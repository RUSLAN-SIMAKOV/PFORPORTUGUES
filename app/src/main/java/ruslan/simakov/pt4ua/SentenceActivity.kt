package ruslan.simakov.pt4ua

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.content.res.Configuration
import android.os.Bundle
import android.speech.tts.TextToSpeech
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.compose.animation.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ruslan.simakov.pt4ua.data.RuleTable
import ruslan.simakov.pt4ua.data.Sentence
import ruslan.simakov.pt4ua.data.lessons.Lessons
import java.util.*

class SentenceActivity : ComponentActivity(), TextToSpeech.OnInitListener {

    private lateinit var tts: TextToSpeech
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tts = TextToSpeech(this, this)
        sharedPreferences = getSharedPreferences("LessonState", Context.MODE_PRIVATE)

        val originalSentences = intent.getSerializableExtra("sentences") as? List<Sentence>
        val lesson = intent.getIntExtra("lesson", 1)

        setContent {
            MaterialTheme(
                colorScheme = lightColorScheme(
                    primary = Color(0xFF2196F3), // Friendly Blue
                    onPrimary = Color.White,
                    secondary = Color(0xFF4CAF50), // Soft Green
                    onSecondary = Color.White,
                    background = Color.White,
                    surface = Color.White,
                    onSurface = Color(0xFF212121),
                    surfaceVariant = Color(0xFFF1F1F1)
                )
            ) {
                Surface(color = MaterialTheme.colorScheme.background) {
                    SentencePracticeScreen(
                        originalSentences = originalSentences ?: emptyList(),
                        lesson = lesson,
                        sharedPreferences = sharedPreferences,
                        onFinish = { correct, total ->
                            val resultIntent = Intent().apply {
                                putExtra("correctAnswers", correct)
                                putExtra("totalSentences", total)
                            }
                            setResult(Activity.RESULT_OK, resultIntent)
                            finish()
                        },
                        onBack = {
                            setResult(Activity.RESULT_CANCELED)
                            finish()
                        },
                        speak = { text ->
                            tts.speak(text, TextToSpeech.QUEUE_FLUSH, null, "")
                        }
                    )
                }
            }
        }
    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            tts.setLanguage(Locale("pt", "PT"))
        }
    }

    override fun onDestroy() {
        if (::tts.isInitialized) {
            tts.stop()
            tts.shutdown()
        }
        super.onDestroy()
    }
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
fun SentencePracticeScreen(
    originalSentences: List<Sentence>,
    lesson: Int,
    sharedPreferences: SharedPreferences,
    onFinish: (Int, Int) -> Unit,
    onBack: () -> Unit,
    speak: (String) -> Unit
) {
    // rememberSaveable keeps the order, answer and chips when the activity is recreated (rotation, theme change)
    var sentences by rememberSaveable { mutableStateOf(originalSentences.shuffled()) }
    var currentSentenceIndex by rememberSaveable {
        mutableStateOf(sharedPreferences.getInt("lesson_${lesson}_progress", 0))
    }
    var userWords by rememberSaveable { mutableStateOf(mutableListOf<String>()) }
    var isChecked by rememberSaveable { mutableStateOf(false) }
    var isCorrect by rememberSaveable { mutableStateOf(false) }
    var showHelp by rememberSaveable { mutableStateOf(false) }
    var incorrectSentences by rememberSaveable { mutableStateOf(mutableListOf<Sentence>()) }
    var correctCount by rememberSaveable { mutableStateOf(0) }

    val isLandscape = LocalConfiguration.current.orientation == Configuration.ORIENTATION_LANDSCAPE

    val currentSentence = sentences.getOrNull(currentSentenceIndex)
    val wordBank = rememberSaveable(currentSentence) {
        currentSentence?.correctPortugueseWords?.shuffled() ?: emptyList()
    }

    LaunchedEffect(currentSentenceIndex) {
        sharedPreferences.edit().putInt("lesson_${lesson}_progress", currentSentenceIndex).apply()
    }

    BackHandler(onBack = onBack)
    // Registered later, so while help is open Back closes help instead of the lesson
    BackHandler(enabled = showHelp) { showHelp = false }

    Box {
        Scaffold(
            topBar = {
                CenterAlignedTopAppBar(
                    title = { Text("Урок $lesson", fontWeight = FontWeight.Bold) },
                    navigationIcon = {
                        IconButton(onClick = onBack) {
                            Icon(Icons.Default.ArrowBack, contentDescription = null)
                        }
                    },
                    actions = {
                        IconButton(onClick = { showHelp = true }) {
                            Icon(Icons.Default.Info, contentDescription = "Допомога")
                        }
                    },
                    colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                        containerColor = MaterialTheme.colorScheme.primary,
                        titleContentColor = Color.White,
                        navigationIconContentColor = Color.White,
                        actionIconContentColor = Color.White
                    )
                )
            },
            bottomBar = {
                Surface(tonalElevation = 8.dp) {
                    Box(modifier = Modifier.padding(16.dp).fillMaxWidth()) {
                        if (!isChecked) {
                            Button(
                                onClick = {
                                    isChecked = true
                                    isCorrect = userWords == currentSentence?.correctPortugueseWords
                                    if (isCorrect) {
                                        correctCount++
                                        speak(userWords.joinToString(" "))
                                    } else {
                                        currentSentence?.let { incorrectSentences.add(it) }
                                    }
                                },
                                modifier = Modifier.fillMaxWidth(),
                                enabled = userWords.isNotEmpty(),
                                shape = RoundedCornerShape(12.dp)
                            ) {
                                Text("ПЕРЕВІРИТИ", fontWeight = FontWeight.Bold)
                            }
                        } else {
                            val feedback: @Composable () -> Unit = {
                                FeedbackSection(
                                    isCorrect,
                                    currentSentence?.correctPortugueseWords?.joinToString(" ") ?: ""
                                )
                            }
                            val continueButton: @Composable (Modifier) -> Unit = { buttonModifier ->
                                Button(
                                    onClick = {
                                        if (currentSentenceIndex < sentences.size - 1) {
                                            currentSentenceIndex++
                                            userWords = mutableListOf()
                                            isChecked = false
                                        } else {
                                            if (incorrectSentences.isNotEmpty()) {
                                                sentences = incorrectSentences.shuffled()
                                                incorrectSentences = mutableListOf()
                                                currentSentenceIndex = 0
                                                userWords = mutableListOf()
                                                isChecked = false
                                            } else {
                                                sharedPreferences.edit()
                                                    .remove("lesson_${lesson}_progress").apply()
                                                onFinish(sentences.size, sentences.size)
                                            }
                                        }
                                    },
                                    modifier = buttonModifier,
                                    shape = RoundedCornerShape(12.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = if (isCorrect) Color(0xFF4CAF50) else Color(
                                            0xFFF44336
                                        )
                                    )
                                ) {
                                    Text("ПРОДОВЖИТИ", fontWeight = FontWeight.Bold)
                                }
                            }

                            // In landscape the feedback sits next to the button to leave height for the answer
                            if (isLandscape) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Box(Modifier.weight(1f)) { feedback() }
                                    Spacer(Modifier.width(16.dp))
                                    continueButton(Modifier.weight(1f))
                                }
                            } else {
                                Column {
                                    feedback()
                                    Spacer(Modifier.height(8.dp))
                                    continueButton(Modifier.fillMaxWidth())
                                }
                            }
                        }
                    }
                }
            }
        ) { padding ->
            val sentenceAndAnswer: @Composable () -> Unit = {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    LinearProgressIndicator(
                        progress = { (currentSentenceIndex + 1).toFloat() / sentences.size },
                        modifier = Modifier
                            .weight(1f)
                            .height(10.dp)
                            .clip(RoundedCornerShape(5.dp)),
                        color = MaterialTheme.colorScheme.primary,
                        trackColor = Color.LightGray
                    )
                    Spacer(Modifier.width(12.dp))
                    Text(
                        text = "${currentSentenceIndex + 1} / ${sentences.size}",
                        fontWeight = FontWeight.Bold,
                        color = Color.Gray,
                        fontSize = 14.sp
                    )
                }

                Spacer(Modifier.height(if (isLandscape) 16.dp else 24.dp))

                Text(
                    text = currentSentence?.ukrainianSentence ?: "",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )

                Spacer(Modifier.height(if (isLandscape) 16.dp else 32.dp))

                FlowRow(
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(min = 64.dp)
                        .background(Color(0xFFF5F5F5), RoundedCornerShape(12.dp))
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.Center
                ) {
                    userWords.forEachIndexed { index, word ->
                        WordChip(word, isEnabled = !isChecked) {
                            if (!isChecked) {
                                userWords = userWords.toMutableList().apply { removeAt(index) }
                            }
                        }
                    }
                }
            }

            val wordBankChips: @Composable () -> Unit = {
                if (!isChecked) {
                    FlowRow(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        wordBank.forEach { word ->
                            val isUsed =
                                userWords.count { it == word } >= wordBank.count { it == word }
                            WordChip(word, isEnabled = !isUsed && !isChecked) {
                                userWords = userWords.toMutableList().apply { add(word) }
                            }
                        }
                    }
                }
            }

            // Landscape is too short for one column, so the word bank gets its own column on the right
            if (isLandscape) {
                Row(
                    modifier = Modifier
                        .padding(padding)
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight()
                            .verticalScroll(rememberScrollState()),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        sentenceAndAnswer()
                    }
                    Spacer(Modifier.width(16.dp))
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight()
                            .verticalScroll(rememberScrollState())
                    ) {
                        wordBankChips()
                    }
                }
            } else {
                Column(
                    modifier = Modifier
                        .padding(padding)
                        .fillMaxSize()
                        .padding(16.dp)
                        .verticalScroll(rememberScrollState()),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    sentenceAndAnswer()
                    Spacer(Modifier.height(32.dp))
                    wordBankChips()
                }
            }
        }

        AnimatedVisibility(
            visible = showHelp,
            enter = fadeIn() + slideInVertically(initialOffsetY = { it }),
            exit = fadeOut() + slideOutVertically(targetOffsetY = { it })
        ) {
            val lessonInfo = Lessons.all.getOrNull(lesson - 1)

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)
                    // Swallow taps so they don't reach the lesson underneath; only the buttons close help
                    .clickable(interactionSource = null, indication = null) { }
            ) {
                Column(modifier = Modifier.fillMaxSize()) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f)
                            .padding(16.dp)
                    ) {
                        val helpImage = lessonInfo?.helpImage
                        if (helpImage != null) {
                            Image(
                                painter = painterResource(id = helpImage),
                                contentDescription = null,
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Fit
                            )
                        } else {
                            // Top padding keeps the tables clear of the close button
                            RulesContent(
                                rules = lessonInfo?.rules.orEmpty(),
                                modifier = Modifier
                                    .fillMaxSize()
                                    .statusBarsPadding()
                                    .padding(top = 48.dp)
                            )
                        }
                    }
                    Button(
                        onClick = { showHelp = false },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Text("ЗРОЗУМІЛО", fontWeight = FontWeight.Bold)
                    }
                }
                FilledIconButton(
                    onClick = { showHelp = false },
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .statusBarsPadding()
                        .padding(8.dp)
                ) {
                    Icon(Icons.Default.Close, contentDescription = "Закрити")
                }
            }
        }
    }
}

@Composable
fun WordChip(word: String, isEnabled: Boolean, onClick: () -> Unit) {
    Surface(
        modifier = Modifier
            .padding(4.dp)
            .clickable(enabled = isEnabled, onClick = onClick),
        shape = RoundedCornerShape(8.dp),
        color = if (isEnabled) Color.White else Color.LightGray,
        tonalElevation = if (isEnabled) 2.dp else 0.dp,
        border = androidx.compose.foundation.BorderStroke(1.dp, Color.LightGray)
    ) {
        Text(
            text = word,
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
            fontSize = 16.sp
        )
    }
}

@Composable
fun RulesContent(rules: List<RuleTable>, modifier: Modifier = Modifier) {
    Column(modifier = modifier.verticalScroll(rememberScrollState())) {
        rules.forEach { table ->
            Text(
                text = table.title,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(8.dp))
                    .border(1.dp, Color.LightGray, RoundedCornerShape(8.dp))
            ) {
                table.rows.forEachIndexed { rowIndex, row ->
                    if (rowIndex > 0) HorizontalDivider(color = Color.LightGray)
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(if (rowIndex == 0) Color(0xFFE3F2FD) else Color.White)
                    ) {
                        row.forEachIndexed { columnIndex, cell ->
                            Text(
                                text = cell,
                                modifier = Modifier
                                    .weight(1f)
                                    .padding(horizontal = 6.dp, vertical = 8.dp),
                                fontSize = 14.sp,
                                fontWeight = if (rowIndex == 0 || columnIndex == 0) FontWeight.Bold else FontWeight.Normal
                            )
                        }
                    }
                }
            }
            table.note?.let {
                Text(
                    text = it,
                    fontSize = 14.sp,
                    color = Color.DarkGray,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            Spacer(Modifier.height(24.dp))
        }
    }
}

@Composable
fun FeedbackSection(isCorrect: Boolean, correctAnswer: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(if (isCorrect) Color(0xFFE8F5E9) else Color(0xFFFFEBEE))
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = if (isCorrect) Icons.Default.CheckCircle else Icons.Default.Warning,
            contentDescription = null,
            tint = if (isCorrect) Color(0xFF4CAF50) else Color(0xFFF44336)
        )
        Spacer(Modifier.width(12.dp))
        Column {
            Text(
                text = if (isCorrect) "Чудово!" else "Не зовсім...",
                fontWeight = FontWeight.Bold,
                color = if (isCorrect) Color(0xFF2E7D32) else Color(0xFFC62828)
            )
            if (!isCorrect) {
                Text(
                    text = "Правильна відповідь: $correctAnswer",
                    fontSize = 14.sp,
                    color = Color(0xFFC62828)
                )
            }
        }
    }
}

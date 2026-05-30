package ruslan.simakov.pt4ua

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.speech.tts.TextToSpeech
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.compose.animation.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ruslan.simakov.pt4ua.data.Sentence
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
                    primary = Color(0xFF006633),
                    secondary = Color(0xFFFF0000),
                    tertiary = Color(0xFFFFCC00)
                )
            ) {
                Surface(color = MaterialTheme.colorScheme.background) {
                    SentencePracticeScreen(
                        originalSentences = originalSentences ?: emptyList(),
                        lesson = lesson,
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
    onFinish: (Int, Int) -> Unit,
    onBack: () -> Unit,
    speak: (String) -> Unit
) {
    var sentences by remember { mutableStateOf(originalSentences.shuffled()) }
    var currentSentenceIndex by remember { mutableStateOf(0) }
    var userWords by remember { mutableStateOf(mutableListOf<String>()) }
    var isChecked by remember { mutableStateOf(false) }
    var isCorrect by remember { mutableStateOf(false) }
    var showHelp by remember { mutableStateOf(false) }
    var incorrectSentences by remember { mutableStateOf(mutableListOf<Sentence>()) }
    var correctCount by remember { mutableStateOf(0) }
    
    val currentSentence = sentences.getOrNull(currentSentenceIndex)
    val wordBank = remember(currentSentence) { 
        currentSentence?.correctPortugueseWords?.shuffled() ?: emptyList() 
    }

    BackHandler(onBack = onBack)

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
                        Column {
                            FeedbackSection(isCorrect, currentSentence?.correctPortugueseWords?.joinToString(" ") ?: "")
                            Spacer(Modifier.height(8.dp))
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
                                            onFinish(sentences.size, sentences.size)
                                        }
                                    }
                                },
                                modifier = Modifier.fillMaxWidth(),
                                shape = RoundedCornerShape(12.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = if (isCorrect) Color(0xFF4CAF50) else Color(0xFFF44336)
                                )
                            ) {
                                Text("ПРОДОВЖИТИ", fontWeight = FontWeight.Bold)
                            }
                        }
                    }
                }
            }
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
                .padding(16.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LinearProgressIndicator(
                progress = { (currentSentenceIndex + 1).toFloat() / sentences.size },
                modifier = Modifier.fillMaxWidth().height(8.dp).clip(RoundedCornerShape(4.dp)),
                color = MaterialTheme.colorScheme.primary,
                trackColor = Color.LightGray
            )
            
            Spacer(Modifier.height(24.dp))

            Text(
                text = currentSentence?.ukrainianSentence ?: "",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

            Spacer(Modifier.height(32.dp))

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

            Spacer(Modifier.height(32.dp))

            if (!isChecked) {
                FlowRow(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    wordBank.forEach { word ->
                        val isUsed = userWords.count { it == word } >= wordBank.count { it == word }
                        WordChip(word, isEnabled = !isUsed && !isChecked) {
                            userWords = userWords.toMutableList().apply { add(word) }
                        }
                    }
                }
            }
        }
    }

    if (showHelp) {
        val helpImage = when (lesson) {
            1 -> R.drawable.less1
            2 -> R.drawable.less2
            3 -> R.drawable.less3
            4 -> R.drawable.less4
            else -> R.drawable.less1
        }
        
        AlertDialog(
            onDismissRequest = { showHelp = false },
            confirmButton = { 
                TextButton(onClick = { showHelp = false }) { 
                    Text("ЗРОЗУМІЛО", fontWeight = FontWeight.Bold) 
                } 
            },
            title = { Text("Правила уроку") },
            text = {
                Box(modifier = Modifier.fillMaxWidth().height(400.dp)) {
                    Image(
                        painter = painterResource(id = helpImage),
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Fit
                    )
                }
            }
        )
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

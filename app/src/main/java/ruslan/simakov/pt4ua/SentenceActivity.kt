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
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Info
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
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ruslan.simakov.pt4ua.data.Progress
import ruslan.simakov.pt4ua.data.RuleTable
import ruslan.simakov.pt4ua.data.Sentence
import ruslan.simakov.pt4ua.data.lessons.LessonInfo
import ruslan.simakov.pt4ua.data.lessons.Lessons
import ruslan.simakov.pt4ua.ui.*
import java.util.*

class SentenceActivity : ComponentActivity(), TextToSpeech.OnInitListener {

    private lateinit var tts: TextToSpeech
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableAppEdgeToEdge()
        tts = TextToSpeech(this, this)
        sharedPreferences = getSharedPreferences(Progress.PREFS_NAME, Context.MODE_PRIVATE)

        val originalSentences = intent.getSerializableExtra("sentences") as? List<Sentence>
        val lesson = intent.getIntExtra("lesson", 1)

        setContent {
            Pt4uaTheme {
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

private enum class AnswerState { Editing, Correct, Wrong }

enum class ChipStyle { Bank, Used, Answer, Correct, Wrong }

@OptIn(ExperimentalLayoutApi::class)
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
        // A saved position past the end (e.g. after a lesson got shorter) restarts the lesson
        mutableStateOf(
            sharedPreferences.getInt(Progress.progressKey(lesson), 0).takeIf { it in originalSentences.indices } ?: 0
        )
    }
    var userWords by rememberSaveable { mutableStateOf(mutableListOf<String>()) }
    var isChecked by rememberSaveable { mutableStateOf(false) }
    var isCorrect by rememberSaveable { mutableStateOf(false) }
    var showHelp by rememberSaveable { mutableStateOf(false) }
    var incorrectSentences by rememberSaveable { mutableStateOf(mutableListOf<Sentence>()) }
    var correctCount by rememberSaveable { mutableStateOf(0) }
    var mistakesCount by rememberSaveable { mutableStateOf(0) }
    var isRetryRound by rememberSaveable { mutableStateOf(false) }
    var isFinished by rememberSaveable { mutableStateOf(false) }

    val lessonInfo = Lessons.all.getOrNull(lesson - 1)
    val isLandscape = LocalConfiguration.current.orientation == Configuration.ORIENTATION_LANDSCAPE

    val currentSentence = sentences.getOrNull(currentSentenceIndex)
    val correctAnswer = currentSentence?.correctPortugueseWords?.joinToString(" ") ?: ""
    val wordBank = rememberSaveable(currentSentence) {
        currentSentence?.correctPortugueseWords?.shuffled() ?: emptyList()
    }
    val answerState = when {
        !isChecked -> AnswerState.Editing
        isCorrect -> AnswerState.Correct
        else -> AnswerState.Wrong
    }

    // The retry round reuses positions from 0, so only the first pass is saved
    LaunchedEffect(currentSentenceIndex, isRetryRound) {
        if (!isRetryRound) {
            sharedPreferences.edit().putInt(Progress.progressKey(lesson), currentSentenceIndex).apply()
        }
    }

    fun checkAnswer() {
        isChecked = true
        isCorrect = userWords == currentSentence?.correctPortugueseWords
        if (isCorrect) {
            correctCount++
            speak(correctAnswer)
        } else {
            mistakesCount++
            currentSentence?.let { incorrectSentences.add(it) }
        }
    }

    fun nextSentence() {
        userWords = mutableListOf()
        isChecked = false
        when {
            currentSentenceIndex < sentences.size - 1 -> currentSentenceIndex++
            incorrectSentences.isNotEmpty() -> {
                sentences = incorrectSentences.shuffled()
                incorrectSentences = mutableListOf()
                currentSentenceIndex = 0
                isRetryRound = true
            }
            else -> {
                sharedPreferences.edit()
                    .remove(Progress.progressKey(lesson))
                    .putBoolean(Progress.completedKey(lesson), true)
                    .apply()
                isFinished = true
            }
        }
    }

    fun restartLesson() {
        sentences = originalSentences.shuffled()
        incorrectSentences = mutableListOf()
        currentSentenceIndex = 0
        userWords = mutableListOf()
        isChecked = false
        correctCount = 0
        mistakesCount = 0
        isRetryRound = false
        isFinished = false
    }

    BackHandler(onBack = onBack)
    // Registered later, so while help is open Back closes help instead of the lesson
    BackHandler(enabled = showHelp) { showHelp = false }
    BackHandler(enabled = isFinished) { onFinish(correctCount, originalSentences.size) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        Scaffold(
            containerColor = MaterialTheme.colorScheme.background,
            topBar = {
                LessonTopBar(lesson = lesson, title = lessonInfo?.title, onBack = onBack, onHelp = { showHelp = true })
            },
            bottomBar = {
                BottomPanel(compact = isLandscape) {
                    if (!isChecked) {
                        BigButton(
                            text = "Перевірити",
                            color = AppColors.Indigo,
                            enabled = userWords.isNotEmpty(),
                            modifier = Modifier.fillMaxWidth(),
                            onClick = { checkAnswer() }
                        )
                    } else {
                        val buttonColor = if (isCorrect) AppColors.Success else AppColors.Error
                        val buttonText = if (isCorrect) "Далі" else "Зрозуміло, далі"
                        val feedback: @Composable () -> Unit = {
                            FeedbackSection(isCorrect, correctAnswer, onListen = { speak(correctAnswer) })
                        }

                        // In landscape the feedback sits next to the button to leave height for the answer
                        if (isLandscape) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Box(Modifier.weight(1f)) { feedback() }
                                Spacer(Modifier.width(16.dp))
                                BigButton(buttonText, buttonColor, Modifier.weight(1f), onClick = { nextSentence() })
                            }
                        } else {
                            Column {
                                feedback()
                                Spacer(Modifier.height(12.dp))
                                BigButton(buttonText, buttonColor, Modifier.fillMaxWidth(), onClick = { nextSentence() })
                            }
                        }
                    }
                }
            }
        ) { padding ->
            val promptAndAnswer: @Composable () -> Unit = {
                ProgressHeader(currentSentenceIndex, sentences.size, isRetryRound)
                Spacer(Modifier.height(if (isLandscape) 8.dp else 20.dp))
                PromptCard(currentSentence?.ukrainianSentence ?: "", compact = isLandscape)
                Spacer(Modifier.height(if (isLandscape) 8.dp else 20.dp))
                AnswerArea(userWords, answerState, compact = isLandscape) { index ->
                    if (!isChecked) {
                        userWords = userWords.toMutableList().apply { removeAt(index) }
                    }
                }
            }

            val wordBankChips: @Composable () -> Unit = {
                if (!isChecked) {
                    Text(
                        text = "Оберіть слова",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 8.dp),
                        fontSize = 13.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = AppColors.Muted,
                        textAlign = TextAlign.Center
                    )
                    FlowRow(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        wordBank.forEach { word ->
                            val isUsed =
                                userWords.count { it == word } >= wordBank.count { it == word }
                            WordChip(word, if (isUsed) ChipStyle.Used else ChipStyle.Bank) {
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
                        .padding(horizontal = 20.dp, vertical = 12.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight()
                            .verticalScroll(rememberScrollState()),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        promptAndAnswer()
                    }
                    Spacer(Modifier.width(20.dp))
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight()
                            .verticalScroll(rememberScrollState())
                            .padding(top = 30.dp)
                    ) {
                        wordBankChips()
                    }
                }
            } else {
                Column(
                    modifier = Modifier
                        .padding(padding)
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                        .padding(horizontal = 20.dp, vertical = 16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    promptAndAnswer()
                    Spacer(Modifier.height(28.dp))
                    wordBankChips()
                }
            }
        }

        AnimatedVisibility(
            visible = showHelp,
            enter = fadeIn() + slideInVertically(initialOffsetY = { it / 3 }),
            exit = fadeOut() + slideOutVertically(targetOffsetY = { it / 3 })
        ) {
            HelpScreen(lesson = lesson, lessonInfo = lessonInfo, onClose = { showHelp = false })
        }

        AnimatedVisibility(
            visible = isFinished,
            enter = fadeIn() + scaleIn(initialScale = 0.92f),
            exit = fadeOut()
        ) {
            CompletionScreen(
                total = originalSentences.size,
                mistakes = mistakesCount,
                onDone = { onFinish(correctCount, originalSentences.size) },
                onRestart = { restartLesson() }
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun LessonTopBar(lesson: Int, title: String?, onBack: () -> Unit, onHelp: () -> Unit) {
    Box(modifier = Modifier.background(HeaderGradient)) {
        CenterAlignedTopAppBar(
            title = {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("Урок $lesson", fontWeight = FontWeight.Bold, fontSize = 18.sp)
                    if (title != null) {
                        Text(
                            title,
                            fontSize = 13.sp,
                            color = Color.White.copy(alpha = 0.85f),
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                }
            },
            navigationIcon = {
                IconButton(onClick = onBack) {
                    Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Назад")
                }
            },
            actions = {
                IconButton(onClick = onHelp) {
                    Icon(Icons.Default.Info, contentDescription = "Допомога")
                }
            },
            colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                containerColor = Color.Transparent,
                titleContentColor = Color.White,
                navigationIconContentColor = Color.White,
                actionIconContentColor = Color.White
            )
        )
    }
}

@Composable
private fun ProgressHeader(index: Int, total: Int, isRetryRound: Boolean) {
    val fraction by animateFloatAsState(
        targetValue = (index + 1f) / total.coerceAtLeast(1),
        label = "progress"
    )
    val accent = if (isRetryRound) AppColors.Error else AppColors.Indigo
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            if (isRetryRound) {
                Pill("Повторюємо помилки", AppColors.ErrorSoft, AppColors.Error)
            }
            Spacer(Modifier.weight(1f))
            Text(
                "${index + 1} / $total",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = AppColors.Muted
            )
        }
        Spacer(Modifier.height(8.dp))
        ProgressBar(fraction, accent, AppColors.Line, 10.dp)
    }
}

// compact = landscape, where every bit of height counts
@Composable
private fun PromptCard(text: String, compact: Boolean) {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(24.dp),
        color = Color.White,
        shadowElevation = 3.dp
    ) {
        Column(
            modifier = Modifier.padding(horizontal = 20.dp, vertical = if (compact) 12.dp else 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (!compact) {
                Text(
                    "ПЕРЕКЛАДІТЬ ПОРТУГАЛЬСЬКОЮ",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = AppColors.Muted,
                    letterSpacing = 1.sp
                )
                Spacer(Modifier.height(8.dp))
            }
            Text(
                text,
                fontSize = if (compact) 19.sp else 22.sp,
                lineHeight = if (compact) 24.sp else 28.sp,
                fontWeight = FontWeight.Bold,
                color = AppColors.Ink,
                textAlign = TextAlign.Center
            )
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun AnswerArea(words: List<String>, state: AnswerState, compact: Boolean, onRemove: (Int) -> Unit) {
    val borderColor = when (state) {
        AnswerState.Editing -> AppColors.Indigo.copy(alpha = 0.3f)
        AnswerState.Correct -> AppColors.Success
        AnswerState.Wrong -> AppColors.Error
    }
    val background = when (state) {
        AnswerState.Editing -> Color.White.copy(alpha = 0.7f)
        AnswerState.Correct -> AppColors.SuccessSoft
        AnswerState.Wrong -> AppColors.ErrorSoft
    }
    val chipStyle = when (state) {
        AnswerState.Editing -> ChipStyle.Answer
        AnswerState.Correct -> ChipStyle.Correct
        AnswerState.Wrong -> ChipStyle.Wrong
    }
    FlowRow(
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = if (compact) 60.dp else 76.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(background)
            .border(2.dp, borderColor, RoundedCornerShape(20.dp))
            .padding(if (compact) 6.dp else 10.dp)
            .animateContentSize(),
        horizontalArrangement = Arrangement.Center,
        verticalArrangement = Arrangement.Center
    ) {
        if (words.isEmpty()) {
            Text(
                if (compact) "Торкайтеся слів праворуч" else "Торкайтеся слів нижче, щоб скласти речення",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = if (compact) 12.dp else 16.dp),
                fontSize = 14.sp,
                color = AppColors.Muted,
                textAlign = TextAlign.Center
            )
        }
        words.forEachIndexed { index, word ->
            WordChip(word, chipStyle) { onRemove(index) }
        }
    }
}

@Composable
fun WordChip(word: String, style: ChipStyle, onClick: () -> Unit) {
    val enabled = style == ChipStyle.Bank || style == ChipStyle.Answer
    val background = when (style) {
        ChipStyle.Bank, ChipStyle.Correct, ChipStyle.Wrong -> Color.White
        ChipStyle.Used -> AppColors.Line.copy(alpha = 0.5f)
        ChipStyle.Answer -> AppColors.IndigoSoft
    }
    val borderColor = when (style) {
        ChipStyle.Bank -> AppColors.Line
        ChipStyle.Used -> Color.Transparent
        ChipStyle.Answer -> AppColors.Indigo.copy(alpha = 0.35f)
        ChipStyle.Correct -> AppColors.Success.copy(alpha = 0.5f)
        ChipStyle.Wrong -> AppColors.Error.copy(alpha = 0.5f)
    }
    val textColor = when (style) {
        ChipStyle.Bank -> AppColors.Ink
        ChipStyle.Used -> AppColors.Muted.copy(alpha = 0.4f)
        ChipStyle.Answer -> AppColors.IndigoDark
        ChipStyle.Correct -> AppColors.Success
        ChipStyle.Wrong -> AppColors.Error
    }
    Surface(
        modifier = Modifier.padding(4.dp),
        shape = RoundedCornerShape(14.dp),
        color = background,
        shadowElevation = if (style == ChipStyle.Bank) 2.dp else 0.dp,
        border = BorderStroke(1.5.dp, borderColor)
    ) {
        Text(
            text = word,
            modifier = Modifier
                .clickable(enabled = enabled, onClick = onClick)
                .padding(horizontal = 16.dp, vertical = 11.dp),
            fontSize = 17.sp,
            fontWeight = FontWeight.Medium,
            color = textColor
        )
    }
}

@Composable
private fun BottomPanel(compact: Boolean, content: @Composable () -> Unit) {
    Surface(
        color = Color.White,
        shadowElevation = 16.dp,
        shape = RoundedCornerShape(topStart = 28.dp, topEnd = 28.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .navigationBarsPadding()
                .padding(horizontal = 20.dp, vertical = if (compact) 8.dp else 16.dp)
        ) {
            content()
        }
    }
}

@Composable
private fun BigButton(
    text: String,
    color: Color,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        enabled = enabled,
        modifier = modifier.height(56.dp),
        shape = RoundedCornerShape(18.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = color,
            contentColor = Color.White,
            disabledContainerColor = AppColors.Line,
            disabledContentColor = AppColors.Muted
        )
    ) {
        Text(text, fontSize = 17.sp, fontWeight = FontWeight.Bold)
    }
}

@Composable
fun FeedbackSection(isCorrect: Boolean, correctAnswer: String, onListen: () -> Unit) {
    val strong = if (isCorrect) AppColors.Success else AppColors.Error
    val soft = if (isCorrect) AppColors.SuccessSoft else AppColors.ErrorSoft
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(18.dp))
            .background(soft)
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(strong),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = if (isCorrect) Icons.Default.Check else Icons.Default.Close,
                contentDescription = null,
                tint = Color.White
            )
        }
        Spacer(Modifier.width(12.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = if (isCorrect) "Чудово!" else "Не зовсім…",
                fontWeight = FontWeight.Bold,
                fontSize = 17.sp,
                color = strong
            )
            Text(
                text = if (isCorrect) correctAnswer else "Правильно: $correctAnswer",
                fontSize = 15.sp,
                color = AppColors.Ink
            )
        }
        IconButton(
            onClick = onListen,
            modifier = Modifier.semantics { contentDescription = "Прослухати" }
        ) {
            Text("🔊", fontSize = 22.sp)
        }
    }
}

@Composable
private fun HelpScreen(lesson: Int, lessonInfo: LessonInfo?, onClose: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AppColors.Background)
            // Swallow taps so they don't reach the lesson underneath; only the buttons close help
            .clickable(interactionSource = null, indication = null) { }
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(HeaderGradient)
                .statusBarsPadding()
                .padding(start = 20.dp, end = 8.dp, top = 8.dp, bottom = 16.dp)
        ) {
            Column(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(top = 8.dp, end = 56.dp)
            ) {
                Text("Правила", color = Color.White, fontSize = 24.sp, fontWeight = FontWeight.Bold)
                Text(
                    "Урок $lesson · ${lessonInfo?.title.orEmpty()}",
                    color = Color.White.copy(alpha = 0.85f),
                    fontSize = 14.sp
                )
            }
            FilledIconButton(
                onClick = onClose,
                modifier = Modifier.align(Alignment.TopEnd),
                colors = IconButtonDefaults.filledIconButtonColors(
                    containerColor = Color.White.copy(alpha = 0.2f),
                    contentColor = Color.White
                )
            ) {
                Icon(Icons.Default.Close, contentDescription = "Закрити")
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            val helpImage = lessonInfo?.helpImage
            if (helpImage != null) {
                Image(
                    painter = painterResource(id = helpImage),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    contentScale = ContentScale.Fit
                )
            } else {
                RulesContent(
                    rules = lessonInfo?.rules.orEmpty(),
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 16.dp)
                )
            }
        }

        Box(
            modifier = Modifier
                .navigationBarsPadding()
                .padding(16.dp)
        ) {
            BigButton("Зрозуміло", AppColors.Indigo, Modifier.fillMaxWidth(), onClick = onClose)
        }
    }
}

@Composable
fun RulesContent(rules: List<RuleTable>, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
            .padding(vertical = 16.dp)
    ) {
        rules.forEach { table ->
            Surface(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                color = Color.White,
                shadowElevation = 2.dp
            ) {
                Column {
                    Row(
                        modifier = Modifier.padding(horizontal = 16.dp, vertical = 14.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .size(width = 4.dp, height = 20.dp)
                                .clip(CircleShape)
                                .background(AppColors.Indigo)
                        )
                        Spacer(Modifier.width(10.dp))
                        Text(table.title, fontSize = 17.sp, fontWeight = FontWeight.Bold, color = AppColors.Ink)
                    }
                    table.rows.forEachIndexed { rowIndex, row ->
                        val rowColor = when {
                            rowIndex == 0 -> AppColors.IndigoSoft
                            rowIndex % 2 == 0 -> AppColors.Stripe
                            else -> Color.White
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(rowColor)
                                .padding(horizontal = 6.dp)
                        ) {
                            row.forEachIndexed { columnIndex, cell ->
                                Text(
                                    text = cell,
                                    modifier = Modifier
                                        .weight(1f)
                                        .padding(horizontal = 6.dp, vertical = 10.dp),
                                    fontSize = 14.sp,
                                    fontWeight = if (rowIndex == 0 || columnIndex == 0) FontWeight.Bold else FontWeight.Normal,
                                    color = if (rowIndex == 0) AppColors.IndigoDark else AppColors.Ink
                                )
                            }
                        }
                    }
                    val note = table.note
                    if (note != null) {
                        Row(
                            modifier = Modifier
                                .padding(12.dp)
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(14.dp))
                                .background(AppColors.NoteBackground)
                                .padding(12.dp)
                        ) {
                            Text("💡", fontSize = 16.sp)
                            Spacer(Modifier.width(8.dp))
                            Text(note, fontSize = 14.sp, color = AppColors.NoteText)
                        }
                    } else {
                        Spacer(Modifier.height(8.dp))
                    }
                }
            }
            Spacer(Modifier.height(16.dp))
        }
    }
}

@Composable
private fun CompletionScreen(total: Int, mistakes: Int, onDone: () -> Unit, onRestart: () -> Unit) {
    BoxWithConstraints(
        modifier = Modifier
            .fillMaxSize()
            .background(HeaderGradient)
            .clickable(interactionSource = null, indication = null) { }
            .statusBarsPadding()
            .navigationBarsPadding()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
                // At least screen-tall, so the content is centred but can still scroll in landscape
                .heightIn(min = maxHeight)
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("🎉", fontSize = 64.sp)
            Spacer(Modifier.height(12.dp))
            Text(
                "Урок завершено!",
                color = Color.White,
                fontSize = 30.sp,
                fontWeight = FontWeight.ExtraBold,
                textAlign = TextAlign.Center
            )
            Text(
                "Ви склали всі речення цього уроку",
                color = Color.White.copy(alpha = 0.85f),
                fontSize = 16.sp,
                textAlign = TextAlign.Center
            )
            Spacer(Modifier.height(24.dp))
            Row(
                modifier = Modifier.widthIn(max = 420.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                StatCard("Речень", "$total", Modifier.weight(1f))
                StatCard("Помилок", "$mistakes", Modifier.weight(1f))
            }
            Spacer(Modifier.height(28.dp))
            Column(modifier = Modifier.widthIn(max = 420.dp)) {
                Button(
                    onClick = onDone,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp),
                    shape = RoundedCornerShape(18.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.White, contentColor = AppColors.Indigo)
                ) {
                    Text("До уроків", fontSize = 17.sp, fontWeight = FontWeight.Bold)
                }
                Spacer(Modifier.height(12.dp))
                OutlinedButton(
                    onClick = onRestart,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp),
                    shape = RoundedCornerShape(18.dp),
                    border = BorderStroke(1.5.dp, Color.White.copy(alpha = 0.7f)),
                    colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.White)
                ) {
                    Text("Пройти ще раз", fontSize = 17.sp, fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}

@Composable
private fun StatCard(label: String, value: String, modifier: Modifier = Modifier) {
    Surface(modifier = modifier, shape = RoundedCornerShape(20.dp), color = Color.White.copy(alpha = 0.15f)) {
        Column(
            modifier = Modifier.padding(vertical = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(value, color = Color.White, fontSize = 28.sp, fontWeight = FontWeight.Bold)
            Text(label, color = Color.White.copy(alpha = 0.85f), fontSize = 13.sp)
        }
    }
}

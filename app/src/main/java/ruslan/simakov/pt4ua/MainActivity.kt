package ruslan.simakov.pt4ua

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ruslan.simakov.pt4ua.data.Developer
import ruslan.simakov.pt4ua.data.Progress
import ruslan.simakov.pt4ua.data.lessons.Lessons
import ruslan.simakov.pt4ua.ui.*
import java.io.Serializable

class MainActivity : ComponentActivity() {

    // Bumped on every resume so the list re-reads progress after returning from a lesson
    private var resumeCount by mutableIntStateOf(0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableAppEdgeToEdge()
        setContent {
            Pt4uaTheme {
                LessonListScreen(refreshKey = resumeCount, onLessonClick = { startLesson(it) })
            }
        }
    }

    override fun onResume() {
        super.onResume()
        resumeCount++
    }

    private fun startLesson(lessonNumber: Int) {
        getSharedPreferences(Progress.PREFS_NAME, Context.MODE_PRIVATE)
            .edit().putInt(Progress.KEY_LAST_LESSON, lessonNumber).apply()

        val sentences = Lessons.all[lessonNumber - 1].sentences().shuffled()
        val intent = Intent(this, SentenceActivity::class.java).apply {
            putExtra("sentences", sentences as Serializable)
            putExtra("lesson", lessonNumber)
        }
        startActivity(intent)
    }
}

private data class LessonState(val done: Int, val completed: Boolean)

private val sectionColors = listOf(AppColors.Indigo, AppColors.Violet, AppColors.Teal)

@Composable
fun LessonListScreen(refreshKey: Int, onLessonClick: (Int) -> Unit) {
    val context = LocalContext.current
    val prefs = remember { context.getSharedPreferences(Progress.PREFS_NAME, Context.MODE_PRIVATE) }
    val sentenceCounts = remember { Lessons.all.map { it.sentences().size } }
    val states = remember(refreshKey) {
        Lessons.all.indices.map { index ->
            LessonState(
                done = prefs.getInt(Progress.progressKey(index + 1), 0),
                completed = prefs.getBoolean(Progress.completedKey(index + 1), false)
            )
        }
    }
    val lastLesson = remember(refreshKey) {
        prefs.getInt(Progress.KEY_LAST_LESSON, 0).takeIf { it in 1..Lessons.all.size }
    }
    val bottomInset = WindowInsets.navigationBars.asPaddingValues().calculateBottomPadding()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        LazyColumn(contentPadding = PaddingValues(bottom = bottomInset + 24.dp)) {
            item {
                ListHeader(
                    completedCount = states.count { it.completed },
                    totalLessons = Lessons.all.size,
                    continueLesson = lastLesson,
                    continueSubtitle = lastLesson?.let {
                        lessonStatus(states[it - 1], sentenceCounts[it - 1])
                    }.orEmpty(),
                    onContinue = { lastLesson?.let(onLessonClick) }
                )
            }
            Lessons.sections.forEachIndexed { sectionIndex, section ->
                item(key = "section_$sectionIndex") { SectionHeader(section.emoji, section.title, section.subtitle) }
                items(section.lessons.toList(), key = { it }) { number ->
                    LessonCard(
                        number = number,
                        title = Lessons.all[number - 1].title,
                        accent = sectionColors[sectionIndex % sectionColors.size],
                        state = states[number - 1],
                        total = sentenceCounts[number - 1],
                        onClick = { onLessonClick(number) }
                    )
                }
            }
            item(key = "developer") { DeveloperMenu() }
        }

        // Keeps the light status bar icons readable once the header scrolls away
        Box(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .fillMaxWidth()
                .windowInsetsTopHeight(WindowInsets.statusBars)
                .background(HeaderGradient)
        )
    }
}

private fun lessonStatus(state: LessonState, total: Int): String = when {
    state.completed -> "Завершено · ${sentencesLabel(total)}"
    state.done > 0 -> "Пройдено ${state.done} з $total"
    else -> sentencesLabel(total)
}

@Composable
private fun ListHeader(
    completedCount: Int,
    totalLessons: Int,
    continueLesson: Int?,
    continueSubtitle: String,
    onContinue: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp))
            .background(HeaderGradient)
            .statusBarsPadding()
            .padding(start = 24.dp, end = 24.dp, top = 20.dp, bottom = 24.dp)
    ) {
        Text("Olá! 👋", color = Color.White.copy(alpha = 0.85f), fontSize = 16.sp)
        Text("PT4UA", color = Color.White, fontSize = 34.sp, fontWeight = FontWeight.ExtraBold)
        Text(
            "Європейська португальська для українців",
            color = Color.White.copy(alpha = 0.9f),
            fontSize = 15.sp
        )

        Spacer(Modifier.height(20.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                "Завершено уроків",
                color = Color.White.copy(alpha = 0.9f),
                fontSize = 14.sp,
                modifier = Modifier.weight(1f)
            )
            Text("$completedCount з $totalLessons", color = Color.White, fontSize = 14.sp, fontWeight = FontWeight.Bold)
        }
        Spacer(Modifier.height(8.dp))
        ProgressBar(
            fraction = completedCount / totalLessons.toFloat(),
            color = Color.White,
            trackColor = Color.White.copy(alpha = 0.25f),
            height = 8.dp
        )

        if (continueLesson != null) {
            Spacer(Modifier.height(20.dp))
            Surface(
                onClick = onContinue,
                shape = RoundedCornerShape(18.dp),
                color = Color.White,
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(modifier = Modifier.padding(14.dp), verticalAlignment = Alignment.CenterVertically) {
                    Column(modifier = Modifier.weight(1f)) {
                        Text("Продовжити", fontSize = 12.sp, fontWeight = FontWeight.SemiBold, color = AppColors.Indigo)
                        Text(
                            "Урок $continueLesson · ${Lessons.all[continueLesson - 1].title}",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = AppColors.Ink,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                        Text(continueSubtitle, fontSize = 13.sp, color = AppColors.Muted)
                    }
                    Spacer(Modifier.width(12.dp))
                    Box(
                        modifier = Modifier
                            .size(44.dp)
                            .clip(CircleShape)
                            .background(HeaderGradient),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(Icons.Default.PlayArrow, contentDescription = "Продовжити", tint = Color.White)
                    }
                }
            }
        }
    }
}

@Composable
private fun SectionHeader(emoji: String, title: String, subtitle: String) {
    Row(
        modifier = Modifier.padding(start = 20.dp, end = 20.dp, top = 24.dp, bottom = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(emoji, fontSize = 24.sp)
        Spacer(Modifier.width(10.dp))
        Column {
            Text(title, fontSize = 19.sp, fontWeight = FontWeight.Bold, color = AppColors.Ink)
            Text(subtitle, fontSize = 13.sp, color = AppColors.Muted)
        }
    }
}

// One entry at the end of the lesson list; it opens a bottom sheet with the developer contacts and the donation link
@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun DeveloperMenu() {
    val context = LocalContext.current
    var showSheet by rememberSaveable { mutableStateOf(false) }
    val versionName = remember {
        runCatching { context.packageManager.getPackageInfo(context.packageName, 0).versionName }.getOrNull()
    }

    fun open(intent: Intent, missingAppMessage: String) {
        showSheet = false
        try {
            context.startActivity(intent)
        } catch (e: ActivityNotFoundException) {
            Toast.makeText(context, missingAppMessage, Toast.LENGTH_SHORT).show()
        }
    }

    Surface(
        onClick = { showSheet = true },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, top = 24.dp, bottom = 6.dp),
        shape = RoundedCornerShape(20.dp),
        color = Color.White,
        shadowElevation = 2.dp
    ) {
        Row(modifier = Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
            EmojiBadge("👤", size = 48)
            Spacer(Modifier.width(16.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text("Про розробника", fontSize = 17.sp, fontWeight = FontWeight.SemiBold, color = AppColors.Ink)
                Text("Контакти та донат", fontSize = 13.sp, color = AppColors.Muted)
            }
            Icon(Icons.AutoMirrored.Filled.KeyboardArrowRight, contentDescription = null, tint = AppColors.Muted)
        }
    }

    if (showSheet) {
        ModalBottomSheet(onDismissRequest = { showSheet = false }, containerColor = Color.White) {
            Column(modifier = Modifier.padding(bottom = 16.dp)) {
                Text(
                    "Про розробника",
                    modifier = Modifier.padding(horizontal = 24.dp),
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = AppColors.Ink
                )
                Text(
                    "Питання, ідеї чи помилка в уроці – напишіть мені",
                    modifier = Modifier.padding(start = 24.dp, end = 24.dp, top = 2.dp, bottom = 8.dp),
                    fontSize = 14.sp,
                    color = AppColors.Muted
                )

                ContactRow("✉️", "Email", Developer.EMAIL) {
                    val intent = Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:${Developer.EMAIL}"))
                        .putExtra(Intent.EXTRA_SUBJECT, "PT4UA")
                    open(intent, "Немає застосунку для пошти")
                }
                if (Developer.LINKEDIN_URL.isNotBlank()) {
                    val shortUrl = Developer.LINKEDIN_URL.removePrefix("https://").removePrefix("www.").trimEnd('/')
                    ContactRow("💼", "LinkedIn", shortUrl) {
                        open(Intent(Intent.ACTION_VIEW, Uri.parse(Developer.LINKEDIN_URL)), "Немає браузера")
                    }
                }
                if (Developer.TELEGRAM_PHONE.isNotBlank()) {
                    ContactRow("💬", "Telegram", Developer.TELEGRAM_PHONE) {
                        val uri = Uri.parse("https://t.me/${Developer.TELEGRAM_PHONE}")
                        open(Intent(Intent.ACTION_VIEW, uri), "Немає Telegram або браузера")
                    }
                }

                Spacer(Modifier.height(12.dp))
                Surface(
                    onClick = { open(Intent(Intent.ACTION_VIEW, Uri.parse(Developer.DONATE_URL)), "Немає браузера") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    shape = RoundedCornerShape(18.dp),
                    color = AppColors.NoteBackground
                ) {
                    Row(modifier = Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
                        Text("🇺🇦", fontSize = 30.sp)
                        Spacer(Modifier.width(14.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text("Задонатити", fontSize = 17.sp, fontWeight = FontWeight.Bold, color = AppColors.Ink)
                            Text("Фонд Стерненка · sternenkofund.org", fontSize = 13.sp, color = AppColors.NoteText)
                        }
                        Icon(Icons.AutoMirrored.Filled.KeyboardArrowRight, contentDescription = null, tint = AppColors.NoteText)
                    }
                }

                if (versionName != null) {
                    Text(
                        "PT4UA · версія $versionName",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 16.dp),
                        fontSize = 12.sp,
                        color = AppColors.Muted,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}

@Composable
private fun EmojiBadge(emoji: String, size: Int) {
    Box(
        modifier = Modifier
            .size(size.dp)
            .clip(CircleShape)
            .background(AppColors.IndigoSoft),
        contentAlignment = Alignment.Center
    ) {
        Text(emoji, fontSize = (size / 2.3).sp)
    }
}

@Composable
private fun ContactRow(emoji: String, label: String, value: String, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(horizontal = 24.dp, vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        EmojiBadge(emoji, size = 44)
        Spacer(Modifier.width(14.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(label, fontSize = 12.sp, fontWeight = FontWeight.SemiBold, color = AppColors.Indigo)
            Text(value, fontSize = 16.sp, color = AppColors.Ink, maxLines = 1, overflow = TextOverflow.Ellipsis)
        }
        Icon(Icons.AutoMirrored.Filled.KeyboardArrowRight, contentDescription = null, tint = AppColors.Muted)
    }
}

@Composable
private fun LessonCard(
    number: Int,
    title: String,
    accent: Color,
    state: LessonState,
    total: Int,
    onClick: () -> Unit
) {
    val badgeColor = if (state.completed) AppColors.Success else accent
    Surface(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 6.dp),
        shape = RoundedCornerShape(20.dp),
        color = Color.White,
        shadowElevation = 2.dp,
        border = if (state.completed) BorderStroke(1.5.dp, AppColors.Success.copy(alpha = 0.35f)) else null
    ) {
        Row(modifier = Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape)
                    .background(badgeColor),
                contentAlignment = Alignment.Center
            ) {
                if (state.completed) {
                    Icon(Icons.Default.Check, contentDescription = "Завершено", tint = Color.White)
                } else {
                    Text("$number", color = Color.White, fontSize = 18.sp, fontWeight = FontWeight.Bold)
                }
            }
            Spacer(Modifier.width(16.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text("Урок $number", fontSize = 12.sp, fontWeight = FontWeight.SemiBold, color = badgeColor)
                Text(title, fontSize = 17.sp, fontWeight = FontWeight.SemiBold, color = AppColors.Ink)
                Spacer(Modifier.height(6.dp))
                if (!state.completed && state.done > 0) {
                    ProgressBar(
                        fraction = state.done / total.toFloat(),
                        color = accent,
                        trackColor = accent.copy(alpha = 0.15f),
                        height = 6.dp
                    )
                    Spacer(Modifier.height(4.dp))
                }
                Text(
                    lessonStatus(state, total),
                    fontSize = 13.sp,
                    color = if (state.completed) AppColors.Success else AppColors.Muted
                )
            }
            Spacer(Modifier.width(8.dp))
            Icon(
                Icons.AutoMirrored.Filled.KeyboardArrowRight,
                contentDescription = null,
                tint = AppColors.Muted
            )
        }
    }
}

package ruslan.simakov.pt4ua

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ruslan.simakov.pt4ua.data.lessons.Lesson1
import ruslan.simakov.pt4ua.data.lessons.Lesson2
import ruslan.simakov.pt4ua.data.lessons.Lesson3
import ruslan.simakov.pt4ua.data.lessons.Lesson4
import java.io.Serializable

class MainActivity : ComponentActivity() {

    private val lessonNames = arrayOf(
        "Lesson 1: Теперішній час",
        "Lesson 2: Минулий час",
        "Lesson 3: SER / ESTAR / TER",
        "Lesson 4: Питання"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LessonListScreen(lessonNames) { position ->
                        startLesson(position)
                    }
                }
            }
        }
    }

    private fun startLesson(position: Int) {
        val sentences = when (position) {
            0 -> Lesson1.getSentences()
            1 -> Lesson2.getSentences()
            2 -> Lesson3.getSentences()
            3 -> Lesson4.getSentences()
            else -> throw IllegalArgumentException("Invalid lesson")
        }.shuffled()

        val intent = Intent(this, SentenceActivity::class.java).apply {
            putExtra("sentences", sentences as Serializable)
            putExtra("lesson", position + 1)
        }
        startActivity(intent)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LessonListScreen(lessons: Array<String>, onLessonClick: (Int) -> Unit) {
    val context = androidx.compose.ui.platform.LocalContext.current
    val sharedPreferences = remember { context.getSharedPreferences("LessonState", Context.MODE_PRIVATE) }
    
    var completedLessons by remember { 
        mutableStateOf(sharedPreferences.getStringSet("completedLessons", emptySet()) ?: emptySet()) 
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("PT4UA", fontWeight = FontWeight.Bold) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = Color.White
                )
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            itemsIndexed(lessons) { index, lesson ->
                LessonCard(
                    title = lesson,
                    isCompleted = completedLessons.contains(lesson),
                    onClick = { onLessonClick(index) }
                )
            }
        }
    }
}

@Composable
fun LessonCard(title: String, isCompleted: Boolean, onClick: () -> Unit) {
    ElevatedCard(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.elevatedCardColors(
            containerColor = if (isCompleted) Color(0xFFE8F5E9) else Color.White
        )
    ) {
        Row(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = title,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = if (isCompleted) Color(0xFF2E7D32) else Color(0xFF212121)
                )
                Text(
                    text = if (isCompleted) "Завершено" else "Натисніть, щоб почати",
                    fontSize = 14.sp,
                    color = if (isCompleted) Color(0xFF4CAF50) else Color.Gray
                )
            }
            Icon(
                imageVector = if (isCompleted) Icons.Default.CheckCircle else Icons.Default.PlayArrow,
                contentDescription = null,
                tint = if (isCompleted) Color(0xFF4CAF50) else MaterialTheme.colorScheme.primary,
                modifier = Modifier.size(32.dp)
            )
        }
    }
}

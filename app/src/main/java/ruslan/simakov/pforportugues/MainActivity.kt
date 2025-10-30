package ruslan.simakov.pforportugues

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.activity.ComponentActivity
import ruslan.simakov.pforportugues.data.lessons.Lesson1
import ruslan.simakov.pforportugues.data.lessons.Lesson2
import ruslan.simakov.pforportugues.data.lessons.Lesson3
import ruslan.simakov.pforportugues.data.lessons.Lesson4
import java.io.Serializable

class MainActivity : ComponentActivity() {

    private val lessonNames = arrayOf("Lesson 1", "Lesson 2", "Lesson 3", "Lesson 4")
    private lateinit var adapter: LessonAdapter
    private var selectedLessonPosition: Int = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView: ListView = findViewById(R.id.listView)
        adapter = LessonAdapter(this, lessonNames)
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            selectedLessonPosition = position
            val selectedLesson = lessonNames[position]
            val sentences = when (selectedLesson) {
                "Lesson 1" -> Lesson1.getSentences()
                "Lesson 2" -> Lesson2.getSentences()
                "Lesson 3" -> Lesson3.getSentences()
                "Lesson 4" -> Lesson4.getSentences()
                else -> throw IllegalArgumentException("Invalid lesson name")
            }.shuffled()

            val intent = Intent(this@MainActivity, SentenceActivity::class.java).apply {
                putExtra("sentences", sentences as Serializable)
            }
            startActivityForResult(intent, 1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1 && resultCode == Activity.RESULT_OK) {
            val correctAnswers = data?.getIntExtra("correctAnswers", 0) ?: 0
            val totalSentences = data?.getIntExtra("totalSentences", 0) ?: 0

            if (correctAnswers == totalSentences) {
                adapter.setLessonCompleted(lessonNames[selectedLessonPosition])
            }
        }
    }
}

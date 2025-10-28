package ruslan.simakov.pforportugues

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.ComponentActivity
import ruslan.simakov.pforportugues.data.lessons.Lesson1
import ruslan.simakov.pforportugues.data.lessons.Lesson2
import ruslan.simakov.pforportugues.data.lessons.Lesson3
import java.io.Serializable

class MainActivity : ComponentActivity() {

    private val lessonNames = arrayOf("Lesson 1", "Lesson 2", "Lesson 3")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView: ListView = findViewById(R.id.listView)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, lessonNames)
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            val selectedLesson = lessonNames[position]
            val sentences = when (selectedLesson) {
                "Lesson 1" -> Lesson1.getSentences()
                "Lesson 2" -> Lesson2.getSentences()
                "Lesson 3" -> Lesson3.getSentences()
                else -> throw IllegalArgumentException("Invalid lesson name")
            }

            val intent = Intent(this@MainActivity, SentenceActivity::class.java).apply {
                putExtra("sentences", sentences as Serializable)
            }
            startActivity(intent)
        }
    }
}

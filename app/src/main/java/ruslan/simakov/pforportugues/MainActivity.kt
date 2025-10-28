package ruslan.simakov.pforportugues

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.ComponentActivity
import ruslan.simakov.pforportugues.data.Sentence
import ruslan.simakov.pforportugues.data.lessons.Lesson1
import ruslan.simakov.pforportugues.data.lessons.Lesson2
import ruslan.simakov.pforportugues.data.lessons.Lesson3

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
            val sentence = when (selectedLesson) {
                "Lesson 1" -> Lesson1.get()
                "Lesson 2" -> Lesson2.get()
                "Lesson 3" -> Lesson3.get()
                else -> throw IllegalArgumentException("Invalid lesson name")
            }

            val intent = Intent(this@MainActivity, SentenceActivity::class.java).apply {
                putExtra("sentence", sentence)
            }
            startActivity(intent)
        }
    }
}

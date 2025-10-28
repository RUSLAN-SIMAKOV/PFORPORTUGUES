package ruslan.simakov.pforportugues

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.ComponentActivity
import ruslan.simakov.pforportugues.data.Sentence

class MainActivity : ComponentActivity() {

    private val lessonSentences = mapOf(
        "Lesson 1" to Sentence("Як справи?", listOf("Como", "vai", "você", "?")),
        "Lesson 2" to Sentence("Як тебе звати?", listOf("Qual", "é", "o", "seu", "nome", "?")),
        "Lesson 3" to Sentence("Дякую.", listOf("Obrigado", "."))
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lessonNames = lessonSentences.keys.toTypedArray()

        val listView: ListView = findViewById(R.id.listView)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, lessonNames)
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            val selectedLesson = lessonNames[position]
            val sentence = lessonSentences[selectedLesson]

            val intent = Intent(this@MainActivity, SentenceActivity::class.java).apply {
                putExtra("sentence", sentence)
            }
            startActivity(intent)
        }
    }
}

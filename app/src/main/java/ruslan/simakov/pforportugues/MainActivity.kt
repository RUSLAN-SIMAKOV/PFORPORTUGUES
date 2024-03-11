package ruslan.simakov.pforportugues

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ruslan.simakov.pforportugues.ui.theme.PforportuguesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Sample lesson names
        val lessonNames = arrayOf("Lesson 1", "Lesson 2", "Lesson 3")

        val listView: ListView = findViewById(R.id.listView)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, lessonNames)
        listView.adapter = adapter

        // Set click listener for lesson items
        listView.setOnItemClickListener { parent, view, position, id ->
            val selectedLesson = lessonNames[position]
            Toast.makeText(this@MainActivity, "Selected lesson: $selectedLesson", Toast.LENGTH_SHORT).show()
        }
    }
}

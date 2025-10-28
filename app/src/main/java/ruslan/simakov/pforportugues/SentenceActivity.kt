package ruslan.simakov.pforportugues

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.GridLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.core.content.ContextCompat
import ruslan.simakov.pforportugues.data.Sentence

class SentenceActivity : ComponentActivity() {

    private lateinit var ukrainianSentenceTextView: TextView
    private lateinit var portugueseSentenceTextView: TextView
    private lateinit var wordBankGridLayout: GridLayout
    private lateinit var resultImageView: ImageView
    private lateinit var checkButton: Button
    private lateinit var backButton: Button

    private var sentence: Sentence? = null
    private val portugueseWords = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

        ukrainianSentenceTextView = findViewById(R.id.ukrainianSentenceTextView)
        portugueseSentenceTextView = findViewById(R.id.portugueseSentenceTextView)
        wordBankGridLayout = findViewById(R.id.wordBankGridLayout)
        resultImageView = findViewById(R.id.resultImageView)
        checkButton = findViewById(R.id.checkButton)
        backButton = findViewById(R.id.backButton)

        sentence = intent.getSerializableExtra("sentence") as? Sentence

        sentence?.let { sen ->
            ukrainianSentenceTextView.text = sen.ukrainianSentence

            val wordBank = sen.correctPortugueseWords.shuffled()

            for (word in wordBank) {
                val button = Button(this)
                button.text = word
                button.setOnClickListener {
                    portugueseWords.add(word)
                    updatePortugueseSentence()
                    it.isEnabled = false
                }
                wordBankGridLayout.addView(button)
            }

            checkButton.setOnClickListener {
                if (portugueseWords == sen.correctPortugueseWords) {
                    resultImageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_correct))
                } else {
                    resultImageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_wrong))
                }
                resultImageView.visibility = View.VISIBLE
            }
        }

        backButton.setOnClickListener {
            finish()
        }
    }

    private fun updatePortugueseSentence() {
        portugueseSentenceTextView.text = portugueseWords.joinToString(" ")
    }
}

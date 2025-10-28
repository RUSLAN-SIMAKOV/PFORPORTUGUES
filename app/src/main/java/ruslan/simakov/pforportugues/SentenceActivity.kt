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
    private lateinit var nextButton: Button
    private lateinit var backButton: Button

    private var sentences: List<Sentence>? = null
    private var currentSentenceIndex = 0
    private val portugueseWords = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

        ukrainianSentenceTextView = findViewById(R.id.ukrainianSentenceTextView)
        portugueseSentenceTextView = findViewById(R.id.portugueseSentenceTextView)
        wordBankGridLayout = findViewById(R.id.wordBankGridLayout)
        resultImageView = findViewById(R.id.resultImageView)
        checkButton = findViewById(R.id.checkButton)
        nextButton = findViewById(R.id.nextButton)
        backButton = findViewById(R.id.backButton)

        sentences = intent.getSerializableExtra("sentences") as? List<Sentence>

        loadSentence()

        checkButton.setOnClickListener {
            checkAnswer()
        }

        nextButton.setOnClickListener {
            loadNextSentence()
        }

        backButton.setOnClickListener {
            finish()
        }
    }

    private fun loadSentence() {
        sentences?.let {
            if (currentSentenceIndex < it.size) {
                val sentence = it[currentSentenceIndex]
                ukrainianSentenceTextView.text = sentence.ukrainianSentence
                portugueseSentenceTextView.text = ""
                portugueseWords.clear()
                resultImageView.visibility = View.GONE
                nextButton.visibility = View.GONE
                checkButton.visibility = View.VISIBLE

                wordBankGridLayout.removeAllViews()
                val wordBank = sentence.correctPortugueseWords.shuffled()

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
            }
        }
    }

    private fun checkAnswer() {
        sentences?.let {
            val sentence = it[currentSentenceIndex]
            if (portugueseWords == sentence.correctPortugueseWords) {
                resultImageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_correct))
            } else {
                resultImageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_wrong))
            }
            resultImageView.visibility = View.VISIBLE
            if (currentSentenceIndex < it.size - 1) {
                nextButton.visibility = View.VISIBLE
            }
            checkButton.visibility = View.GONE
        }
    }

    private fun loadNextSentence() {
        currentSentenceIndex++
        loadSentence()
    }

    private fun updatePortugueseSentence() {
        portugueseSentenceTextView.text = portugueseWords.joinToString(" ")
    }
}

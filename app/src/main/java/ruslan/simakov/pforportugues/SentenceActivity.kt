package ruslan.simakov.pforportugues

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.GridLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.core.content.ContextCompat
import ruslan.simakov.pforportugues.data.Sentence
import java.util.*

class SentenceActivity : ComponentActivity(), TextToSpeech.OnInitListener {

    private lateinit var sentenceCounterTextView: TextView
    private lateinit var ukrainianSentenceTextView: TextView
    private lateinit var portugueseSentenceTextView: TextView
    private lateinit var wordBankGridLayout: GridLayout
    private lateinit var resultImageView: ImageView
    private lateinit var checkButton: Button
    private lateinit var nextButton: Button
    private lateinit var backButton: Button

    private lateinit var tts: TextToSpeech

    private var sentences: List<Sentence>? = null
    private var currentSentenceIndex = 0
    private var correctAnswers = 0
    private val portugueseWords = mutableListOf<String>()
    private val clickedWordButtons = mutableListOf<Button>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

        sentenceCounterTextView = findViewById(R.id.sentenceCounterTextView)
        ukrainianSentenceTextView = findViewById(R.id.ukrainianSentenceTextView)
        portugueseSentenceTextView = findViewById(R.id.portugueseSentenceTextView)
        wordBankGridLayout = findViewById(R.id.wordBankGridLayout)
        resultImageView = findViewById(R.id.resultImageView)
        checkButton = findViewById(R.id.checkButton)
        nextButton = findViewById(R.id.nextButton)
        backButton = findViewById(R.id.backButton)

        tts = TextToSpeech(this, this)

        sentences = intent.getSerializableExtra("sentences") as? List<Sentence>

        loadSentence()

        checkButton.setOnClickListener {
            checkAnswer()
        }

        nextButton.setOnClickListener {
            loadNextSentence()
        }

        backButton.setOnClickListener {
            setResult(Activity.RESULT_CANCELED)
            finish()
        }

        portugueseSentenceTextView.setOnClickListener {
            if (clickedWordButtons.isNotEmpty()) {
                val lastClickedButton = clickedWordButtons.removeLast()
                lastClickedButton.isEnabled = true
                portugueseWords.removeLast()
                updatePortugueseSentence()
            }
        }
    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            val result = tts.setLanguage(Locale("pt", "PT"))
            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                Log.e("TTS", "The Language specified is not supported!")
            }
        } else {
            Log.e("TTS", "Initialization Failed!")
        }
    }

    private fun loadSentence() {
        sentences?.let {
            if (currentSentenceIndex < it.size) {
                val sentence = it[currentSentenceIndex]
                sentenceCounterTextView.text = "${currentSentenceIndex + 1} / ${it.size}"
                ukrainianSentenceTextView.text = sentence.ukrainianSentence
                portugueseSentenceTextView.text = ""
                portugueseWords.clear()
                clickedWordButtons.clear()
                resultImageView.visibility = View.GONE
                nextButton.visibility = View.GONE
                checkButton.visibility = View.VISIBLE

                wordBankGridLayout.removeAllViews()
                val wordBank = sentence.correctPortugueseWords.shuffled()

                for (word in wordBank) {
                    val button = Button(this)
                    button.text = word
                    button.setOnClickListener {
                        val clickedButton = it as Button
                        portugueseWords.add(word)
                        clickedWordButtons.add(clickedButton)
                        updatePortugueseSentence()
                        clickedButton.isEnabled = false
                    }
                    wordBankGridLayout.addView(button)
                }
            } else {
                val resultIntent = Intent()
                resultIntent.putExtra("correctAnswers", correctAnswers)
                resultIntent.putExtra("totalSentences", it.size)
                setResult(Activity.RESULT_OK, resultIntent)
                finish()
            }
        }
    }

    private fun checkAnswer() {
        sentences?.let {
            val sentence = it[currentSentenceIndex]
            if (portugueseWords == sentence.correctPortugueseWords) {
                resultImageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_correct))
                correctAnswers++
                tts.speak(portugueseSentenceTextView.text.toString(), TextToSpeech.QUEUE_FLUSH, null, "")
            } else {
                resultImageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_wrong))
            }
            resultImageView.visibility = View.VISIBLE
            if (currentSentenceIndex < it.size) {
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

    override fun onDestroy() {
        if (::tts.isInitialized) {
            tts.stop()
            tts.shutdown()
        }
        super.onDestroy()
    }
}

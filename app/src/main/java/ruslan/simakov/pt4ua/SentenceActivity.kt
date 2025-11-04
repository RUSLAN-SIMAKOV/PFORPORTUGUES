package ruslan.simakov.pt4ua

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
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
import ruslan.simakov.pt4ua.data.Sentence
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
    private lateinit var helpButton: Button
    private lateinit var ruleImageView: ImageView
    private lateinit var clickInterceptor: View

    private lateinit var tts: TextToSpeech
    private lateinit var sharedPreferences: SharedPreferences

    private var sentences: List<Sentence>? = null
    private var incorrectSentences = mutableListOf<Sentence>()
    private var currentSentenceIndex = 0
    private var correctAnswers = 0
    private var lesson = 1
    private var totalSentencesInLesson = 0
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
        helpButton = findViewById(R.id.helpButton)
        ruleImageView = findViewById(R.id.ruleImageView)
        clickInterceptor = findViewById(R.id.clickInterceptor)

        tts = TextToSpeech(this, this)
        sharedPreferences = getSharedPreferences("LessonState", Context.MODE_PRIVATE)

        val originalSentences = intent.getSerializableExtra("sentences") as? List<Sentence>
        sentences = originalSentences?.shuffled()
        totalSentencesInLesson = sentences?.size ?: 0

        lesson = intent.getIntExtra("lesson", 1)
        currentSentenceIndex = sharedPreferences.getInt("lesson_${lesson}_progress", 0)

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

        helpButton.setOnClickListener {
            val ruleImage = when (lesson) {
                1 -> R.drawable.less1
                2 -> R.drawable.less2
                3 -> R.drawable.less3
                4 -> R.drawable.less4
                else -> R.drawable.less1 // Default image
            }
            ruleImageView.setImageResource(ruleImage)
            ruleImageView.visibility = View.VISIBLE
        }

        ruleImageView.setOnClickListener {
            ruleImageView.visibility = View.GONE
        }

        portugueseSentenceTextView.setOnClickListener {
            if (clickedWordButtons.isNotEmpty()) {
                val lastClickedButton = clickedWordButtons.removeLast()
                lastClickedButton.isEnabled = true
                portugueseWords.removeLast()
                updatePortugueseSentence()
            }
        }

        clickInterceptor.setOnClickListener {
            wordBankGridLayout.visibility = View.VISIBLE
            checkButton.visibility = View.VISIBLE
            backButton.visibility = View.VISIBLE
            helpButton.visibility = View.VISIBLE
            clickInterceptor.visibility = View.GONE
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
        val currentList = sentences
        if (currentList != null && currentSentenceIndex < currentList.size) {
            with(sharedPreferences.edit()) {
                putInt("lesson_${lesson}_progress", currentSentenceIndex)
                apply()
            }

            clickInterceptor.visibility = View.VISIBLE
            wordBankGridLayout.visibility = View.GONE
            checkButton.visibility = View.GONE
            nextButton.visibility = View.GONE
            backButton.visibility = View.GONE
            helpButton.visibility = View.GONE
            resultImageView.visibility = View.GONE

            val sentence = currentList[currentSentenceIndex]
            sentenceCounterTextView.text = "${currentSentenceIndex + 1} / ${currentList.size}"
            ukrainianSentenceTextView.text = sentence.ukrainianSentence
            portugueseSentenceTextView.text = ""
            portugueseWords.clear()
            clickedWordButtons.clear()

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
            if (incorrectSentences.isNotEmpty()) {
                sentences = incorrectSentences.shuffled()
                incorrectSentences = mutableListOf()
                currentSentenceIndex = 0
                loadSentence()
            } else {
                with(sharedPreferences.edit()) {
                    remove("lesson_${lesson}_progress")
                    apply()
                }

                val resultIntent = Intent()
                resultIntent.putExtra("correctAnswers", totalSentencesInLesson)
                resultIntent.putExtra("totalSentences", totalSentencesInLesson)
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
                portugueseSentenceTextView.text = sentence.correctPortugueseWords.joinToString(" ")
                incorrectSentences.add(sentence)
            }
            resultImageView.visibility = View.VISIBLE
            nextButton.visibility = View.VISIBLE
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

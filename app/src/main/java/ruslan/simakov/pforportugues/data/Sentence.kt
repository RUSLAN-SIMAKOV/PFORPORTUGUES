package ruslan.simakov.pforportugues.data

import java.io.Serializable

data class Sentence(
    val ukrainianSentence: String,
    val correctPortugueseWords: List<String>
) : Serializable

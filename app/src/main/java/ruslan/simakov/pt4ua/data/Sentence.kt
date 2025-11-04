package ruslan.simakov.pt4ua.data

import java.io.Serializable

data class Sentence(
    val ukrainianSentence: String,
    val correctPortugueseWords: List<String>
) : Serializable

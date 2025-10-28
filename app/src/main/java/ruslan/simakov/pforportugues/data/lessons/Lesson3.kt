package ruslan.simakov.pforportugues.data.lessons

import ruslan.simakov.pforportugues.data.Sentence

object Lesson3 {
    fun getSentences(): List<Sentence> {
        return listOf(
            Sentence("Дякую.", listOf("Obrigado", ".")),
            Sentence("Допоможіть!", listOf("Socorro", "!")),
            Sentence("Я не розумію.", listOf("Eu", "não", "entendo", "."))
        )
    }
}

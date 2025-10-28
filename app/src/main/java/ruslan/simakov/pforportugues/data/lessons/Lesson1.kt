package ruslan.simakov.pforportugues.data.lessons

import ruslan.simakov.pforportugues.data.Sentence

object Lesson1 {
    fun getSentences(): List<Sentence> {
        return listOf(
            Sentence("Як справи?", listOf("Como", "vai", "você", "?")),
            Sentence("Дякую, добре.", listOf("Bem", "obrigado", ".")),
            Sentence("Будь ласка.", listOf("De", "nada", "."))
        )
    }
}

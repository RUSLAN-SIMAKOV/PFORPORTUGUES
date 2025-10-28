package ruslan.simakov.pforportugues.data.lessons

import ruslan.simakov.pforportugues.data.Sentence

object Lesson2 {
    fun getSentences(): List<Sentence> {
        return listOf(
            Sentence("Як тебе звати?", listOf("Qual", "é", "o", "seu", "nome", "?")),
            Sentence("Мене звати...", listOf("Meu", "nome", "é", "...")),
            Sentence("Приємно познайомитись.", listOf("Prazer", "em", "conhecê-lo", "."))
        )
    }
}

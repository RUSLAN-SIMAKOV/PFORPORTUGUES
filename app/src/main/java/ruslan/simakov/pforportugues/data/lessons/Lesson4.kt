package ruslan.simakov.pforportugues.data.lessons

import ruslan.simakov.pforportugues.data.Sentence

object Lesson4 {
    fun getSentences(): List<Sentence> {
        return listOf(
            Sentence("Весна - прекрасна пора року.", listOf("A", "primavera", "é", "uma", "estação", "bonita", ".")),
            Sentence("Я люблю літо.", listOf("Eu", "gosto", "do", "verão", ".")),
            Sentence("Осінь барвиста.", listOf("O", "outono", "é", "colorido", ".")),
            Sentence("Зима холодна.", listOf("O", "inverno", "é", "frio", "."))
        )
    }
}

package ruslan.simakov.pt4ua.data.lessons

import ruslan.simakov.pt4ua.data.Sentence

object Lesson5 {

    fun getSentences(): List<Sentence> {
        return listOf(
            Sentence("Що я роблю?", listOf("O que", "eu", "faço?")),
            Sentence("я роблю?", listOf("eu", "faço?")),
            Sentence("роблю?", listOf("faço?")),
        )
    }
}

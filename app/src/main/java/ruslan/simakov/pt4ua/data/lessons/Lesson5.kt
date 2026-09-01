package ruslan.simakov.pt4ua.data.lessons

import ruslan.simakov.pt4ua.data.Sentence

object Lesson5 {

    fun getSentences(): List<Sentence> {
        return listOf(
            // VERBOS EM -ER (Presente)
            // COMER - їсти
            Sentence("Я їм", listOf("Eu", "como")),
            Sentence("Ти їси", listOf("Tu", "comes")),
            Sentence("Він їсть", listOf("Ele", "come")),
            Sentence("Ми їмо", listOf("Nós", "comemos")),
            Sentence("Вони їдять", listOf("Eles", "comem")),

            // BEBER - пити
            Sentence("Я п'ю", listOf("Eu", "bebo")),
            Sentence("Ти п'єш", listOf("Tu", "bebes")),
            Sentence("Вона п'є", listOf("Ela", "bebe")),
            Sentence("Ми п'ємо", listOf("Nós", "bebemos")),
            Sentence("Вони п'ють", listOf("Vocês", "bebem")),

            // VERBOS EM -IR (Presente)
            // PARTIR - від'їжджати / розбивати
            Sentence("Я від'їжджаю", listOf("Eu", "parto")),
            Sentence("Ти від'їжджаєш", listOf("Tu", "partes")),
            Sentence("Він від'їжджає", listOf("Ele", "parte")),
            Sentence("Ми від'їжджаємо", listOf("Nós", "partimos")),
            Sentence("Вони від'їжджають", listOf("Eles", "partem")),

            // ABRIR - відкривати
            Sentence("Я відкриваю", listOf("Eu", "abro")),
            Sentence("Ти відкриваєш", listOf("Tu", "abres")),
            Sentence("Вона відкриває", listOf("Ela", "abre")),
            Sentence("Ми відкриваємо", listOf("Nós", "abrimos")),
            Sentence("Вони відкривають", listOf("Eles", "abrem")),

            // VERBOS EM -ER (Pretérito Perfeito - Минулий час)
            // COMER
            Sentence("Я з'їв", listOf("Eu", "comi")),
            Sentence("Ти з'їв", listOf("Tu", "comeste")),
            Sentence("Він з'їв", listOf("Ele", "comeu")),
            Sentence("Ми з'їли", listOf("Nós", "comemos")),
            Sentence("Вони з'їли", listOf("Eles", "comeram")),

            // VERBOS EM -IR (Pretérito Perfeito - Минулий час)
            // ABRIR
            Sentence("Я відкрив", listOf("Eu", "abri")),
            Sentence("Ти відкрив", listOf("Tu", "abriste")),
            Sentence("Вона відкрила", listOf("Ela", "abriu")),
            Sentence("Ми відкрили", listOf("Nós", "abrimos")),
            Sentence("Вони відкрили", listOf("Eles", "abriram")),

            // FRASES ÚTEIS
            Sentence("Я п'ю каву", listOf("Eu", "bebo", "café")),
            Sentence("Ми їмо хліб", listOf("Nós", "comemos", "pão")),
            Sentence("Він відкриває двері", listOf("Ele", "abre", "a", "porta")),
            Sentence("Вони вже від'їхали", listOf("Eles", "já", "partiram"))
        )
    }
}

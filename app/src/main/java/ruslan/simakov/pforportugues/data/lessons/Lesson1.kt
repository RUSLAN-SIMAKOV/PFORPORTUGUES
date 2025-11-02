package ruslan.simakov.pforportugues.data.lessons

import ruslan.simakov.pforportugues.data.Sentence

object Lesson1 {
    // á
    // AMAR
    fun getSentences(): List<Sentence> {
        return listOf(
            Sentence("Привіт. Доброго ранку. Доброго дня і доброї ночі", listOf("Olá", "Bom", "dia", "Boa", "tarde", "e", "Boa", "noite")),
            Sentence("До побачення", listOf("Até", "logo")),
            Sentence("Бувай", listOf("Tchau")),
            Sentence("Будь ласка", listOf("Por", "favor")),
            Sentence("Дякую (чоловік говорить)", listOf("Obrigado")),
            Sentence("Дякую (жінка говорить)", listOf("Obrigada")),
            // AMAR – любити
            Sentence("Я люблю", listOf("Eu", "amo")),
            Sentence("Ти любиш", listOf("Você", "ama")),
            Sentence("Він любить", listOf("Ele", "ama")),
            Sentence("Вона любить", listOf("Ela", "ama")),
            Sentence("Ми любимо", listOf("Nós", "amamos")),
            Sentence("Ви любите", listOf("Vocês", "amam")),
            Sentence("Вони люблять (чоловіки)", listOf("Eles", "amam")),
            Sentence("Вони люблять (жінки)", listOf("Elas", "amam")),

            // FALAR – говорити
            Sentence("Я говорю", listOf("Eu", "falo")),
            Sentence("Ти говориш", listOf("Você", "fala")),
            Sentence("Він говорить", listOf("Ele", "fala")),
            Sentence("Вона говорить", listOf("Ela", "fala")),
            Sentence("Ми говоримо", listOf("Nós", "falamos")),
            Sentence("Ви говорите", listOf("Vocês", "falam")),
            Sentence("Вони говорять (чоловіки)", listOf("Eles", "falam")),
            Sentence("Вони говорять (жінки)", listOf("Elas", "falam")),

            // CANTAR – співати
            Sentence("Я співаю", listOf("Eu", "canto")),
            Sentence("Ти співаєш", listOf("Você", "canta")),
            Sentence("Він співає", listOf("Ele", "canta")),
            Sentence("Вона співає", listOf("Ela", "canta")),
            Sentence("Ми співаємо", listOf("Nós", "cantamos")),
            Sentence("Ви співаєте", listOf("Vocês", "cantam")),
            Sentence("Вони співають (чоловіки)", listOf("Eles", "cantam")),
            Sentence("Вони співають (жінки)", listOf("Elas", "cantam")),

            // TRABALHAR – працювати
            Sentence("Я працюю", listOf("Eu", "trabalho")),
            Sentence("Ти працюєш", listOf("Você", "trabalha")),
            Sentence("Він працює", listOf("Ele", "trabalha")),
            Sentence("Вона працює", listOf("Ela", "trabalha")),
            Sentence("Ми працюємо", listOf("Nós", "trabalhamos")),
            Sentence("Ви працюєте", listOf("Vocês", "trabalham")),
            Sentence("Вони працюють (чоловіки)", listOf("Eles", "trabalham")),
            Sentence("Вони працюють (жінки)", listOf("Elas", "trabalham")),

            // COMPRAR – купувати
            Sentence("Я купую", listOf("Eu", "compro")),
            Sentence("Ти купуєш", listOf("Você", "compra")),
            Sentence("Він купує", listOf("Ele", "compra")),
            Sentence("Вона купує", listOf("Ela", "compra")),
            Sentence("Ми купуємо", listOf("Nós", "compramos")),
            Sentence("Ви купуєте", listOf("Vocês", "compram")),
            Sentence("Вони купують (чоловіки)", listOf("Eles", "compram")),
            Sentence("Вони купують (жінки)", listOf("Elas", "compram")),

            // PERGUNTAR – питати
            Sentence("Я питаю", listOf("Eu", "pergunto")),
            Sentence("Ти питаєш", listOf("Você", "pergunta")),
            Sentence("Він питає", listOf("Ele", "pergunta")),
            Sentence("Вона питає", listOf("Ela", "pergunta")),
            Sentence("Ми питаємо", listOf("Nós", "perguntamos")),
            Sentence("Ви питаєте", listOf("Vocês", "perguntam")),
            Sentence("Вони питають (чоловіки)", listOf("Eles", "perguntam")),
            Sentence("Вони питають (жінки)", listOf("Elas", "perguntam")),

            // MORAR – жити
            Sentence("Я живу", listOf("Eu", "moro")),
            Sentence("Ти живеш", listOf("Você", "mora")),
            Sentence("Він живе", listOf("Ele", "mora")),
            Sentence("Вона живе", listOf("Ela", "mora")),
            Sentence("Ми живемо", listOf("Nós", "moramos")),
            Sentence("Ви живете", listOf("Vocês", "moram")),
            Sentence("Вони живуть (чоловіки)", listOf("Eles", "moram")),
            Sentence("Вони живуть (жінки)", listOf("Elas", "moram")),

            // ESCUTAR – слухати
            Sentence("Я слухаю", listOf("Eu", "escuto")),
            Sentence("Ти слухаєш", listOf("Você", "escuta")),
            Sentence("Він слухає", listOf("Ele", "escuta")),
            Sentence("Вона слухає", listOf("Ela", "escuta")),
            Sentence("Ми слухаємо", listOf("Nós", "escutamos")),
            Sentence("Ви слухаєте", listOf("Vocês", "escutam")),
            Sentence("Вони слухають (чоловіки)", listOf("Eles", "escutam")),
            Sentence("Вони слухають (жінки)", listOf("Elas", "escutam")),

            // OLHAR – дивитись
            Sentence("Я дивлюся", listOf("Eu", "olho")),
            Sentence("Ти дивишся", listOf("Você", "olha")),
            Sentence("Він дивиться", listOf("Ele", "olha")),
            Sentence("Вона дивиться", listOf("Ela", "olha")),
            Sentence("Ми дивимося", listOf("Nós", "olhamos")),
            Sentence("Ви дивитесь", listOf("Vocês", "olham")),
            Sentence("Вони дивляться (чоловіки)", listOf("Eles", "olham")),
            Sentence("Вони дивляться (жінки)", listOf("Elas", "olham")),

            // DANÇAR – танцювати
            Sentence("Я танцюю", listOf("Eu", "danço")),
            Sentence("Ти танцюєш", listOf("Você", "dança")),
            Sentence("Він танцює", listOf("Ele", "dança")),
            Sentence("Вона танцює", listOf("Ela", "dança")),
            Sentence("Ми танцюємо", listOf("Nós", "dançamos")),
            Sentence("Ви танцюєте", listOf("Vocês", "dançam")),
            Sentence("Вони танцюють (чоловіки)", listOf("Eles", "dançam")),
            Sentence("Вони танцюють (жінки)", listOf("Elas", "dançam"))
        )
    }
}

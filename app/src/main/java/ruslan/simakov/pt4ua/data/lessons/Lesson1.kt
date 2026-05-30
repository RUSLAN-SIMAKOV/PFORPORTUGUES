package ruslan.simakov.pt4ua.data.lessons

import ruslan.simakov.pt4ua.data.Sentence

object Lesson1 {
    fun getSentences(): List<Sentence> {
        return listOf(
            // ПРИВІТАННЯ ТА ВВІЧЛИВІ СЛОВА (GREETINGS & COURTESY)
            Sentence("Привіт", listOf("Olá")),
            Sentence("Добрий ранок", listOf("Bom", "dia")),
            Sentence("Добрий день", listOf("Boa", "tarde")),
            Sentence("Добрий вечір", listOf("Boa", "noite")),
            Sentence("На добраніч", listOf("Boa", "noite")),
            Sentence("Як справи?", listOf("Como", "vai?")),
            Sentence("Дуже приємно", listOf("Muito", "prazer")),
            Sentence("Дякую (чоловік)", listOf("Obrigado")),
            Sentence("Дякую (жінка)", listOf("Obrigada")),
            Sentence("Будь ласка", listOf("Por", "favor")),
            Sentence("Вибачте", listOf("Com", "licença")),
            Sentence("З вашого дозволу", listOf("Com", "licença")),
            Sentence("До побачення", listOf("Até", "logo")),
            Sentence("Бувай", listOf("Tchau")),

            // AMAR – любити (Теперішній час)
            Sentence("Я люблю", listOf("Eu", "amo")),
            Sentence("Ти любиш", listOf("Tu", "amas")),
            Sentence("Ви любите", listOf("Você", "ama")),
            Sentence("Він любить", listOf("Ele", "ama")),
            Sentence("Вона любить", listOf("Ela", "ama")),
            Sentence("Ми любимо", listOf("Nós", "amamos")),
            Sentence("Ви любите (множина)", listOf("Vocês", "amam")),
            Sentence("Вони люблять (чоловіки)", listOf("Eles", "amam")),
            Sentence("Вони люблять (жінки)", listOf("Elas", "amam")),

            // FALAR – говорити
            Sentence("Я говорю", listOf("Eu", "falo")),
            Sentence("Ти говориш", listOf("Tu", "falas")),
            Sentence("Ви говорите", listOf("Você", "fala")),
            Sentence("Він говорить", listOf("Ele", "fala")),
            Sentence("Вона говорить", listOf("Ela", "fala")),
            Sentence("Ми говоримо", listOf("Nós", "falamos")),
            Sentence("Ви говорите (множина)", listOf("Vocês", "falam")),
            Sentence("Вони говорять (чоловіки)", listOf("Eles", "falam")),
            Sentence("Вони говорять (жінки)", listOf("Elas", "falam")),

            // TRABALHAR – працювати
            Sentence("Я працюю", listOf("Eu", "trabalho")),
            Sentence("Ти працюєш", listOf("Tu", "trabalhas")),
            Sentence("Ви працюєте", listOf("Você", "trabalha")),
            Sentence("Він працює", listOf("Ele", "trabalha")),
            Sentence("Вона працює", listOf("Ela", "trabalha")),
            Sentence("Ми працюємо", listOf("Nós", "trabalhamos")),
            Sentence("Ви працюєте (множина)", listOf("Vocês", "trabalham")),
            Sentence("Вони працюють (чоловіки)", listOf("Eles", "trabalham")),
            Sentence("Вони працюють (жінки)", listOf("Elas", "trabalham")),

            // MORAR – жити (проживати)
            Sentence("Я живу", listOf("Eu", "moro")),
            Sentence("Ти живеш", listOf("Tu", "moras")),
            Sentence("Ви живете", listOf("Você", "mora")),
            Sentence("Він живе", listOf("Ele", "mora")),
            Sentence("Вона живе", listOf("Ela", "mora")),
            Sentence("Ми живемо", listOf("Nós", "moramos")),
            Sentence("Ви живете (множина)", listOf("Vocês", "moram")),
            Sentence("Вони живуть (чоловіки)", listOf("Eles", "moram")),
            Sentence("Вони живуть (жінки)", listOf("Elas", "moram")),

            // COMPRAR – купувати
            Sentence("Я купую", listOf("Eu", "compro")),
            Sentence("Ти купуєш", listOf("Tu", "compras")),
            Sentence("Ви купуєте", listOf("Você", "compra")),
            Sentence("Він купує", listOf("Ele", "compra")),
            Sentence("Вона купує", listOf("Ela", "compra")),
            Sentence("Ми купуємо", listOf("Nós", "compramos")),
            Sentence("Ви купуєте (множина)", listOf("Vocês", "compram")),
            Sentence("Вони купують (чоловіки)", listOf("Eles", "compram")),
            Sentence("Вони купують (жінки)", listOf("Elas", "compram")),

            // PERGUNTAR – питати
            Sentence("Я питаю", listOf("Eu", "pergunto")),
            Sentence("Ти питаєш", listOf("Tu", "pergunto")),
            Sentence("Ви питаєте", listOf("Você", "pergunta")),
            Sentence("Він питає", listOf("Ele", "pergunta")),
            Sentence("Вона питає", listOf("Ela", "pergunta")),
            Sentence("Ми питаємо", listOf("Nós", "perguntamos")),
            Sentence("Ви питаєте (множина)", listOf("Vocês", "perguntam")),
            Sentence("Вони питають (чоловіки)", listOf("Eles", "perguntam")),
            Sentence("Вони питають (жінки)", listOf("Elas", "perguntam")),

            // AMAR – минулий час (Pretérito Perfeito)
            Sentence("Я любив", listOf("Eu", "amei")),
            Sentence("Я любила", listOf("Eu", "amei")),
            Sentence("Ти любив", listOf("Tu", "amaste")),
            Sentence("Ти любила", listOf("Tu", "amaste")),
            Sentence("Ви любили", listOf("Você", "amou")),
            Sentence("Він любив", listOf("Ele", "amou")),
            Sentence("Вона любила", listOf("Ela", "amou")),
            Sentence("Ми любили", listOf("Nós", "amamos")),
            Sentence("Ви любили (множина)", listOf("Vocês", "amaram")),
            Sentence("Вони любили (чоловіки)", listOf("Eles", "amaram")),
            Sentence("Вони любили (жінки)", listOf("Elas", "amaram"))
        )
    }
}

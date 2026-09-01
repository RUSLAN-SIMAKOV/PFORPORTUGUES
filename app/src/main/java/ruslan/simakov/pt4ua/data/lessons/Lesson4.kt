package ruslan.simakov.pt4ua.data.lessons

import ruslan.simakov.pt4ua.data.Sentence

object Lesson4 {
    fun getSentences(): List<Sentence> {
        return listOf(
            // O QUE – що
            Sentence("Що я роблю?", listOf("O que", "eu", "faço?")),
            Sentence("Що я не роблю?", listOf("O que", "eu", "não", "faço?")),
            Sentence("Що ти робиш?", listOf("O que", "tu", "fazes?")),
            Sentence("Що Ви робите? (ввічливо)", listOf("O que", "você", "faz?")),
            Sentence("Що він робить?", listOf("O que", "ele", "faz?")),
            Sentence("Що вона робить?", listOf("O que", "ela", "faz?")),
            Sentence("Що ми робимо?", listOf("O que", "nós", "fazemos?")),
            Sentence("Що ви робите? (множина)", listOf("O que", "vocês", "fazem?")),
            Sentence("Що вони роблять? (чоловіки)", listOf("O que", "eles", "fazem?")),
            Sentence("Що вони роблять? (жінки)", listOf("O que", "elas", "fazem?")),

            // QUEM – хто
            Sentence("Хто я?", listOf("Quem", "eu", "sou?")),
            Sentence("Хто ти?", listOf("Quem", "tu", "és?")),
            Sentence("Хто Ви? (ввічливо)", listOf("Quem", "você", "é?")),
            Sentence("Хто він?", listOf("Quem", "ele", "é?")),
            Sentence("Хто вона?", listOf("Quem", "ela", "é?")),
            Sentence("Хто ми?", listOf("Quem", "nós", "somos?")),
            Sentence("Хто ви? (множина)", listOf("Quem", "vocês", "são?")),
            Sentence("Хто вони? (чоловіки)", listOf("Quem", "eles", "são?")),
            Sentence("Хто вони? (жінки)", listOf("Quem", "elas", "são?")),

            // ONDE – де
            Sentence("Де я?", listOf("Onde", "eu", "estou?")),
            Sentence("Де ти?", listOf("Onde", "tu", "estás?")),
            Sentence("Де Ви? (ввічливо)", listOf("Onde", "você", "está?")),
            Sentence("Де він?", listOf("Onde", "ele", "está?")),
            Sentence("Де вона?", listOf("Onde", "ela", "está?")),
            Sentence("Де ми?", listOf("Onde", "nós", "estamos?")),
            Sentence("Де ви? (множина)", listOf("Onde", "vocês", "estão?")),
            Sentence("Де вони? (чоловіки)", listOf("Onde", "eles", "estão?")),
            Sentence("Де вони? (жінки)", listOf("Onde", "elas", "estão?")),

            // QUANDO – коли
            Sentence("Коли я приходжу?", listOf("Quando", "eu", "chego?")),
            Sentence("Коли ти приходиш?", listOf("Quando", "tu", "chegas?")),
            Sentence("Коли Ви приходите? (ввічливо)", listOf("Quando", "você", "chega?")),
            Sentence("Коли він приходить?", listOf("Quando", "ele", "chega?")),
            Sentence("Коли вона приходить?", listOf("Quando", "ela", "chega?")),
            Sentence("Коли ми приходимо?", listOf("Quando", "nós", "chegamos?")),
            Sentence("Коли ви приходите? (множина)", listOf("Quando", "vocês", "chegam?")),
            Sentence("Коли вони приходять? (чоловіки)", listOf("Quando", "eles", "chegam?")),
            Sentence("Коли вони приходять? (жінки)", listOf("Quando", "elas", "chegam?")),

            // QUANTO – скільки
            Sentence("Скільки я маю?", listOf("Quanto", "eu", "tenho?")),
            Sentence("Скільки ти маєш?", listOf("Quanto", "tu", "tens?")),
            Sentence("Скільки Ви маєте? (ввічливо)", listOf("Quanto", "você", "tem?")),
            Sentence("Скільки він має?", listOf("Quanto", "ele", "tem?")),
            Sentence("Скільки вона має?", listOf("Quanto", "ela", "tem?")),
            Sentence("Скільки ми маємо?", listOf("Quanto", "nós", "temos?")),
            Sentence("Скільки ви маєте? (множина)", listOf("Quanto", "vocês", "têm?")),
            Sentence("Скільки вони мають? (чоловіки)", listOf("Quanto", "eles", "têm?")),
            Sentence("Скільки вони мають? (жінки)", listOf("Quanto", "elas", "têm?")),

            // COMO – як
            Sentence("Як я це роблю?", listOf("Como", "eu", "faço", "isso?")),
            Sentence("Як ти це робиш?", listOf("Como", "tu", "fazes", "isso?")),
            Sentence("Як Ви це робите? (ввічливо)", listOf("Como", "você", "faz", "isso?")),
            Sentence("Як він це робить?", listOf("Como", "ele", "faz", "isso?")),
            Sentence("Як ми це робимо?", listOf("Como", "nós", "fazemos", "isso?")),
            Sentence("Як вони це роблять? (чоловіки)", listOf("Como", "eles", "fazem", "isso?")),

            // PORQUE – чому
            Sentence("Чому я допомагаю?", listOf("Porque", "eu", "ajudo?")),
            Sentence("Чому ти допомагаєш?", listOf("Porque", "tu", "ajudas?")),
            Sentence("Чому Ви допомагаєте? (ввічливо)", listOf("Porque", "você", "ajuda?")),
            Sentence("Чому він допомагає?", listOf("Porque", "ele", "ajuda?")),
            Sentence("Чому ми допомагаємо?", listOf("Porque", "nós", "ajudamos?")),
            Sentence("Чому вони допомагають? (чоловіки)", listOf("Porque", "eles", "ajudam?")),

            // QUAL – який / яка
            Sentence("Як Вас звати?", listOf("Qual", "é", "o", "seu", "nome?")),
            Sentence("Який я обираю?", listOf("Qual", "eu", "escolho?")),
            Sentence("Який ти обираєш?", listOf("Qual", "tu", "escolhes?")),
            Sentence("Який Ви обираєте? (ввічливо)", listOf("Qual", "você", "escolhe?")),
            Sentence("Який він обирає?", listOf("Qual", "ele", "escolhe?")),
            Sentence("Яка вона обирає?", listOf("Qual", "ela", "escolhe?")),
            Sentence("Який ми обираємо?", listOf("Qual", "nós", "escolhemos?")),
            Sentence("Які вони обирають? (чоловіки)", listOf("Qual", "eles", "escolhem?")),

            // ISSO – це
            Sentence("Що це означає?", listOf("O", "que", "isso", "significa?")),
            Sentence("Це корисно?", listOf("Isso", "é", "útil?")),
            Sentence("Це важливо?", listOf("Isso", "é", "importante?"))
        )
    }
}

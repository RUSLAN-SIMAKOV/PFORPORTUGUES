package ruslan.simakov.pforportugues.data.lessons

import ruslan.simakov.pforportugues.data.Sentence

object Lesson4 {
    fun getSentences(): List<Sentence> {
        return listOf(
            Sentence("Що я роблю?", listOf("O que", "eu", "faço?")),
            Sentence("Що я не роблю?", listOf("O que", "eu", "não", "faço?")),
            Sentence("Що ти робиш?", listOf("O que", "tu", "faz?")),
            Sentence("Що ти не робиш?", listOf("O que", "tu", "não", "faz?")),
            Sentence("Що він робить?", listOf("O que", "ele", "faz?")),
            Sentence("Що він не робить?", listOf("O que", "ele", "não", "faz?")),
            Sentence("Що вона робить?", listOf("O que", "ela", "faz?")),
            Sentence("Що вона не робить?", listOf("O que", "ela", "não", "faz?")),
            Sentence("Що ми робимо?", listOf("O que", "nós", "fazemos?")),
            Sentence("Що ми не робимо?", listOf("O que", "nós", "não", "fazemos?")),
            Sentence("Що ви робите?", listOf("O que", "vocês", "fazem?")),
            Sentence("Що ви не робите?", listOf("O que", "vocês", "não", "fazem?")),
            Sentence("Що вони роблять (чоловіки)?", listOf("O que", "eles", "fazem?")),
            Sentence("Що вони не роблять (чоловіки)?", listOf("O que", "eles", "não", "fazem?")),
            Sentence("Що вони роблять (жінки)?", listOf("O que", "elas", "fazem?")),
            Sentence("Що вони не роблять (жінки)?", listOf("O que", "elas", "não", "fazem?")),

// QUEM – хто
            Sentence("Хто я?", listOf("Quem", "eu", "sou?")),
            Sentence("Хто ти?", listOf("Quem", "tu", "és?")),
            Sentence("Хто він?", listOf("Quem", "ele", "é?")),
            Sentence("Хто вона?", listOf("Quem", "ela", "é?")),
            Sentence("Хто ми?", listOf("Quem", "nós", "somos?")),
            Sentence("Хто ви?", listOf("Quem", "vocês", "são?")),
            Sentence("Хто вони (чоловіки)?", listOf("Quem", "eles", "são?")),
            Sentence("Хто вони (жінки)?", listOf("Quem", "elas", "são?")),

// ONDE – де
            Sentence("Де я є?", listOf("Onde", "eu", "estou?")),
            Sentence("Де ти є?", listOf("Onde", "tu", "estás?")),
            Sentence("Де він є?", listOf("Onde", "ele", "está?")),
            Sentence("Де вона є?", listOf("Onde", "ela", "está?")),
            Sentence("Де ми є?", listOf("Onde", "nós", "estamos?")),
            Sentence("Де ви є?", listOf("Onde", "vocês", "estão?")),
            Sentence("Де вони (чоловіки)?", listOf("Onde", "eles", "estão?")),
            Sentence("Де вони (жінки)?", listOf("Onde", "elas", "estão?")),

// QUANDO – коли
            Sentence("Коли я приходжу?", listOf("Quando", "eu", "chego?")),
            Sentence("Коли ти приходиш?", listOf("Quando", "tu", "chegas?")),
            Sentence("Коли він приходить?", listOf("Quando", "ele", "chega?")),
            Sentence("Коли вона приходить?", listOf("Quando", "ela", "chega?")),
            Sentence("Коли ми приходимо?", listOf("Quando", "nós", "chegamos?")),
            Sentence("Коли ви приходите?", listOf("Quando", "vocês", "chegam?")),
            Sentence("Коли вони (чоловіки) приходять?", listOf("Quando", "eles", "chegam?")),
            Sentence("Коли вони (жінки) приходять?", listOf("Quando", "elas", "chegam?")),

// QUANTO – скільки
            Sentence("Скільки я маю?", listOf("Quanto", "eu", "tenho?")),
            Sentence("Скільки ти маєш?", listOf("Quanto", "tu", "tens?")),
            Sentence("Скільки він має?", listOf("Quanto", "ele", "tem?")),
            Sentence("Скільки вона має?", listOf("Quanto", "ela", "tem?")),
            Sentence("Скільки ми маємо?", listOf("Quanto", "nós", "temos?")),
            Sentence("Скільки ви маєте?", listOf("Quanto", "vocês", "têm?")),
            Sentence("Скільки вони (чоловіки) мають?", listOf("Quanto", "eles", "têm?")),
            Sentence("Скільки вони (жінки) мають?", listOf("Quanto", "elas", "têm?")),

// COMO – як
            Sentence("Як я роблю?", listOf("Como", "eu", "faço?")),
            Sentence("Як ти робиш?", listOf("Como", "tu", "faz?")),
            Sentence("Як він робить?", listOf("Como", "ele", "faz?")),
            Sentence("Як вона робить?", listOf("Como", "ela", "faz?")),
            Sentence("Як ми робимо?", listOf("Como", "nós", "fazemos?")),
            Sentence("Як ви робите?", listOf("Como", "vocês", "fazem?")),
            Sentence("Як вони (чоловіки) роблять?", listOf("Como", "eles", "fazem?")),
            Sentence("Як вони (жінки) роблять?", listOf("Como", "elas", "fazem?")),

// POR QUE – чому
            Sentence("Чому я допомагаю?", listOf("Por que", "eu", "ajudo?")),
            Sentence("Чому ти допомагаєш?", listOf("Por que", "tu", "ajudas?")),
            Sentence("Чому він допомагає?", listOf("Por que", "ele", "ajuda?")),
            Sentence("Чому вона допомагає?", listOf("Por que", "ela", "ajuda?")),
            Sentence("Чому ми допомагаємо?", listOf("Por que", "nós", "ajudamos?")),
            Sentence("Чому ви допомагаєте?", listOf("Por que", "vocês", "ajudam?")),
            Sentence("Чому вони (чоловіки) допомагають?", listOf("Por que", "eles", "ajudam?")),
            Sentence("Чому вони (жінки) допомагають?", listOf("Por que", "elas", "ajudam?")),

// QUAL – який
            Sentence("Який я обираю?", listOf("Qual", "eu", "escolho?")),
            Sentence("Який ти обираєш?", listOf("Qual", "tu", "escolhes?")),
            Sentence("Який він обирає?", listOf("Qual", "ele", "escolhe?")),
            Sentence("Який вона обирає?", listOf("Qual", "ela", "escolhe?")),
            Sentence("Який ми обираємо?", listOf("Qual", "nós", "escolhemos?")),
            Sentence("Який ви обираєте?", listOf("Qual", "vocês", "escolhem?")),
            Sentence("Який вони (чоловіки) обирають?", listOf("Qual", "eles", "escolhem?")),
            Sentence("Який вони (жінки) обирають?", listOf("Qual", "elas", "escolhem?")),

// ISSO – це
            Sentence("Що це означає?", listOf("Isso", "significa?")),
            Sentence("Чи це корисно?", listOf("Isso", "é", "útil?"))
        )
    }
}

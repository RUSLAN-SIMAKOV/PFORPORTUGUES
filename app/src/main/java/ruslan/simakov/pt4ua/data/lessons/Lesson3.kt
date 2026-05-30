package ruslan.simakov.pt4ua.data.lessons

import ruslan.simakov.pt4ua.data.Sentence

object Lesson3 {
    fun getSentences(): List<Sentence> {
        return listOf(
            // SER – бути (постійна характеристика: професія, національність, ім'я)
            Sentence("Я є вчителем", listOf("Eu", "sou", "professor")),
            Sentence("Я не є вчителем", listOf("Eu", "não", "sou", "professor")),
            Sentence("Ти є студентом", listOf("Tu", "és", "estudante")),
            Sentence("Ви є лікарем (ввічливо)", listOf("Você", "é", "médico")),
            Sentence("Він є лікарем", listOf("Ele", "é", "médico")),
            Sentence("Вона є інженером", listOf("Ela", "é", "engenheira")),
            Sentence("Ми є друзями", listOf("Nós", "somos", "amigos")),
            Sentence("Ви є викладачами (множина)", listOf("Vocês", "são", "professores")),
            Sentence("Вони є братами", listOf("Eles", "são", "irmãos")),
            Sentence("Вони є сестрами", listOf("Elas", "são", "irmãs")),
            Sentence("Хто ти?", listOf("Quem", "és", "tu?")),
            Sentence("Хто Ви? (ввічливо)", listOf("Quem", "é", "você?")),

            // ESTAR – бути (тимчасовий стан, місцезнаходження)
            Sentence("Я є вдома", listOf("Eu", "estou", "em", "casa")),
            Sentence("Я не є вдома", listOf("Eu", "não", "estou", "em", "casa")),
            Sentence("Ти є на роботі", listOf("Tu", "estás", "no", "trabalho")),
            Sentence("Ви є в готелі (ввічливо)", listOf("Você", "está", "no", "hotel")),
            Sentence("Він є в школі", listOf("Ele", "está", "na", "escola")),
            Sentence("Вона є в офісі", listOf("Ela", "está", "no", "escritório")),
            Sentence("Ми є в парку", listOf("Nós", "estamos", "no", "parque")),
            Sentence("Ви є в ресторані (множина)", listOf("Vocês", "estão", "no", "restaurante")),
            Sentence("Вони є в машині (чоловіки)", listOf("Eles", "estão", "no", "carro")),
            Sentence("Вони є в машині (жінки)", listOf("Elas", "estão", "no", "carro")),
            Sentence("Як ти?", listOf("Como", "estás?")),
            Sentence("Як Ви? (ввічливо)", listOf("Como", "está", "você?")),
            Sentence("Де він?", listOf("Onde", "está", "ele?")),

            // TER – мати (володіння, вік)
            Sentence("Я маю машину", listOf("Eu", "tenho", "um", "carro")),
            Sentence("Я не маю машини", listOf("Eu", "não", "tenho", "um", "carro")),
            Sentence("Ти маєш книгу", listOf("Tu", "tens", "um", "livro")),
            Sentence("Ви маєте час (ввічливо)", listOf("Você", "tem", "tempo")),
            Sentence("Він має дім", listOf("Ele", "tem", "uma", "casa")),
            Sentence("Вона має кота", listOf("Ela", "tem", "um", "gato")),
            Sentence("Ми маємо час", listOf("Nós", "temos", "tempo")),
            Sentence("Ви маєте роботу (множина)", listOf("Vocês", "têm", "trabalho")),
            Sentence("Вони мають дітей (чоловіки)", listOf("Eles", "têm", "filhos")),
            Sentence("Вони мають дітей (жінки)", listOf("Elas", "têm", "filhos")),
            Sentence("Скільки ти маєш грошей?", listOf("Quanto", "dinheiro", "tens?")),

            // VER – бачити
            Sentence("Я бачу тебе", listOf("Eu", "vejo", "te")),
            Sentence("Я не бачу тебе", listOf("Eu", "não", "vejo", "te")),
            Sentence("Ти бачиш мене", listOf("Tu", "vês", "me")),
            Sentence("Ви бачите море (ввічливо)", listOf("Você", "vê", "o", "mar")),
            Sentence("Він бачить собаку", listOf("Ele", "vê", "o", "cão")),
            Sentence("Вона бачить море", listOf("Ela", "vê", "o", "mar")),
            Sentence("Ми бачимо гори", listOf("Nós", "vemos", "as", "montanhas")),
            Sentence("Ви бачите птаха (множина)", listOf("Vocês", "veem", "o", "pássaro")),
            Sentence("Вони бачать нас (чоловіки)", listOf("Eles", "veem", "nos")),
            Sentence("Вони бачать нас (жінки)", listOf("Elas", "veem", "nos")),
            Sentence("Що ти бачиш?", listOf("O", "que", "vês?")),
            Sentence("Чому ти не бачиш мене?", listOf("Porque", "não", "me", "vês?"))
        )
    }
}

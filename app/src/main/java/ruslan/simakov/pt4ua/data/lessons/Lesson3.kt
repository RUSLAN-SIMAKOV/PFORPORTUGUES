package ruslan.simakov.pt4ua.data.lessons

import ruslan.simakov.pt4ua.data.Sentence

object Lesson3 {
    fun getSentences(): List<Sentence> {
        return listOf(
// SER – бути (постійна характеристика)
            Sentence("Я є вчителем", listOf("Eu", "sou", "professor")),
            Sentence("Я не є вчителем", listOf("Eu", "não", "sou", "professor")),
            Sentence("Ти є студентом", listOf("Tu", "és", "estudante")),
            Sentence("Ти не є студентом", listOf("Tu", "não", "és", "estudante")),
            Sentence("Він є лікарем", listOf("Ele", "é", "médico")),
            Sentence("Вона є інженером", listOf("Ela", "é", "engenheira")),
            Sentence("Ми є друзями", listOf("Nós", "somos", "amigos")),
            Sentence("Ви є викладачами", listOf("Vocês", "são", "professores")),
            Sentence("Вони є сестрами", listOf("Elas", "são", "irmãs")),
            Sentence("Хто ти?", listOf("Quem", "és", "tu?")),

// ESTAR – бути (тимчасовий стан, місце)
            Sentence("Я є вдома", listOf("Eu", "estou", "em", "casa")),
            Sentence("Я не є вдома", listOf("Eu", "não", "estou", "em", "casa")),
            Sentence("Ти є на роботі", listOf("Tu", "estás", "no", "trabalho")),
            Sentence("Він є в школі", listOf("Ele", "está", "na", "escola")),
            Sentence("Вона є в офісі", listOf("Ela", "está", "no", "escritório")),
            Sentence("Ми є в парку", listOf("Nós", "estamos", "no", "parque")),
            Sentence("Ви є в ресторані", listOf("Vocês", "estão", "no", "restaurante")),
            Sentence("Вони є в машині", listOf("Eles", "estão", "no", "carro")),
            Sentence("Як ти?", listOf("Como", "estás?")),
            Sentence("Де він?", listOf("Onde", "está", "ele?")),

// TER – мати (володіння)
            Sentence("Я маю машину", listOf("Eu", "tenho", "um", "carro")),
            Sentence("Я не маю машини", listOf("Eu", "não", "tenho", "um", "carro")),
            Sentence("Ти маєш книгу", listOf("Tu", "tens", "um", "livro")),
            Sentence("Він має дім", listOf("Ele", "tem", "uma", "casa")),
            Sentence("Вона має кота", listOf("Ela", "tem", "um", "gato")),
            Sentence("Ми маємо час", listOf("Nós", "temos", "tempo")),
            Sentence("Ви маєте роботу", listOf("Vocês", "têm", "trabalho")),
            Sentence("Вони мають дітей", listOf("Eles", "têm", "filhos")),
            Sentence("Скільки ти маєш грошей?", listOf("Quanto", "dinheiro", "tens?")),

// VER – бачити
            Sentence("Я бачу тебе", listOf("Eu", "vejo", "te")),
            Sentence("Я не бачу тебе", listOf("Eu", "não", "vejo", "te")),
            Sentence("Ти бачиш мене", listOf("Tu", "vês", "me")),
            Sentence("Він бачить собаку", listOf("Ele", "vê", "o", "cão")),
            Sentence("Вона бачить море", listOf("Ela", "vê", "o", "mar")),
            Sentence("Ми бачимо гори", listOf("Nós", "vemos", "as", "montanhas")),
            Sentence("Ви бачите птаха", listOf("Vocês", "veem", "o", "pássaro")),
            Sentence("Вони бачать нас", listOf("Eles", "veem", "nos")),
            Sentence("Що ти бачиш?", listOf("O", "que", "vês?")),
            Sentence("Чому ти не бачиш мене?", listOf("Porque", "não", "me", "vês?")),
        )
    }
}

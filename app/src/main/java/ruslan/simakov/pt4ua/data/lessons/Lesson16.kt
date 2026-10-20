package ruslan.simakov.pt4ua.data.lessons

import ruslan.simakov.pt4ua.data.RuleTable
import ruslan.simakov.pt4ua.data.Sentence

// Умовний спосіб (falaria, se eu tivesse…) і порівняння (mais… do que, o melhor)
object Lesson16 {

    val rules = listOf(
        RuleTable(
            "Умовний спосіб – «б, би»",
            listOf(
                listOf("", "falar", "comer", "fazer"),
                listOf("eu", "falaria", "comeria", "faria"),
                listOf("tu", "falarias", "comerias", "farias"),
                listOf("você, ele, ela", "falaria", "comeria", "faria"),
                listOf("nós", "falaríamos", "comeríamos", "faríamos"),
                listOf("vocês, eles, elas", "falariam", "comeriam", "fariam")
            ),
            note = "Ввічливо: Poderia…? – Ви не могли б…? Gostaria de… – Я хотів би… " +
                "Неправильні: fazer – faria, dizer – diria, trazer – traria. " +
                "У розмові в Португалії часто кажуть gostava, podia, queria."
        ),
        RuleTable(
            "Якби… – se + …",
            listOf(
                listOf("Дієслово", "Якби…"),
                listOf("ter", "se eu tivesse"),
                listOf("ser", "se eu fosse"),
                listOf("estar", "se estivesse"),
                listOf("poder", "se tu pudesses"),
                listOf("saber", "se nós soubéssemos")
            ),
            note = "Se eu tivesse tempo, estudaria = Якби в мене був час, я б учився."
        ),
        RuleTable(
            "Порівняння",
            listOf(
                listOf("Українською", "Português", "Приклад"),
                listOf("більш… ніж", "mais… do que", "mais rápido do que"),
                listOf("менш… ніж", "menos… do que", "menos caro do que"),
                listOf("такий… як", "tão… como", "tão alto como"),
                listOf("най…", "o mais…", "o mais bonito")
            ),
            note = "Неправильні: bom – melhor – o melhor, mau – pior – o pior, grande – maior – o maior. " +
                "Дуже-дуже: -íssimo (lindíssimo, caríssimo)."
        )
    )

    fun getSentences(): List<Sentence> {
        return listOf(
            // УМОВНИЙ СПОСІБ – ввічливо та «б, би»
            Sentence("Я хотів би забронювати столик на двох", listOf("Eu", "gostaria", "de", "reservar", "uma", "mesa", "para", "dois")),
            Sentence("Ви могли б мені допомогти з валізою? (ввічливо)", listOf("Você", "poderia", "ajudar-me", "com", "a", "mala?")),
            Sentence("Ти міг би говорити тихіше?", listOf("Tu", "poderias", "falar", "mais", "baixo?")),
            Sentence("Було б добре відпочити тиждень", listOf("Seria", "bom", "descansar", "uma", "semana")),
            Sentence("На твоєму місці я б не купував цю машину", listOf("No", "teu", "lugar", "eu", "não", "compraria", "este", "carro")),
            Sentence("Я б охоче поїхав з вами (множина)", listOf("Eu", "iria", "convosco", "com", "todo", "o", "gosto")),
            Sentence("Ми б жили біля моря, але це дорого", listOf("Nós", "viveríamos", "perto", "do", "mar,", "mas", "é", "caro")),
            Sentence("Що б ти зробив на моєму місці?", listOf("O", "que", "farias", "no", "meu", "lugar?")),
            Sentence("Вони б прийшли, але вони працюють (чоловіки)", listOf("Eles", "viriam,", "mas", "estão", "a", "trabalhar")),
            Sentence("Вона б ніколи цього не сказала", listOf("Ela", "nunca", "diria", "isso")),
            Sentence("Ви не могли б зачинити двері? (множина)", listOf("Vocês", "não", "poderiam", "fechar", "a", "porta?")),
            Sentence("Я б дуже хотів відвідати Азорські острови", listOf("Eu", "gostaria", "muito", "de", "visitar", "os", "Açores")),
            Sentence("Я б зараз випив кави", listOf("Eu", "agora", "beberia", "um", "café")),
            Sentence("Було б краще поїхати потягом", listOf("Seria", "melhor", "ir", "de", "comboio")),
            Sentence("Я б не хотів працювати в неділю", listOf("Eu", "não", "gostaria", "de", "trabalhar", "ao", "domingo")),

            // ЯКБИ… – se + …
            Sentence("Якби в мене був час, я б вивчав італійську", listOf("Se", "eu", "tivesse", "tempo,", "estudaria", "italiano")),
            Sentence("Якби я був багатим, я б купив будинок у Сінтрі", listOf("Se", "eu", "fosse", "rico,", "compraria", "uma", "casa", "em", "Sintra")),
            Sentence("Якби ти міг, ти б приїхав?", listOf("Se", "tu", "pudesses,", "virias?")),
            Sentence("Якби ми знали, ми б прийшли раніше", listOf("Se", "nós", "soubéssemos,", "viríamos", "mais", "cedo")),
            Sentence("Якби було тепло, ми б пішли на пляж", listOf("Se", "estivesse", "calor,", "iríamos", "à", "praia")),

            // ПОРІВНЯННЯ
            Sentence("Лісабон більший за Порту", listOf("Lisboa", "é", "maior", "do", "que", "o", "Porto")),
            Sentence("Потяг швидший за автобус", listOf("O", "comboio", "é", "mais", "rápido", "do", "que", "o", "autocarro")),
            Sentence("Моя сестра молодша за мене", listOf("A", "minha", "irmã", "é", "mais", "nova", "do", "que", "eu")),
            Sentence("Тут дешевше, ніж у центрі", listOf("Aqui", "é", "mais", "barato", "do", "que", "no", "centro")),
            Sentence("Цей телефон менш дорогий, ніж той", listOf("Este", "telemóvel", "é", "menos", "caro", "do", "que", "aquele")),
            Sentence("Сьогодні холодніше, ніж учора", listOf("Hoje", "está", "mais", "frio", "do", "que", "ontem")),
            Sentence("Мій брат такий же високий, як батько", listOf("O", "meu", "irmão", "é", "tão", "alto", "como", "o", "meu", "pai")),
            Sentence("Португальська не така складна, як здається", listOf("O", "português", "não", "é", "tão", "difícil", "como", "parece")),
            Sentence("Ти говориш португальською краще за мене", listOf("Tu", "falas", "português", "melhor", "do", "que", "eu")),
            Sentence("Сьогодні погода гірша, ніж учора", listOf("Hoje", "o", "tempo", "está", "pior", "do", "que", "ontem")),
            Sentence("Це найкращий ресторан у місті", listOf("Este", "é", "o", "melhor", "restaurante", "da", "cidade")),
            Sentence("Це найгірший день тижня", listOf("Este", "é", "o", "pior", "dia", "da", "semana")),
            Sentence("Азорські острови – найгарніше місце в Португалії", listOf("Os", "Açores", "são", "o", "sítio", "mais", "bonito", "de", "Portugal")),
            Sentence("Вона найрозумніша учениця в класі", listOf("Ela", "é", "a", "aluna", "mais", "inteligente", "da", "turma")),
            Sentence("Яка найдовша річка в Португалії?", listOf("Qual", "é", "o", "rio", "mais", "longo", "de", "Portugal?")),
            Sentence("У мене менше часу, ніж у тебе", listOf("Eu", "tenho", "menos", "tempo", "do", "que", "tu")),
            Sentence("Він заробляє більше, ніж я", listOf("Ele", "ganha", "mais", "do", "que", "eu")),
            Sentence("У нас стільки ж дітей, скільки у вас (множина)", listOf("Nós", "temos", "tantos", "filhos", "como", "vocês")),
            Sentence("Ця сукня просто чудова", listOf("Este", "vestido", "é", "lindíssimo")),
            Sentence("Квитки були дуже-дуже дорогі", listOf("Os", "bilhetes", "eram", "caríssimos")),
            Sentence("Найкраще – прийти рано", listOf("O", "melhor", "é", "chegar", "cedo")),
            Sentence("Чим раніше, тим краще", listOf("Quanto", "mais", "cedo,", "melhor")),
            Sentence("Мені потрібна більша квартира", listOf("Eu", "preciso", "de", "um", "apartamento", "maior")),
            Sentence("Мій син уже вищий за мене", listOf("O", "meu", "filho", "já", "é", "mais", "alto", "do", "que", "eu")),
            Sentence("Життя тут спокійніше, ніж у великому місті", listOf("A", "vida", "aqui", "é", "mais", "calma", "do", "que", "numa", "cidade", "grande"))
        )
    }
}

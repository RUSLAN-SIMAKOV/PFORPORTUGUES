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
            Sentence("Життя тут спокійніше, ніж у великому місті", listOf("A", "vida", "aqui", "é", "mais", "calma", "do", "que", "numa", "cidade", "grande")),

            // ЩЕ УМОВНИЙ СПОСІБ
            Sentence("Я б з'їв щось солодке", listOf("Eu", "comeria", "um", "doce")),
            Sentence("Ти б хотів жити в Португалії?", listOf("Tu", "gostarias", "de", "viver", "em", "Portugal?")),
            Sentence("Було б чудово поїхати на пляж", listOf("Seria", "ótimo", "ir", "à", "praia")),
            Sentence("Ви не могли б повторити? (ввічливо)", listOf("Poderia", "repetir,", "por", "favor?")),
            Sentence("Я б цього не робив", listOf("Eu", "não", "faria", "isso")),
            Sentence("Ми б поїхали з вами, але працюємо (множина)", listOf("Nós", "iríamos", "convosco,", "mas", "trabalhamos")),
            Sentence("Він сказав, що прийде", listOf("Ele", "disse", "que", "viria")),
            Sentence("Вона сказала, що подзвонить", listOf("Ela", "disse", "que", "ligaria")),
            Sentence("Хто б міг подумати, що тут так гарно!", listOf("Quem", "diria", "que", "aqui", "é", "tão", "bonito!")),
            Sentence("Ти б міг позичити мені двадцять євро?", listOf("Poderias", "emprestar-me", "vinte", "euros?")),
            Sentence("Я б порадив цей ресторан", listOf("Eu", "recomendaria", "este", "restaurante")),
            Sentence("На твоєму місці я б вивчав португальську щодня", listOf("No", "teu", "lugar", "eu", "estudaria", "português", "todos", "os", "dias")),
            Sentence("Ми б купили будинок, якби мали гроші", listOf("Nós", "compraríamos", "uma", "casa", "se", "tivéssemos", "dinheiro")),
            Sentence("Вам би сподобалося це місто (ввічливо)", listOf("Você", "gostaria", "desta", "cidade")),
            Sentence("Вони б ніколи не переїхали без дітей (чоловіки)", listOf("Eles", "nunca", "se", "mudariam", "sem", "os", "filhos")),
            Sentence("Було б краще почекати до завтра", listOf("Seria", "melhor", "esperar", "até", "amanhã")),
            Sentence("Я хотів би розрахуватися, будь ласка", listOf("Eu", "gostaria", "de", "pagar,", "por", "favor")),
            Sentence("Ти не міг би мені допомогти?", listOf("Tu", "não", "poderias", "ajudar-me?")),
            Sentence("Що б Ви хотіли замовити? (ввічливо)", listOf("O", "que", "gostaria", "de", "pedir?")),
            Sentence("Було б цікаво побувати на Мадейрі", listOf("Seria", "interessante", "conhecer", "a", "Madeira")),

            // ЩЕ ЯКБИ…
            Sentence("Якби в мене була машина, я б поїхав до Порту", listOf("Se", "eu", "tivesse", "carro,", "iria", "ao", "Porto")),
            Sentence("Якби я краще знав португальську, я б знайшов кращу роботу", listOf("Se", "eu", "soubesse", "melhor", "português,", "encontraria", "um", "trabalho", "melhor")),
            Sentence("Якби ти був тут, ти б зрозумів", listOf("Se", "tu", "estivesses", "aqui,", "perceberias")),
            Sentence("Якби ми жили біля моря, ми б плавали щодня", listOf("Se", "nós", "morássemos", "perto", "do", "mar,", "nadaríamos", "todos", "os", "dias")),
            Sentence("Якби вона мала час, вона б вчилася", listOf("Se", "ela", "tivesse", "tempo,", "estudaria")),
            Sentence("Якби не було дощу, ми б пішли гуляти", listOf("Se", "não", "chovesse,", "iríamos", "passear")),
            Sentence("Якби я був тобою, я б погодився", listOf("Se", "eu", "fosse", "tu,", "aceitaria")),
            Sentence("Якби вони могли, вони б приїхали (чоловіки)", listOf("Se", "eles", "pudessem,", "viriam")),
            Sentence("Що б ти робив, якби виграв у лотерею?", listOf("O", "que", "farias", "se", "ganhasses", "a", "lotaria?")),
            Sentence("Якби в мене були гроші, я б подорожував", listOf("Se", "eu", "tivesse", "dinheiro,", "viajaria")),

            // ЩЕ ПОРІВНЯННЯ
            Sentence("Порту менше за Лісабон", listOf("O", "Porto", "é", "mais", "pequeno", "do", "que", "Lisboa")),
            Sentence("Літак швидший за потяг", listOf("O", "avião", "é", "mais", "rápido", "do", "que", "o", "comboio")),
            Sentence("Мій брат старший за мене", listOf("O", "meu", "irmão", "é", "mais", "velho", "do", "que", "eu")),
            Sentence("Сьогодні тепліше, ніж учора", listOf("Hoje", "está", "mais", "calor", "do", "que", "ontem")),
            Sentence("У Португалії життя дешевше, ніж у Франції", listOf("Em", "Portugal", "a", "vida", "é", "mais", "barata", "do", "que", "em", "França")),
            Sentence("Ця квартира менш простора, ніж та", listOf("Este", "apartamento", "é", "menos", "espaçoso", "do", "que", "aquele")),
            Sentence("Мій син такий же високий, як я", listOf("O", "meu", "filho", "é", "tão", "alto", "como", "eu")),
            Sentence("Тут не так шумно, як у центрі", listOf("Aqui", "não", "é", "tão", "barulhento", "como", "no", "centro")),
            Sentence("Вона готує краще, ніж у ресторані", listOf("Ela", "cozinha", "melhor", "do", "que", "no", "restaurante")),
            Sentence("Моя португальська гірша за твою", listOf("O", "meu", "português", "é", "pior", "do", "que", "o", "teu")),
            Sentence("Це найстаріший будинок на вулиці", listOf("Esta", "é", "a", "casa", "mais", "antiga", "da", "rua")),
            Sentence("Лісабон – найбільше місто Португалії", listOf("Lisboa", "é", "a", "maior", "cidade", "de", "Portugal")),
            Sentence("Це найкраща кава, яку я пив", listOf("Este", "é", "o", "melhor", "café", "que", "já", "bebi")),
            Sentence("Серпень – найспекотніший місяць", listOf("Agosto", "é", "o", "mês", "mais", "quente")),
            Sentence("Він найкращий учень у класі", listOf("Ele", "é", "o", "melhor", "aluno", "da", "turma")),
            Sentence("Яке місто найгарніше в Португалії?", listOf("Qual", "é", "a", "cidade", "mais", "bonita", "de", "Portugal?")),
            Sentence("У неї стільки ж роботи, скільки в мене", listOf("Ela", "tem", "tanto", "trabalho", "como", "eu")),
            Sentence("Я працюю менше, ніж раніше", listOf("Eu", "trabalho", "menos", "do", "que", "antes")),
            Sentence("Він їсть більше, ніж я", listOf("Ele", "come", "mais", "do", "que", "eu")),
            Sentence("Цей фільм надзвичайно цікавий", listOf("Este", "filme", "é", "interessantíssimo")),
            Sentence("Ця кава дуже-дуже гаряча", listOf("Este", "café", "está", "quentíssimo")),
            Sentence("Що швидше: метро чи автобус?", listOf("O", "que", "é", "mais", "rápido:", "o", "metro", "ou", "o", "autocarro?")),
            Sentence("Що більше практики, то краще", listOf("Quanto", "mais", "prática,", "melhor")),
            Sentence("Моя нова робота краща за стару", listOf("O", "meu", "novo", "trabalho", "é", "melhor", "do", "que", "o", "antigo")),
            Sentence("Він такий же розумний, як його батько", listOf("Ele", "é", "tão", "inteligente", "como", "o", "pai"))
        )
    }
}

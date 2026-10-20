package ruslan.simakov.pt4ua.data.lessons

import ruslan.simakov.pt4ua.data.RuleTable
import ruslan.simakov.pt4ua.data.Sentence

object Lesson1 {

    val rules = listOf(
        RuleTable(
            "Привітання та ввічливі слова",
            listOf(
                listOf("Українською", "Português"),
                listOf("Привіт", "Olá"),
                listOf("Доброго ранку (до обіду)", "Bom dia"),
                listOf("Добрий день (після обіду)", "Boa tarde"),
                listOf("Добрий вечір / На добраніч", "Boa noite"),
                listOf("Дякую (чоловік / жінка)", "Obrigado / Obrigada"),
                listOf("Будь ласка", "Por favor"),
                listOf("Вибачте", "Desculpe"),
                listOf("Перепрошую, дозвольте", "Com licença"),
                listOf("Дуже приємно", "Muito prazer"),
                listOf("До побачення / Бувай", "Adeus / Tchau"),
                listOf("До завтра", "Até amanhã")
            )
        ),
        RuleTable(
            "Хто?",
            listOf(
                listOf("Українською", "Português"),
                listOf("я", "eu"),
                listOf("ти", "tu"),
                listOf("Ви (ввічливо)", "você"),
                listOf("він / вона", "ele / ela"),
                listOf("ми", "nós"),
                listOf("ви (множина)", "vocês"),
                listOf("вони", "eles / elas")
            ),
            note = "Eles – чоловіки або змішана група, elas – тільки жінки."
        ),
        RuleTable(
            "Теперішній час: дієслова на -AR",
            listOf(
                listOf("", "Закінчення", "AMAR", "FALAR"),
                listOf("eu", "-o", "amo", "falo"),
                listOf("tu", "-as", "amas", "falas"),
                listOf("você, ele, ela", "-a", "ama", "fala"),
                listOf("nós", "-amos", "amamos", "falamos"),
                listOf("vocês, eles, elas", "-am", "amam", "falam")
            ),
            note = "Відкиньте -ar і додайте закінчення: trabalhar → trabalh + o = trabalho. " +
                "Заперечення – não перед дієсловом: Eu não falo inglês."
        ),
        RuleTable(
            "GOSTAR DE – подобатися",
            listOf(
                listOf("Українською", "Português"),
                listOf("Мені подобається", "Eu gosto de"),
                listOf("Тобі подобається", "Tu gostas de"),
                listOf("Йому / їй / Вам подобається", "Ele / ela / você gosta de"),
                listOf("Нам подобається", "Nós gostamos de"),
                listOf("Їм / вам подобається", "Eles / elas / vocês gostam de")
            ),
            note = "de + o = do, de + a = da: gosto do café, gosto da música, gosto de ler."
        )
    )
    fun getSentences(): List<Sentence> {
        return listOf(
            // ПРИВІТАННЯ ТА ВВІЧЛИВІ СЛОВА (GREETINGS & COURTESY)
            Sentence("Привіт, як ти сьогодні?", listOf("Olá,", "como", "estás", "hoje?")),
            Sentence("Доброго ранку, пане вчителю", listOf("Bom", "dia,", "senhor", "professor")),
            Sentence("Добрий день, як Ваші справи? (ввічливо)", listOf("Boa", "tarde,", "como", "está?")),
            Sentence("Добрий вечір усім", listOf("Boa", "noite", "a", "todos")),
            Sentence("На добраніч, до завтра", listOf("Boa", "noite,", "até", "amanhã")),
            Sentence("У мене все дуже добре, дякую (чоловік)", listOf("Estou", "muito", "bem,", "obrigado")),
            Sentence("Дуже приємно, я Марія", listOf("Muito", "prazer,", "eu", "sou", "a", "Maria")),
            Sentence("Дуже дякую за допомогу (чоловік)", listOf("Muito", "obrigado", "pela", "ajuda")),
            Sentence("Дуже дякую за все (жінка)", listOf("Muito", "obrigada", "por", "tudo")),
            Sentence("Одну каву, будь ласка", listOf("Um", "café,", "por", "favor")),
            Sentence("Вибачте, де тут туалет?", listOf("Desculpe,", "onde", "é", "a", "casa", "de", "banho?")),
            Sentence("Перепрошую, можна пройти?", listOf("Com", "licença,", "posso", "passar?")),
            Sentence("Так, я трохи розумію португальську", listOf("Sim,", "eu", "percebo", "um", "pouco", "de", "português")),
            Sentence("Ні, я не говорю англійською", listOf("Não,", "eu", "não", "falo", "inglês")),
            Sentence("До побачення, до наступного тижня", listOf("Adeus,", "até", "à", "próxima", "semana")),
            Sentence("Бувай, до завтра на роботі", listOf("Tchau,", "até", "amanhã", "no", "trabalho")),

            // AMAR – любити (Теперішній час)
            Sentence("Я люблю свою родину", listOf("Eu", "amo", "a", "minha", "família")),
            Sentence("Ти любиш свою маму", listOf("Tu", "amas", "a", "tua", "mãe")),
            Sentence("Ви любите свою роботу (ввічливо)", listOf("Você", "ama", "o", "seu", "trabalho")),
            Sentence("Він любить свою дружину", listOf("Ele", "ama", "a", "sua", "mulher")),
            Sentence("Вона любить свого чоловіка", listOf("Ela", "ama", "o", "seu", "marido")),
            Sentence("Ми любимо наших дітей", listOf("Nós", "amamos", "os", "nossos", "filhos")),
            Sentence("Ви любите це місто (множина)", listOf("Vocês", "amam", "esta", "cidade")),
            Sentence("Вони люблять свою країну (чоловіки)", listOf("Eles", "amam", "o", "seu", "país")),
            Sentence("Вони люблять португальську музику (жінки)", listOf("Elas", "amam", "a", "música", "portuguesa")),

            // FALAR – говорити
            Sentence("Я говорю українською і португальською", listOf("Eu", "falo", "ucraniano", "e", "português")),
            Sentence("Ти говориш дуже швидко", listOf("Tu", "falas", "muito", "depressa")),
            Sentence("Ви говорите португальською на роботі? (ввічливо)", listOf("Você", "fala", "português", "no", "trabalho?")),
            Sentence("Він говорить з мамою по телефону", listOf("Ele", "fala", "com", "a", "mãe", "ao", "telefone")),
            Sentence("Вона говорить трохи французькою", listOf("Ela", "fala", "um", "pouco", "de", "francês")),
            Sentence("Ми говоримо португальською вдома", listOf("Nós", "falamos", "português", "em", "casa")),
            Sentence("Ви говорите дуже голосно (множина)", listOf("Vocês", "falam", "muito", "alto")),
            Sentence("Вони завжди говорять про футбол (чоловіки)", listOf("Eles", "falam", "sempre", "de", "futebol")),
            Sentence("Вони говорять із сусідами щодня (жінки)", listOf("Elas", "falam", "com", "os", "vizinhos", "todos", "os", "dias")),

            // TRABALHAR – працювати
            Sentence("Я працюю в офісі з понеділка до п'ятниці", listOf("Eu", "trabalho", "no", "escritório", "de", "segunda", "a", "sexta")),
            Sentence("Ти працюєш сьогодні ввечері?", listOf("Tu", "trabalhas", "hoje", "à", "noite?")),
            Sentence("Ви працюєте в лікарні в Лісабоні? (ввічливо)", listOf("Você", "trabalha", "num", "hospital", "em", "Lisboa?")),
            Sentence("Він працює в ресторані щовечора", listOf("Ele", "trabalha", "num", "restaurante", "todas", "as", "noites")),
            Sentence("Вона працює вчителькою в школі", listOf("Ela", "trabalha", "como", "professora", "numa", "escola")),
            Sentence("Ми працюємо разом у магазині", listOf("Nós", "trabalhamos", "juntos", "numa", "loja")),
            Sentence("Ви працюєте у вихідні? (множина)", listOf("Vocês", "trabalham", "ao", "fim", "de", "semana?")),
            Sentence("Вони працюють на будівництві (чоловіки)", listOf("Eles", "trabalham", "na", "construção", "civil")),
            Sentence("Вони працюють вісім годин на день (жінки)", listOf("Elas", "trabalham", "oito", "horas", "por", "dia")),

            // MORAR – жити (проживати)
            Sentence("Я живу в Лісабоні вже два роки", listOf("Eu", "moro", "em", "Lisboa", "há", "dois", "anos")),
            Sentence("Ти живеш близько від роботи?", listOf("Tu", "moras", "perto", "do", "trabalho?")),
            Sentence("Ви живете в цьому будинку давно? (ввічливо)", listOf("Você", "mora", "neste", "prédio", "há", "muito", "tempo?")),
            Sentence("Він живе з батьками", listOf("Ele", "mora", "com", "os", "pais")),
            Sentence("Вона живе в маленькій квартирі", listOf("Ela", "mora", "num", "apartamento", "pequeno")),
            Sentence("Ми живемо в центрі міста", listOf("Nós", "moramos", "no", "centro", "da", "cidade")),
            Sentence("Ви живете далеко звідси? (множина)", listOf("Vocês", "moram", "longe", "daqui?")),
            Sentence("Вони живуть у Порту з родиною (чоловіки)", listOf("Eles", "moram", "no", "Porto", "com", "a", "família")),
            Sentence("Вони живуть на першому поверсі (жінки)", listOf("Elas", "moram", "no", "rés-do-chão")),

            // COMPRAR – купувати
            Sentence("Я купую хліб щоранку", listOf("Eu", "compro", "pão", "todas", "as", "manhãs")),
            Sentence("Ти купуєш фрукти на ринку?", listOf("Tu", "compras", "fruta", "no", "mercado?")),
            Sentence("Ви купуєте квитки в інтернеті? (ввічливо)", listOf("Você", "compra", "os", "bilhetes", "na", "internet?")),
            Sentence("Він купує квіти для своєї дівчини", listOf("Ele", "compra", "flores", "para", "a", "namorada")),
            Sentence("Вона купує одяг у торговому центрі", listOf("Ela", "compra", "roupa", "no", "centro", "comercial")),
            Sentence("Ми купуємо продукти в супермаркеті", listOf("Nós", "compramos", "comida", "no", "supermercado")),
            Sentence("Ви купуєте нову машину? (множина)", listOf("Vocês", "compram", "um", "carro", "novo?")),
            Sentence("Вони купують газету щонеділі (чоловіки)", listOf("Eles", "compram", "o", "jornal", "todos", "os", "domingos")),
            Sentence("Вони купують подарунки для дітей (жінки)", listOf("Elas", "compram", "presentes", "para", "as", "crianças")),

            // PERGUNTAR – питати
            Sentence("Я питаю дорогу до вокзалу", listOf("Eu", "pergunto", "o", "caminho", "para", "a", "estação")),
            Sentence("Ти питаєш учителя після уроку", listOf("Tu", "perguntas", "ao", "professor", "depois", "da", "aula")),
            Sentence("Ви питаєте ціну в продавця (ввічливо)", listOf("Você", "pergunta", "o", "preço", "ao", "vendedor")),
            Sentence("Він питає, котра година", listOf("Ele", "pergunta", "que", "horas", "são")),
            Sentence("Вона питає про мою родину", listOf("Ela", "pergunta", "pela", "minha", "família")),
            Sentence("Ми питаємо лікаря про результати", listOf("Nós", "perguntamos", "ao", "médico", "sobre", "os", "resultados")),
            Sentence("Ви завжди питаєте одне й те саме (множина)", listOf("Vocês", "perguntam", "sempre", "a", "mesma", "coisa")),
            Sentence("Вони питають, де зупинка автобуса (чоловіки)", listOf("Eles", "perguntam", "onde", "é", "a", "paragem", "do", "autocarro")),
            Sentence("Вони питають, скільки коштує квиток (жінки)", listOf("Elas", "perguntam", "quanto", "custa", "o", "bilhete")),

            // GOSTAR DE – подобатися
            Sentence("Мені подобається португальська кухня", listOf("Eu", "gosto", "da", "comida", "portuguesa")),
            Sentence("Мені не подобається холодна погода", listOf("Eu", "não", "gosto", "do", "tempo", "frio")),
            Sentence("Тобі подобається жити в Португалії?", listOf("Tu", "gostas", "de", "viver", "em", "Portugal?")),
            Sentence("Вам подобається ця кава? (ввічливо)", listOf("Você", "gosta", "deste", "café?")),
            Sentence("Йому подобається грати у футбол", listOf("Ele", "gosta", "de", "jogar", "futebol")),
            Sentence("Їй подобається читати книжки ввечері", listOf("Ela", "gosta", "de", "ler", "livros", "à", "noite")),
            Sentence("Нам подобається гуляти біля моря", listOf("Nós", "gostamos", "de", "passear", "junto", "ao", "mar")),
            Sentence("Вам подобається ваша нова школа? (множина)", listOf("Vocês", "gostam", "da", "vossa", "nova", "escola?")),
            Sentence("Їм подобається ходити в кіно (чоловіки)", listOf("Eles", "gostam", "de", "ir", "ao", "cinema")),
            Sentence("Їм подобається готувати разом (жінки)", listOf("Elas", "gostam", "de", "cozinhar", "juntas")),
            Sentence("Що тобі подобається робити у вихідні?", listOf("O", "que", "gostas", "de", "fazer", "ao", "fim", "de", "semana?"))
        )
    }
}

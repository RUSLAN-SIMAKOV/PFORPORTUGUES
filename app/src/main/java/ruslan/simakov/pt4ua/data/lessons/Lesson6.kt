package ruslan.simakov.pt4ua.data.lessons

import ruslan.simakov.pt4ua.data.RuleTable
import ruslan.simakov.pt4ua.data.Sentence

// Базова схема Петрова: 3 часи (минулий, теперішній, майбутній) × 3 форми (питання, ствердження, заперечення)
object Lesson6 {

    val rules = listOf(
        RuleTable(
            "Базова схема Петрова (FALAR)",
            listOf(
                listOf("", "Минулий", "Теперішній", "Майбутній"),
                listOf("?", "Eu falei?", "Eu falo?", "Eu falarei?"),
                listOf("+", "Eu falei", "Eu falo", "Eu falarei"),
                listOf("–", "Eu não falei", "Eu não falo", "Eu não falarei")
            ),
            note = "Питання – те саме речення з питальною інтонацією. Заперечення – não перед дієсловом."
        ),
        RuleTable(
            "Дієслова на -AR",
            listOf(
                listOf("", "Минулий", "Теперішній", "Майбутній"),
                listOf("eu", "falei", "falo", "falarei"),
                listOf("tu", "falaste", "falas", "falarás"),
                listOf("você, ele, ela", "falou", "fala", "falará"),
                listOf("nós", "falamos", "falamos", "falaremos"),
                listOf("vocês, eles, elas", "falaram", "falam", "falarão")
            ),
            note = "Майбутній час = інфінітив + -ei, -ás, -á, -emos, -ão."
        )
    )

    fun getSentences(): List<Sentence> {
        return listOf(
            // FALAR – говорити
            Sentence("Я говорю з мамою щонеділі", listOf("Eu", "falo", "com", "a", "minha", "mãe", "todos", "os", "domingos")),
            Sentence("Ти говориш португальською на роботі?", listOf("Tu", "falas", "português", "no", "trabalho?")),
            Sentence("Він зовсім не говорить англійською", listOf("Ele", "não", "fala", "nada", "de", "inglês")),
            Sentence("Учора ми говорили з лікарем", listOf("Ontem", "nós", "falamos", "com", "o", "médico")),
            Sentence("Ви говорили з директором? (множина)", listOf("Vocês", "falaram", "com", "o", "diretor?")),
            Sentence("Вони ні з ким не говорили на вечірці (жінки)", listOf("Elas", "não", "falaram", "com", "ninguém", "na", "festa")),
            Sentence("Завтра я поговорю з начальником", listOf("Amanhã", "eu", "falarei", "com", "o", "chefe")),
            Sentence("Ви говоритимете на зборах завтра? (ввічливо)", listOf("Você", "falará", "na", "reunião", "amanhã?")),
            Sentence("Вони не говоритимуть про це (чоловіки)", listOf("Eles", "não", "falarão", "sobre", "isso")),

            // TRABALHAR – працювати
            Sentence("Ми працюємо в лікарні вночі", listOf("Nós", "trabalhamos", "no", "hospital", "à", "noite")),
            Sentence("Ви працюєте тут по суботах? (ввічливо)", listOf("Você", "trabalha", "aqui", "aos", "sábados?")),
            Sentence("Вона не працює по понеділках", listOf("Ela", "não", "trabalha", "à", "segunda-feira")),
            Sentence("Минулого року я працював у Порту", listOf("No", "ano", "passado", "eu", "trabalhei", "no", "Porto")),
            Sentence("Ти працював учора допізна?", listOf("Tu", "trabalhaste", "ontem", "até", "tarde?")),
            Sentence("Вони не працювали минулого тижня (чоловіки)", listOf("Eles", "não", "trabalharam", "na", "semana", "passada")),
            Sentence("Наступного тижня вона працюватиме вдома", listOf("Na", "próxima", "semana", "ela", "trabalhará", "em", "casa")),
            Sentence("Ви працюватимете разом у серпні? (множина)", listOf("Vocês", "trabalharão", "juntos", "em", "agosto?")),
            Sentence("Я не працюватиму в неділю", listOf("Eu", "não", "trabalharei", "no", "domingo")),

            // MORAR – жити
            Sentence("Мої батьки живуть у селі", listOf("Os", "meus", "pais", "moram", "na", "aldeia")),
            Sentence("Ти живеш сам чи з друзями?", listOf("Tu", "moras", "sozinho", "ou", "com", "amigos?")),
            Sentence("Ми не живемо в центрі", listOf("Nós", "não", "moramos", "no", "centro")),
            Sentence("Вона жила в Лондоні три роки", listOf("Ela", "morou", "em", "Londres", "durante", "três", "anos")),
            Sentence("Ви жили в Україні до війни? (ввічливо)", listOf("Você", "morou", "na", "Ucrânia", "antes", "da", "guerra?")),
            Sentence("Я не жив у великому місті", listOf("Eu", "não", "morei", "numa", "cidade", "grande")),
            Sentence("Наступного року ми житимемо в Лісабоні", listOf("No", "próximo", "ano", "nós", "moraremos", "em", "Lisboa")),
            Sentence("Ти житимеш у гуртожитку?", listOf("Tu", "morarás", "na", "residência", "de", "estudantes?")),
            Sentence("Вони не житимуть з нами в цьому будинку (жінки)", listOf("Elas", "não", "morarão", "connosco", "nesta", "casa")),

            // COMPRAR – купувати
            Sentence("Він купує свіжий хліб щоранку", listOf("Ele", "compra", "pão", "fresco", "todas", "as", "manhãs")),
            Sentence("Ви купуєте квитки онлайн? (множина)", listOf("Vocês", "compram", "os", "bilhetes", "online?")),
            Sentence("Я не купую м'ясо в супермаркеті", listOf("Eu", "não", "compro", "carne", "no", "supermercado")),
            Sentence("Учора ми купили новий холодильник", listOf("Ontem", "nós", "compramos", "um", "frigorífico", "novo")),
            Sentence("Ти купив подарунок для мами?", listOf("Tu", "compraste", "um", "presente", "para", "a", "mãe?")),
            Sentence("Вони нічого не купили на ринку (чоловіки)", listOf("Eles", "não", "compraram", "nada", "no", "mercado")),
            Sentence("Я куплю квитки на концерт завтра", listOf("Eu", "comprarei", "os", "bilhetes", "para", "o", "concerto", "amanhã")),
            Sentence("Вона купить машину цього року?", listOf("Ela", "comprará", "um", "carro", "este", "ano?")),
            Sentence("Ми не купимо дорогий телефон", listOf("Nós", "não", "compraremos", "um", "telemóvel", "caro")),

            // ESTUDAR – вчитися, вивчати
            Sentence("Я вивчаю португальську щовечора", listOf("Eu", "estudo", "português", "todas", "as", "noites")),
            Sentence("Твій брат вчиться в університеті?", listOf("O", "teu", "irmão", "estuda", "na", "universidade?")),
            Sentence("Ви не вчитеся у вихідні (множина)", listOf("Vocês", "não", "estudam", "ao", "fim", "de", "semana")),
            Sentence("Вона вчилася в університеті в Коїмбрі", listOf("Ela", "estudou", "na", "universidade", "de", "Coimbra")),
            Sentence("Ви вчили граматику вчора? (ввічливо)", listOf("Você", "estudou", "a", "gramática", "ontem?")),
            Sentence("Ми не вчилися до тесту", listOf("Nós", "não", "estudamos", "para", "o", "teste")),
            Sentence("Наступного року вони вчитимуться в Португалії (чоловіки)", listOf("No", "próximo", "ano", "eles", "estudarão", "em", "Portugal")),
            Sentence("Ти будеш вчитися сьогодні ввечері?", listOf("Tu", "estudarás", "hoje", "à", "noite?")),
            Sentence("Я не буду вчитися завтра, бо це свято", listOf("Eu", "não", "estudarei", "amanhã", "porque", "é", "feriado")),

            // VIAJAR – подорожувати
            Sentence("Ми часто подорожуємо потягом", listOf("Nós", "viajamos", "muitas", "vezes", "de", "comboio")),
            Sentence("Ви подорожуєте з дітьми? (ввічливо)", listOf("Você", "viaja", "com", "os", "filhos?")),
            Sentence("Вона не подорожує літаком", listOf("Ela", "não", "viaja", "de", "avião")),
            Sentence("Минулого літа вони подорожували Італією (жінки)", listOf("No", "verão", "passado", "elas", "viajaram", "pela", "Itália")),
            Sentence("Ти подорожував сам до Іспанії?", listOf("Tu", "viajaste", "sozinho", "para", "Espanha?")),
            Sentence("Я не подорожував цього року", listOf("Eu", "não", "viajei", "este", "ano")),
            Sentence("У серпні ми поїдемо до Алгарве", listOf("Em", "agosto", "nós", "viajaremos", "para", "o", "Algarve")),
            Sentence("Ви поїдете в Україну влітку? (множина)", listOf("Vocês", "viajarão", "para", "a", "Ucrânia", "no", "verão?")),
            Sentence("Він не подорожуватиме без свого собаки", listOf("Ele", "não", "viajará", "sem", "o", "seu", "cão"))
        )
    }
}

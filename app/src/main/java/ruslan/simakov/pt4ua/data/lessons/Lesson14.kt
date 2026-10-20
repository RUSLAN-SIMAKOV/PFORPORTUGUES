package ruslan.simakov.pt4ua.data.lessons

import ruslan.simakov.pt4ua.data.RuleTable
import ruslan.simakov.pt4ua.data.Sentence

// Тривалі дії: ESTAR A + інфінітив, імперфект (falava), TER + дієприкметник (tenho falado)
object Lesson14 {

    val rules = listOf(
        RuleTable(
            "ESTAR A + інфінітив – дія триває",
            listOf(
                listOf("", "Зараз", "Тоді (у минулому)"),
                listOf("eu", "estou a falar", "estava a falar"),
                listOf("tu", "estás a falar", "estavas a falar"),
                listOf("você, ele, ela", "está a falar", "estava a falar"),
                listOf("nós", "estamos a falar", "estávamos a falar"),
                listOf("vocês, eles, elas", "estão a falar", "estavam a falar")
            ),
            note = "Так кажуть у Португалії: estou a trabalhar = я (саме зараз) працюю."
        ),
        RuleTable(
            "Імперфект – звичка або опис у минулому",
            listOf(
                listOf("", "-AR (falar)", "-ER / -IR (comer)"),
                listOf("eu", "falava", "comia"),
                listOf("tu", "falavas", "comias"),
                listOf("você, ele, ela", "falava", "comia"),
                listOf("nós", "falávamos", "comíamos"),
                listOf("vocês, eles, elas", "falavam", "comiam")
            ),
            note = "Неправильні: ser – era, ter – tinha, ir – ia, vir – vinha, pôr – punha. " +
                "Falei – один раз (учора я говорив з ним). Falava – часто або довго (раніше я часто з ним говорив)."
        ),
        RuleTable(
            "TER + дієприкметник – останнім часом",
            listOf(
                listOf("Дієслово", "Дієприкметник", "Приклад"),
                listOf("-AR", "-ado", "tenho trabalhado"),
                listOf("-ER / -IR", "-ido", "tenho comido, tenho dormido"),
                listOf("ver, ler, ir", "visto, lido, ido", "temos ido ao cinema")
            ),
            note = "Tenho trabalhado muito = Останнім часом я багато працюю."
        )
    )

    fun getSentences(): List<Sentence> {
        return listOf(
            // ESTAR A + інфінітив – зараз
            Sentence("Зараз я працюю, передзвоню пізніше", listOf("Agora", "estou", "a", "trabalhar,", "ligo", "mais", "tarde")),
            Sentence("Що ти зараз робиш?", listOf("O", "que", "estás", "a", "fazer", "agora?")),
            Sentence("Діти дивляться мультфільми", listOf("As", "crianças", "estão", "a", "ver", "desenhos", "animados")),
            Sentence("Вона розмовляє по телефону з мамою", listOf("Ela", "está", "a", "falar", "ao", "telefone", "com", "a", "mãe")),
            Sentence("Ми чекаємо на автобус уже пів години", listOf("Nós", "estamos", "à", "espera", "do", "autocarro", "há", "meia", "hora")),
            Sentence("Ви зараз вивчаєте португальську? (ввічливо)", listOf("Você", "está", "a", "estudar", "português", "agora?")),
            Sentence("Я не сплю, я читаю", listOf("Eu", "não", "estou", "a", "dormir,", "estou", "a", "ler")),
            Sentence("Ти мене слухаєш?", listOf("Tu", "estás", "a", "ouvir-me?")),
            Sentence("Надворі йде дощ", listOf("Está", "a", "chover", "lá", "fora")),
            Sentence("Вони будують новий міст (чоловіки)", listOf("Eles", "estão", "a", "construir", "uma", "ponte", "nova")),
            Sentence("Що ви тут робите? (множина)", listOf("O", "que", "vocês", "estão", "a", "fazer", "aqui?")),
            Sentence("Він зараз не працює, він обідає", listOf("Ele", "não", "está", "a", "trabalhar", "agora,", "está", "a", "almoçar")),

            // ESTAVA A + інфінітив – тоді
            Sentence("Коли ти подзвонив, я спав", listOf("Quando", "ligaste,", "eu", "estava", "a", "dormir")),
            Sentence("Ми вечеряли, коли прийшли гості", listOf("Nós", "estávamos", "a", "jantar", "quando", "chegaram", "os", "convidados")),
            Sentence("Що ти робив учора о восьмій?", listOf("O", "que", "estavas", "a", "fazer", "ontem", "às", "oito?")),
            Sentence("Вона готувала, а він прибирав", listOf("Ela", "estava", "a", "cozinhar", "e", "ele", "estava", "a", "limpar")),
            Sentence("Ви не слухали вчителя (множина)", listOf("Vocês", "não", "estavam", "a", "ouvir", "o", "professor")),
            Sentence("Ішов сильний дощ, коли ми вийшли", listOf("Estava", "a", "chover", "muito", "quando", "saímos")),

            // ІМПЕРФЕКТ – як було раніше
            Sentence("Коли я був дитиною, я жив у селі", listOf("Quando", "eu", "era", "criança,", "eu", "morava", "numa", "aldeia")),
            Sentence("Раніше я працював у банку", listOf("Antes", "eu", "trabalhava", "num", "banco")),
            Sentence("Щоліта ми їздили до бабусі", listOf("Todos", "os", "verões", "nós", "íamos", "a", "casa", "da", "avó")),
            Sentence("У дитинстві ти любив морозиво?", listOf("Em", "criança", "tu", "gostavas", "de", "gelado?")),
            Sentence("Мій дідусь був лікарем", listOf("O", "meu", "avô", "era", "médico")),
            Sentence("Раніше в нас не було машини", listOf("Antes", "nós", "não", "tínhamos", "carro")),
            Sentence("Колись тут був великий ринок", listOf("Antigamente", "aqui", "havia", "um", "grande", "mercado")),
            Sentence("Вони завжди приходили пізно (чоловіки)", listOf("Eles", "chegavam", "sempre", "tarde")),
            Sentence("Коли ми жили в Києві, ми часто ходили в театр", listOf("Quando", "morávamos", "em", "Kyiv,", "íamos", "muitas", "vezes", "ao", "teatro")),
            Sentence("Вона щодня читала дітям казки", listOf("Ela", "lia", "histórias", "às", "crianças", "todos", "os", "dias")),
            Sentence("Що ти робив у вихідні, коли був студентом?", listOf("O", "que", "fazias", "ao", "fim", "de", "semana", "quando", "eras", "estudante?")),
            Sentence("Раніше я не пив кави", listOf("Antes", "eu", "não", "bebia", "café")),
            Sentence("Було холодно, і всі були втомлені", listOf("Estava", "frio", "e", "todos", "estavam", "cansados")),
            Sentence("Була десята година вечора", listOf("Eram", "dez", "horas", "da", "noite")),
            Sentence("Ви жили біля моря? (ввічливо)", listOf("Você", "morava", "perto", "do", "mar?")),
            Sentence("Мої батьки працювали на заводі", listOf("Os", "meus", "pais", "trabalhavam", "numa", "fábrica")),
            Sentence("Я хотів би каву, будь ласка", listOf("Eu", "queria", "um", "café,", "por", "favor")),
            Sentence("Коли я прийшов, вона вже спала", listOf("Quando", "eu", "cheguei,", "ela", "já", "estava", "a", "dormir")),

            // TER + дієприкметник – останнім часом
            Sentence("Останнім часом я багато працюю", listOf("Ultimamente", "eu", "tenho", "trabalhado", "muito")),
            Sentence("Останнім часом ти погано спиш?", listOf("Ultimamente", "tu", "tens", "dormido", "mal?")),
            Sentence("Цього тижня часто йде дощ", listOf("Esta", "semana", "tem", "chovido", "muito")),
            Sentence("Останнім часом вона вивчає багато нових слів", listOf("Ultimamente", "ela", "tem", "estudado", "muitas", "palavras", "novas")),
            Sentence("Останнім часом ми не ходимо в кіно", listOf("Ultimamente", "nós", "não", "temos", "ido", "ao", "cinema")),
            Sentence("Останнім часом вони багато подорожують (чоловіки)", listOf("Ultimamente", "eles", "têm", "viajado", "muito")),
            Sentence("Ви останнім часом багато читаєте? (ввічливо)", listOf("Ultimamente", "você", "tem", "lido", "muito?")),
            Sentence("Цього року ціни дуже зростають", listOf("Este", "ano", "os", "preços", "têm", "subido", "muito")),
            Sentence("Останнім часом я не їм м'яса", listOf("Ultimamente", "eu", "não", "tenho", "comido", "carne"))
        )
    }
}

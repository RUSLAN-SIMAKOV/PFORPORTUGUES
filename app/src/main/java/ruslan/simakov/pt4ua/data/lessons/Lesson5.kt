package ruslan.simakov.pt4ua.data.lessons

import ruslan.simakov.pt4ua.data.RuleTable
import ruslan.simakov.pt4ua.data.Sentence

object Lesson5 {

    val rules = listOf(
        RuleTable(
            "Теперішній час: -AR, -ER, -IR",
            listOf(
                listOf("", "-AR (falar)", "-ER (comer)", "-IR (abrir)"),
                listOf("eu", "falo", "como", "abro"),
                listOf("tu", "falas", "comes", "abres"),
                listOf("você, ele, ela", "fala", "come", "abre"),
                listOf("nós", "falamos", "comemos", "abrimos"),
                listOf("vocês, eles, elas", "falam", "comem", "abrem")
            ),
            note = "Відрізняється лише голосна: -a- для -AR, -e- для -ER та -IR (крім nós: -imos)."
        ),
        RuleTable(
            "Минулий час: -AR, -ER, -IR",
            listOf(
                listOf("", "-AR (falar)", "-ER (comer)", "-IR (abrir)"),
                listOf("eu", "falei", "comi", "abri"),
                listOf("tu", "falaste", "comeste", "abriste"),
                listOf("você, ele, ela", "falou", "comeu", "abriu"),
                listOf("nós", "falamos", "comemos", "abrimos"),
                listOf("vocês, eles, elas", "falaram", "comeram", "abriram")
            ),
            note = "Форма nós однакова в теперішньому і минулому часі: comemos, abrimos."
        ),
        RuleTable(
            "Дієслова уроку",
            listOf(
                listOf("Português", "Українською"),
                listOf("comer", "їсти"),
                listOf("beber", "пити"),
                listOf("partir", "від'їжджати"),
                listOf("abrir", "відкривати, відчиняти")
            )
        )
    )

    fun getSentences(): List<Sentence> {
        return listOf(
            // VERBOS EM -ER (Presente)
            // COMER - їсти
            Sentence("Я їм суп на обід", listOf("Eu", "como", "sopa", "ao", "almoço")),
            Sentence("Ти їси м'ясо чи рибу?", listOf("Tu", "comes", "carne", "ou", "peixe?")),
            Sentence("Він їсть фрукти щоранку", listOf("Ele", "come", "fruta", "todas", "as", "manhãs")),
            Sentence("Ми їмо разом по неділях", listOf("Nós", "comemos", "juntos", "ao", "domingo")),
            Sentence("Вони їдять у ресторані по п'ятницях", listOf("Eles", "comem", "num", "restaurante", "às", "sextas-feiras")),

            // BEBER - пити
            Sentence("Я п'ю каву з молоком уранці", listOf("Eu", "bebo", "café", "com", "leite", "de", "manhã")),
            Sentence("Ти п'єш багато води влітку?", listOf("Tu", "bebes", "muita", "água", "no", "verão?")),
            Sentence("Вона п'є чай без цукру", listOf("Ela", "bebe", "chá", "sem", "açúcar")),
            Sentence("Ми п'ємо вино тільки на свята", listOf("Nós", "bebemos", "vinho", "só", "nas", "festas")),
            Sentence("Вони п'ють сік на сніданок", listOf("Eles", "bebem", "sumo", "ao", "pequeno-almoço")),

            // VERBOS EM -IR (Presente)
            // PARTIR - від'їжджати / розбивати
            Sentence("Я від'їжджаю до Порту завтра вранці", listOf("Eu", "parto", "para", "o", "Porto", "amanhã", "de", "manhã")),
            Sentence("Ти від'їжджаєш сьогодні ввечері?", listOf("Tu", "partes", "hoje", "à", "noite?")),
            Sentence("Він від'їжджає о сьомій годині", listOf("Ele", "parte", "às", "sete", "horas")),
            Sentence("Ми від'їжджаємо у відпустку в п'ятницю", listOf("Nós", "partimos", "de", "férias", "na", "sexta-feira")),
            Sentence("Вони від'їжджають зі станції Оріенте", listOf("Eles", "partem", "da", "estação", "do", "Oriente")),

            // ABRIR - відкривати
            Sentence("Я відчиняю вікно, бо тут жарко", listOf("Eu", "abro", "a", "janela", "porque", "está", "calor")),
            Sentence("Ти відчиняєш двері гостям?", listOf("Tu", "abres", "a", "porta", "aos", "convidados?")),
            Sentence("Вона відкриває магазин о дев'ятій", listOf("Ela", "abre", "a", "loja", "às", "nove")),
            Sentence("Ми відкриваємо подарунки на Різдво", listOf("Nós", "abrimos", "os", "presentes", "no", "Natal")),
            Sentence("Вони відкривають рахунок у банку", listOf("Eles", "abrem", "uma", "conta", "no", "banco")),

            // VERBOS EM -ER (Pretérito Perfeito - Минулий час)
            // COMER
            Sentence("Я з'їв увесь торт учора", listOf("Eu", "comi", "o", "bolo", "todo", "ontem")),
            Sentence("Ти вже з'їв сніданок?", listOf("Tu", "já", "comeste", "o", "pequeno-almoço?")),
            Sentence("Він з'їв дві тарілки супу", listOf("Ele", "comeu", "dois", "pratos", "de", "sopa")),
            Sentence("Ми їли рибу в ресторані на пляжі", listOf("Nós", "comemos", "peixe", "num", "restaurante", "na", "praia")),
            Sentence("Вони з'їли всі тістечка", listOf("Eles", "comeram", "todos", "os", "bolos")),

            // VERBOS EM -IR (Pretérito Perfeito - Минулий час)
            // ABRIR
            Sentence("Я відкрив лист від мами", listOf("Eu", "abri", "a", "carta", "da", "mãe")),
            Sentence("Ти відчинив вікно в спальні?", listOf("Tu", "abriste", "a", "janela", "do", "quarto?")),
            Sentence("Вона відкрила нове кафе в Лісабоні", listOf("Ela", "abriu", "um", "café", "novo", "em", "Lisboa")),
            Sentence("Ми відкрили пляшку вина на святі", listOf("Nós", "abrimos", "uma", "garrafa", "de", "vinho", "na", "festa")),
            Sentence("Вони відчинили двері й увійшли", listOf("Eles", "abriram", "a", "porta", "e", "entraram")),

            // FRASES ÚTEIS
            Sentence("Я п'ю каву щоранку перед роботою", listOf("Eu", "bebo", "café", "todas", "as", "manhãs", "antes", "do", "trabalho")),
            Sentence("Ми їмо хліб із сиром на вечерю", listOf("Nós", "comemos", "pão", "com", "queijo", "ao", "jantar")),
            Sentence("Він відчиняє двері своїм ключем", listOf("Ele", "abre", "a", "porta", "com", "a", "sua", "chave")),
            Sentence("Вони вже від'їхали до аеропорту", listOf("Eles", "já", "partiram", "para", "o", "aeroporto")),

            // BEBER – минулий час
            Sentence("Я випив дві склянки води", listOf("Eu", "bebi", "dois", "copos", "de", "água")),
            Sentence("Ти вже випив каву?", listOf("Tu", "já", "bebeste", "o", "café?")),
            Sentence("Вона випила чай з лимоном", listOf("Ela", "bebeu", "um", "chá", "com", "limão")),
            Sentence("Ми пили вино за вечерею", listOf("Nós", "bebemos", "vinho", "ao", "jantar")),
            Sentence("Вони нічого не пили в дорозі", listOf("Eles", "não", "beberam", "nada", "na", "viagem")),

            // PARTIR – минулий час
            Sentence("Я від'їхав о шостій ранку", listOf("Eu", "parti", "às", "seis", "da", "manhã")),
            Sentence("Ти поїхав без мене?", listOf("Tu", "partiste", "sem", "mim?")),
            Sentence("Потяг відправився вчасно", listOf("O", "comboio", "partiu", "a", "horas")),
            Sentence("Ми виїхали з Києва в березні", listOf("Nós", "partimos", "de", "Kyiv", "em", "março")),
            Sentence("Діти розбили вазу", listOf("As", "crianças", "partiram", "a", "jarra")),

            // VIVER – жити
            Sentence("Я живу в Португалії з родиною", listOf("Eu", "vivo", "em", "Portugal", "com", "a", "família")),
            Sentence("Ти живеш близько до моря?", listOf("Tu", "vives", "perto", "do", "mar?")),
            Sentence("Вона живе сама в маленькому будинку", listOf("Ela", "vive", "sozinha", "numa", "casa", "pequena")),
            Sentence("Ми живемо на другому поверсі", listOf("Nós", "vivemos", "no", "primeiro", "andar")),
            Sentence("Ви живете в Сінтрі? (множина)", listOf("Vocês", "vivem", "em", "Sintra?")),
            Sentence("Вони живуть разом уже десять років (чоловіки)", listOf("Eles", "vivem", "juntos", "há", "dez", "anos")),
            Sentence("Я жив у Харкові до війни", listOf("Eu", "vivi", "em", "Kharkiv", "antes", "da", "guerra")),
            Sentence("Ти жив за кордоном?", listOf("Tu", "viveste", "no", "estrangeiro?")),
            Sentence("Мій дідусь прожив дев'яносто років", listOf("O", "meu", "avô", "viveu", "noventa", "anos")),
            Sentence("Ми жили там два роки", listOf("Nós", "vivemos", "lá", "dois", "anos")),

            // ESCREVER – писати
            Sentence("Я пишу листа бабусі", listOf("Eu", "escrevo", "uma", "carta", "à", "avó")),
            Sentence("Ти пишеш дуже гарно", listOf("Tu", "escreves", "muito", "bem")),
            Sentence("Він пише книжку про Португалію", listOf("Ele", "escreve", "um", "livro", "sobre", "Portugal")),
            Sentence("Ми пишемо диктант на уроці", listOf("Nós", "escrevemos", "um", "ditado", "na", "aula")),
            Sentence("Вони весь час пишуть повідомлення (жінки)", listOf("Elas", "escrevem", "mensagens", "o", "tempo", "todo")),
            Sentence("Я написав тут своє ім'я", listOf("Eu", "escrevi", "o", "meu", "nome", "aqui")),
            Sentence("Ти написав мамі?", listOf("Tu", "escreveste", "à", "mãe?")),
            Sentence("Вона написала нам з Парижа", listOf("Ela", "escreveu-nos", "de", "Paris")),
            Sentence("Ми написали листа в банк", listOf("Nós", "escrevemos", "uma", "carta", "ao", "banco")),
            Sentence("Вони написали гарну пісню (чоловіки)", listOf("Eles", "escreveram", "uma", "canção", "bonita")),

            // APRENDER – вчити, навчатися
            Sentence("Я вчу нові слова щодня", listOf("Eu", "aprendo", "palavras", "novas", "todos", "os", "dias")),
            Sentence("Ти дуже швидко вчиш мову", listOf("Tu", "aprendes", "a", "língua", "muito", "depressa")),
            Sentence("Вона вчиться грати на піаніно", listOf("Ela", "aprende", "a", "tocar", "piano")),
            Sentence("Ми вчимося готувати португальські страви", listOf("Nós", "aprendemos", "a", "cozinhar", "pratos", "portugueses")),
            Sentence("Діти вчать португальську в школі", listOf("As", "crianças", "aprendem", "português", "na", "escola")),
            Sentence("Я навчився плавати влітку", listOf("Eu", "aprendi", "a", "nadar", "no", "verão")),
            Sentence("Що ти вивчив сьогодні?", listOf("O", "que", "aprendeste", "hoje?")),
            Sentence("Він навчився водити в Португалії", listOf("Ele", "aprendeu", "a", "conduzir", "em", "Portugal")),
            Sentence("Ми вивчили багато нових слів", listOf("Nós", "aprendemos", "muitas", "palavras", "novas")),
            Sentence("Вони швидко вивчили правила (жінки)", listOf("Elas", "aprenderam", "as", "regras", "depressa")),

            // VENDER – продавати
            Sentence("Я продаю свою стару машину", listOf("Eu", "vendo", "o", "meu", "carro", "velho")),
            Sentence("Ви продаєте тут квитки? (ввічливо)", listOf("Você", "vende", "bilhetes", "aqui?")),
            Sentence("Цей магазин продає українські продукти", listOf("Esta", "loja", "vende", "produtos", "ucranianos")),
            Sentence("Вони продають фрукти на ринку (чоловіки)", listOf("Eles", "vendem", "fruta", "no", "mercado")),
            Sentence("Ми продали квартиру в Україні", listOf("Nós", "vendemos", "o", "apartamento", "na", "Ucrânia")),
            Sentence("Ти продав свій велосипед?", listOf("Tu", "vendeste", "a", "tua", "bicicleta?")),
            Sentence("Вона продала все за тиждень", listOf("Ela", "vendeu", "tudo", "numa", "semana")),
            Sentence("Вони не продали будинок (жінки)", listOf("Elas", "não", "venderam", "a", "casa")),

            // PERCEBER – розуміти
            Sentence("Я розумію, коли ти говориш повільно", listOf("Eu", "percebo", "quando", "falas", "devagar")),
            Sentence("Ти розумієш, що я кажу?", listOf("Tu", "percebes", "o", "que", "eu", "digo?")),
            Sentence("Він не розуміє португальської", listOf("Ele", "não", "percebe", "português")),
            Sentence("Ми розуміємо майже все", listOf("Nós", "percebemos", "quase", "tudo")),
            Sentence("Ви розумієте правила? (множина)", listOf("Vocês", "percebem", "as", "regras?")),
            Sentence("Я не зрозумів питання", listOf("Eu", "não", "percebi", "a", "pergunta")),
            Sentence("Ти зрозумів пояснення вчителя?", listOf("Tu", "percebeste", "a", "explicação", "do", "professor?")),
            Sentence("Вони одразу все зрозуміли (чоловіки)", listOf("Eles", "perceberam", "tudo", "logo")),

            // DECIDIR – вирішувати
            Sentence("Я сам вирішую, що купити", listOf("Eu", "decido", "sozinho", "o", "que", "comprar")),
            Sentence("Хто вирішує у твоїй родині?", listOf("Quem", "decide", "na", "tua", "família?")),
            Sentence("Ми разом вирішуємо, куди їхати", listOf("Nós", "decidimos", "juntos", "para", "onde", "ir")),
            Sentence("Я вирішив залишитися в Португалії", listOf("Eu", "decidi", "ficar", "em", "Portugal")),
            Sentence("Вона вирішила вивчати медицину", listOf("Ela", "decidiu", "estudar", "medicina")),
            Sentence("Ви вже вирішили, коли переїжджати? (множина)", listOf("Vocês", "já", "decidiram", "quando", "mudar", "de", "casa?")),

            // RESPONDER – відповідати
            Sentence("Я відповідаю на листи щоранку", listOf("Eu", "respondo", "aos", "e-mails", "todas", "as", "manhãs")),
            Sentence("Ти не відповідаєш на дзвінки", listOf("Tu", "não", "respondes", "às", "chamadas")),
            Sentence("Вона відповіла дуже швидко", listOf("Ela", "respondeu", "muito", "depressa")),
            Sentence("Ми не відповіли на питання вчителя", listOf("Nós", "não", "respondemos", "à", "pergunta", "do", "professor"))
        )
    }
}

package ruslan.simakov.pt4ua.data.lessons

import ruslan.simakov.pt4ua.data.RuleTable
import ruslan.simakov.pt4ua.data.Sentence

// Найчастіші неправильні дієслова в базовій схемі Петрова + розмовне майбутнє IR + інфінітив
object Lesson8 {

    private val header = listOf("", "Минулий", "Теперішній", "Майбутній")

    val rules = listOf(
        RuleTable(
            "SER – бути (постійне)",
            listOf(
                header,
                listOf("eu", "fui", "sou", "serei"),
                listOf("tu", "foste", "és", "serás"),
                listOf("você, ele, ela", "foi", "é", "será"),
                listOf("nós", "fomos", "somos", "seremos"),
                listOf("vocês, eles, elas", "foram", "são", "serão")
            )
        ),
        RuleTable(
            "ESTAR – бути (тимчасове, місце)",
            listOf(
                header,
                listOf("eu", "estive", "estou", "estarei"),
                listOf("tu", "estiveste", "estás", "estarás"),
                listOf("você, ele, ela", "esteve", "está", "estará"),
                listOf("nós", "estivemos", "estamos", "estaremos"),
                listOf("vocês, eles, elas", "estiveram", "estão", "estarão")
            )
        ),
        RuleTable(
            "TER – мати",
            listOf(
                header,
                listOf("eu", "tive", "tenho", "terei"),
                listOf("tu", "tiveste", "tens", "terás"),
                listOf("você, ele, ela", "teve", "tem", "terá"),
                listOf("nós", "tivemos", "temos", "teremos"),
                listOf("vocês, eles, elas", "tiveram", "têm", "terão")
            )
        ),
        RuleTable(
            "IR – іти, їхати",
            listOf(
                header,
                listOf("eu", "fui", "vou", "irei"),
                listOf("tu", "foste", "vais", "irás"),
                listOf("você, ele, ela", "foi", "vai", "irá"),
                listOf("nós", "fomos", "vamos", "iremos"),
                listOf("vocês, eles, elas", "foram", "vão", "irão")
            ),
            note = "Минулий час SER і IR однаковий: fui, foste, foi, fomos, foram."
        ),
        RuleTable(
            "FAZER – робити",
            listOf(
                header,
                listOf("eu", "fiz", "faço", "farei"),
                listOf("tu", "fizeste", "fazes", "farás"),
                listOf("você, ele, ela", "fez", "faz", "fará"),
                listOf("nós", "fizemos", "fazemos", "faremos"),
                listOf("vocês, eles, elas", "fizeram", "fazem", "farão")
            )
        ),
        RuleTable(
            "Розмовне майбутнє: IR + інфінітив",
            listOf(
                listOf("", "Приклад"),
                listOf("?", "Tu vais trabalhar?"),
                listOf("+", "Eu vou trabalhar"),
                listOf("–", "Eu não vou trabalhar")
            ),
            note = "«Я збираюся працювати» = Eu vou trabalhar. У розмові ця форма звучить частіше, ніж trabalharei."
        )
    )

    fun getSentences(): List<Sentence> {
        return listOf(
            // SER – бути
            Sentence("Моя дружина медсестра", listOf("A", "minha", "mulher", "é", "enfermeira")),
            Sentence("Ти з Києва чи зі Львова?", listOf("Tu", "és", "de", "Kyiv", "ou", "de", "Lviv?")),
            Sentence("Це не моя сумка", listOf("Esta", "não", "é", "a", "minha", "mala")),
            Sentence("Він був учителем двадцять років", listOf("Ele", "foi", "professor", "durante", "vinte", "anos")),
            Sentence("Подорож була цікавою?", listOf("A", "viagem", "foi", "interessante?")),
            Sentence("Іспит не був складним", listOf("O", "exame", "não", "foi", "difícil")),
            Sentence("Я буду лікарем, як мій батько", listOf("Eu", "serei", "médico", "como", "o", "meu", "pai")),
            Sentence("Зустріч буде в понеділок?", listOf("A", "reunião", "será", "na", "segunda-feira?")),
            Sentence("Нова робота не буде легкою", listOf("O", "novo", "trabalho", "não", "será", "fácil")),

            // ESTAR – бути (тимчасово, місце)
            Sentence("Ми зараз у кафе біля вокзалу", listOf("Nós", "estamos", "agora", "num", "café", "perto", "da", "estação")),
            Sentence("Ти втомлений після роботи?", listOf("Tu", "estás", "cansado", "depois", "do", "trabalho?")),
            Sentence("Мами немає вдома, вона на роботі", listOf("A", "mãe", "não", "está", "em", "casa,", "está", "no", "trabalho")),
            Sentence("Учора я був у лікаря", listOf("Ontem", "eu", "estive", "no", "médico")),
            Sentence("Ви були в Порту минулого тижня? (множина)", listOf("Vocês", "estiveram", "no", "Porto", "na", "semana", "passada?")),
            Sentence("Вони не були на зборах (жінки)", listOf("Elas", "não", "estiveram", "na", "reunião")),
            Sentence("Завтра я буду в офісі цілий день", listOf("Amanhã", "eu", "estarei", "no", "escritório", "o", "dia", "todo")),
            Sentence("Ви будете вдома ввечері? (ввічливо)", listOf("Você", "estará", "em", "casa", "à", "noite?")),
            Sentence("Він не буде на вечірці", listOf("Ele", "não", "estará", "na", "festa")),

            // TER – мати
            Sentence("У мене двоє дітей і собака", listOf("Eu", "tenho", "dois", "filhos", "e", "um", "cão")),
            Sentence("У тебе є хвилинка?", listOf("Tu", "tens", "um", "minuto?")),
            Sentence("У нас немає часу на це", listOf("Nós", "não", "temos", "tempo", "para", "isso")),
            Sentence("Учора в мене був важкий день", listOf("Ontem", "eu", "tive", "um", "dia", "difícil")),
            Sentence("У Вас були проблеми з документами? (ввічливо)", listOf("Você", "teve", "problemas", "com", "os", "documentos?")),
            Sentence("Вони не мали часу пообідати (чоловіки)", listOf("Eles", "não", "tiveram", "tempo", "para", "almoçar")),
            Sentence("Наступного тижня в нас буде відпустка", listOf("Na", "próxima", "semana", "nós", "teremos", "férias")),
            Sentence("У тебе буде час у суботу?", listOf("Tu", "terás", "tempo", "no", "sábado?")),
            Sentence("Завтра в неї не буде уроків", listOf("Amanhã", "ela", "não", "terá", "aulas")),

            // IR – іти, їхати
            Sentence("Я їжджу на роботу автобусом", listOf("Eu", "vou", "para", "o", "trabalho", "de", "autocarro")),
            Sentence("Ти йдеш з нами в кіно?", listOf("Tu", "vais", "connosco", "ao", "cinema?")),
            Sentence("Діти не ходять до школи в суботу", listOf("As", "crianças", "não", "vão", "à", "escola", "ao", "sábado")),
            Sentence("Минулого літа ми їздили до Іспанії", listOf("No", "verão", "passado", "nós", "fomos", "a", "Espanha")),
            Sentence("Ви ходили до лікаря? (ввічливо)", listOf("Você", "foi", "ao", "médico?")),
            Sentence("Вони не пішли на вечірку (чоловіки)", listOf("Eles", "não", "foram", "à", "festa")),
            Sentence("Завтра я піду в банк", listOf("Amanhã", "eu", "irei", "ao", "banco")),
            Sentence("Ви поїдете в Україну на Різдво? (множина)", listOf("Vocês", "irão", "à", "Ucrânia", "no", "Natal?")),
            Sentence("Вона не піде на роботу в понеділок", listOf("Ela", "não", "irá", "ao", "trabalho", "na", "segunda-feira")),

            // FAZER – робити
            Sentence("Я роблю домашнє завдання ввечері", listOf("Eu", "faço", "os", "trabalhos", "de", "casa", "à", "noite")),
            Sentence("Ти робиш зарядку щоранку?", listOf("Tu", "fazes", "ginástica", "todas", "as", "manhãs?")),
            Sentence("Він не готує вечерю", listOf("Ele", "não", "faz", "o", "jantar")),
            Sentence("Учора ми спекли торт для бабусі", listOf("Ontem", "nós", "fizemos", "um", "bolo", "para", "a", "avó")),
            Sentence("Ви написали тест? (множина)", listOf("Vocês", "fizeram", "o", "teste?")),
            Sentence("Я нічого не робив у вихідні", listOf("Eu", "não", "fiz", "nada", "no", "fim", "de", "semana")),
            Sentence("Завтра вона зробить усе вчасно", listOf("Amanhã", "ela", "fará", "tudo", "a", "tempo")),
            Sentence("Ти зробиш це для мене?", listOf("Tu", "farás", "isso", "por", "mim?")),
            Sentence("Ми не робитимемо вечірку цього року", listOf("Nós", "não", "faremos", "uma", "festa", "este", "ano")),

            // IR + інфінітив – розмовне майбутнє
            Sentence("Я збираюся купити нову машину", listOf("Eu", "vou", "comprar", "um", "carro", "novo")),
            Sentence("Ти збираєшся вчити португальську цього року?", listOf("Tu", "vais", "estudar", "português", "este", "ano?")),
            Sentence("Він не збирається працювати у вихідні", listOf("Ele", "não", "vai", "trabalhar", "ao", "fim", "de", "semana")),
            Sentence("Ми збираємося відпочивати в Алгарве в липні", listOf("Nós", "vamos", "descansar", "no", "Algarve", "em", "julho")),
            Sentence("Ви збираєтеся вечеряти вдома? (множина)", listOf("Vocês", "vão", "jantar", "em", "casa?")),
            Sentence("Вони не збираються переїжджати (чоловіки)", listOf("Eles", "não", "vão", "mudar", "de", "casa")),
            Sentence("Вона збирається відкрити своє кафе", listOf("Ela", "vai", "abrir", "o", "seu", "próprio", "café")),
            Sentence("Ви збираєтеся замовити рибу? (ввічливо)", listOf("Você", "vai", "pedir", "peixe?")),
            Sentence("Я не збираюся чекати так довго", listOf("Eu", "não", "vou", "esperar", "tanto", "tempo"))
        )
    }
}

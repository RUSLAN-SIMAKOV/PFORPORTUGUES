package ruslan.simakov.pt4ua.data.lessons

import ruslan.simakov.pt4ua.data.RuleTable
import ruslan.simakov.pt4ua.data.Sentence

// Найчастіші неправильні дієслова в базовій схемі + розмовне майбутнє IR + інфінітив
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
            Sentence("Я не збираюся чекати так довго", listOf("Eu", "não", "vou", "esperar", "tanto", "tempo")),
            Sentence("Сьогодні ввечері ми збираємося дивитися фільм", listOf("Hoje", "à", "noite", "nós", "vamos", "ver", "um", "filme")),

            // ЩЕ SER
            Sentence("Ми українці, ми з Одеси", listOf("Nós", "somos", "ucranianos,", "somos", "de", "Odessa")),
            Sentence("Це твій новий телефон?", listOf("Este", "é", "o", "teu", "telemóvel", "novo?")),
            Sentence("Я не з Лісабона, я з Порту", listOf("Eu", "não", "sou", "de", "Lisboa,", "sou", "do", "Porto")),
            Sentence("Учора був дуже гарний день", listOf("Ontem", "foi", "um", "dia", "muito", "bonito")),
            Sentence("Концерт був хороший?", listOf("O", "concerto", "foi", "bom?")),
            Sentence("Це була не моя ідея", listOf("Não", "foi", "ideia", "minha")),
            Sentence("Наступного понеділка буде свято", listOf("Na", "próxima", "segunda-feira", "será", "feriado")),
            Sentence("Вечірка буде в тебе вдома?", listOf("A", "festa", "será", "em", "tua", "casa?")),
            Sentence("Подорож не буде дорогою", listOf("A", "viagem", "não", "será", "cara")),

            // ЩЕ ESTAR
            Sentence("Ключі на столі в кухні", listOf("As", "chaves", "estão", "em", "cima", "da", "mesa", "da", "cozinha")),
            Sentence("Ви сьогодні вдома? (ввічливо)", listOf("Você", "está", "em", "casa", "hoje?")),
            Sentence("Я не втомлена, я щойно прокинулася (жінка)", listOf("Eu", "não", "estou", "cansada,", "acabei", "de", "acordar")),
            Sentence("Минулого тижня ми були в Мадриді", listOf("Na", "semana", "passada", "nós", "estivemos", "em", "Madrid")),
            Sentence("Ти був удома вчора ввечері?", listOf("Tu", "estiveste", "em", "casa", "ontem", "à", "noite?")),
            Sentence("Він не був на роботі в понеділок", listOf("Ele", "não", "esteve", "no", "trabalho", "na", "segunda-feira")),
            Sentence("Я буду в Україні в серпні", listOf("Eu", "estarei", "na", "Ucrânia", "em", "agosto")),
            Sentence("Магазин буде відчинений у неділю?", listOf("A", "loja", "estará", "aberta", "no", "domingo?")),
            Sentence("Ми не будемо вдома в суботу", listOf("Nós", "não", "estaremos", "em", "casa", "no", "sábado")),

            // ЩЕ TER
            Sentence("Вона має гарний голос", listOf("Ela", "tem", "uma", "voz", "bonita")),
            Sentence("У Вас є вільні кімнати на вихідні? (ввічливо)", listOf("Tem", "quartos", "livres", "para", "o", "fim", "de", "semana?")),
            Sentence("У них немає дітей (чоловіки)", listOf("Eles", "não", "têm", "filhos")),
            Sentence("У нас була чудова відпустка", listOf("Nós", "tivemos", "umas", "férias", "ótimas")),
            Sentence("У тебе були проблеми на кордоні?", listOf("Tu", "tiveste", "problemas", "na", "fronteira?")),
            Sentence("Я не мав часу поснідати", listOf("Eu", "não", "tive", "tempo", "para", "tomar", "o", "pequeno-almoço")),
            Sentence("Завтра в тебе буде новий учитель", listOf("Amanhã", "tu", "terás", "um", "professor", "novo")),
            Sentence("У нас буде достатньо часу?", listOf("Nós", "teremos", "tempo", "suficiente?")),
            Sentence("У серпні в них не буде уроків (жінки)", listOf("Elas", "não", "terão", "aulas", "em", "agosto")),

            // ЩЕ IR
            Sentence("Ми ходимо до церкви щонеділі", listOf("Nós", "vamos", "à", "igreja", "todos", "os", "domingos")),
            Sentence("Ви їдете до Порту потягом? (множина)", listOf("Vocês", "vão", "para", "o", "Porto", "de", "comboio?")),
            Sentence("Я сьогодні не йду на роботу", listOf("Eu", "não", "vou", "ao", "trabalho", "hoje")),
            Sentence("Учора я ходив до банку", listOf("Ontem", "eu", "fui", "ao", "banco")),
            Sentence("Ти їздив до Фатіми?", listOf("Tu", "foste", "a", "Fátima?")),
            Sentence("Вона не ходила до школи, бо хворіла", listOf("Ela", "não", "foi", "à", "escola", "porque", "estava", "doente")),
            Sentence("Наступного року ми поїдемо до Бразилії", listOf("No", "próximo", "ano", "nós", "iremos", "ao", "Brasil")),
            Sentence("Ти підеш на концерт у суботу?", listOf("Tu", "irás", "ao", "concerto", "no", "sábado?")),
            Sentence("Вони не підуть на пляж через дощ (чоловіки)", listOf("Eles", "não", "irão", "à", "praia", "por", "causa", "da", "chuva")),

            // ЩЕ FAZER
            Sentence("Ми робимо покупки по суботах", listOf("Nós", "fazemos", "compras", "ao", "sábado")),
            Sentence("Ви робите знижку студентам? (ввічливо)", listOf("Você", "faz", "desconto", "aos", "estudantes?")),
            Sentence("Він не робить домашніх завдань", listOf("Ele", "não", "faz", "os", "trabalhos", "de", "casa")),
            Sentence("Я зробив усе, що міг", listOf("Eu", "fiz", "tudo", "o", "que", "pude")),
            Sentence("Що ви робили у вихідні? (множина)", listOf("O", "que", "vocês", "fizeram", "no", "fim", "de", "semana?")),
            Sentence("Вони не робили ремонту (жінки)", listOf("Elas", "não", "fizeram", "obras")),
            Sentence("Завтра я приготую сніданок для всіх", listOf("Amanhã", "eu", "farei", "o", "pequeno-almoço", "para", "todos")),
            Sentence("Ти зробиш це до понеділка?", listOf("Tu", "farás", "isso", "até", "segunda-feira?")),
            Sentence("Ми не робитимемо ремонт цього року", listOf("Nós", "não", "faremos", "obras", "este", "ano"))
        )
    }
}

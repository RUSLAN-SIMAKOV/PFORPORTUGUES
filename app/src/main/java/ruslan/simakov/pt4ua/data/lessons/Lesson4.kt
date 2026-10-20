package ruslan.simakov.pt4ua.data.lessons

import ruslan.simakov.pt4ua.data.RuleTable
import ruslan.simakov.pt4ua.data.Sentence

object Lesson4 {

    val rules = listOf(
        RuleTable(
            "Питальні слова",
            listOf(
                listOf("Українською", "Português", "Приклад"),
                listOf("Що?", "O que?", "O que fazes?"),
                listOf("Хто?", "Quem?", "Quem é ele?"),
                listOf("Де?", "Onde?", "Onde ele está?"),
                listOf("Коли?", "Quando?", "Quando chegas?"),
                listOf("Скільки?", "Quanto? Quantos?", "Quanto custa?"),
                listOf("Як?", "Como?", "Como eu faço isso?"),
                listOf("Чому?", "Porque?", "Porque eu ajudo?"),
                listOf("Який? Які?", "Qual? Quais?", "Qual é o seu nome?")
            )
        ),
        RuleTable(
            "Як побудувати питання",
            listOf(
                listOf("Тип", "Приклад"),
                listOf("так / ні – та сама фраза з інтонацією", "Tu falas português?"),
                listOf("питальне слово + хто + дієслово", "Onde ele trabalha?"),
                listOf("з QUEM – дієслово перед займенником", "Quem é ele? Quem és tu?")
            ),
            note = "Quantos / quantas – перед іменником: Quantos filhos tens? Qual – один, quais – кілька. " +
                "Відповідь «тому що» – porque, в кінці питання – porquê?"
        ),
        RuleTable(
            "ISSO – це",
            listOf(
                listOf("Українською", "Português"),
                listOf("Що це означає?", "O que significa isso?"),
                listOf("Це корисно?", "Isso é útil?"),
                listOf("Це (тут, поруч)", "Isto")
            )
        )
    )
    fun getSentences(): List<Sentence> {
        return listOf(
            // O QUE – що
            Sentence("Що я роблю не так?", listOf("O", "que", "eu", "faço", "mal?")),
            Sentence("Що я не розумію в цьому тексті?", listOf("O", "que", "eu", "não", "percebo", "neste", "texto?")),
            Sentence("Що ти робиш у вихідні?", listOf("O", "que", "tu", "fazes", "ao", "fim", "de", "semana?")),
            Sentence("Що Ви робите після роботи? (ввічливо)", listOf("O", "que", "você", "faz", "depois", "do", "trabalho?")),
            Sentence("Що він робить на кухні?", listOf("O", "que", "ele", "faz", "na", "cozinha?")),
            Sentence("Що вона читає перед сном?", listOf("O", "que", "ela", "lê", "antes", "de", "dormir?")),
            Sentence("Що ми їмо сьогодні на вечерю?", listOf("O", "que", "nós", "comemos", "hoje", "ao", "jantar?")),
            Sentence("Що ви робите в суботу ввечері? (множина)", listOf("O", "que", "vocês", "fazem", "no", "sábado", "à", "noite?")),
            Sentence("Що вони роблять у саду? (чоловіки)", listOf("O", "que", "eles", "fazem", "no", "jardim?")),
            Sentence("Що вони купують на ринку? (жінки)", listOf("O", "que", "elas", "compram", "no", "mercado?")),

            // QUEM – хто
            Sentence("Хто я для тебе?", listOf("Quem", "sou", "eu", "para", "ti?")),
            Sentence("Хто ти і як тебе звати?", listOf("Quem", "és", "tu", "e", "como", "te", "chamas?")),
            Sentence("Хто Ви? Ви новий лікар? (ввічливо)", listOf("Quem", "é", "você?", "É", "o", "novo", "médico?")),
            Sentence("Хто він? Твій брат?", listOf("Quem", "é", "ele?", "É", "o", "teu", "irmão?")),
            Sentence("Хто вона? Нова вчителька?", listOf("Quem", "é", "ela?", "É", "a", "nova", "professora?")),
            Sentence("Хто ми в цій історії?", listOf("Quem", "somos", "nós", "nesta", "história?")),
            Sentence("Хто ви? Ви туристи? (множина)", listOf("Quem", "são", "vocês?", "São", "turistas?")),
            Sentence("Хто вони? Твої колеги? (чоловіки)", listOf("Quem", "são", "eles?", "São", "os", "teus", "colegas?")),
            Sentence("Хто вони? Твої подруги? (жінки)", listOf("Quem", "são", "elas?", "São", "as", "tuas", "amigas?")),

            // ONDE – де
            Sentence("Де я можу купити квиток?", listOf("Onde", "eu", "posso", "comprar", "um", "bilhete?")),
            Sentence("Де ти зараз? Я на тебе чекаю", listOf("Onde", "tu", "estás", "agora?", "Estou", "à", "tua", "espera")),
            Sentence("Де Ви живете в Лісабоні? (ввічливо)", listOf("Onde", "você", "mora", "em", "Lisboa?")),
            Sentence("Де він працює після переїзду?", listOf("Onde", "ele", "trabalha", "depois", "da", "mudança?")),
            Sentence("Де вона купує свіжий хліб?", listOf("Onde", "ela", "compra", "pão", "fresco?")),
            Sentence("Де ми зустрічаємося завтра?", listOf("Onde", "nós", "nos", "encontramos", "amanhã?")),
            Sentence("Де ви паркуєте машину? (множина)", listOf("Onde", "vocês", "estacionam", "o", "carro?")),
            Sentence("Де вони проводять відпустку? (чоловіки)", listOf("Onde", "eles", "passam", "as", "férias?")),
            Sentence("Де вони вивчають португальську? (жінки)", listOf("Onde", "elas", "estudam", "português?")),

            // QUANDO – коли
            Sentence("Коли я починаю нову роботу?", listOf("Quando", "eu", "começo", "o", "novo", "trabalho?")),
            Sentence("Коли ти приходиш додому з роботи?", listOf("Quando", "tu", "chegas", "a", "casa", "do", "trabalho?")),
            Sentence("Коли Ви відкриваєте магазин? (ввічливо)", listOf("Quando", "você", "abre", "a", "loja?")),
            Sentence("Коли він приїжджає з Порту?", listOf("Quando", "ele", "chega", "do", "Porto?")),
            Sentence("Коли вона закінчує роботу?", listOf("Quando", "ela", "acaba", "o", "trabalho?")),
            Sentence("Коли ми йдемо на пляж?", listOf("Quando", "nós", "vamos", "à", "praia?")),
            Sentence("Коли ви повертаєтеся з відпустки? (множина)", listOf("Quando", "vocês", "voltam", "das", "férias?")),
            Sentence("Коли вони приходять на вечерю? (чоловіки)", listOf("Quando", "eles", "chegam", "para", "o", "jantar?")),
            Sentence("Коли вони мають вихідний? (жінки)", listOf("Quando", "elas", "têm", "folga?")),

            // QUANTO – скільки
            Sentence("Скільки я винен за каву?", listOf("Quanto", "eu", "devo", "pelo", "café?")),
            Sentence("Скільки ти платиш за квартиру?", listOf("Quanto", "tu", "pagas", "pelo", "apartamento?")),
            Sentence("Скільки Ви хочете за машину? (ввічливо)", listOf("Quanto", "você", "quer", "pelo", "carro?")),
            Sentence("Скільки він заробляє на місяць?", listOf("Quanto", "ele", "ganha", "por", "mês?")),
            Sentence("Скільки коштує квиток на автобус?", listOf("Quanto", "custa", "o", "bilhete", "de", "autocarro?")),
            Sentence("Скільки часу ми маємо до потяга?", listOf("Quanto", "tempo", "nós", "temos", "até", "ao", "comboio?")),
            Sentence("Скільки ви витрачаєте на їжу? (множина)", listOf("Quanto", "vocês", "gastam", "em", "comida?")),
            Sentence("Скільки вони платять за світло? (чоловіки)", listOf("Quanto", "eles", "pagam", "pela", "luz?")),
            Sentence("Скільки в них дітей? (жінки)", listOf("Quantos", "filhos", "elas", "têm?")),

            // COMO – як
            Sentence("Як мені дістатися до вокзалу?", listOf("Como", "eu", "chego", "à", "estação?")),
            Sentence("Як ти робиш цей торт?", listOf("Como", "tu", "fazes", "este", "bolo?")),
            Sentence("Як Ви їздите на роботу щодня? (ввічливо)", listOf("Como", "você", "vai", "para", "o", "trabalho", "todos", "os", "dias?")),
            Sentence("Як він це робить так швидко?", listOf("Como", "ele", "faz", "isso", "tão", "depressa?")),
            Sentence("Як ми пишемо це слово?", listOf("Como", "nós", "escrevemos", "esta", "palavra?")),
            Sentence("Як вони вивчають мову так добре? (чоловіки)", listOf("Como", "eles", "aprendem", "a", "língua", "tão", "bem?")),

            // PORQUE – чому
            Sentence("Чому я маю чекати так довго?", listOf("Porque", "eu", "tenho", "de", "esperar", "tanto", "tempo?")),
            Sentence("Чому ти не відповідаєш на мої повідомлення?", listOf("Porque", "tu", "não", "respondes", "às", "minhas", "mensagens?")),
            Sentence("Чому Ви вивчаєте португальську мову? (ввічливо)", listOf("Porque", "você", "estuda", "a", "língua", "portuguesa?")),
            Sentence("Чому він не працює сьогодні?", listOf("Porque", "ele", "não", "trabalha", "hoje?")),
            Sentence("Чому ми не їдемо автобусом?", listOf("Porque", "nós", "não", "vamos", "de", "autocarro?")),
            Sentence("Чому вони живуть так далеко? (чоловіки)", listOf("Porque", "eles", "moram", "tão", "longe?")),

            // QUAL – який / яка
            Sentence("Як Вас звати? (ввічливо)", listOf("Qual", "é", "o", "seu", "nome?")),
            Sentence("Який твій номер телефону?", listOf("Qual", "é", "o", "teu", "número", "de", "telefone?")),
            Sentence("Яка Ваша національність? (ввічливо)", listOf("Qual", "é", "a", "sua", "nacionalidade?")),
            Sentence("Яку з книжок ти обираєш?", listOf("Qual", "dos", "livros", "tu", "escolhes?")),
            Sentence("Яку із суконь вона обирає?", listOf("Qual", "dos", "vestidos", "ela", "escolhe?")),
            Sentence("Який із цих двох будинків ми обираємо?", listOf("Qual", "destas", "duas", "casas", "nós", "escolhemos?")),
            Sentence("Яка твоя улюблена страва?", listOf("Qual", "é", "o", "teu", "prato", "preferido?")),
            Sentence("Які з квитків вони обирають? (чоловіки)", listOf("Quais", "dos", "bilhetes", "eles", "escolhem?")),

            // ISSO – це
            Sentence("Що це означає португальською?", listOf("O", "que", "significa", "isso", "em", "português?")),
            Sentence("Це корисно для роботи?", listOf("Isso", "é", "útil", "para", "o", "trabalho?")),
            Sentence("Це дуже важливо для мене", listOf("Isso", "é", "muito", "importante", "para", "mim"))
        )
    }
}

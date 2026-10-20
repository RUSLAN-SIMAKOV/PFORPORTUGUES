package ruslan.simakov.pt4ua.data.lessons

import ruslan.simakov.pt4ua.data.RuleTable
import ruslan.simakov.pt4ua.data.Sentence

object Lesson3 {

    val rules = listOf(
        RuleTable(
            "SER і ESTAR – бути",
            listOf(
                listOf("", "SER", "ESTAR"),
                listOf("eu", "sou", "estou"),
                listOf("tu", "és", "estás"),
                listOf("você, ele, ela", "é", "está"),
                listOf("nós", "somos", "estamos"),
                listOf("vocês, eles, elas", "são", "estão")
            ),
            note = "В українській «бути» в теперішньому часі пропускаємо (Я вчитель), у португальській – ні: Eu sou professor."
        ),
        RuleTable(
            "SER – постійне",
            listOf(
                listOf("Що?", "Приклад"),
                listOf("професія", "Eu sou professor"),
                listOf("походження", "Eu sou da Ucrânia"),
                listOf("характер", "Ele é simpático"),
                listOf("хто це", "Quem és tu?")
            )
        ),
        RuleTable(
            "ESTAR – тимчасове",
            listOf(
                listOf("Що?", "Приклад"),
                listOf("місце", "Eu estou em casa"),
                listOf("стан", "Elas estão cansadas"),
                listOf("самопочуття", "Como estás?")
            )
        ),
        RuleTable(
            "TER – мати, VER – бачити",
            listOf(
                listOf("", "TER", "VER"),
                listOf("eu", "tenho", "vejo"),
                listOf("tu", "tens", "vês"),
                listOf("você, ele, ela", "tem", "vê"),
                listOf("nós", "temos", "vemos"),
                listOf("vocês, eles, elas", "têm", "veem")
            ),
            note = "Вік – через TER: Eu tenho trinta anos (Мені тридцять років). " +
                "Займенник після дієслова через дефіс: vejo-te, vês-me, veem-nos. Після não – перед дієсловом: não te vejo."
        )
    )
    fun getSentences(): List<Sentence> {
        return listOf(
            // SER – бути (постійна характеристика: професія, національність, ім'я)
            Sentence("Я вчитель математики", listOf("Eu", "sou", "professor", "de", "matemática")),
            Sentence("Я не лікарка, я медсестра", listOf("Eu", "não", "sou", "médica,", "sou", "enfermeira")),
            Sentence("Ти студент цього університету?", listOf("Tu", "és", "estudante", "desta", "universidade?")),
            Sentence("Ви лікар у цій лікарні? (ввічливо)", listOf("Você", "é", "médico", "neste", "hospital?")),
            Sentence("Він дуже привітний і спокійний", listOf("Ele", "é", "muito", "simpático", "e", "calmo")),
            Sentence("Вона інженерка, вона з Харкова", listOf("Ela", "é", "engenheira", "e", "é", "de", "Kharkiv")),
            Sentence("Ми друзі ще зі школи", listOf("Nós", "somos", "amigos", "desde", "a", "escola")),
            Sentence("Ви вчителі в цій школі? (множина)", listOf("Vocês", "são", "professores", "nesta", "escola?")),
            Sentence("Вони брати, але не близнюки", listOf("Eles", "são", "irmãos,", "mas", "não", "são", "gémeos")),
            Sentence("Вони сестри з Одеси", listOf("Elas", "são", "irmãs", "de", "Odessa")),
            Sentence("Хто ти і звідки ти?", listOf("Quem", "és", "tu", "e", "de", "onde", "és?")),
            Sentence("Ви з України чи з Польщі? (ввічливо)", listOf("Você", "é", "da", "Ucrânia", "ou", "da", "Polónia?")),

            // ESTAR – бути (тимчасовий стан, місцезнаходження)
            Sentence("Зараз я вдома з дітьми", listOf("Agora", "eu", "estou", "em", "casa", "com", "os", "filhos")),
            Sentence("Я не вдома, я на роботі", listOf("Eu", "não", "estou", "em", "casa,", "estou", "no", "trabalho")),
            Sentence("Ти на роботі чи вже вдома?", listOf("Tu", "estás", "no", "trabalho", "ou", "já", "em", "casa?")),
            Sentence("Ви в готелі біля пляжу? (ввічливо)", listOf("Você", "está", "no", "hotel", "perto", "da", "praia?")),
            Sentence("Він у школі до третьої", listOf("Ele", "está", "na", "escola", "até", "às", "três")),
            Sentence("Вона в офісі на нараді", listOf("Ela", "está", "no", "escritório", "numa", "reunião")),
            Sentence("Ми в парку з собакою", listOf("Nós", "estamos", "no", "parque", "com", "o", "cão")),
            Sentence("Ви в ресторані в центрі? (множина)", listOf("Vocês", "estão", "no", "restaurante", "no", "centro?")),
            Sentence("Вони в машині на парковці (чоловіки)", listOf("Eles", "estão", "no", "carro", "no", "parque", "de", "estacionamento")),
            Sentence("Вони дуже втомлені сьогодні (жінки)", listOf("Elas", "estão", "muito", "cansadas", "hoje")),
            Sentence("Як ти сьогодні? Усе добре?", listOf("Como", "estás", "hoje?", "Está", "tudo", "bem?")),
            Sentence("Як Ви сьогодні? (ввічливо)", listOf("Como", "está", "você", "hoje?")),
            Sentence("Де він зараз? Ще на вокзалі?", listOf("Onde", "está", "ele", "agora?", "Ainda", "está", "na", "estação?")),

            // TER – мати (володіння, вік)
            Sentence("Я маю машину, але не маю гаража", listOf("Eu", "tenho", "carro,", "mas", "não", "tenho", "garagem")),
            Sentence("Я не маю часу сьогодні ввечері", listOf("Eu", "não", "tenho", "tempo", "hoje", "à", "noite")),
            Sentence("Ти маєш брата чи сестру?", listOf("Tu", "tens", "um", "irmão", "ou", "uma", "irmã?")),
            Sentence("Ви маєте хвилинку для мене? (ввічливо)", listOf("Você", "tem", "um", "minuto", "para", "mim?")),
            Sentence("Він має великий будинок біля моря", listOf("Ele", "tem", "uma", "casa", "grande", "perto", "do", "mar")),
            Sentence("Вона має двох котів і собаку", listOf("Ela", "tem", "dois", "gatos", "e", "um", "cão")),
            Sentence("Ми маємо багато роботи цього тижня", listOf("Nós", "temos", "muito", "trabalho", "esta", "semana")),
            Sentence("Ви маєте квитки на концерт? (множина)", listOf("Vocês", "têm", "bilhetes", "para", "o", "concerto?")),
            Sentence("Вони мають маленький ресторан у Порту (чоловіки)", listOf("Eles", "têm", "um", "pequeno", "restaurante", "no", "Porto")),
            Sentence("Вони мають урок португальської в понеділок (жінки)", listOf("Elas", "têm", "aula", "de", "português", "na", "segunda-feira")),
            Sentence("Мені тридцять п'ять років", listOf("Eu", "tenho", "trinta", "e", "cinco", "anos")),
            Sentence("Скільки грошей ти маєш у гаманці?", listOf("Quanto", "dinheiro", "tens", "na", "carteira?")),

            // VER – бачити
            Sentence("Я бачу тебе щодня на вокзалі", listOf("Eu", "vejo-te", "todos", "os", "dias", "na", "estação")),
            Sentence("Я не бачу тебе без окулярів", listOf("Eu", "não", "te", "vejo", "sem", "óculos")),
            Sentence("Ти бачиш мене? Я біля входу", listOf("Tu", "vês-me?", "Estou", "perto", "da", "entrada")),
            Sentence("Ви бачите море з вікна? (ввічливо)", listOf("Você", "vê", "o", "mar", "da", "janela?")),
            Sentence("Він бачить собаку в саду", listOf("Ele", "vê", "o", "cão", "no", "jardim")),
            Sentence("Вона бачить батьків щонеділі", listOf("Ela", "vê", "os", "pais", "todos", "os", "domingos")),
            Sentence("Ми бачимо гори з балкона", listOf("Nós", "vemos", "as", "montanhas", "da", "varanda")),
            Sentence("Ви бачите того птаха на дереві? (множина)", listOf("Vocês", "veem", "aquele", "pássaro", "na", "árvore?")),
            Sentence("Вони бачать нас щоранку (чоловіки)", listOf("Eles", "veem-nos", "todas", "as", "manhãs")),
            Sentence("Вони бачать нас з вікна кухні (жінки)", listOf("Elas", "veem-nos", "da", "janela", "da", "cozinha")),
            Sentence("Що ти бачиш на цій фотографії?", listOf("O", "que", "vês", "nesta", "fotografia?")),
            Sentence("Чому ти мене не бачиш? Я тут", listOf("Porque", "não", "me", "vês?", "Eu", "estou", "aqui")),

            // ЩЕ SER
            Sentence("Мій тато водій автобуса", listOf("O", "meu", "pai", "é", "motorista", "de", "autocarro")),
            Sentence("Моя мама кухарка в ресторані", listOf("A", "minha", "mãe", "é", "cozinheira", "num", "restaurante")),
            Sentence("Ми з України, з Києва", listOf("Nós", "somos", "da", "Ucrânia,", "de", "Kyiv")),
            Sentence("Ти португалець чи бразилець?", listOf("Tu", "és", "português", "ou", "brasileiro?")),
            Sentence("Ця книжка дуже цікава", listOf("Este", "livro", "é", "muito", "interessante")),
            Sentence("Квартира велика, але дорога", listOf("O", "apartamento", "é", "grande,", "mas", "caro")),
            Sentence("Лісабон – дуже гарне місто", listOf("Lisboa", "é", "uma", "cidade", "muito", "bonita")),
            Sentence("Мої сусіди дуже привітні", listOf("Os", "meus", "vizinhos", "são", "muito", "simpáticos")),
            Sentence("Ви не з Португалії? (ввічливо)", listOf("Você", "não", "é", "de", "Portugal?")),
            Sentence("Вона висока і світловолоса", listOf("Ela", "é", "alta", "e", "loira")),
            Sentence("Сьогодні неділя, а завтра робочий день", listOf("Hoje", "é", "domingo", "e", "amanhã", "é", "dia", "de", "trabalho")),
            Sentence("Це мій чоловік, він лікар", listOf("Este", "é", "o", "meu", "marido,", "ele", "é", "médico")),
            Sentence("Ми не брати, ми друзі (чоловіки)", listOf("Nós", "não", "somos", "irmãos,", "somos", "amigos")),

            // ЩЕ ESTAR
            Sentence("Я втомлений після роботи (чоловік)", listOf("Eu", "estou", "cansado", "depois", "do", "trabalho")),
            Sentence("Ти хворий? Ти дуже блідий", listOf("Tu", "estás", "doente?", "Estás", "muito", "pálido")),
            Sentence("Кава вже холодна", listOf("O", "café", "já", "está", "frio")),
            Sentence("Сьогодні дуже жарко", listOf("Hoje", "está", "muito", "calor")),
            Sentence("Двері відчинені", listOf("A", "porta", "está", "aberta")),
            Sentence("Магазин зачинений у неділю", listOf("A", "loja", "está", "fechada", "ao", "domingo")),
            Sentence("Ми зараз у відпустці в Алгарве", listOf("Nós", "estamos", "de", "férias", "no", "Algarve")),
            Sentence("Вона щаслива, бо має нову роботу", listOf("Ela", "está", "feliz", "porque", "tem", "um", "trabalho", "novo")),
            Sentence("Діти в школі до п'ятої", listOf("As", "crianças", "estão", "na", "escola", "até", "às", "cinco")),
            Sentence("Ви готові? Ми вже йдемо (множина)", listOf("Vocês", "estão", "prontos?", "Já", "vamos")),
            Sentence("Мій телефон розрядився", listOf("O", "meu", "telemóvel", "está", "sem", "bateria")),
            Sentence("Я не в Лісабоні, я в Порту", listOf("Eu", "não", "estou", "em", "Lisboa,", "estou", "no", "Porto")),
            Sentence("Як твоя мама? Їй уже краще?", listOf("Como", "está", "a", "tua", "mãe?", "Já", "está", "melhor?")),

            // ЩЕ TER
            Sentence("Я маю двох братів і одну сестру", listOf("Eu", "tenho", "dois", "irmãos", "e", "uma", "irmã")),
            Sentence("Ти маєш дітей чи онуків?", listOf("Tu", "tens", "filhos", "ou", "netos?")),
            Sentence("Він має нову роботу в банку", listOf("Ele", "tem", "um", "trabalho", "novo", "no", "banco")),
            Sentence("Ми маємо квартиру біля метро", listOf("Nós", "temos", "um", "apartamento", "perto", "do", "metro")),
            Sentence("Ви вже маєте податковий номер? (ввічливо)", listOf("Você", "já", "tem", "número", "de", "contribuinte?")),
            Sentence("Моїй мамі шістдесят років", listOf("A", "minha", "mãe", "tem", "sessenta", "anos")),
            Sentence("Скільки років твоєму синові?", listOf("Quantos", "anos", "tem", "o", "teu", "filho?")),
            Sentence("Я голодний, а ти?", listOf("Eu", "tenho", "fome,", "e", "tu?")),
            Sentence("Діти хочуть пити", listOf("As", "crianças", "têm", "sede")),
            Sentence("Мені холодно, де мій светр?", listOf("Tenho", "frio,", "onde", "está", "a", "minha", "camisola?")),
            Sentence("Ми не маємо машини в Португалії", listOf("Nós", "não", "temos", "carro", "em", "Portugal")),
            Sentence("Вона боїться собак", listOf("Ela", "tem", "medo", "de", "cães")),
            Sentence("Ти маєш рацію, це дуже дорого", listOf("Tu", "tens", "razão,", "isso", "é", "muito", "caro")),

            // ЩЕ VER
            Sentence("Я бачу море з вікна спальні", listOf("Eu", "vejo", "o", "mar", "da", "janela", "do", "quarto")),
            Sentence("Ти бачиш автобус? Він уже їде", listOf("Tu", "vês", "o", "autocarro?", "Já", "vem", "aí")),
            Sentence("Він погано бачить уночі", listOf("Ele", "vê", "mal", "à", "noite")),
            Sentence("Ми бачимо друзів щосуботи", listOf("Nós", "vemos", "os", "amigos", "todos", "os", "sábados")),
            Sentence("Ви бачите той човен? (множина)", listOf("Vocês", "veem", "aquele", "barco?")),
            Sentence("Вони дивляться футбол у кафе (чоловіки)", listOf("Eles", "veem", "o", "futebol", "no", "café")),
            Sentence("Я не бачу свого телефона", listOf("Eu", "não", "vejo", "o", "meu", "telemóvel")),
            Sentence("Що ви бачите на картині? (множина)", listOf("O", "que", "vocês", "veem", "no", "quadro?")),
            Sentence("Ти бачиш мене щодня в офісі", listOf("Tu", "vês-me", "todos", "os", "dias", "no", "escritório")),
            Sentence("Ми бачимо тебе, ти біля дверей", listOf("Nós", "vemos-te,", "estás", "perto", "da", "porta")),
            Sentence("Вона бачить нас з балкона", listOf("Ela", "vê-nos", "da", "varanda")),
            Sentence("Ви бачите ціну на етикетці? (ввічливо)", listOf("Você", "vê", "o", "preço", "na", "etiqueta?"))
        )
    }
}

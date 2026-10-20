package ruslan.simakov.pt4ua.data.lessons

import ruslan.simakov.pt4ua.data.RuleTable
import ruslan.simakov.pt4ua.data.Sentence

// Займенники: хто? кого? кому? з ким? чий?
object Lesson10 {

    val rules = listOf(
        RuleTable(
            "Хто? Кого? Кому? З ким?",
            listOf(
                listOf("Хто?", "Кого?", "Кому?", "З ким / для кого?"),
                listOf("eu", "me", "me", "comigo, para mim"),
                listOf("tu", "te", "te", "contigo, para ti"),
                listOf("você", "o / a", "lhe", "consigo, com você"),
                listOf("ele", "o", "lhe", "com ele"),
                listOf("ela", "a", "lhe", "com ela"),
                listOf("nós", "nos", "nos", "connosco"),
                listOf("vocês", "vos", "vos", "convosco"),
                listOf("eles", "os", "lhes", "com eles"),
                listOf("elas", "as", "lhes", "com elas")
            ),
            note = "Ствердження – займенник після дієслова через дефіс: vejo-te, conheço-o. " +
                "Після não, já, nunca і питальних слів – перед дієсловом: não te vejo, quem te disse?"
        ),
        RuleTable(
            "Чий?",
            listOf(
                listOf("Чий?", "чол. рід", "жін. рід"),
                listOf("мій", "o meu", "a minha"),
                listOf("твій", "o teu", "a tua"),
                listOf("Ваш (ввічливо)", "o seu", "a sua"),
                listOf("наш", "o nosso", "a nossa"),
                listOf("ваш (множина)", "o vosso", "a vossa")
            ),
            note = "Його, її, їхній – після іменника: o carro dele, a casa dela, os filhos deles."
        )
    )

    fun getSentences(): List<Sentence> {
        return listOf(
            // КОГО? – me, te, o, a, nos, vos, os, as
            Sentence("Я бачу тебе щоранку на зупинці", listOf("Eu", "vejo-te", "todas", "as", "manhãs", "na", "paragem")),
            Sentence("Ти добре мене чуєш по телефону?", listOf("Tu", "ouves-me", "bem", "ao", "telefone?")),
            Sentence("Я не розумію тебе, коли ти говориш швидко", listOf("Eu", "não", "te", "percebo", "quando", "falas", "depressa")),
            Sentence("Я знаю його вже десять років", listOf("Eu", "conheço-o", "há", "dez", "anos")),
            Sentence("Ми її не знаємо, вона тут нова", listOf("Nós", "não", "a", "conhecemos,", "ela", "é", "nova", "aqui")),
            Sentence("Учитель запросив нас на обід", listOf("O", "professor", "convidou-nos", "para", "almoçar")),
            Sentence("Хто вас чекає біля входу? (множина)", listOf("Quem", "vos", "espera", "à", "entrada?")),
            Sentence("Де квитки? Я їх не бачу", listOf("Onde", "estão", "os", "bilhetes?", "Eu", "não", "os", "vejo")),
            Sentence("Вона любить його понад усе", listOf("Ela", "ama-o", "acima", "de", "tudo")),
            Sentence("Я зустріла її вчора в магазині", listOf("Eu", "encontrei-a", "ontem", "na", "loja")),
            Sentence("Подруги приїхали? Ти зустрів їх на вокзалі?", listOf("As", "amigas", "chegaram?", "Tu", "encontraste-as", "na", "estação?")),
            Sentence("Я подзвоню тобі ввечері", listOf("Eu", "vou", "ligar-te", "à", "noite")),

            // КОМУ? – me, te, lhe, nos, vos, lhes
            Sentence("Я даю тобі мій номер телефону", listOf("Eu", "dou-te", "o", "meu", "número", "de", "telefone")),
            Sentence("Ми пишемо йому щотижня", listOf("Nós", "escrevemos-lhe", "todas", "as", "semanas")),
            Sentence("Вона не відповіла мені на повідомлення", listOf("Ela", "não", "me", "respondeu", "à", "mensagem")),
            Sentence("Офіціант приніс нам меню", listOf("O", "empregado", "trouxe-nos", "o", "menu")),
            Sentence("Ви можете сказати мені, котра година? (ввічливо)", listOf("Você", "pode", "dizer-me", "que", "horas", "são?")),
            Sentence("Я показав їм місто в суботу", listOf("Eu", "mostrei-lhes", "a", "cidade", "no", "sábado")),
            Sentence("Що ти подаруєш їй на день народження?", listOf("O", "que", "lhe", "vais", "oferecer", "no", "aniversário?")),
            Sentence("Батьки не дають йому грошей", listOf("Os", "pais", "não", "lhe", "dão", "dinheiro")),

            // ЧИЙ? – meu, teu, seu, nosso, vosso, dele, dela
            Sentence("Це мій брат, а це моя сестра", listOf("Este", "é", "o", "meu", "irmão", "e", "esta", "é", "a", "minha", "irmã")),
            Sentence("Де твої ключі?", listOf("Onde", "estão", "as", "tuas", "chaves?")),
            Sentence("Їхній будинок дуже великий", listOf("A", "casa", "deles", "é", "muito", "grande")),
            Sentence("Її чоловік працює в банку", listOf("O", "marido", "dela", "trabalha", "num", "banco")),
            Sentence("Наш учитель з Порту", listOf("O", "nosso", "professor", "é", "do", "Porto")),
            Sentence("Ваша квартира близько від метро? (множина)", listOf("O", "vosso", "apartamento", "fica", "perto", "do", "metro?")),
            Sentence("Ваше замовлення готове (ввічливо)", listOf("O", "seu", "pedido", "está", "pronto")),
            Sentence("Його діти вчаться в нашій школі", listOf("Os", "filhos", "dele", "estudam", "na", "nossa", "escola")),

            // З КИМ? ДЛЯ КОГО? – comigo, contigo, para mim, para ti...
            Sentence("Ти підеш зі мною до лікаря?", listOf("Tu", "vais", "comigo", "ao", "médico?")),
            Sentence("Я не можу жити без тебе", listOf("Eu", "não", "posso", "viver", "sem", "ti")),
            Sentence("Цей подарунок для тебе", listOf("Este", "presente", "é", "para", "ti")),
            Sentence("Ми говорили про неї вчора ввечері", listOf("Nós", "falamos", "dela", "ontem", "à", "noite")),
            Sentence("Вони живуть поруч із нами (чоловіки)", listOf("Eles", "moram", "perto", "de", "nós")),
            Sentence("Можна мені піти з вами в кіно? (множина)", listOf("Posso", "ir", "convosco", "ao", "cinema?")),
            Sentence("Я думаю про тебе весь час", listOf("Eu", "penso", "em", "ti", "o", "tempo", "todo")),
            Sentence("Для мене це дуже важливо", listOf("Para", "mim", "isso", "é", "muito", "importante")),

            // ЗАЙМЕННИКИ В БАЗОВІЙ СХЕМІ
            Sentence("Ти бачив мене вчора в парку?", listOf("Tu", "viste-me", "ontem", "no", "parque?")),
            Sentence("Я не бачив його цілий тиждень", listOf("Eu", "não", "o", "vi", "a", "semana", "toda")),
            Sentence("Ми провідаємо вас наступного місяця (множина)", listOf("Nós", "vamos", "visitar-vos", "no", "próximo", "mês")),
            Sentence("Я ніколи тебе не забуду", listOf("Eu", "nunca", "te", "esquecerei")),
            Sentence("Вона не скаже тобі правди", listOf("Ela", "não", "te", "dirá", "a", "verdade")),
            Sentence("Хто тобі це сказав?", listOf("Quem", "te", "disse", "isso?")),
            Sentence("Чому ти мені не подзвонив?", listOf("Porque", "não", "me", "ligaste?")),
            Sentence("Ви допоможете нам з перекладом? (ввічливо)", listOf("Você", "vai", "ajudar-nos", "com", "a", "tradução?")),
            Sentence("Я вже все йому розповів", listOf("Eu", "já", "lhe", "contei", "tudo")),

            // ЩЕ КОГО?
            Sentence("Я кохаю тебе більше за все", listOf("Eu", "amo-te", "mais", "do", "que", "tudo")),
            Sentence("Ти мене знаєш? Я твій новий сусід", listOf("Tu", "conheces-me?", "Sou", "o", "teu", "novo", "vizinho")),
            Sentence("Я чекаю тебе біля школи", listOf("Eu", "espero-te", "à", "porta", "da", "escola")),
            Sentence("Мама кличе вас вечеряти (множина)", listOf("A", "mãe", "chama-vos", "para", "jantar")),
            Sentence("Ми запрошуємо тебе на день народження", listOf("Nós", "convidamos-te", "para", "o", "aniversário")),
            Sentence("Я не знаю його особисто", listOf("Eu", "não", "o", "conheço", "pessoalmente")),
            Sentence("Діти її обожнюють, вона дуже добра", listOf("As", "crianças", "adoram-na,", "ela", "é", "muito", "querida")),
            Sentence("Я купив хліб і з'їв його", listOf("Eu", "comprei", "o", "pão", "e", "comi-o")),
            Sentence("Де мої окуляри? Ти їх бачила?", listOf("Onde", "estão", "os", "meus", "óculos?", "Tu", "viste-os?")),
            Sentence("Вони вітають нас щоранку (чоловіки)", listOf("Eles", "cumprimentam-nos", "todas", "as", "manhãs")),
            Sentence("Ніхто нас не бачив у парку", listOf("Ninguém", "nos", "viu", "no", "parque")),
            Sentence("Я відвезу тебе додому", listOf("Eu", "levo-te", "a", "casa")),

            // ЩЕ КОМУ?
            Sentence("Я пишу тобі з Лісабона", listOf("Eu", "escrevo-te", "de", "Lisboa")),
            Sentence("Можеш позичити мені ручку?", listOf("Podes", "emprestar-me", "uma", "caneta?")),
            Sentence("Він приносить їй квіти щоп'ятниці", listOf("Ele", "traz-lhe", "flores", "todas", "as", "sextas-feiras")),
            Sentence("Скажи йому, що я запізнюся", listOf("Diz-lhe", "que", "vou", "chegar", "atrasado")),
            Sentence("Офіціант дав нам рахунок", listOf("O", "empregado", "deu-nos", "a", "conta")),
            Sentence("Учителька пояснює їм граматику", listOf("A", "professora", "explica-lhes", "a", "gramática")),
            Sentence("Що тобі подарували на Різдво?", listOf("O", "que", "te", "deram", "no", "Natal?")),
            Sentence("Я не скажу тобі секрету", listOf("Eu", "não", "te", "digo", "o", "segredo")),
            Sentence("Покажіть мені, будь ласка, де вихід (ввічливо)", listOf("Mostre-me,", "por", "favor,", "onde", "é", "a", "saída")),
            Sentence("Хто вам допомагає з дітьми? (множина)", listOf("Quem", "vos", "ajuda", "com", "as", "crianças?")),
            Sentence("Я передзвоню Вам завтра вранці (ввічливо)", listOf("Eu", "ligo-lhe", "amanhã", "de", "manhã")),
            Sentence("Він ніколи не каже мені правди", listOf("Ele", "nunca", "me", "diz", "a", "verdade")),

            // ЩЕ ЧИЙ?
            Sentence("Це твоя куртка чи моя?", listOf("Este", "casaco", "é", "teu", "ou", "meu?")),
            Sentence("Мої батьки живуть в Україні", listOf("Os", "meus", "pais", "vivem", "na", "Ucrânia")),
            Sentence("Наша квартира на другому поверсі", listOf("O", "nosso", "apartamento", "é", "no", "primeiro", "andar")),
            Sentence("Твої діти дуже виховані", listOf("Os", "teus", "filhos", "são", "muito", "educados")),
            Sentence("Де ваша машина? (множина)", listOf("Onde", "está", "o", "vosso", "carro?")),
            Sentence("Її сестра живе в Порту", listOf("A", "irmã", "dela", "mora", "no", "Porto")),
            Sentence("Їхній син вчиться в університеті", listOf("O", "filho", "deles", "estuda", "na", "universidade")),
            Sentence("Його телефон не працює", listOf("O", "telemóvel", "dele", "não", "funciona")),
            Sentence("Це Ваш паспорт? (ввічливо)", listOf("Este", "é", "o", "seu", "passaporte?")),
            Sentence("Моя робота дуже цікава", listOf("O", "meu", "trabalho", "é", "muito", "interessante")),
            Sentence("Наші друзі приїжджають у суботу", listOf("Os", "nossos", "amigos", "chegam", "no", "sábado")),
            Sentence("Ця сумка не моя, а її", listOf("Esta", "mala", "não", "é", "minha,", "é", "dela")),

            // ЩЕ З КИМ? ДЛЯ КОГО?
            Sentence("Хочеш піти зі мною в кіно?", listOf("Queres", "ir", "comigo", "ao", "cinema?")),
            Sentence("Я поговорю з тобою пізніше", listOf("Eu", "falo", "contigo", "mais", "tarde")),
            Sentence("Вона живе з нами вже рік", listOf("Ela", "mora", "connosco", "há", "um", "ano")),
            Sentence("Цей лист для Вас (ввічливо)", listOf("Esta", "carta", "é", "para", "si")),
            Sentence("Ми думаємо про вас (множина)", listOf("Nós", "pensamos", "em", "vocês")),
            Sentence("Я купив квіти для неї", listOf("Eu", "comprei", "flores", "para", "ela")),
            Sentence("Без тебе тут сумно", listOf("Sem", "ti", "isto", "é", "triste")),
            Sentence("Він працює з ними десять років", listOf("Ele", "trabalha", "com", "eles", "há", "dez", "anos")),
            Sentence("Можна з Вами поговорити хвилинку? (ввічливо)", listOf("Posso", "falar", "consigo", "um", "minuto?")),

            // ЩЕ ЗАЙМЕННИКИ В БАЗОВІЙ СХЕМІ
            Sentence("Я бачу тебе, а ти бачиш мене", listOf("Eu", "vejo-te", "e", "tu", "vês-me")),
            Sentence("Учора я бачив тебе в метро", listOf("Ontem", "eu", "vi-te", "no", "metro")),
            Sentence("Завтра я тобі допоможу", listOf("Amanhã", "eu", "vou", "ajudar-te")),
            Sentence("Ти мені не віриш?", listOf("Tu", "não", "acreditas", "em", "mim?")),
            Sentence("Я ніколи тобі не брешу", listOf("Eu", "nunca", "te", "minto")),
            Sentence("Вони не бачили нас учора (чоловіки)", listOf("Eles", "não", "nos", "viram", "ontem")),
            Sentence("Ти подзвониш мені завтра?", listOf("Tu", "vais", "ligar-me", "amanhã?")),
            Sentence("Ми вже її запросили", listOf("Nós", "já", "a", "convidamos")),
            Sentence("Хто вас запросив на вечірку? (множина)", listOf("Quem", "vos", "convidou", "para", "a", "festa?")),
            Sentence("Я не дам тобі мою машину", listOf("Eu", "não", "te", "dou", "o", "meu", "carro"))
        )
    }
}

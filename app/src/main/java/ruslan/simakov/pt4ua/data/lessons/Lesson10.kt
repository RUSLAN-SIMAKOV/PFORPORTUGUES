package ruslan.simakov.pt4ua.data.lessons

import ruslan.simakov.pt4ua.data.RuleTable
import ruslan.simakov.pt4ua.data.Sentence

// Займенники за Петровим: хто? кого? кому? з ким? чий?
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
            Sentence("Я вже все йому розповів", listOf("Eu", "já", "lhe", "contei", "tudo"))
        )
    }
}

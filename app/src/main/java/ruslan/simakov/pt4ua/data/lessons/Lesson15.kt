package ruslan.simakov.pt4ua.data.lessons

import ruslan.simakov.pt4ua.data.RuleTable
import ruslan.simakov.pt4ua.data.Sentence

// Наказовий спосіб (fala! fale! não fales!) і теперішній конжунтив (espero que fales)
object Lesson15 {

    val rules = listOf(
        RuleTable(
            "Наказовий спосіб",
            listOf(
                listOf("", "-AR (falar)", "-ER (comer)", "-IR (abrir)"),
                listOf("tu", "fala!", "come!", "abre!"),
                listOf("você", "fale!", "coma!", "abra!"),
                listOf("vocês", "falem!", "comam!", "abram!"),
                listOf("não + tu", "não fales!", "não comas!", "não abras!")
            ),
            note = "Для você, vocês і заперечення беремо форму eu і міняємо голосну: " +
                "falo → fale, como → coma, faço → faça, digo → diga, venho → venha."
        ),
        RuleTable(
            "Неправильні",
            listOf(
                listOf("", "tu", "você", "não + tu"),
                listOf("fazer", "faz!", "faça!", "não faças!"),
                listOf("dizer", "diz!", "diga!", "não digas!"),
                listOf("vir", "vem!", "venha!", "não venhas!"),
                listOf("ir", "vai!", "vá!", "não vás!"),
                listOf("pôr", "põe!", "ponha!", "não ponhas!"),
                listOf("ter", "tem!", "tenha!", "não tenhas!"),
                listOf("ser", "sê!", "seja!", "não sejas!")
            ),
            note = "Займенник: Diz-me! Ajuda-me! Diga-me! Але: Não me digas!"
        ),
        RuleTable(
            "Конжунтив: espero que…, quero que…",
            listOf(
                listOf("", "falar", "comer", "ter"),
                listOf("eu", "fale", "coma", "tenha"),
                listOf("tu", "fales", "comas", "tenhas"),
                listOf("você, ele, ela", "fale", "coma", "tenha"),
                listOf("nós", "falemos", "comamos", "tenhamos"),
                listOf("vocês, eles, elas", "falem", "comam", "tenham")
            ),
            note = "Після espero que, quero que, é preciso que, é importante que, para que, talvez. " +
                "Неправильні: ser – seja, estar – esteja, ir – vá, saber – saiba, dar – dê."
        )
    )

    fun getSentences(): List<Sentence> {
        return listOf(
            // НАКАЗОВИЙ СПОСІБ – tu
            Sentence("Говори повільніше, будь ласка", listOf("Fala", "mais", "devagar,", "por", "favor")),
            Sentence("Відчини вікно, тут жарко", listOf("Abre", "a", "janela,", "está", "calor")),
            Sentence("Їж суп, поки гарячий", listOf("Come", "a", "sopa", "enquanto", "está", "quente")),
            Sentence("Скажи мені правду, будь ласка", listOf("Diz-me", "a", "verdade,", "por", "favor")),
            Sentence("Іди сюди, я хочу тобі щось показати", listOf("Vem", "cá,", "quero", "mostrar-te", "uma", "coisa")),
            Sentence("Зроби домашнє завдання до вечері", listOf("Faz", "os", "trabalhos", "de", "casa", "antes", "do", "jantar")),
            Sentence("Поклади ключі на стіл", listOf("Põe", "as", "chaves", "em", "cima", "da", "mesa")),
            Sentence("Допоможи мені з валізою", listOf("Ajuda-me", "com", "a", "mala")),
            Sentence("Подзвони мамі сьогодні ввечері", listOf("Liga", "à", "mãe", "hoje", "à", "noite")),

            // НАКАЗОВИЙ СПОСІБ – você (ввічливо)
            Sentence("Заходьте й сідайте, будь ласка (ввічливо)", listOf("Entre", "e", "sente-se,", "por", "favor")),
            Sentence("Зачекайте хвилинку, будь ласка (ввічливо)", listOf("Espere", "um", "momento,", "por", "favor")),
            Sentence("Скажіть, будь ласка, де вокзал? (ввічливо)", listOf("Diga-me,", "por", "favor,", "onde", "fica", "a", "estação?")),
            Sentence("Заповніть цю форму і підпишіть тут (ввічливо)", listOf("Preencha", "este", "formulário", "e", "assine", "aqui")),
            Sentence("Поверніть праворуч на другому світлофорі (ввічливо)", listOf("Vire", "à", "direita", "no", "segundo", "semáforo")),
            Sentence("Покажіть мені паспорт, будь ласка (ввічливо)", listOf("Mostre-me", "o", "passaporte,", "por", "favor")),
            Sentence("Приходьте завтра о десятій ранку (ввічливо)", listOf("Venha", "amanhã", "às", "dez", "da", "manhã")),
            Sentence("Говоріть голосніше, будь ласка (ввічливо)", listOf("Fale", "mais", "alto,", "por", "favor")),
            Sentence("Будьте обережні на дорозі (ввічливо)", listOf("Tenha", "cuidado", "na", "estrada")),

            // НАКАЗОВИЙ СПОСІБ – vocês
            Sentence("Діти, мийте руки перед їжею", listOf("Meninos,", "lavem", "as", "mãos", "antes", "de", "comer")),
            Sentence("Заходьте, будь ласка, двері відчинені (множина)", listOf("Entrem,", "por", "favor,", "a", "porta", "está", "aberta")),
            Sentence("Слухайте уважно, це важливо (множина)", listOf("Ouçam", "com", "atenção,", "isto", "é", "importante")),
            Sentence("Відкрийте книжки на сторінці десять (множина)", listOf("Abram", "os", "livros", "na", "página", "dez")),
            Sentence("Приходьте до нас у суботу (множина)", listOf("Venham", "a", "nossa", "casa", "no", "sábado")),
            Sentence("Зробіть фото біля моря (множина)", listOf("Tirem", "uma", "fotografia", "junto", "ao", "mar")),

            // ЗАБОРОНА – não + конжунтив
            Sentence("Не хвилюйся, усе добре", listOf("Não", "te", "preocupes,", "está", "tudo", "bem")),
            Sentence("Не їж так швидко", listOf("Não", "comas", "tão", "depressa")),
            Sentence("Не говори так голосно, дитина спить", listOf("Não", "fales", "tão", "alto,", "o", "bebé", "está", "a", "dormir")),
            Sentence("Не забудь ключі", listOf("Não", "te", "esqueças", "das", "chaves")),
            Sentence("Не кажи нікому", listOf("Não", "digas", "a", "ninguém")),
            Sentence("Не відчиняй двері незнайомцям", listOf("Não", "abras", "a", "porta", "a", "desconhecidos")),
            Sentence("Не паліть тут, будь ласка (ввічливо)", listOf("Não", "fume", "aqui,", "por", "favor")),
            Sentence("Не чекайте мене на вечерю (множина)", listOf("Não", "esperem", "por", "mim", "para", "jantar")),
            Sentence("Не роби цього, це небезпечно", listOf("Não", "faças", "isso,", "é", "perigoso")),

            // КОНЖУНТИВ – espero que, quero que, é preciso que, talvez
            Sentence("Сподіваюся, що тобі скоро покращає", listOf("Espero", "que", "melhores", "depressa")),
            Sentence("Сподіваюся, у вас буде гарна відпустка (множина)", listOf("Espero", "que", "tenham", "umas", "boas", "férias")),
            Sentence("Я хочу, щоб ти прийшов на мій день народження", listOf("Quero", "que", "venhas", "ao", "meu", "aniversário")),
            Sentence("Мама хоче, щоб ми їли більше фруктів", listOf("A", "mãe", "quer", "que", "nós", "comamos", "mais", "fruta")),
            Sentence("Треба, щоб ти підписав цей документ", listOf("É", "preciso", "que", "assines", "este", "documento")),
            Sentence("Важливо, щоб діти спали вісім годин", listOf("É", "importante", "que", "as", "crianças", "durmam", "oito", "horas")),
            Sentence("Можливо, завтра в Лісабоні піде дощ", listOf("Talvez", "chova", "amanhã", "em", "Lisboa")),
            Sentence("Можливо, він не знає адреси", listOf("Talvez", "ele", "não", "saiba", "a", "morada")),
            Sentence("Я не думаю, що це правда", listOf("Não", "acho", "que", "seja", "verdade")),
            Sentence("Говори повільно, щоб я тебе зрозумів", listOf("Fala", "devagar", "para", "que", "eu", "te", "perceba")),
            Sentence("Учитель хоче, щоб ми писали щодня", listOf("O", "professor", "quer", "que", "escrevamos", "todos", "os", "dias")),
            Sentence("Сподіваюся, що все буде добре", listOf("Espero", "que", "corra", "tudo", "bem")),

            // ЩЕ НАКАЗОВИЙ – tu
            Sentence("Відпочинь трохи, ти втомився", listOf("Descansa", "um", "pouco,", "estás", "cansado")),
            Sentence("Зачини двері, будь ласка", listOf("Fecha", "a", "porta,", "por", "favor")),
            Sentence("Купи хліба дорогою додому", listOf("Compra", "pão", "no", "caminho", "para", "casa")),
            Sentence("Подивися, яке гарне небо!", listOf("Olha", "que", "céu", "tão", "bonito!")),
            Sentence("Слухай мене уважно, це важливо", listOf("Ouve-me", "com", "atenção,", "é", "importante")),
            Sentence("Почекай мене тут", listOf("Espera", "por", "mim", "aqui")),
            Sentence("Візьми парасольку, йде дощ", listOf("Leva", "o", "guarda-chuva,", "está", "a", "chover")),
            Sentence("Напиши мені, коли приїдеш", listOf("Manda-me", "uma", "mensagem", "quando", "chegares")),
            Sentence("Будь обережний на дорозі", listOf("Tem", "cuidado", "na", "estrada")),
            Sentence("Іди спати, вже пізно", listOf("Vai", "dormir,", "já", "é", "tarde")),

            // ЩЕ НАКАЗОВИЙ – você (ввічливо)
            Sentence("Наберіть номер ще раз (ввічливо)", listOf("Marque", "o", "número", "outra", "vez")),
            Sentence("Проходьте, будь ласка, лікар Вас чекає (ввічливо)", listOf("Entre,", "por", "favor,", "o", "médico", "está", "à", "sua", "espera")),
            Sentence("Підпишіть тут і тут (ввічливо)", listOf("Assine", "aqui", "e", "aqui")),
            Sentence("Візьміть талончик і зачекайте (ввічливо)", listOf("Tire", "uma", "senha", "e", "aguarde")),
            Sentence("Поверніть ліворуч після банку (ввічливо)", listOf("Vire", "à", "esquerda", "depois", "do", "banco")),
            Sentence("Покладіть сумку сюди, будь ласка (ввічливо)", listOf("Ponha", "a", "mala", "aqui,", "por", "favor")),
            Sentence("Скажіть, будь ласка, скільки це коштує (ввічливо)", listOf("Diga-me,", "por", "favor,", "quanto", "custa", "isto")),
            Sentence("Приймайте ліки після їжі (ввічливо)", listOf("Tome", "o", "medicamento", "depois", "das", "refeições")),
            Sentence("Принесіть рахунок, будь ласка (ввічливо)", listOf("Traga", "a", "conta,", "por", "favor")),
            Sentence("Будьте ласкаві, говоріть повільніше (ввічливо)", listOf("Faça", "o", "favor", "de", "falar", "mais", "devagar")),

            // ЩЕ НАКАЗОВИЙ – vocês
            Sentence("Діти, сідайте за стіл", listOf("Meninos,", "sentem-se", "à", "mesa")),
            Sentence("Напишіть тут свої імена (множина)", listOf("Escrevam", "os", "vossos", "nomes", "aqui")),
            Sentence("Чекайте мене біля входу (множина)", listOf("Esperem", "por", "mim", "à", "entrada")),
            Sentence("Говоріть тихіше, будь ласка (множина)", listOf("Falem", "mais", "baixo,", "por", "favor")),
            Sentence("Їжте, поки гаряче (множина)", listOf("Comam", "enquanto", "está", "quente")),
            Sentence("Подзвоніть нам, коли приїдете до Лісабона (множина)", listOf("Liguem-nos", "quando", "chegarem", "a", "Lisboa")),
            Sentence("Повторюйте за мною всі разом (множина)", listOf("Repitam", "comigo,", "todos", "juntos")),
            Sentence("Візьміть документи з собою (множина)", listOf("Levem", "os", "documentos", "convosco")),

            // ЩЕ ЗАБОРОНА
            Sentence("Не запізнюйся завтра", listOf("Não", "chegues", "atrasado", "amanhã")),
            Sentence("Не купуй цього, це дорого", listOf("Não", "compres", "isso,", "é", "caro")),
            Sentence("Не дзвони мені після десятої", listOf("Não", "me", "ligues", "depois", "das", "dez")),
            Sentence("Не плач, усе буде добре", listOf("Não", "chores,", "vai", "correr", "tudo", "bem")),
            Sentence("Не йди без мене", listOf("Não", "vás", "sem", "mim")),
            Sentence("Не пий холодної води", listOf("Não", "bebas", "água", "fria")),
            Sentence("Не забудьте паспорт (ввічливо)", listOf("Não", "se", "esqueça", "do", "passaporte")),
            Sentence("Не торкайтеся, будь ласка (множина)", listOf("Não", "toquem,", "por", "favor")),
            Sentence("Не відчиняйте вікон в автобусі (множина)", listOf("Não", "abram", "as", "janelas", "no", "autocarro")),
            Sentence("Не шуми, сусіди сплять", listOf("Não", "faças", "barulho,", "os", "vizinhos", "estão", "a", "dormir")),
            Sentence("Не кажи так, це неправда", listOf("Não", "digas", "isso,", "não", "é", "verdade")),
            Sentence("Не чекай мене, я працюю допізна", listOf("Não", "esperes", "por", "mim,", "trabalho", "até", "tarde")),

            // ЩЕ КОНЖУНТИВ
            Sentence("Сподіваюся, тобі сподобається подарунок", listOf("Espero", "que", "gostes", "do", "presente")),
            Sentence("Я хочу, щоб ви були щасливі (множина)", listOf("Quero", "que", "vocês", "sejam", "felizes")),
            Sentence("Треба, щоб ти прийшов о дев'ятій", listOf("É", "preciso", "que", "venhas", "às", "nove")),
            Sentence("Мама хоче, щоб я вивчав медицину", listOf("A", "mãe", "quer", "que", "eu", "estude", "medicina")),
            Sentence("Можливо, я поїду в Україну влітку", listOf("Talvez", "eu", "vá", "à", "Ucrânia", "no", "verão")),
            Sentence("Можливо, вони вже знають (чоловіки)", listOf("Talvez", "eles", "já", "saibam")),
            Sentence("Важливо, щоб ти пив багато води", listOf("É", "importante", "que", "bebas", "muita", "água")),
            Sentence("Я сумніваюся, що він прийде", listOf("Duvido", "que", "ele", "venha")),
            Sentence("Сподіваюся, що завтра буде сонце", listOf("Espero", "que", "amanhã", "esteja", "sol")),
            Sentence("Учитель хоче, щоб ми говорили тільки португальською", listOf("O", "professor", "quer", "que", "falemos", "só", "português")),
            Sentence("Мені шкода, що ти хворієш", listOf("Tenho", "pena", "que", "estejas", "doente")),
            Sentence("Пиши повільніше, щоб я міг прочитати", listOf("Escreve", "mais", "devagar", "para", "que", "eu", "consiga", "ler")),
            Sentence("Я радий, що ви тут (множина)", listOf("Fico", "contente", "que", "vocês", "estejam", "aqui")),
            Sentence("Можливо, у неї немає часу", listOf("Talvez", "ela", "não", "tenha", "tempo")),
            Sentence("Я хочу, щоб ти мені подзвонив", listOf("Quero", "que", "me", "ligues"))
        )
    }
}

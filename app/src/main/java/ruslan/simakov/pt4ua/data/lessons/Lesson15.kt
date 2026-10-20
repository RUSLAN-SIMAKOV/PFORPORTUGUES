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
            Sentence("Сподіваюся, що все буде добре", listOf("Espero", "que", "corra", "tudo", "bem"))
        )
    }
}

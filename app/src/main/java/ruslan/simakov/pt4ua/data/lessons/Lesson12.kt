package ruslan.simakov.pt4ua.data.lessons

import ruslan.simakov.pt4ua.data.RuleTable
import ruslan.simakov.pt4ua.data.Sentence

// Числа, час і дати
object Lesson12 {

    val rules = listOf(
        RuleTable(
            "Числа",
            listOf(
                listOf("", "1–9", "11–19", "× 10"),
                listOf("1", "um / uma", "onze", "dez"),
                listOf("2", "dois / duas", "doze", "vinte"),
                listOf("3", "três", "treze", "trinta"),
                listOf("4", "quatro", "catorze", "quarenta"),
                listOf("5", "cinco", "quinze", "cinquenta"),
                listOf("6", "seis", "dezasseis", "sessenta"),
                listOf("7", "sete", "dezassete", "setenta"),
                listOf("8", "oito", "dezoito", "oitenta"),
                listOf("9", "nove", "dezanove", "noventa")
            ),
            note = "21 = vinte e um, 45 = quarenta e cinco, 100 = cem, 101 = cento e um, " +
                "200 = duzentos, 1000 = mil, 2024 = dois mil e vinte e quatro."
        ),
        RuleTable(
            "Котра година?",
            listOf(
                listOf("Українською", "Português"),
                listOf("Котра година?", "Que horas são?"),
                listOf("1:00", "É uma hora"),
                listOf("3:00", "São três horas"),
                listOf("4:15", "São quatro e um quarto"),
                listOf("5:30", "São cinco e meia"),
                listOf("7:45", "São oito menos um quarto"),
                listOf("12:00 / 0:00", "É meio-dia / É meia-noite"),
                listOf("о 9:00", "às nove")
            ),
            note = "Ранку – da manhã, дня – da tarde, вечора – da noite."
        ),
        RuleTable(
            "Дні тижня",
            listOf(
                listOf("Українською", "Português"),
                listOf("понеділок", "segunda-feira"),
                listOf("вівторок", "terça-feira"),
                listOf("середа", "quarta-feira"),
                listOf("четвер", "quinta-feira"),
                listOf("п'ятниця", "sexta-feira"),
                listOf("субота", "sábado"),
                listOf("неділя", "domingo")
            ),
            note = "Місяці: janeiro, fevereiro, março, abril, maio, junho, julho, agosto, setembro, " +
                "outubro, novembro, dezembro. Дата: no dia cinco de maio."
        )
    )

    fun getSentences(): List<Sentence> {
        return listOf(
            // ЧИСЛА, ЦІНИ, ВІК
            Sentence("Скільки коштує кава? Один євро", listOf("Quanto", "custa", "o", "café?", "Um", "euro")),
            Sentence("Квиток коштує три євро п'ятдесят", listOf("O", "bilhete", "custa", "três", "euros", "e", "cinquenta")),
            Sentence("Мені тридцять два роки", listOf("Eu", "tenho", "trinta", "e", "dois", "anos")),
            Sentence("Моїй доньці дев'ятнадцять років", listOf("A", "minha", "filha", "tem", "dezanove", "anos")),
            Sentence("Мій номер починається на дев'ятсот дванадцять", listOf("O", "meu", "número", "começa", "por", "novecentos", "e", "doze")),
            Sentence("У нашому класі шістнадцять учнів", listOf("Na", "nossa", "turma", "há", "dezasseis", "alunos")),
            Sentence("Я живу на четвертому поверсі", listOf("Eu", "moro", "no", "quarto", "andar")),
            Sentence("У мене двоє дітей: хлопчик і дівчинка", listOf("Eu", "tenho", "dois", "filhos:", "um", "rapaz", "e", "uma", "rapariga")),
            Sentence("Дві кави й одну воду, будь ласка", listOf("Dois", "cafés", "e", "uma", "água,", "por", "favor")),
            Sentence("Цей будинок коштує двісті тисяч євро", listOf("Esta", "casa", "custa", "duzentos", "mil", "euros")),
            Sentence("Сто грамів сиру, будь ласка", listOf("Cem", "gramas", "de", "queijo,", "por", "favor")),
            Sentence("Автобус номер двадцять сім їде до центру", listOf("O", "autocarro", "vinte", "e", "sete", "vai", "para", "o", "centro")),

            // ЧАС
            Sentence("Вибачте, котра година?", listOf("Desculpe,", "que", "horas", "são?")),
            Sentence("Зараз рівно третя година", listOf("Agora", "são", "três", "horas", "em", "ponto")),
            Sentence("Зараз перша година дня", listOf("É", "uma", "hora", "da", "tarde")),
            Sentence("Урок починається о дев'ятій ранку", listOf("A", "aula", "começa", "às", "nove", "da", "manhã")),
            Sentence("Магазин зачиняється о восьмій вечора", listOf("A", "loja", "fecha", "às", "oito", "da", "noite")),
            Sentence("Я встаю о 6:30", listOf("Eu", "levanto-me", "às", "seis", "e", "meia")),
            Sentence("Потяг відправляється о 5:15", listOf("O", "comboio", "parte", "às", "cinco", "e", "um", "quarto")),
            Sentence("Зустрінемося о 7:45", listOf("Encontramo-nos", "às", "oito", "menos", "um", "quarto")),
            Sentence("Ми обідаємо опівдні", listOf("Nós", "almoçamos", "ao", "meio-dia")),
            Sentence("Діти лягають спати о 21:00", listOf("As", "crianças", "deitam-se", "às", "nove", "da", "noite")),
            Sentence("Фільм триває дві години", listOf("O", "filme", "dura", "duas", "horas")),
            Sentence("Я чекаю на тебе вже двадцять хвилин", listOf("Estou", "à", "tua", "espera", "há", "vinte", "minutos")),
            Sentence("Аптека працює з дев'ятої до сьомої", listOf("A", "farmácia", "está", "aberta", "das", "nove", "às", "sete")),
            Sentence("О котрій ти закінчуєш роботу?", listOf("A", "que", "horas", "acabas", "o", "trabalho?")),

            // ДНІ, МІСЯЦІ, ДАТИ
            Sentence("Сьогодні понеділок, а завтра вівторок", listOf("Hoje", "é", "segunda-feira", "e", "amanhã", "é", "terça-feira")),
            Sentence("У середу в мене урок португальської", listOf("Na", "quarta-feira", "eu", "tenho", "aula", "de", "português")),
            Sentence("У четвер ми йдемо в кіно", listOf("Na", "quinta-feira", "nós", "vamos", "ao", "cinema")),
            Sentence("По п'ятницях вона працює вдома", listOf("Às", "sextas-feiras", "ela", "trabalha", "em", "casa")),
            Sentence("У суботу й неділю магазин зачинений", listOf("Ao", "sábado", "e", "ao", "domingo", "a", "loja", "está", "fechada")),
            Sentence("Мій день народження двадцятого березня", listOf("O", "meu", "aniversário", "é", "no", "dia", "vinte", "de", "março")),
            Sentence("Сьогодні п'яте травня", listOf("Hoje", "é", "dia", "cinco", "de", "maio")),
            Sentence("Різдво двадцять п'ятого грудня", listOf("O", "Natal", "é", "no", "dia", "vinte", "e", "cinco", "de", "dezembro")),
            Sentence("Ми приїхали до Португалії у 2022 році", listOf("Nós", "chegamos", "a", "Portugal", "em", "dois", "mil", "e", "vinte", "e", "dois")),
            Sentence("Літні канікули починаються в липні", listOf("As", "férias", "de", "verão", "começam", "em", "julho")),
            Sentence("У січні в Лісабоні холодно й дощить", listOf("Em", "janeiro", "em", "Lisboa", "está", "frio", "e", "chove")),
            Sentence("Наступного тижня в нас іспит", listOf("Na", "próxima", "semana", "nós", "temos", "exame")),
            Sentence("Я народився в 1990 році", listOf("Eu", "nasci", "em", "mil", "novecentos", "e", "noventa")),
            Sentence("Який сьогодні день тижня?", listOf("Que", "dia", "da", "semana", "é", "hoje?")),
            Sentence("Яке сьогодні число?", listOf("Que", "dia", "é", "hoje?")),
            Sentence("Ми бачимося двічі на місяць", listOf("Nós", "vemo-nos", "duas", "vezes", "por", "mês")),
            Sentence("Я працюю п'ять днів на тиждень", listOf("Eu", "trabalho", "cinco", "dias", "por", "semana")),
            Sentence("Два тижні тому я був у Порту", listOf("Há", "duas", "semanas", "eu", "estive", "no", "Porto")),
            Sentence("Через три дні ми їдемо у відпустку", listOf("Daqui", "a", "três", "dias", "nós", "vamos", "de", "férias"))
        )
    }
}

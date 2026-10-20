package ruslan.simakov.pt4ua.data.lessons

import ruslan.simakov.pt4ua.data.RuleTable
import ruslan.simakov.pt4ua.data.Sentence

// Зворотні дієслова (-ся) у базовій схемі Петрова
object Lesson11 {

    val rules = listOf(
        RuleTable(
            "LEVANTAR-SE – вставати",
            listOf(
                listOf("", "Минулий", "Теперішній", "Майбутній"),
                listOf("eu", "levantei-me", "levanto-me", "vou levantar-me"),
                listOf("tu", "levantaste-te", "levantas-te", "vais levantar-te"),
                listOf("você, ele, ela", "levantou-se", "levanta-se", "vai levantar-se"),
                listOf("nós", "levantamo-nos", "levantamo-nos", "vamos levantar-nos"),
                listOf("vocês, eles, elas", "levantaram-se", "levantam-se", "vão levantar-se")
            ),
            note = "Займенники: me, te, se, nos, se. Перед -nos дієслово втрачає -s: levantamos + nos = levantamo-nos."
        ),
        RuleTable(
            "Заперечення та питання",
            listOf(
                listOf("", "Минулий", "Теперішній", "Майбутній"),
                listOf("?", "Levantaste-te?", "Levantas-te?", "Vais levantar-te?"),
                listOf("–", "Não me levantei", "Não me levanto", "Não me vou levantar")
            ),
            note = "Після não, já, ainda não займенник стає перед дієсловом."
        )
    )

    fun getSentences(): List<Sentence> {
        return listOf(
            // LEVANTAR-SE – вставати
            Sentence("Я встаю о сьомій щодня", listOf("Eu", "levanto-me", "às", "sete", "todos", "os", "dias")),
            Sentence("Ти встаєш рано у вихідні?", listOf("Tu", "levantas-te", "cedo", "ao", "fim", "de", "semana?")),
            Sentence("Він не встає до обіду", listOf("Ele", "não", "se", "levanta", "antes", "do", "almoço")),
            Sentence("Сьогодні я встав о шостій", listOf("Hoje", "eu", "levantei-me", "às", "seis")),
            Sentence("Ви вже встали? (множина)", listOf("Vocês", "já", "se", "levantaram?")),
            Sentence("Діти ще не встали", listOf("As", "crianças", "ainda", "não", "se", "levantaram")),
            Sentence("Завтра ми встанемо дуже рано", listOf("Amanhã", "nós", "vamos", "levantar-nos", "muito", "cedo")),
            Sentence("Ти встанеш завтра раніше?", listOf("Tu", "vais", "levantar-te", "mais", "cedo", "amanhã?")),
            Sentence("У неділю я не встану рано", listOf("No", "domingo", "eu", "não", "me", "vou", "levantar", "cedo")),

            // DEITAR-SE – лягати
            Sentence("Вона лягає спати об одинадцятій вечора", listOf("Ela", "deita-se", "às", "onze", "da", "noite")),
            Sentence("Ти лягаєш пізно, коли працюєш?", listOf("Tu", "deitas-te", "tarde", "quando", "trabalhas?")),
            Sentence("Діти не лягають без казки", listOf("As", "crianças", "não", "se", "deitam", "sem", "uma", "história")),
            Sentence("Учора я ліг опівночі", listOf("Ontem", "eu", "deitei-me", "à", "meia-noite")),
            Sentence("Ви пізно лягли вчора? (ввічливо)", listOf("Você", "deitou-se", "tarde", "ontem?")),
            Sentence("Ми не лягали спати всю ніч", listOf("Nós", "não", "nos", "deitamos", "toda", "a", "noite")),
            Sentence("Сьогодні я ляжу раніше", listOf("Hoje", "eu", "vou", "deitar-me", "mais", "cedo")),
            Sentence("Ви ляжете відпочити після обіду? (множина)", listOf("Vocês", "vão", "deitar-se", "depois", "do", "almoço?")),
            Sentence("Вони не ляжуть рано сьогодні (чоловіки)", listOf("Eles", "não", "se", "vão", "deitar", "cedo", "hoje")),

            // LEMBRAR-SE DE – пам'ятати, згадувати
            Sentence("Я дуже добре пам'ятаю той день", listOf("Eu", "lembro-me", "muito", "bem", "desse", "dia")),
            Sentence("Ти пам'ятаєш мого брата?", listOf("Tu", "lembras-te", "do", "meu", "irmão?")),
            Sentence("Вона не пам'ятає мого імені", listOf("Ela", "não", "se", "lembra", "do", "meu", "nome")),
            Sentence("Нарешті я згадав його адресу", listOf("Finalmente", "eu", "lembrei-me", "da", "morada", "dele")),
            Sentence("Ти не забув купити хліба?", listOf("Tu", "lembraste-te", "de", "comprar", "pão?")),
            Sentence("Вони не згадали про мій день народження (чоловіки)", listOf("Eles", "não", "se", "lembraram", "do", "meu", "aniversário")),
            Sentence("Ти запам'ятаєш це на все життя", listOf("Tu", "vais", "lembrar-te", "disso", "toda", "a", "vida")),
            Sentence("Ви запам'ятаєте дорогу? (множина)", listOf("Vocês", "vão", "lembrar-se", "do", "caminho?")),
            Sentence("Завтра він про це не згадає", listOf("Amanhã", "ele", "não", "se", "vai", "lembrar", "disso")),

            // SENTIR-SE – почуватися
            Sentence("Я почуваюся добре в Португалії", listOf("Eu", "sinto-me", "bem", "em", "Portugal")),
            Sentence("Ти почуваєшся краще сьогодні?", listOf("Tu", "sentes-te", "melhor", "hoje?")),
            Sentence("Вона не почувається вдома в цьому місті", listOf("Ela", "não", "se", "sente", "em", "casa", "nesta", "cidade")),
            Sentence("Учора я почувався дуже втомленим", listOf("Ontem", "eu", "senti-me", "muito", "cansado")),
            Sentence("Ви почувалися добре після операції? (ввічливо)", listOf("Você", "sentiu-se", "bem", "depois", "da", "operação?")),
            Sentence("Ми не почувалися самотніми", listOf("Nós", "não", "nos", "sentimos", "sozinhos")),
            Sentence("Після відпустки ти почуватимешся краще", listOf("Depois", "das", "férias", "tu", "vais", "sentir-te", "melhor")),
            Sentence("Діти почуватимуться добре в новій школі?", listOf("As", "crianças", "vão", "sentir-se", "bem", "na", "nova", "escola?")),
            Sentence("Я не почуватимуся там комфортно", listOf("Eu", "não", "me", "vou", "sentir", "à", "vontade", "lá")),

            // CHAMAR-SE, SENTAR-SE, PREOCUPAR-SE, CASAR-SE
            Sentence("Привіт, як тебе звати?", listOf("Olá,", "como", "te", "chamas?")),
            Sentence("Мене звати Олена, а тебе?", listOf("Eu", "chamo-me", "Olena,", "e", "tu?")),
            Sentence("Як звати твою сестру?", listOf("Como", "se", "chama", "a", "tua", "irmã?")),
            Sentence("Мого сина звати Андрій", listOf("O", "meu", "filho", "chama-se", "Andrii")),
            Sentence("Сідайте, будь ласка, лікар зараз прийде (ввічливо)", listOf("Sente-se,", "por", "favor,", "o", "médico", "já", "vem")),
            Sentence("Ми сідаємо біля вікна", listOf("Nós", "sentamo-nos", "perto", "da", "janela")),
            Sentence("Не хвилюйся, все буде добре", listOf("Não", "te", "preocupes,", "vai", "correr", "tudo", "bem")),
            Sentence("Я хвилююся за маму", listOf("Eu", "preocupo-me", "com", "a", "minha", "mãe")),
            Sentence("Мій брат одружується в червні", listOf("O", "meu", "irmão", "casa-se", "em", "junho"))
        )
    }
}

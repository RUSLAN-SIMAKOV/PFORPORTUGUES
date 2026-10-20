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
            Sentence("Мій брат одружується в червні", listOf("O", "meu", "irmão", "casa-se", "em", "junho")),

            // LAVAR-SE – вмиватися, митися
            Sentence("Я вмиваюся холодною водою", listOf("Eu", "lavo-me", "com", "água", "fria")),
            Sentence("Ти вмиваєшся перед сном?", listOf("Tu", "lavas-te", "antes", "de", "dormir?")),
            Sentence("Діти не хочуть митися", listOf("As", "crianças", "não", "se", "querem", "lavar")),
            Sentence("Він швидко помився й пішов", listOf("Ele", "lavou-se", "depressa", "e", "saiu")),
            Sentence("Ти вже помився?", listOf("Tu", "já", "te", "lavaste?")),
            Sentence("Ми не вмивалися зранку, не було води", listOf("Nós", "não", "nos", "lavamos", "de", "manhã,", "não", "havia", "água")),
            Sentence("Я помиюся після роботи", listOf("Eu", "vou", "lavar-me", "depois", "do", "trabalho")),
            Sentence("Ти помиєшся перед вечерею?", listOf("Tu", "vais", "lavar-te", "antes", "do", "jantar?")),
            Sentence("Він не митиметься холодною водою", listOf("Ele", "não", "se", "vai", "lavar", "com", "água", "fria")),

            // VESTIR-SE – одягатися
            Sentence("Я одягаюся за п'ять хвилин", listOf("Eu", "visto-me", "em", "cinco", "minutos")),
            Sentence("Ти тепло одягаєшся взимку?", listOf("Tu", "vestes-te", "com", "roupa", "quente", "no", "inverno?")),
            Sentence("Він ще не одягається сам, він малий", listOf("Ele", "não", "se", "veste", "sozinho,", "ainda", "é", "pequeno")),
            Sentence("Вона дуже гарно вбралася на весілля", listOf("Ela", "vestiu-se", "muito", "bem", "para", "o", "casamento")),
            Sentence("Діти вже одяглися?", listOf("As", "crianças", "já", "se", "vestiram?")),
            Sentence("Я не вдягнувся тепло і змерз",listOf("Eu", "não", "me", "vesti", "bem", "e", "tive", "frio")),
            Sentence("Ми одягнемося й вийдемо", listOf("Nós", "vamos", "vestir-nos", "e", "sair")),
            Sentence("Що ти вдягнеш на вечірку?", listOf("O", "que", "vais", "vestir", "para", "a", "festa?")),
            Sentence("Я не вдягатиму цю сукню (жінка)", listOf("Eu", "não", "vou", "vestir", "este", "vestido")),

            // ESQUECER-SE DE – забувати
            Sentence("Я завжди забуваю парасольку", listOf("Eu", "esqueço-me", "sempre", "do", "guarda-chuva")),
            Sentence("Ти не забуваєш про ліки?", listOf("Tu", "não", "te", "esqueces", "dos", "medicamentos?")),
            Sentence("Вона ніколи не забуває про дні народження", listOf("Ela", "nunca", "se", "esquece", "dos", "aniversários")),
            Sentence("Я забув ключі в машині", listOf("Eu", "esqueci-me", "das", "chaves", "no", "carro")),
            Sentence("Ти забув мій номер?", listOf("Tu", "esqueceste-te", "do", "meu", "número?")),
            Sentence("Ми не забули про тебе", listOf("Nós", "não", "nos", "esquecemos", "de", "ti")),
            Sentence("Через тиждень ти про це забудеш", listOf("Tu", "vais", "esquecer-te", "disso", "daqui", "a", "uma", "semana")),
            Sentence("Ви не забудете купити хліба? (множина)", listOf("Vocês", "não", "se", "vão", "esquecer", "de", "comprar", "pão?")),
            Sentence("Я не забуду про твій день народження", listOf("Eu", "não", "me", "vou", "esquecer", "do", "teu", "aniversário")),

            // SENTAR-SE – сідати
            Sentence("В автобусі я завжди сідаю біля вікна", listOf("Eu", "sento-me", "sempre", "à", "janela", "no", "autocarro")),
            Sentence("Ти сідаєш спереду чи ззаду?", listOf("Tu", "sentas-te", "à", "frente", "ou", "atrás?")),
            Sentence("Він ніколи не сідає за стіл без мене", listOf("Ele", "nunca", "se", "senta", "à", "mesa", "sem", "mim")),
            Sentence("Ми сіли в перший ряд", listOf("Nós", "sentamo-nos", "na", "primeira", "fila")),
            Sentence("Де ви сіли в кінотеатрі? (множина)", listOf("Onde", "vocês", "se", "sentaram", "no", "cinema?")),
            Sentence("Вона не сіла, бо поспішала", listOf("Ela", "não", "se", "sentou", "porque", "estava", "com", "pressa")),
            Sentence("Я сяду тут, якщо можна", listOf("Eu", "vou", "sentar-me", "aqui,", "se", "puder")),
            Sentence("Ти сядеш поруч зі мною?", listOf("Tu", "vais", "sentar-te", "ao", "meu", "lado?")),
            Sentence("Діти не сидітимуть спокійно", listOf("As", "crianças", "não", "se", "vão", "sentar", "quietas")),

            // PREOCUPAR-SE – хвилюватися
            Sentence("Мама завжди хвилюється за мене", listOf("A", "mãe", "preocupa-se", "sempre", "comigo")),
            Sentence("Ти хвилюєшся перед іспитом?", listOf("Tu", "preocupas-te", "antes", "do", "exame?")),
            Sentence("Він ні про що не хвилюється", listOf("Ele", "não", "se", "preocupa", "com", "nada")),
            Sentence("Ми дуже хвилювалися, коли ти не подзвонив", listOf("Nós", "preocupamo-nos", "muito", "quando", "não", "ligaste")),
            Sentence("Ви хвилювалися через документи? (ввічливо)", listOf("Você", "preocupou-se", "com", "os", "documentos?")),
            Sentence("Вона не хвилювалася, бо все знала", listOf("Ela", "não", "se", "preocupou", "porque", "sabia", "tudo")),
            Sentence("Батьки хвилюватимуться, якщо ми запізнимося", listOf("Os", "pais", "vão", "preocupar-se", "se", "chegarmos", "tarde")),
            Sentence("Ти хвилюватимешся, якщо я поїду?", listOf("Tu", "vais", "preocupar-te", "se", "eu", "partir?")),
            Sentence("Я не хвилюватимусь через дрібниці", listOf("Eu", "não", "me", "vou", "preocupar", "com", "coisas", "pequenas")),

            // ЩЕ ЗВОРОТНІ ДІЄСЛОВА
            Sentence("Ми переїжджаємо до Порту в липні", listOf("Nós", "mudamo-nos", "para", "o", "Porto", "em", "julho")),
            Sentence("Вони одружилися минулого року", listOf("Eles", "casaram-se", "no", "ano", "passado")),
            Sentence("Ми дуже весело провели час на вечірці", listOf("Nós", "divertimo-nos", "muito", "na", "festa")),
            Sentence("Він розсердився на мене через дрібницю", listOf("Ele", "zangou-se", "comigo", "por", "causa", "de", "uma", "coisa", "pequena")),
            Sentence("Я запізнився на роботу", listOf("Eu", "atrasei-me", "para", "o", "trabalho")),
            Sentence("Де ми зустрінемося після роботи?", listOf("Onde", "nos", "encontramos", "depois", "do", "trabalho?")),
            Sentence("Вона попрощалася з усіма й пішла", listOf("Ela", "despediu-se", "de", "todos", "e", "saiu")),
            Sentence("Я погано почуваюся, піду додому", listOf("Não", "me", "sinto", "bem,", "vou", "para", "casa")),
            Sentence("Ти пам'ятаєш, де ми познайомилися?", listOf("Lembras-te", "de", "onde", "nos", "conhecemos?")),
            Sentence("Діти, вмивайтеся й лягайте спати", listOf("Meninos,", "lavem-se", "e", "vão", "deitar-se"))
        )
    }
}

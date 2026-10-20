package ruslan.simakov.pt4ua.data.lessons

import ruslan.simakov.pt4ua.data.RuleTable
import ruslan.simakov.pt4ua.data.Sentence

// Ще шість частих неправильних дієслів у базовій схемі Петрова
object Lesson13 {

    private val header = listOf("", "Минулий", "Теперішній", "Майбутній")

    val rules = listOf(
        RuleTable(
            "DIZER – казати",
            listOf(
                header,
                listOf("eu", "disse", "digo", "direi"),
                listOf("tu", "disseste", "dizes", "dirás"),
                listOf("você, ele, ela", "disse", "diz", "dirá"),
                listOf("nós", "dissemos", "dizemos", "diremos"),
                listOf("vocês, eles, elas", "disseram", "dizem", "dirão")
            )
        ),
        RuleTable(
            "DAR – давати",
            listOf(
                header,
                listOf("eu", "dei", "dou", "darei"),
                listOf("tu", "deste", "dás", "darás"),
                listOf("você, ele, ela", "deu", "dá", "dará"),
                listOf("nós", "demos", "damos", "daremos"),
                listOf("vocês, eles, elas", "deram", "dão", "darão")
            )
        ),
        RuleTable(
            "VIR – приходити",
            listOf(
                header,
                listOf("eu", "vim", "venho", "virei"),
                listOf("tu", "vieste", "vens", "virás"),
                listOf("você, ele, ela", "veio", "vem", "virá"),
                listOf("nós", "viemos", "vimos", "viremos"),
                listOf("vocês, eles, elas", "vieram", "vêm", "virão")
            ),
            note = "Не плутайте: vimos – «ми приходимо» (VIR) і «ми бачили» (VER)."
        ),
        RuleTable(
            "VER – бачити",
            listOf(
                header,
                listOf("eu", "vi", "vejo", "verei"),
                listOf("tu", "viste", "vês", "verás"),
                listOf("você, ele, ela", "viu", "vê", "verá"),
                listOf("nós", "vimos", "vemos", "veremos"),
                listOf("vocês, eles, elas", "viram", "veem", "verão")
            )
        ),
        RuleTable(
            "PÔR – класти, ставити",
            listOf(
                header,
                listOf("eu", "pus", "ponho", "porei"),
                listOf("tu", "puseste", "pões", "porás"),
                listOf("você, ele, ela", "pôs", "põe", "porá"),
                listOf("nós", "pusemos", "pomos", "poremos"),
                listOf("vocês, eles, elas", "puseram", "põem", "porão")
            )
        ),
        RuleTable(
            "TRAZER – приносити",
            listOf(
                header,
                listOf("eu", "trouxe", "trago", "trarei"),
                listOf("tu", "trouxeste", "trazes", "trarás"),
                listOf("você, ele, ela", "trouxe", "traz", "trará"),
                listOf("nós", "trouxemos", "trazemos", "traremos"),
                listOf("vocês, eles, elas", "trouxeram", "trazem", "trarão")
            )
        )
    )

    fun getSentences(): List<Sentence> {
        return listOf(
            // DIZER – казати
            Sentence("Я завжди кажу правду", listOf("Eu", "digo", "sempre", "a", "verdade")),
            Sentence("Ти кажеш, що це дорого?", listOf("Tu", "dizes", "que", "isso", "é", "caro?")),
            Sentence("Він не каже, де працює", listOf("Ele", "não", "diz", "onde", "trabalha")),
            Sentence("Учителька сказала, що завтра тест", listOf("A", "professora", "disse", "que", "amanhã", "há", "teste")),
            Sentence("Ви сказали правду? (множина)", listOf("Vocês", "disseram", "a", "verdade?")),
            Sentence("Я нічого не сказав мамі", listOf("Eu", "não", "disse", "nada", "à", "mãe")),
            Sentence("Завтра лікар скаже результат", listOf("Amanhã", "o", "médico", "dirá", "o", "resultado")),
            Sentence("Ти скажеш правду батькам?", listOf("Tu", "dirás", "a", "verdade", "aos", "pais?")),
            Sentence("Ми нікому нічого не скажемо", listOf("Nós", "não", "diremos", "nada", "a", "ninguém")),

            // DAR – давати
            Sentence("Я даю уроки англійської", listOf("Eu", "dou", "aulas", "de", "inglês")),
            Sentence("Ви даєте знижку студентам? (ввічливо)", listOf("Você", "dá", "desconto", "aos", "estudantes?")),
            Sentence("Батьки не дають дітям солодощів", listOf("Os", "pais", "não", "dão", "doces", "às", "crianças")),
            Sentence("Бабуся дала мені двадцять євро", listOf("A", "avó", "deu-me", "vinte", "euros")),
            Sentence("Ти дав їй мій номер?", listOf("Tu", "deste-lhe", "o", "meu", "número?")),
            Sentence("Вони не дали нам чека (чоловіки)", listOf("Eles", "não", "nos", "deram", "o", "recibo")),
            Sentence("Компанія дасть директору нову машину", listOf("A", "empresa", "dará", "um", "carro", "novo", "ao", "diretor")),
            Sentence("Ви дасте відповідь до п'ятниці? (ввічливо)", listOf("Você", "dará", "uma", "resposta", "até", "sexta-feira?")),
            Sentence("Я не дам свою машину братові", listOf("Eu", "não", "darei", "o", "meu", "carro", "ao", "meu", "irmão")),

            // VIR – приходити
            Sentence("Мій брат приходить до нас щонеділі", listOf("O", "meu", "irmão", "vem", "a", "nossa", "casa", "todos", "os", "domingos")),
            Sentence("Ти приходиш сьогодні на вечерю?", listOf("Tu", "vens", "jantar", "hoje?")),
            Sentence("Автобус ніколи не приходить вчасно", listOf("O", "autocarro", "nunca", "vem", "a", "horas")),
            Sentence("Учора до нас прийшли друзі з України", listOf("Ontem", "os", "amigos", "da", "Ucrânia", "vieram", "a", "nossa", "casa")),
            Sentence("Ви прийшли пішки? (множина)", listOf("Vocês", "vieram", "a", "pé?")),
            Sentence("Він не прийшов на роботу вчора", listOf("Ele", "não", "veio", "trabalhar", "ontem")),
            Sentence("Завтра о десятій прийде технік", listOf("Amanhã", "às", "dez", "virá", "o", "técnico")),
            Sentence("Ви прийдете на моє весілля? (множина)", listOf("Vocês", "virão", "ao", "meu", "casamento?")),
            Sentence("Вона не прийде, бо хворіє", listOf("Ela", "não", "virá", "porque", "está", "doente")),

            // VER – бачити, дивитися
            Sentence("Ми дивимося новини щовечора", listOf("Nós", "vemos", "as", "notícias", "todas", "as", "noites")),
            Sentence("Ти бачиш той білий будинок?", listOf("Tu", "vês", "aquela", "casa", "branca?")),
            Sentence("Я не бачу добре без окулярів", listOf("Eu", "não", "vejo", "bem", "sem", "óculos")),
            Sentence("Учора я бачив твою сестру в метро", listOf("Ontem", "eu", "vi", "a", "tua", "irmã", "no", "metro")),
            Sentence("Ви бачили цей фільм? (ввічливо)", listOf("Você", "viu", "este", "filme?")),
            Sentence("Ми не бачили океану до приїзду в Португалію", listOf("Nós", "não", "vimos", "o", "oceano", "antes", "de", "vir", "para", "Portugal")),
            Sentence("У суботу ми побачимо Лісабон з річки", listOf("No", "sábado", "nós", "veremos", "Lisboa", "do", "rio")),
            Sentence("Ти побачиш батьків на Різдво?", listOf("Tu", "verás", "os", "teus", "pais", "no", "Natal?")),
            Sentence("Вони не побачать матч, бо працюють (чоловіки)", listOf("Eles", "não", "verão", "o", "jogo", "porque", "trabalham")),

            // PÔR – класти, ставити
            Sentence("Я кладу ключі на стіл", listOf("Eu", "ponho", "as", "chaves", "em", "cima", "da", "mesa")),
            Sentence("Ти кладеш цукор у каву?", listOf("Tu", "pões", "açúcar", "no", "café?")),
            Sentence("Вона не кладе сіль у суп", listOf("Ela", "não", "põe", "sal", "na", "sopa")),
            Sentence("Я поставив машину в гараж", listOf("Eu", "pus", "o", "carro", "na", "garagem")),
            Sentence("Ти поставив молоко в холодильник?", listOf("Tu", "puseste", "o", "leite", "no", "frigorífico?")),
            Sentence("Ми не поставили будильник", listOf("Nós", "não", "pusemos", "o", "despertador")),
            Sentence("Я покладу документи в сумку", listOf("Eu", "porei", "os", "documentos", "na", "mala")),
            Sentence("Ви поставите квіти на вікно? (множина)", listOf("Vocês", "porão", "as", "flores", "na", "janela?")),
            Sentence("Він не поставить машину тут", listOf("Ele", "não", "porá", "o", "carro", "aqui")),

            // TRAZER – приносити
            Sentence("Офіціант приносить рахунок", listOf("O", "empregado", "traz", "a", "conta")),
            Sentence("Ти приносиш обід з дому?", listOf("Tu", "trazes", "o", "almoço", "de", "casa?")),
            Sentence("Листоноша не приносить листів у суботу", listOf("O", "carteiro", "não", "traz", "cartas", "ao", "sábado")),
            Sentence("Друзі принесли вино і торт", listOf("Os", "amigos", "trouxeram", "vinho", "e", "um", "bolo")),
            Sentence("Ви принесли паспорт? (ввічливо)", listOf("Você", "trouxe", "o", "passaporte?")),
            Sentence("Я не взяв із собою парасольку", listOf("Eu", "não", "trouxe", "o", "guarda-chuva")),
            Sentence("Завтра я принесу книжку на урок", listOf("Amanhã", "eu", "trarei", "o", "livro", "para", "a", "aula")),
            Sentence("Ти привезеш фотографії з подорожі?", listOf("Tu", "trarás", "as", "fotografias", "da", "viagem?")),
            Sentence("Вони не візьмуть дітей на вечірку (жінки)", listOf("Elas", "não", "trarão", "as", "crianças", "para", "a", "festa"))
        )
    }
}

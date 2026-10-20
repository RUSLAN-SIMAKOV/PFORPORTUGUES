package ruslan.simakov.pt4ua.data.lessons

import ruslan.simakov.pt4ua.data.RuleTable
import ruslan.simakov.pt4ua.data.Sentence

// Ще одинадцять частих неправильних дієслів у базовій схемі
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
        ),
        RuleTable(
            "SAIR, LER, OUVIR, PEDIR, DORMIR (форма eu)",
            listOf(
                header,
                listOf("sair – виходити", "saí", "saio", "sairei"),
                listOf("ler – читати", "li", "leio", "lerei"),
                listOf("ouvir – чути", "ouvi", "ouço", "ouvirei"),
                listOf("pedir – просити", "pedi", "peço", "pedirei"),
                listOf("dormir – спати", "dormi", "durmo", "dormirei")
            ),
            note = "Неправильна переважно форма eu в теперішньому, решта звичайні: sais, ouves, pedes, dormes. " +
                "LER: leio, lês, lê, lemos, leem. SAIR: saio, sais, sai, saímos, saem."
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
            Sentence("Вони не візьмуть дітей на вечірку (жінки)", listOf("Elas", "não", "trarão", "as", "crianças", "para", "a", "festa")),

            // SAIR – виходити
            Sentence("Я виходжу з дому о восьмій", listOf("Eu", "saio", "de", "casa", "às", "oito")),
            Sentence("Ти виходиш сьогодні ввечері?", listOf("Tu", "sais", "hoje", "à", "noite?")),
            Sentence("Вона не виходить, коли йде дощ", listOf("Ela", "não", "sai", "quando", "chove")),
            Sentence("Ми вийшли з кіно опівночі", listOf("Nós", "saímos", "do", "cinema", "à", "meia-noite")),
            Sentence("Ви вже вийшли з роботи? (ввічливо)", listOf("Você", "já", "saiu", "do", "trabalho?")),
            Sentence("Вони цілий день не виходили з дому (чоловіки)", listOf("Eles", "não", "saíram", "de", "casa", "o", "dia", "todo")),
            Sentence("Я вийду на наступній зупинці", listOf("Eu", "sairei", "na", "próxima", "paragem")),
            Sentence("Ти завтра раніше підеш з роботи?", listOf("Tu", "sairás", "mais", "cedo", "do", "trabalho", "amanhã?")),
            Sentence("Ми не виходитимемо вночі", listOf("Nós", "não", "sairemos", "à", "noite")),

            // LER – читати
            Sentence("Я читаю новини в телефоні", listOf("Eu", "leio", "as", "notícias", "no", "telemóvel")),
            Sentence("Ти читаєш португальською?", listOf("Tu", "lês", "em", "português?")),
            Sentence("Він не читає книжок", listOf("Ele", "não", "lê", "livros")),
            Sentence("Учора я прочитав цікаву статтю", listOf("Ontem", "eu", "li", "um", "artigo", "interessante")),
            Sentence("Ви прочитали договір? (ввічливо)", listOf("Você", "leu", "o", "contrato?")),
            Sentence("Ми не прочитали інструкцію", listOf("Nós", "não", "lemos", "as", "instruções")),
            Sentence("Я прочитаю цю книжку у відпустці", listOf("Eu", "lerei", "este", "livro", "nas", "férias")),
            Sentence("Ти прочитаєш мого листа?", listOf("Tu", "lerás", "a", "minha", "carta?")),
            Sentence("Вони не читатимуть такий довгий текст (жінки)", listOf("Elas", "não", "lerão", "um", "texto", "tão", "longo")),

            // OUVIR – чути, слухати
            Sentence("Я слухаю радіо в машині", listOf("Eu", "ouço", "rádio", "no", "carro")),
            Sentence("Ти чуєш цей шум?", listOf("Tu", "ouves", "este", "barulho?")),
            Sentence("Бабуся погано чує", listOf("A", "avó", "não", "ouve", "bem")),
            Sentence("Ми чули музику з вулиці", listOf("Nós", "ouvimos", "música", "da", "rua")),
            Sentence("Ви чули новину? (множина)", listOf("Vocês", "ouviram", "a", "notícia?")),
            Sentence("Я не почув будильника", listOf("Eu", "não", "ouvi", "o", "despertador")),
            Sentence("Завтра ви почуєте відповідь (множина)", listOf("Amanhã", "vocês", "ouvirão", "a", "resposta")),
            Sentence("Діти почують дзвінок?", listOf("As", "crianças", "ouvirão", "a", "campainha?")),
            Sentence("Ми не слухатимемо його порад", listOf("Nós", "não", "ouviremos", "os", "conselhos", "dele")),

            // PEDIR – просити, замовляти
            Sentence("Я завжди прошу чек з податковим номером", listOf("Eu", "peço", "sempre", "fatura", "com", "contribuinte")),
            Sentence("Що ти зазвичай замовляєш?", listOf("O", "que", "costumas", "pedir?")),
            Sentence("Він ніколи не просить допомоги", listOf("Ele", "nunca", "pede", "ajuda")),
            Sentence("Ми замовили піцу додому", listOf("Nós", "pedimos", "uma", "pizza", "para", "casa")),
            Sentence("Ви попросили знижку в магазині? (ввічливо)", listOf("Você", "pediu", "desconto", "na", "loja?")),
            Sentence("Вони не замовляли десерту (жінки)", listOf("Elas", "não", "pediram", "sobremesa")),
            Sentence("Я попрошу відпустку на серпень", listOf("Eu", "pedirei", "férias", "para", "agosto")),
            Sentence("Ти попросиш допомоги в сусідів?", listOf("Tu", "pedirás", "ajuda", "aos", "vizinhos?")),
            Sentence("Ми не проситимемо грошей у батьків", listOf("Nós", "não", "pediremos", "dinheiro", "aos", "pais")),

            // DORMIR – спати
            Sentence("Я сплю вісім годин на ніч", listOf("Eu", "durmo", "oito", "horas", "por", "noite")),
            Sentence("Ти добре спиш у новій квартирі?", listOf("Tu", "dormes", "bem", "no", "apartamento", "novo?")),
            Sentence("Малюк не спить уночі", listOf("O", "bebé", "não", "dorme", "à", "noite")),
            Sentence("Учора я спав до обіду", listOf("Ontem", "eu", "dormi", "até", "ao", "almoço")),
            Sentence("Ви добре спали в готелі? (ввічливо)", listOf("Você", "dormiu", "bem", "no", "hotel?")),
            Sentence("Ми не спали всю ніч", listOf("Nós", "não", "dormimos", "a", "noite", "toda")),
            Sentence("Сьогодні діти ночуватимуть у бабусі", listOf("Hoje", "as", "crianças", "dormirão", "em", "casa", "da", "avó")),
            Sentence("Ти спатимеш у потязі?", listOf("Tu", "dormirás", "no", "comboio?")),
            Sentence("Я не спатиму вдень", listOf("Eu", "não", "dormirei", "durante", "o", "dia")),

            // ТРИ ЧАСИ В ОДНОМУ РЕЧЕННІ
            Sentence("Учора я читав, сьогодні слухаю музику, а завтра довго спатиму", listOf("Ontem", "li,", "hoje", "ouço", "música", "e", "amanhã", "dormirei", "muito"))
        )
    }
}

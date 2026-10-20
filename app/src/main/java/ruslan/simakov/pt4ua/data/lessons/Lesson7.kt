package ruslan.simakov.pt4ua.data.lessons

import ruslan.simakov.pt4ua.data.RuleTable
import ruslan.simakov.pt4ua.data.Sentence

// Базова схема для дієслів на -ER та -IR
object Lesson7 {

    val rules = listOf(
        RuleTable(
            "COMER (-ER) – їсти",
            listOf(
                listOf("", "Минулий", "Теперішній", "Майбутній"),
                listOf("eu", "comi", "como", "comerei"),
                listOf("tu", "comeste", "comes", "comerás"),
                listOf("você, ele, ela", "comeu", "come", "comerá"),
                listOf("nós", "comemos", "comemos", "comeremos"),
                listOf("vocês, eles, elas", "comeram", "comem", "comerão")
            )
        ),
        RuleTable(
            "ABRIR (-IR) – відкривати",
            listOf(
                listOf("", "Минулий", "Теперішній", "Майбутній"),
                listOf("eu", "abri", "abro", "abrirei"),
                listOf("tu", "abriste", "abres", "abrirás"),
                listOf("você, ele, ela", "abriu", "abre", "abrirá"),
                listOf("nós", "abrimos", "abrimos", "abriremos"),
                listOf("vocês, eles, elas", "abriram", "abrem", "abrirão")
            ),
            note = "Майбутній час для всіх дієслів: інфінітив + -ei, -ás, -á, -emos, -ão. " +
                "CONHECER: eu conheço (ç перед -o). ASSISTIR A + артикль: assisto ao jogo, à aula."
        )
    )

    fun getSentences(): List<Sentence> {
        return listOf(
            // COMER – їсти
            Sentence("Я їм рибу двічі на тиждень", listOf("Eu", "como", "peixe", "duas", "vezes", "por", "semana")),
            Sentence("Ти їси м'ясо на вечерю?", listOf("Tu", "comes", "carne", "ao", "jantar?")),
            Sentence("Вона не їсть солодкого після шостої", listOf("Ela", "não", "come", "doces", "depois", "das", "seis")),
            Sentence("Учора ми їли в новому ресторані", listOf("Ontem", "nós", "comemos", "num", "restaurante", "novo")),
            Sentence("Ви вже щось з'їли? (ввічливо)", listOf("Você", "já", "comeu", "alguma", "coisa?")),
            Sentence("Діти нічого не їли зранку", listOf("As", "crianças", "não", "comeram", "nada", "de", "manhã")),
            Sentence("Сьогодні ввечері ми їстимемо піцу", listOf("Hoje", "à", "noite", "nós", "comeremos", "pizza")),
            Sentence("Ти їстимеш з нами в неділю?", listOf("Tu", "comerás", "connosco", "no", "domingo?")),
            Sentence("Я не їстиму після восьмої вечора", listOf("Eu", "não", "comerei", "depois", "das", "oito", "da", "noite")),

            // BEBER – пити
            Sentence("Він п'є каву без цукру", listOf("Ele", "bebe", "café", "sem", "açúcar")),
            Sentence("Ви п'єте червоне вино за вечерею? (множина)", listOf("Vocês", "bebem", "vinho", "tinto", "ao", "jantar?")),
            Sentence("Я не п'ю алкоголь, коли за кермом", listOf("Eu", "não", "bebo", "álcool", "quando", "conduzo")),
            Sentence("Учора ввечері вони випили пляшку вина (чоловіки)", listOf("Ontem", "à", "noite", "eles", "beberam", "uma", "garrafa", "de", "vinho")),
            Sentence("Ти випив усю воду?", listOf("Tu", "bebeste", "a", "água", "toda?")),
            Sentence("Ми не пили кави сьогодні вранці", listOf("Nós", "não", "bebemos", "café", "esta", "manhã")),
            Sentence("На святі ми питимемо шампанське", listOf("Na", "festa", "nós", "beberemos", "champanhe")),
            Sentence("Ви питимете чай чи каву? (ввічливо)", listOf("Você", "beberá", "chá", "ou", "café?")),
            Sentence("Вона не питиме холодної води, бо хворіє", listOf("Ela", "não", "beberá", "água", "fria", "porque", "está", "doente")),

            // VIVER – жити
            Sentence("Ми живемо в Португалії вже три роки", listOf("Nós", "vivemos", "em", "Portugal", "há", "três", "anos")),
            Sentence("Ти живеш тут сам?", listOf("Tu", "vives", "aqui", "sozinho?")),
            Sentence("Вони більше не живуть разом (чоловіки)", listOf("Eles", "já", "não", "vivem", "juntos")),
            Sentence("Моя бабуся прожила все життя в Києві", listOf("A", "minha", "avó", "viveu", "toda", "a", "vida", "em", "Kyiv")),
            Sentence("Ви довго жили в Бразилії? (ввічливо)", listOf("Você", "viveu", "muito", "tempo", "no", "Brasil?")),
            Sentence("Я не жив у гуртожитку", listOf("Eu", "não", "vivi", "na", "residência", "de", "estudantes")),
            Sentence("Колись ми житимемо біля моря", listOf("Um", "dia", "nós", "viveremos", "perto", "do", "mar")),
            Sentence("Ви житимете в цій квартирі? (множина)", listOf("Vocês", "viverão", "neste", "apartamento?")),
            Sentence("Вона не житиме з батьками", listOf("Ela", "não", "viverá", "com", "os", "pais")),

            // ESCREVER – писати
            Sentence("Я пишу листи бабусі щомісяця", listOf("Eu", "escrevo", "cartas", "à", "avó", "todos", "os", "meses")),
            Sentence("Ти пишеш українською чи португальською?", listOf("Tu", "escreves", "em", "ucraniano", "ou", "em", "português?")),
            Sentence("Він не пише повідомлень, коли за кермом", listOf("Ele", "não", "escreve", "mensagens", "quando", "conduz")),
            Sentence("Учора вона написала довгого листа", listOf("Ontem", "ela", "escreveu", "uma", "carta", "longa")),
            Sentence("Ви написали звіт? (множина)", listOf("Vocês", "escreveram", "o", "relatório?")),
            Sentence("Ми не написали домашнє завдання", listOf("Nós", "não", "escrevemos", "os", "trabalhos", "de", "casa")),
            Sentence("Я напишу листа директору завтра", listOf("Eu", "escreverei", "uma", "carta", "ao", "diretor", "amanhã")),
            Sentence("Ти напишеш свою адресу тут?", listOf("Tu", "escreverás", "a", "tua", "morada", "aqui?")),
            Sentence("Вони не писатимуть книжку разом (жінки)", listOf("Elas", "não", "escreverão", "o", "livro", "juntas")),

            // ABRIR – відкривати
            Sentence("Вони відкривають кафе о сьомій ранку (чоловіки)", listOf("Eles", "abrem", "o", "café", "às", "sete", "da", "manhã")),
            Sentence("Ти відчиняєш вікно вночі?", listOf("Tu", "abres", "a", "janela", "à", "noite?")),
            Sentence("Аптека не працює в неділю", listOf("A", "farmácia", "não", "abre", "ao", "domingo")),
            Sentence("Ми відкрили рахунок у банку вчора", listOf("Nós", "abrimos", "uma", "conta", "no", "banco", "ontem")),
            Sentence("Ви відкрили лист з податкової? (ввічливо)", listOf("Você", "abriu", "a", "carta", "das", "Finanças?")),
            Sentence("Я не відчинив двері незнайомцю", listOf("Eu", "não", "abri", "a", "porta", "ao", "desconhecido")),
            Sentence("Наступного місяця вона відкриє свій магазин", listOf("No", "próximo", "mês", "ela", "abrirá", "a", "sua", "loja")),
            Sentence("Магазин відкриється завтра?", listOf("A", "loja", "abrirá", "amanhã?")),
            Sentence("Вони не відкриватимуть подарунки до Різдва (жінки)", listOf("Elas", "não", "abrirão", "os", "presentes", "antes", "do", "Natal")),

            // DECIDIR – вирішувати
            Sentence("У нашій родині ми вирішуємо все разом", listOf("Na", "nossa", "família", "nós", "decidimos", "tudo", "juntos")),
            Sentence("Ти сам вирішуєш, куди їхати?", listOf("Tu", "decides", "sozinho", "para", "onde", "ir?")),
            Sentence("Вона не вирішує за мене", listOf("Ela", "não", "decide", "por", "mim")),
            Sentence("Минулого року я вирішив вивчати португальську", listOf("No", "ano", "passado", "eu", "decidi", "estudar", "português")),
            Sentence("Ви вже вирішили, що замовити? (множина)", listOf("Vocês", "já", "decidiram", "o", "que", "pedir?")),
            Sentence("Вони ще не вирішили, де жити (чоловіки)", listOf("Eles", "ainda", "não", "decidiram", "onde", "morar")),
            Sentence("Лікар вирішить це завтра вранці", listOf("O", "médico", "decidirá", "isso", "amanhã", "de", "manhã")),
            Sentence("Ти вирішиш до п'ятниці?", listOf("Tu", "decidirás", "até", "sexta-feira?")),
            Sentence("Ми нічого не вирішуватимемо без тебе", listOf("Nós", "não", "decidiremos", "nada", "sem", "ti")),

            // CONHECER – знати (когось), знайомитися
            Sentence("Я знаю цього лікаря", listOf("Eu", "conheço", "este", "médico")),
            Sentence("Ти знаєш мою сестру?", listOf("Tu", "conheces", "a", "minha", "irmã?")),
            Sentence("Ми не знаємо нікого в цьому місті", listOf("Nós", "não", "conhecemos", "ninguém", "nesta", "cidade")),
            Sentence("Я познайомився з дружиною в Києві", listOf("Eu", "conheci", "a", "minha", "mulher", "em", "Kyiv")),
            Sentence("Ви познайомилися з новим учителем? (множина)", listOf("Vocês", "conheceram", "o", "novo", "professor?")),
            Sentence("Вона ще не бувала в Порту", listOf("Ela", "ainda", "não", "conheceu", "o", "Porto")),
            Sentence("Завтра ти познайомишся з моїми батьками", listOf("Amanhã", "tu", "conhecerás", "os", "meus", "pais")),
            Sentence("Ви побуваєте в Алгарве цього літа? (ввічливо)", listOf("Você", "conhecerá", "o", "Algarve", "este", "verão?")),
            Sentence("Діти не знатимуть нікого в новій школі", listOf("As", "crianças", "não", "conhecerão", "ninguém", "na", "nova", "escola")),

            // RECEBER – отримувати
            Sentence("Я отримую зарплату наприкінці місяця", listOf("Eu", "recebo", "o", "salário", "no", "fim", "do", "mês")),
            Sentence("Ти отримуєш мої повідомлення?", listOf("Tu", "recebes", "as", "minhas", "mensagens?")),
            Sentence("Вона не отримує листів поштою", listOf("Ela", "não", "recebe", "cartas", "pelo", "correio")),
            Sentence("Учора ми отримали посилку з України", listOf("Ontem", "nós", "recebemos", "uma", "encomenda", "da", "Ucrânia")),
            Sentence("Ви отримали мого листа? (ввічливо)", listOf("Você", "recebeu", "a", "minha", "carta?")),
            Sentence("Вони ще не отримали документів (жінки)", listOf("Elas", "ainda", "não", "receberam", "os", "documentos")),
            Sentence("Ти отримаєш відповідь через тиждень", listOf("Tu", "receberás", "a", "resposta", "daqui", "a", "uma", "semana")),
            Sentence("Ми отримаємо знижку для дітей?", listOf("Nós", "receberemos", "desconto", "para", "as", "crianças?")),
            Sentence("Я не прийматиму гостей цього тижня", listOf("Eu", "não", "receberei", "visitas", "esta", "semana")),

            // CORRER – бігати
            Sentence("Я бігаю в парку щоранку", listOf("Eu", "corro", "no", "parque", "todas", "as", "manhãs")),
            Sentence("Ти бігаєш по суботах?", listOf("Tu", "corres", "aos", "sábados?")),
            Sentence("Він не бігає, бо в нього болить нога", listOf("Ele", "não", "corre", "porque", "lhe", "dói", "a", "perna")),
            Sentence("Учора ми пробігли п'ять кілометрів", listOf("Ontem", "nós", "corremos", "cinco", "quilómetros")),
            Sentence("Ви бігли, щоб встигнути на потяг? (множина)", listOf("Vocês", "correram", "para", "apanhar", "o", "comboio?")),
            Sentence("Вона не бігала цього тижня", listOf("Ela", "não", "correu", "esta", "semana")),
            Sentence("Наступного року я пробіжу марафон", listOf("No", "próximo", "ano", "eu", "correrei", "a", "maratona")),
            Sentence("Ти бігатимеш з нами завтра?", listOf("Tu", "correrás", "connosco", "amanhã?")),
            Sentence("Вони не бігатимуть під дощем (чоловіки)", listOf("Eles", "não", "correrão", "à", "chuva")),

            // ASSISTIR A – дивитися (матч, концерт), бути присутнім
            Sentence("Я дивлюся футбол по суботах", listOf("Eu", "assisto", "ao", "futebol", "aos", "sábados")),
            Sentence("Ти відвідуєш уроки португальської?", listOf("Tu", "assistes", "às", "aulas", "de", "português?")),
            Sentence("Вона не дивиться телевізор", listOf("Ela", "não", "assiste", "à", "televisão")),
            Sentence("Ми дивилися концерт на площі", listOf("Nós", "assistimos", "ao", "concerto", "na", "praça")),
            Sentence("Ви були на зборах учора? (ввічливо)", listOf("Você", "assistiu", "à", "reunião", "ontem?")),
            Sentence("Вони не дивилися фінал (чоловіки)", listOf("Eles", "não", "assistiram", "à", "final")),
            Sentence("Я буду на весіллі сестри", listOf("Eu", "assistirei", "ao", "casamento", "da", "minha", "irmã")),
            Sentence("Ви будете на уроці завтра? (множина)", listOf("Vocês", "assistirão", "à", "aula", "amanhã?")),
            Sentence("Ми не дивитимемося цей фільм", listOf("Nós", "não", "assistiremos", "a", "este", "filme")),

            // PARTIR – від'їжджати
            Sentence("Потяг до Порту відправляється о восьмій", listOf("O", "comboio", "para", "o", "Porto", "parte", "às", "oito")),
            Sentence("Ти їдеш завтра рано?", listOf("Tu", "partes", "amanhã", "cedo?")),
            Sentence("Ми не їдемо цього тижня", listOf("Nós", "não", "partimos", "esta", "semana")),
            Sentence("Вони поїхали вчора ввечері (чоловіки)", listOf("Eles", "partiram", "ontem", "à", "noite")),
            Sentence("Автобус уже поїхав?", listOf("O", "autocarro", "já", "partiu?")),
            Sentence("Я не поїхав, бо захворів", listOf("Eu", "não", "parti", "porque", "fiquei", "doente")),
            Sentence("Ми вирушимо о шостій ранку", listOf("Nós", "partiremos", "às", "seis", "da", "manhã")),
            Sentence("Ви поїдете до суботи? (ввічливо)", listOf("Você", "partirá", "antes", "de", "sábado?")),
            Sentence("Літак не вилетить через туман", listOf("O", "avião", "não", "partirá", "por", "causa", "do", "nevoeiro")),

            // ТРИ ЧАСИ В ОДНОМУ РЕЧЕННІ
            Sentence("Учора я їв рибу, сьогодні їм м'ясо, а завтра їстиму суп", listOf("Ontem", "comi", "peixe,", "hoje", "como", "carne", "e", "amanhã", "comerei", "sopa"))
        )
    }
}

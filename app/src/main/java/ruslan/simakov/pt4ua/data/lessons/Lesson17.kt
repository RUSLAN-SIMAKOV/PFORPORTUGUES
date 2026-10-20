package ruslan.simakov.pt4ua.data.lessons

import ruslan.simakov.pt4ua.data.RuleTable
import ruslan.simakov.pt4ua.data.Sentence

// У лікаря та в аптеці
object Lesson17 {

    val rules = listOf(
        RuleTable(
            "Що болить?",
            listOf(
                listOf("Українською", "Português"),
                listOf("У мене болить голова", "Dói-me a cabeça"),
                listOf("У мене болить горло", "Dói-me a garganta"),
                listOf("У мене болять ноги", "Doem-me as pernas"),
                listOf("У мене температура", "Tenho febre"),
                listOf("У мене кашель", "Tenho tosse"),
                listOf("У мене грип", "Estou com gripe")
            ),
            note = "Dói-me + однина, doem-me + множина. Тіло: a cabeça, a garganta, a barriga, " +
                "as costas, o dente, o braço, a perna, o pé."
        ),
        RuleTable(
            "Де і що",
            listOf(
                listOf("Українською", "Português"),
                listOf("поліклініка", "o centro de saúde"),
                listOf("сімейний лікар", "o médico de família"),
                listOf("невідкладна допомога", "as urgências"),
                listOf("прийом у лікаря", "a consulta"),
                listOf("рецепт", "a receita"),
                listOf("таблетка", "o comprimido"),
                listOf("лікарняний", "a baixa"),
                listOf("чергова аптека", "a farmácia de serviço")
            ),
            note = "Екстрений номер – 112. Медична лінія SNS 24 – 808 24 24 24."
        )
    )

    fun getSentences(): List<Sentence> {
        return listOf(
            // ЗАПИС І СИМПТОМИ
            Sentence("Доброго дня, я хотів би записатися до лікаря", listOf("Bom", "dia,", "queria", "marcar", "uma", "consulta")),
            Sentence("У мене болить голова з учорашнього дня", listOf("Dói-me", "a", "cabeça", "desde", "ontem")),
            Sentence("У мене болить горло і температура", listOf("Dói-me", "a", "garganta", "e", "tenho", "febre")),
            Sentence("У мене дуже болить спина", listOf("Doem-me", "muito", "as", "costas")),
            Sentence("У дитини болить живіт", listOf("A", "criança", "tem", "dores", "de", "barriga")),
            Sentence("У мене кашель уже тиждень", listOf("Tenho", "tosse", "há", "uma", "semana")),
            Sentence("Я думаю, що в мене грип", listOf("Acho", "que", "estou", "com", "gripe")),
            Sentence("У мене алергія на пеніцилін (чоловік)", listOf("Sou", "alérgico", "à", "penicilina")),
            Sentence("Я вагітна, мені можна ці ліки?", listOf("Estou", "grávida,", "posso", "tomar", "este", "medicamento?")),
            Sentence("Де найближча поліклініка?", listOf("Onde", "fica", "o", "centro", "de", "saúde", "mais", "próximo?")),
            Sentence("Я хочу зареєструватися в поліклініці", listOf("Quero", "inscrever-me", "no", "centro", "de", "saúde")),
            Sentence("У мене ще немає сімейного лікаря", listOf("Ainda", "não", "tenho", "médico", "de", "família")),
            Sentence("Ось мій номер пацієнта", listOf("Aqui", "está", "o", "meu", "número", "de", "utente")),
            Sentence("О котрій годині мій прийом?", listOf("A", "que", "horas", "é", "a", "minha", "consulta?")),
            Sentence("Я хотів би перенести прийом на п'ятницю", listOf("Queria", "mudar", "a", "consulta", "para", "sexta-feira")),
            Sentence("Мені треба в лікарню, це терміново", listOf("Preciso", "de", "ir", "às", "urgências,", "é", "urgente")),
            Sentence("Викличте швидку, будь ласка (ввічливо)", listOf("Chame", "uma", "ambulância,", "por", "favor")),
            Sentence("У разі небезпеки дзвоніть на 112 (ввічливо)", listOf("Em", "caso", "de", "emergência,", "ligue", "para", "o", "112")),
            Sentence("Можна зателефонувати на SNS 24, перш ніж іти до лікаря (ввічливо)", listOf("Pode", "ligar", "para", "o", "SNS", "24", "antes", "de", "ir", "ao", "médico")),

            // ЛІКАР ГОВОРИТЬ
            Sentence("Що у Вас болить? (ввічливо)", listOf("O", "que", "lhe", "dói?")),
            Sentence("Відколи у Вас ці симптоми? (ввічливо)", listOf("Desde", "quando", "tem", "estes", "sintomas?")),
            Sentence("Ви приймаєте якісь ліки? (ввічливо)", listOf("Está", "a", "tomar", "algum", "medicamento?")),
            Sentence("Глибоко вдихніть, будь ласка (ввічливо)", listOf("Respire", "fundo,", "por", "favor")),
            Sentence("Відкрийте рот, будь ласка (ввічливо)", listOf("Abra", "a", "boca,", "por", "favor")),
            Sentence("Я виміряю Вам тиск (ввічливо)", listOf("Vou", "medir-lhe", "a", "tensão")),
            Sentence("Вам треба здати аналіз крові (ввічливо)", listOf("Tem", "de", "fazer", "análises", "ao", "sangue")),
            Sentence("Я випишу Вам рецепт (ввічливо)", listOf("Vou", "passar-lhe", "uma", "receita")),
            Sentence("Приймайте одну таблетку тричі на день (ввічливо)", listOf("Tome", "um", "comprimido", "três", "vezes", "por", "dia")),
            Sentence("Пийте багато води й відпочивайте (ввічливо)", listOf("Beba", "muita", "água", "e", "descanse")),
            Sentence("Вам потрібна довідка для роботи? (ввічливо)", listOf("Precisa", "de", "um", "atestado", "para", "o", "trabalho?")),
            Sentence("Мені потрібен лікарняний на три дні", listOf("Preciso", "de", "baixa", "por", "três", "dias")),
            Sentence("Через тиждень мені стало краще", listOf("Uma", "semana", "depois", "senti-me", "melhor")),

            // В АПТЕЦІ
            Sentence("У Вас є щось від головного болю? (ввічливо)", listOf("Tem", "alguma", "coisa", "para", "as", "dores", "de", "cabeça?")),
            Sentence("Мені потрібен сироп від кашлю", listOf("Preciso", "de", "um", "xarope", "para", "a", "tosse")),
            Sentence("Ці ліки продаються без рецепта?", listOf("Este", "medicamento", "vende-se", "sem", "receita?")),
            Sentence("Скільки разів на день їх приймати?", listOf("Quantas", "vezes", "por", "dia", "devo", "tomar?")),
            Sentence("Приймати до чи після їжі?", listOf("Tomo", "antes", "ou", "depois", "das", "refeições?")),
            Sentence("Яка аптека сьогодні чергова?", listOf("Qual", "é", "a", "farmácia", "de", "serviço", "hoje?")),
            Sentence("У Вас є пластир і бинт? (ввічливо)", listOf("Tem", "pensos", "rápidos", "e", "ligaduras?")),
            Sentence("Мені потрібен термометр для малюка", listOf("Preciso", "de", "um", "termómetro", "para", "o", "bebé")),

            // ІНШЕ
            Sentence("У мене болить зуб, можна сьогодні до стоматолога?", listOf("Dói-me", "um", "dente,", "posso", "ir", "hoje", "ao", "dentista?")),
            Sentence("Я загубив окуляри, мені потрібен окуліст", listOf("Perdi", "os", "óculos,", "preciso", "de", "um", "oftalmologista")),
            Sentence("Моєму синові потрібні щеплення", listOf("O", "meu", "filho", "precisa", "de", "vacinas")),
            Sentence("Я погано сплю й почуваюся втомленим", listOf("Durmo", "mal", "e", "sinto-me", "cansado")),
            Sentence("Дякую, лікарю, тепер мені набагато краще (чоловік)", listOf("Obrigado,", "doutor,", "agora", "estou", "muito", "melhor")),

            // ЩЕ СИМПТОМИ
            Sentence("У мене болить вухо з учорашнього вечора", listOf("Dói-me", "o", "ouvido", "desde", "ontem", "à", "noite")),
            Sentence("У мене болять ноги після роботи", listOf("Doem-me", "as", "pernas", "depois", "do", "trabalho")),
            Sentence("Зранку в мене паморочиться голова", listOf("De", "manhã", "tenho", "tonturas")),
            Sentence("Мене нудить після їжі", listOf("Tenho", "náuseas", "depois", "de", "comer")),
            Sentence("У мене висока температура, тридцять дев'ять", listOf("Tenho", "febre", "alta,", "trinta", "e", "nove", "graus")),
            Sentence("У мене закладений ніс і болить горло", listOf("Tenho", "o", "nariz", "entupido", "e", "dói-me", "a", "garganta")),
            Sentence("Я порізав палець ножем", listOf("Cortei", "o", "dedo", "com", "uma", "faca")),
            Sentence("Я впав, і в мене болить коліно", listOf("Caí", "e", "dói-me", "o", "joelho")),
            Sentence("У дитини висип на шкірі", listOf("A", "criança", "tem", "manchas", "na", "pele")),
            Sentence("Я погано почуваюся вже три дні", listOf("Sinto-me", "mal", "há", "três", "dias")),
            Sentence("У мене високий тиск", listOf("Tenho", "a", "tensão", "alta")),
            Sentence("Я діабетик, мені потрібен інсулін (чоловік)", listOf("Sou", "diabético,", "preciso", "de", "insulina")),

            // У РЕЄСТРАТУРІ
            Sentence("У мене запис на десяту", listOf("Tenho", "consulta", "marcada", "para", "as", "dez")),
            Sentence("Скільки чекати на прийом?", listOf("Quanto", "tempo", "tenho", "de", "esperar", "pela", "consulta?")),
            Sentence("У лікаря є сьогодні вільне місце?", listOf("O", "médico", "tem", "vaga", "hoje?")),
            Sentence("Мені потрібен перекладач", listOf("Preciso", "de", "um", "tradutor")),
            Sentence("Я погано говорю португальською, говоріть повільно, будь ласка (ввічливо)", listOf("Não", "falo", "bem", "português,", "fale", "devagar,", "por", "favor")),
            Sentence("Скільки коштує консультація?", listOf("Quanto", "custa", "a", "consulta?")),
            Sentence("У мене є медична страховка", listOf("Tenho", "seguro", "de", "saúde")),
            Sentence("Мені потрібна довідка для школи", listOf("Preciso", "de", "um", "atestado", "para", "a", "escola")),
            Sentence("Можна записатися онлайн?", listOf("Posso", "marcar", "a", "consulta", "online?")),
            Sentence("Де кабінет номер п'ять?", listOf("Onde", "é", "o", "gabinete", "número", "cinco?")),

            // ЩЕ ЛІКАР ГОВОРИТЬ
            Sentence("Ляжте сюди, будь ласка (ввічливо)", listOf("Deite-se", "aqui,", "por", "favor")),
            Sentence("Де саме болить? (ввічливо)", listOf("Onde", "é", "que", "lhe", "dói", "exatamente?")),
            Sentence("У Вас є на щось алергія? (ввічливо)", listOf("Tem", "alergia", "a", "alguma", "coisa?")),
            Sentence("Ви палите чи вживаєте алкоголь? (ввічливо)", listOf("Fuma", "ou", "bebe", "álcool?")),
            Sentence("Нічого серйозного, це вірус", listOf("Não", "é", "nada", "grave,", "é", "um", "vírus")),
            Sentence("Вам треба зробити рентген (ввічливо)", listOf("Precisa", "de", "fazer", "um", "raio-X")),
            Sentence("Результати будуть готові через тиждень", listOf("Os", "resultados", "ficam", "prontos", "daqui", "a", "uma", "semana")),
            Sentence("Приходьте через десять днів (ввічливо)", listOf("Volte", "daqui", "a", "dez", "dias")),
            Sentence("Нічого не їжте перед аналізом (ввічливо)", listOf("Não", "coma", "nada", "antes", "da", "análise")),
            Sentence("Вам треба відпочивати три дні (ввічливо)", listOf("Tem", "de", "descansar", "três", "dias")),
            Sentence("Це антибіотик, приймайте сім днів (ввічливо)", listOf("É", "um", "antibiótico,", "tome", "durante", "sete", "dias")),
            Sentence("Вас направлять до кардіолога (ввічливо)", listOf("Vai", "ser", "encaminhado", "para", "um", "cardiologista")),
            Sentence("Бажаю Вам швидко одужати, до побачення (ввічливо)", listOf("Desejo-lhe", "as", "melhoras,", "adeus")),

            // ЩЕ В АПТЕЦІ
            Sentence("У Вас є щось від болю в горлі? (ввічливо)", listOf("Tem", "alguma", "coisa", "para", "a", "dor", "de", "garganta?")),
            Sentence("Мені потрібен сонцезахисний крем", listOf("Preciso", "de", "um", "protetor", "solar")),
            Sentence("Це для дитини трьох років", listOf("É", "para", "uma", "criança", "de", "três", "anos")),
            Sentence("Скільки таблеток в упаковці?", listOf("Quantos", "comprimidos", "tem", "a", "caixa?")),
            Sentence("Чи є дешевший аналог?", listOf("Há", "um", "genérico", "mais", "barato?")),
            Sentence("Мені потрібні краплі для очей", listOf("Preciso", "de", "gotas", "para", "os", "olhos")),
            Sentence("Від цих ліків хочеться спати?", listOf("Este", "medicamento", "dá", "sono?")),
            Sentence("Я хотіла б тест на вагітність", listOf("Queria", "um", "teste", "de", "gravidez")),
            Sentence("Мені потрібні маски й антисептик", listOf("Preciso", "de", "máscaras", "e", "de", "álcool", "gel")),
            Sentence("Аптека працює цілодобово?", listOf("A", "farmácia", "está", "aberta", "vinte", "e", "quatro", "horas?")),
            Sentence("Де найближча чергова аптека?", listOf("Onde", "fica", "a", "farmácia", "de", "serviço", "mais", "próxima?")),
            Sentence("Мені треба поновити рецепт", listOf("Preciso", "de", "renovar", "a", "receita")),

            // ЩЕ СТОМАТОЛОГ ТА ІНШЕ
            Sentence("Мені треба запломбувати зуб", listOf("Preciso", "de", "chumbar", "um", "dente")),
            Sentence("У мене кровоточать ясна, коли я чищу зуби", listOf("As", "gengivas", "sangram", "quando", "lavo", "os", "dentes")),
            Sentence("Мені треба перевірити зір", listOf("Preciso", "de", "fazer", "um", "exame", "à", "vista")),
            Sentence("Мій син погано спить і плаче", listOf("O", "meu", "filho", "dorme", "mal", "e", "chora")),
            Sentence("Я на п'ятому місяці вагітності", listOf("Estou", "grávida", "de", "cinco", "meses")),
            Sentence("Мені треба поговорити з психологом", listOf("Preciso", "de", "falar", "com", "um", "psicólogo")),
            Sentence("Швидка вже їде", listOf("A", "ambulância", "já", "vem", "a", "caminho")),
            Sentence("Тримайтеся, допомога вже поруч (ввічливо)", listOf("Aguente,", "a", "ajuda", "está", "a", "chegar"))
        )
    }
}

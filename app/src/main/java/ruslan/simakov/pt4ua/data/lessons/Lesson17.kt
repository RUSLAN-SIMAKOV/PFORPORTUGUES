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
            Sentence("Дякую, лікарю, тепер мені набагато краще (чоловік)", listOf("Obrigado,", "doutor,", "agora", "estou", "muito", "melhor"))
        )
    }
}

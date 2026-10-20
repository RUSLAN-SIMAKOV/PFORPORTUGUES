package ruslan.simakov.pt4ua.data.lessons

import ruslan.simakov.pt4ua.data.RuleTable
import ruslan.simakov.pt4ua.data.Sentence

// Транспорт і місто
object Lesson20 {

    val rules = listOf(
        RuleTable(
            "Транспорт",
            listOf(
                listOf("Українською", "Português"),
                listOf("зупинка", "a paragem"),
                listOf("автобус", "o autocarro"),
                listOf("трамвай", "o elétrico"),
                listOf("потяг", "o comboio"),
                listOf("платформа", "a linha"),
                listOf("квиток", "o bilhete"),
                listOf("проїзний", "o passe"),
                listOf("поповнити картку", "carregar o cartão"),
                listOf("платна дорога", "a portagem"),
                listOf("заправка", "a bomba de gasolina"),
                listOf("водійські права", "a carta de condução")
            )
        ),
        RuleTable(
            "Як пройти?",
            listOf(
                listOf("Українською", "Português"),
                listOf("ліворуч / праворуч", "à esquerda / à direita"),
                listOf("прямо", "em frente"),
                listOf("навпроти", "em frente a"),
                listOf("поруч із", "ao lado de"),
                listOf("за", "atrás de"),
                listOf("кільце", "a rotunda"),
                listOf("перехрестя", "o cruzamento"),
                listOf("світлофор", "o semáforo")
            ),
            note = "Como chego a…? – Як дістатися до…? Onde fica…? – Де знаходиться…? Fica a 5 minutos a pé – це 5 хвилин пішки."
        )
    )

    fun getSentences(): List<Sentence> {
        return listOf(
            // ГРОМАДСЬКИЙ ТРАНСПОРТ
            Sentence("Вибачте, як дістатися до станції метро?", listOf("Desculpe,", "como", "chego", "à", "estação", "de", "metro?")),
            Sentence("Де найближча автобусна зупинка?", listOf("Onde", "fica", "a", "paragem", "de", "autocarro", "mais", "próxima?")),
            Sentence("Цей автобус їде до центру?", listOf("Este", "autocarro", "vai", "para", "o", "centro?")),
            Sentence("Скільки зупинок до вокзалу?", listOf("Quantas", "paragens", "faltam", "até", "à", "estação?")),
            Sentence("Скажіть мені, будь ласка, коли виходити (ввічливо)", listOf("Pode", "avisar-me", "quando", "tiver", "de", "sair?")),
            Sentence("Мені треба виходити на наступній", listOf("Tenho", "de", "sair", "na", "próxima")),
            Sentence("Один квиток до Порту, будь ласка", listOf("Um", "bilhete", "para", "o", "Porto,", "por", "favor")),
            Sentence("Квиток туди й назад, будь ласка", listOf("Um", "bilhete", "de", "ida", "e", "volta,", "por", "favor")),
            Sentence("З якої платформи відправляється потяг?", listOf("De", "que", "linha", "parte", "o", "comboio?")),
            Sentence("Потяг запізнюється на двадцять хвилин", listOf("O", "comboio", "está", "atrasado", "vinte", "minutos")),
            Sentence("Де можна купити проїзний на місяць?", listOf("Onde", "posso", "comprar", "o", "passe", "mensal?")),
            Sentence("Треба валідувати квиток перед поїздкою", listOf("É", "preciso", "validar", "o", "bilhete", "antes", "da", "viagem")),
            Sentence("Я хотів би поповнити транспортну картку", listOf("Queria", "carregar", "o", "cartão", "de", "transportes")),
            Sentence("Метро працює до першої ночі", listOf("O", "metro", "funciona", "até", "à", "uma", "da", "manhã")),
            Sentence("У трамваї двадцять вісім завжди багато туристів", listOf("No", "elétrico", "vinte", "e", "oito", "há", "sempre", "muitos", "turistas")),
            Sentence("Ми попливемо на поромі на інший берег річки", listOf("Vamos", "de", "barco", "para", "o", "outro", "lado", "do", "rio")),

            // ЯК ПРОЙТИ
            Sentence("Ідіть прямо, а потім поверніть ліворуч (ввічливо)", listOf("Siga", "em", "frente", "e", "depois", "vire", "à", "esquerda")),
            Sentence("Аптека праворуч, поруч із банком", listOf("A", "farmácia", "fica", "à", "direita,", "ao", "lado", "do", "banco")),
            Sentence("Музей навпроти парку", listOf("O", "museu", "fica", "em", "frente", "ao", "parque")),
            Sentence("Пошта за церквою", listOf("Os", "correios", "ficam", "atrás", "da", "igreja")),
            Sentence("На кільці з'їжджайте на другому виїзді (ввічливо)", listOf("Na", "rotunda,", "saia", "na", "segunda", "saída")),
            Sentence("Це далеко? Можна дійти пішки?", listOf("É", "longe?", "Posso", "ir", "a", "pé?")),
            Sentence("Це п'ять хвилин пішки звідси", listOf("Fica", "a", "cinco", "minutos", "a", "pé", "daqui")),
            Sentence("Я заблукав, можете мені допомогти? (ввічливо)", listOf("Estou", "perdido,", "pode", "ajudar-me?")),
            Sentence("Можете показати на мапі? (ввічливо)", listOf("Pode", "mostrar-me", "no", "mapa?")),
            Sentence("Перейдіть вулицю на світлофорі (ввічливо)", listOf("Atravesse", "a", "rua", "no", "semáforo")),
            Sentence("На перехресті поверніть праворуч (ввічливо)", listOf("No", "cruzamento,", "vire", "à", "direita")),

            // ТАКСІ ТА МАШИНА
            Sentence("Можете викликати таксі? (ввічливо)", listOf("Pode", "chamar", "um", "táxi?")),
            Sentence("До аеропорту, будь ласка", listOf("Para", "o", "aeroporto,", "por", "favor")),
            Sentence("Скільки коштує поїздка до центру?", listOf("Quanto", "custa", "a", "viagem", "até", "ao", "centro?")),
            Sentence("Зупиніть тут, будь ласка (ввічливо)", listOf("Pare", "aqui,", "por", "favor")),
            Sentence("Я хотів би орендувати машину на тиждень", listOf("Queria", "alugar", "um", "carro", "por", "uma", "semana")),
            Sentence("Де тут можна припаркуватися?", listOf("Onde", "posso", "estacionar", "aqui?")),
            Sentence("Паркування платне з дев'ятої до сьомої", listOf("O", "estacionamento", "é", "pago", "das", "nove", "às", "sete")),
            Sentence("На цій дорозі є платні ділянки", listOf("Esta", "estrada", "tem", "portagens")),
            Sentence("Де найближча заправка?", listOf("Onde", "fica", "a", "bomba", "de", "gasolina", "mais", "próxima?")),
            Sentence("Повний бак дизелю, будь ласка (ввічливо)", listOf("Encha", "o", "depósito", "de", "gasóleo,", "por", "favor")),
            Sentence("Мені треба обміняти українські права на португальські", listOf("Preciso", "de", "trocar", "a", "carta", "de", "condução", "ucraniana", "pela", "portuguesa")),
            Sentence("Тут зранку великі затори", listOf("Aqui", "há", "muito", "trânsito", "de", "manhã")),

            // МІСТО
            Sentence("Тут поблизу є пошта?", listOf("Há", "correios", "aqui", "perto?")),
            Sentence("Біля мого дому є великий парк", listOf("Perto", "da", "minha", "casa", "há", "um", "grande", "parque")),
            Sentence("Пляж за двадцять хвилин потягом від Лісабона", listOf("A", "praia", "fica", "a", "vinte", "minutos", "de", "comboio", "de", "Lisboa")),
            Sentence("Старе місто дуже гарне, але там багато підйомів", listOf("A", "zona", "antiga", "é", "muito", "bonita,", "mas", "tem", "muitas", "subidas")),
            Sentence("Я їжджу на роботу на велосипеді", listOf("Vou", "para", "o", "trabalho", "de", "bicicleta")),
            Sentence("Ми запізнилися на останній потяг", listOf("Perdemos", "o", "último", "comboio"))
        )
    }
}

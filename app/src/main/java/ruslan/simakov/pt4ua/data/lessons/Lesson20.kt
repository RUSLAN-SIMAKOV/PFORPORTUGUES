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
            Sentence("Ми запізнилися на останній потяг", listOf("Perdemos", "o", "último", "comboio")),

            // ЩЕ ГРОМАДСЬКИЙ ТРАНСПОРТ
            Sentence("Як часто ходить цей автобус?", listOf("De", "quanto", "em", "quanto", "tempo", "passa", "este", "autocarro?")),
            Sentence("Останній автобус о пів на першу ночі", listOf("O", "último", "autocarro", "é", "à", "meia-noite", "e", "meia")),
            Sentence("Цей потяг зупиняється в Сінтрі?", listOf("Este", "comboio", "para", "em", "Sintra?")),
            Sentence("Мені треба робити пересадку?", listOf("Tenho", "de", "mudar", "de", "comboio?")),
            Sentence("Де пересадка на синю лінію?", listOf("Onde", "se", "muda", "para", "a", "linha", "azul?")),
            Sentence("Скільки коштує студентський проїзний?", listOf("Quanto", "custa", "o", "passe", "de", "estudante?")),
            Sentence("Діти до чотирьох років їздять безкоштовно", listOf("As", "crianças", "até", "aos", "quatro", "anos", "não", "pagam")),
            Sentence("Я загубив транспортну картку", listOf("Perdi", "o", "cartão", "de", "transportes")),
            Sentence("Потяг скасували через страйк", listOf("O", "comboio", "foi", "cancelado", "por", "causa", "da", "greve")),
            Sentence("Сьогодні в метро страйк", listOf("Hoje", "há", "greve", "no", "metro")),
            Sentence("Цей автобус їде до аеропорту?", listOf("Este", "autocarro", "vai", "para", "o", "aeroporto?")),
            Sentence("Де купити квиток на автобус до Фару?", listOf("Onde", "compro", "o", "bilhete", "de", "autocarro", "para", "Faro?")),
            Sentence("Це місце вільне?", listOf("Este", "lugar", "está", "livre?")),
            Sentence("Перепрошую, це моє місце", listOf("Desculpe,", "este", "lugar", "é", "meu")),
            Sentence("Наступна зупинка – Росіу", listOf("A", "próxima", "paragem", "é", "o", "Rossio")),
            Sentence("Потяг прибуває на третю платформу", listOf("O", "comboio", "chega", "à", "linha", "três")),
            Sentence("Я їжджу на роботу на метро", listOf("Vou", "para", "o", "trabalho", "de", "metro")),
            Sentence("Скільки їхати до центру?", listOf("Quanto", "tempo", "demora", "até", "ao", "centro?")),

            // ЩЕ ЯК ПРОЙТИ
            Sentence("Як дійти до площі Комерсіу?", listOf("Como", "chego", "à", "Praça", "do", "Comércio?")),
            Sentence("Ідіть цією вулицею до кінця (ввічливо)", listOf("Siga", "por", "esta", "rua", "até", "ao", "fim")),
            Sentence("Це друга вулиця праворуч", listOf("É", "a", "segunda", "rua", "à", "direita")),
            Sentence("Це на розі, поруч із кафе", listOf("Fica", "na", "esquina,", "ao", "lado", "do", "café")),
            Sentence("Перейдіть міст і поверніть ліворуч (ввічливо)", listOf("Atravesse", "a", "ponte", "e", "vire", "à", "esquerda")),
            Sentence("Спустіться до річки (ввічливо)", listOf("Desça", "até", "ao", "rio")),
            Sentence("Підніміться сходами до замку (ввічливо)", listOf("Suba", "as", "escadas", "até", "ao", "castelo")),
            Sentence("Банк між аптекою і пекарнею", listOf("O", "banco", "fica", "entre", "a", "farmácia", "e", "a", "padaria")),
            Sentence("Вокзал біля метро", listOf("A", "estação", "fica", "ao", "pé", "do", "metro")),
            Sentence("Скільки кілометрів до Коїмбри?", listOf("Quantos", "quilómetros", "são", "até", "Coimbra?")),
            Sentence("Я шукаю цю адресу, можете допомогти? (ввічливо)", listOf("Procuro", "esta", "morada,", "pode", "ajudar-me?")),
            Sentence("Ви йдете не в той бік (ввічливо)", listOf("Está", "a", "ir", "no", "sentido", "errado")),
            Sentence("Поверніться назад і йдіть прямо (ввічливо)", listOf("Volte", "para", "trás", "e", "siga", "em", "frente")),
            Sentence("Вхід з іншого боку будинку", listOf("A", "entrada", "é", "do", "outro", "lado", "do", "prédio")),

            // ЩЕ ТАКСІ ТА МАШИНА
            Sentence("Скільки коштує таксі до вокзалу?", listOf("Quanto", "custa", "um", "táxi", "até", "à", "estação?")),
            Sentence("У таксі можна заплатити карткою?", listOf("Posso", "pagar", "com", "cartão", "no", "táxi?")),
            Sentence("Відкрийте багажник, будь ласка (ввічливо)", listOf("Pode", "abrir", "a", "mala,", "por", "favor?")),
            Sentence("Я поспішаю, можна швидше? (ввічливо)", listOf("Estou", "com", "pressa,", "pode", "ir", "mais", "depressa?")),
            Sentence("Мені потрібна машина з автоматичною коробкою", listOf("Preciso", "de", "um", "carro", "automático")),
            Sentence("Страховка включена?", listOf("O", "seguro", "está", "incluído?")),
            Sentence("Де повернути машину?", listOf("Onde", "devolvo", "o", "carro?")),
            Sentence("У мене пробите колесо", listOf("Tenho", "um", "pneu", "furado")),
            Sentence("Машина не заводиться", listOf("O", "carro", "não", "pega")),
            Sentence("Я отримав штраф за паркування", listOf("Levei", "uma", "multa", "de", "estacionamento")),
            Sentence("Тут обмеження швидкості – п'ятдесят", listOf("Aqui", "o", "limite", "de", "velocidade", "é", "cinquenta")),
            Sentence("Як платити за платні дороги?", listOf("Como", "se", "pagam", "as", "portagens?")),
            Sentence("Я складатиму на права в Португалії", listOf("Vou", "tirar", "a", "carta", "em", "Portugal")),

            // ЩЕ МІСТО
            Sentence("Де найближча трамвайна зупинка?", listOf("Onde", "fica", "a", "paragem", "do", "elétrico", "mais", "próxima?")),
            Sentence("О котрій відкривається музей?", listOf("A", "que", "horas", "abre", "o", "museu?")),
            Sentence("У неділю вхід до музею безкоштовний", listOf("A", "entrada", "no", "museu", "é", "gratuita", "ao", "domingo")),
            Sentence("Де туристичний офіс?", listOf("Onde", "é", "o", "posto", "de", "turismo?")),
            Sentence("Можна взяти мапу міста?", listOf("Posso", "levar", "um", "mapa", "da", "cidade?")),
            Sentence("Ця вулиця дуже крута", listOf("Esta", "rua", "é", "muito", "íngreme")),
            Sentence("Набережна гарна надвечір", listOf("A", "marginal", "é", "bonita", "ao", "fim", "da", "tarde")),
            Sentence("Біля мого дому відкрили новий супермаркет", listOf("Abriram", "um", "supermercado", "novo", "perto", "da", "minha", "casa")),
            Sentence("У центрі важко знайти паркування", listOf("No", "centro", "é", "difícil", "encontrar", "estacionamento")),
            Sentence("Я люблю гуляти старим містом", listOf("Gosto", "de", "passear", "pela", "zona", "antiga"))
        )
    }
}

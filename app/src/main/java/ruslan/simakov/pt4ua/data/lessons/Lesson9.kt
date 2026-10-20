package ruslan.simakov.pt4ua.data.lessons

import ruslan.simakov.pt4ua.data.RuleTable
import ruslan.simakov.pt4ua.data.Sentence

// Модальні дієслова + інфінітив у базовій схемі Петрова
object Lesson9 {

    val rules = listOf(
        RuleTable(
            "Модальні дієслова (форма eu)",
            listOf(
                listOf("", "Минулий", "Теперішній", "Майбутній"),
                listOf("могти\nPODER", "pude", "posso", "poderei"),
                listOf("хотіти\nQUERER", "quis", "quero", "vou querer"),
                listOf("знати, вміти\nSABER", "soube", "sei", "saberei"),
                listOf("потребувати\nPRECISAR DE", "precisei de", "preciso de", "precisarei de"),
                listOf("мусити\nTER DE", "tive de", "tenho de", "terei de")
            ),
            note = "Після модального дієслова – інфінітив: posso ajudar, quero comer, tenho de ir. " +
                "Soube (минулий від SABER) означає «дізнався»."
        ),
        RuleTable(
            "PODER і QUERER – теперішній час",
            listOf(
                listOf("", "PODER", "QUERER"),
                listOf("eu", "posso", "quero"),
                listOf("tu", "podes", "queres"),
                listOf("você, ele, ela", "pode", "quer"),
                listOf("nós", "podemos", "queremos"),
                listOf("vocês, eles, elas", "podem", "querem")
            ),
            note = "У кафе кажуть: «Eu vou querer um café» – «Я візьму каву»."
        )
    )

    fun getSentences(): List<Sentence> {
        return listOf(
            // PODER – могти
            Sentence("Я можу допомогти тобі завтра", listOf("Eu", "posso", "ajudar-te", "amanhã")),
            Sentence("Ви можете говорити повільніше? (ввічливо)", listOf("Você", "pode", "falar", "mais", "devagar?")),
            Sentence("Він не може прийти сьогодні", listOf("Ele", "não", "pode", "vir", "hoje")),
            Sentence("Нарешті я зміг відпочити", listOf("Finalmente", "eu", "pude", "descansar")),
            Sentence("Ти зміг поговорити з лікарем?", listOf("Tu", "pudeste", "falar", "com", "o", "médico?")),
            Sentence("Вони не змогли прийти на вечірку (жінки)", listOf("Elas", "não", "puderam", "vir", "à", "festa")),
            Sentence("Завтра ти зможеш відпочити", listOf("Amanhã", "tu", "poderás", "descansar")),
            Sentence("Ви зможете прийти о дев'ятій? (множина)", listOf("Vocês", "poderão", "vir", "às", "nove?")),
            Sentence("Я не зможу працювати в суботу", listOf("Eu", "não", "poderei", "trabalhar", "no", "sábado")),

            // QUERER – хотіти
            Sentence("Я хочу каву з молоком, будь ласка", listOf("Eu", "quero", "um", "café", "com", "leite,", "por", "favor")),
            Sentence("Ти хочеш піти з нами на пляж?", listOf("Tu", "queres", "ir", "connosco", "à", "praia?")),
            Sentence("Діти не хочуть спати", listOf("As", "crianças", "não", "querem", "dormir")),
            Sentence("Ми захотіли залишитися ще на тиждень", listOf("Nós", "quisemos", "ficar", "mais", "uma", "semana")),
            Sentence("Ви захотіли подивитися квартиру? (ввічливо)", listOf("Você", "quis", "ver", "o", "apartamento?")),
            Sentence("Вона не захотіла їсти суп", listOf("Ela", "não", "quis", "comer", "a", "sopa")),
            Sentence("Я візьму рибу, будь ласка", listOf("Eu", "vou", "querer", "o", "peixe,", "por", "favor")),
            Sentence("Ви будете десерт? (множина)", listOf("Vocês", "vão", "querer", "sobremesa?")),
            Sentence("Він не захоче чекати так довго", listOf("Ele", "não", "vai", "querer", "esperar", "tanto", "tempo")),

            // SABER – знати, вміти
            Sentence("Я знаю, де живе вчитель", listOf("Eu", "sei", "onde", "mora", "o", "professor")),
            Sentence("Ти вмієш плавати в морі?", listOf("Tu", "sabes", "nadar", "no", "mar?")),
            Sentence("Вона не знає мого номера", listOf("Ela", "não", "sabe", "o", "meu", "número")),
            Sentence("Учора ми дізналися новину", listOf("Ontem", "nós", "soubemos", "a", "notícia")),
            Sentence("Ти дізнався результати іспиту?", listOf("Tu", "soubeste", "os", "resultados", "do", "exame?")),
            Sentence("Вони так і не дізналися правди (чоловіки)", listOf("Eles", "não", "souberam", "a", "verdade")),
            Sentence("Завтра ми дізнаємося результати", listOf("Amanhã", "nós", "saberemos", "os", "resultados")),
            Sentence("Ти знатимеш відповідь до п'ятниці?", listOf("Tu", "saberás", "a", "resposta", "até", "sexta-feira?")),
            Sentence("Батьки не знатимуть про це", listOf("Os", "pais", "não", "saberão", "disso")),

            // PRECISAR DE – потребувати
            Sentence("Мені потрібна твоя допомога", listOf("Eu", "preciso", "da", "tua", "ajuda")),
            Sentence("Вам потрібен пакет? (ввічливо)", listOf("Você", "precisa", "de", "saco?")),
            Sentence("Нам не потрібна машина в Лісабоні", listOf("Nós", "não", "precisamos", "de", "carro", "em", "Lisboa")),
            Sentence("Учора мені був потрібен лікар", listOf("Ontem", "eu", "precisei", "de", "um", "médico")),
            Sentence("Тобі були потрібні гроші?", listOf("Tu", "precisaste", "de", "dinheiro?")),
            Sentence("Їм не потрібна була допомога (чоловіки)", listOf("Eles", "não", "precisaram", "de", "ajuda")),
            Sentence("Завтра тобі знадобиться парасолька", listOf("Amanhã", "tu", "precisarás", "de", "um", "guarda-chuva")),
            Sentence("Вам знадобиться перекладач? (множина)", listOf("Vocês", "precisarão", "de", "um", "tradutor?")),
            Sentence("Мені не знадобиться твоя допомога", listOf("Eu", "não", "precisarei", "da", "tua", "ajuda")),

            // TER DE – мусити
            Sentence("Я мушу йти на роботу о сьомій", listOf("Eu", "tenho", "de", "ir", "para", "o", "trabalho", "às", "sete")),
            Sentence("Ти мусиш працювати сьогодні?", listOf("Tu", "tens", "de", "trabalhar", "hoje?")),
            Sentence("Вам не треба платити за дітей (множина)", listOf("Vocês", "não", "têm", "de", "pagar", "pelas", "crianças")),
            Sentence("Учора ми мусили чекати дві години", listOf("Ontem", "nós", "tivemos", "de", "esperar", "duas", "horas")),
            Sentence("Вам довелося показати паспорт? (ввічливо)", listOf("Você", "teve", "de", "mostrar", "o", "passaporte?")),
            Sentence("Їй не довелося платити за квиток", listOf("Ela", "não", "teve", "de", "pagar", "o", "bilhete")),
            Sentence("Завтра я муситиму прокинутися рано", listOf("Amanhã", "eu", "terei", "de", "acordar", "cedo")),
            Sentence("Нам доведеться змінити плани?", listOf("Nós", "teremos", "de", "mudar", "os", "planos?")),
            Sentence("Вони не муситимуть працювати в суботу (жінки)", listOf("Elas", "não", "terão", "de", "trabalhar", "no", "sábado"))
        )
    }
}

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
        ),
        RuleTable(
            "Ще корисні дієслова + інфінітив",
            listOf(
                listOf("Дієслово", "Значення", "Приклад"),
                listOf("DEVER", "повинен; мабуть", "Deves descansar. Deve ser caro."),
                listOf("CONSEGUIR", "змогти, вдатися", "Não consigo dormir."),
                listOf("COSTUMAR", "зазвичай, мати звичку", "Costumo beber café."),
                listOf("ACABAR DE", "щойно", "Acabei de chegar."),
                listOf("DEIXAR", "дозволяти; залишати", "Deixa-me pensar."),
                listOf("DEIXAR DE", "перестати", "Deixei de fumar.")
            ),
            note = "Можна / не можна (загалом): pode-se, não se pode – Aqui não se pode estacionar."
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
            Sentence("Вони не муситимуть працювати в суботу (жінки)", listOf("Elas", "não", "terão", "de", "trabalhar", "no", "sábado")),

            // DEVER – повинен; мабуть
            Sentence("Ти повинен більше відпочивати", listOf("Tu", "deves", "descansar", "mais")),
            Sentence("Я повинен заплатити зараз чи пізніше?", listOf("Eu", "devo", "pagar", "agora", "ou", "mais", "tarde?")),
            Sentence("Ви не повинні тут палити (множина)", listOf("Vocês", "não", "devem", "fumar", "aqui")),
            Sentence("Діти повинні спати вісім годин", listOf("As", "crianças", "devem", "dormir", "oito", "horas")),
            Sentence("Ми повинні допомагати сусідам", listOf("Nós", "devemos", "ajudar", "os", "vizinhos")),
            Sentence("Вона, мабуть, удома", listOf("Ela", "deve", "estar", "em", "casa")),
            Sentence("Це, мабуть, дорого", listOf("Isso", "deve", "ser", "caro")),
            Sentence("Вам не варто через це хвилюватися (ввічливо)", listOf("Não", "deve", "preocupar-se", "com", "isso")),
            Sentence("Скільки я Вам винен за ремонт? (ввічливо)", listOf("Quanto", "lhe", "devo", "pela", "reparação?")),

            // CONSEGUIR – змогти, вдатися
            Sentence("Я не можу відчинити двері", listOf("Eu", "não", "consigo", "abrir", "a", "porta")),
            Sentence("Ти можеш це прочитати?", listOf("Tu", "consegues", "ler", "isto?")),
            Sentence("Вона вже може говорити португальською", listOf("Ela", "já", "consegue", "falar", "português")),
            Sentence("Нарешті ми знайшли квартиру", listOf("Finalmente", "conseguimos", "encontrar", "um", "apartamento")),
            Sentence("Тобі вдалося купити квитки?", listOf("Tu", "conseguiste", "comprar", "os", "bilhetes?")),
            Sentence("Вони не змогли знайти паркування (чоловіки)", listOf("Eles", "não", "conseguiram", "encontrar", "estacionamento")),
            Sentence("Я не можу заснути вночі", listOf("Eu", "não", "consigo", "dormir", "à", "noite")),
            Sentence("Ти зможеш прийти о восьмій?", listOf("Tu", "vais", "conseguir", "vir", "às", "oito?")),
            Sentence("Ми не встигнемо на потяг", listOf("Nós", "não", "vamos", "conseguir", "apanhar", "o", "comboio")),

            // COSTUMAR – зазвичай, мати звичку
            Sentence("Я зазвичай п'ю каву о десятій", listOf("Eu", "costumo", "beber", "café", "às", "dez")),
            Sentence("Ти зазвичай обідаєш удома?", listOf("Tu", "costumas", "almoçar", "em", "casa?")),
            Sentence("Він зазвичай не працює в неділю", listOf("Ele", "não", "costuma", "trabalhar", "ao", "domingo")),
            Sentence("Ми зазвичай гуляємо після вечері", listOf("Nós", "costumamos", "passear", "depois", "do", "jantar")),
            Sentence("Ви зазвичай їздите на роботу автобусом? (множина)", listOf("Vocês", "costumam", "ir", "para", "o", "trabalho", "de", "autocarro?")),
            Sentence("Вони зазвичай вечеряють пізно (жінки)", listOf("Elas", "costumam", "jantar", "tarde")),
            Sentence("У Португалії зазвичай вечеряють о восьмій", listOf("Em", "Portugal", "costuma-se", "jantar", "às", "oito")),
            Sentence("Раніше я зазвичай вставав рано", listOf("Antes", "eu", "costumava", "levantar-me", "cedo")),
            Sentence("Я зазвичай не дивлюся телевізор", listOf("Eu", "não", "costumo", "ver", "televisão")),

            // ACABAR DE – щойно
            Sentence("Я щойно прийшов додому", listOf("Eu", "acabei", "de", "chegar", "a", "casa")),
            Sentence("Ти щойно поїв?", listOf("Tu", "acabaste", "de", "comer?")),
            Sentence("Вона щойно вийшла", listOf("Ela", "acabou", "de", "sair")),
            Sentence("Ми щойно отримали новину", listOf("Nós", "acabamos", "de", "receber", "a", "notícia")),
            Sentence("Потяг щойно поїхав", listOf("O", "comboio", "acabou", "de", "partir")),
            Sentence("Вони щойно переїхали (чоловіки)", listOf("Eles", "acabaram", "de", "mudar", "de", "casa")),
            Sentence("Я щойно прокинувся, подзвоню пізніше", listOf("Acabei", "de", "acordar,", "ligo", "mais", "tarde")),
            Sentence("Ви щойно приїхали з України? (ввічливо)", listOf("Você", "acabou", "de", "chegar", "da", "Ucrânia?")),
            Sentence("Лікар щойно подзвонив", listOf("O", "médico", "acabou", "de", "ligar")),

            // DEIXAR – дозволяти, залишати
            Sentence("Батьки не дозволяють мені виходити вночі", listOf("Os", "pais", "não", "me", "deixam", "sair", "à", "noite")),
            Sentence("Дай мені хвилинку подумати", listOf("Deixa-me", "pensar", "um", "minuto")),
            Sentence("Я залишив ключі вдома", listOf("Eu", "deixei", "as", "chaves", "em", "casa")),
            Sentence("Залиште повідомлення, будь ласка (ввічливо)", listOf("Deixe", "uma", "mensagem,", "por", "favor")),
            Sentence("Вона дозволяє дітям гратися на вулиці", listOf("Ela", "deixa", "as", "crianças", "brincar", "na", "rua")),
            Sentence("Ти можеш залишити машину тут", listOf("Podes", "deixar", "o", "carro", "aqui")),
            Sentence("Ми кинули палити", listOf("Nós", "deixamos", "de", "fumar")),
            Sentence("Він перестав пити каву", listOf("Ele", "deixou", "de", "beber", "café")),
            Sentence("Не залишай мене самого!", listOf("Não", "me", "deixes", "sozinho!")),

            // У ЖИТТІ
            Sentence("Тут можна фотографувати?", listOf("Pode-se", "tirar", "fotografias", "aqui?")),
            Sentence("Тут не можна паркуватися", listOf("Aqui", "não", "se", "pode", "estacionar")),
            Sentence("Мені треба йти, вже пізно", listOf("Tenho", "de", "ir,", "já", "é", "tarde")),
            Sentence("Хочеш кави чи чаю?", listOf("Queres", "café", "ou", "chá?")),
            Sentence("Я не знаю, що робити", listOf("Eu", "não", "sei", "o", "que", "fazer")),
            Sentence("Ви вмієте водити вантажівку? (ввічливо)", listOf("Você", "sabe", "conduzir", "um", "camião?")),
            Sentence("Мені не потрібна допомога, дякую (жінка)", listOf("Não", "preciso", "de", "ajuda,", "obrigada")),
            Sentence("Ми хотіли б поговорити з директором", listOf("Nós", "queríamos", "falar", "com", "o", "diretor")),
            Sentence("Можете дати мені склянку води? (ввічливо)", listOf("Pode", "dar-me", "um", "copo", "de", "água?")),
            Sentence("Ти обов'язково маєш скуштувати паштел де ната", listOf("Tu", "tens", "de", "provar", "o", "pastel", "de", "nata"))
        )
    }
}

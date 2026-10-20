package ruslan.simakov.pt4ua.data.lessons

import ruslan.simakov.pt4ua.data.RuleTable
import ruslan.simakov.pt4ua.data.Sentence

// Документи, банк і робота в Португалії
object Lesson18 {

    val rules = listOf(
        RuleTable(
            "Документи",
            listOf(
                listOf("Українською", "Português"),
                listOf("податковий номер", "o NIF (número de contribuinte)"),
                listOf("номер соцстраху", "o NISS (Segurança Social)"),
                listOf("міграційна служба", "a AIMA"),
                listOf("податкова", "as Finanças"),
                listOf("центр адмінпослуг", "a Loja do Cidadão"),
                listOf("посвідка на проживання", "a autorização de residência"),
                listOf("тимчасовий захист", "a proteção temporária"),
                listOf("довідка про проживання", "o atestado de residência"),
                listOf("запис на прийом", "a marcação"),
                listOf("талончик у черзі", "a senha")
            )
        ),
        RuleTable(
            "Банк і робота",
            listOf(
                listOf("Українською", "Português"),
                listOf("банківський рахунок", "a conta bancária"),
                listOf("банкомат", "o multibanco"),
                listOf("переказ", "a transferência"),
                listOf("трудовий договір", "o contrato de trabalho"),
                listOf("зарплата", "o salário"),
                listOf("розрахунковий лист", "o recibo de vencimento"),
                listOf("повний / неповний день", "a tempo inteiro / a tempo parcial"),
                listOf("вихідний", "a folga"),
                listOf("відпустка", "as férias")
            ),
            note = "Ввічливо в установі: Queria… (Я хотів би…), Pode…? (Чи можете Ви…?)"
        )
    )

    fun getSentences(): List<Sentence> {
        return listOf(
            // ДОКУМЕНТИ
            Sentence("Мені потрібно отримати NIF", listOf("Preciso", "de", "tirar", "o", "NIF")),
            Sentence("Де можна отримати податковий номер?", listOf("Onde", "posso", "pedir", "o", "número", "de", "contribuinte?")),
            Sentence("У мене тимчасовий захист у Португалії", listOf("Eu", "tenho", "proteção", "temporária", "em", "Portugal")),
            Sentence("Я хотів би записатися на прийом в AIMA", listOf("Queria", "fazer", "uma", "marcação", "na", "AIMA")),
            Sentence("Які документи мені треба принести?", listOf("Que", "documentos", "tenho", "de", "trazer?")),
            Sentence("Ось мій паспорт і договір оренди", listOf("Aqui", "está", "o", "meu", "passaporte", "e", "o", "contrato", "de", "arrendamento")),
            Sentence("Мені потрібна довідка про місце проживання", listOf("Preciso", "de", "um", "atestado", "de", "residência")),
            Sentence("Довідку видають у місцевій раді (Junta de Freguesia)", listOf("O", "atestado", "é", "passado", "na", "Junta", "de", "Freguesia")),
            Sentence("Моя посвідка на проживання закінчується в травні", listOf("A", "minha", "autorização", "de", "residência", "termina", "em", "maio")),
            Sentence("Я хочу продовжити посвідку на проживання", listOf("Quero", "renovar", "a", "autorização", "de", "residência")),
            Sentence("Де найближчий центр адміністративних послуг?", listOf("Onde", "fica", "a", "Loja", "do", "Cidadão", "mais", "próxima?")),
            Sentence("Мені треба взяти талончик?", listOf("Tenho", "de", "tirar", "senha?")),
            Sentence("Який номер зараз обслуговують?", listOf("Que", "número", "está", "a", "ser", "atendido?")),
            Sentence("Де мені треба підписати?", listOf("Onde", "tenho", "de", "assinar?")),
            Sentence("Можете перевірити мої документи? (ввічливо)", listOf("Pode", "verificar", "os", "meus", "documentos?")),
            Sentence("Я не розумію цього листа з податкової", listOf("Não", "percebo", "esta", "carta", "das", "Finanças")),
            Sentence("Мені потрібен номер соціального страхування", listOf("Preciso", "do", "número", "da", "Segurança", "Social")),

            // БАНК
            Sentence("Я хотів би відкрити рахунок у банку", listOf("Queria", "abrir", "uma", "conta", "no", "banco")),
            Sentence("Яка комісія за обслуговування рахунку?", listOf("Qual", "é", "a", "comissão", "de", "manutenção", "da", "conta?")),
            Sentence("Мені потрібна дебетова картка", listOf("Preciso", "de", "um", "cartão", "de", "débito")),
            Sentence("Ось мій IBAN для зарплати", listOf("Aqui", "está", "o", "meu", "IBAN", "para", "o", "salário")),
            Sentence("Банкомат не повернув мою картку", listOf("O", "multibanco", "ficou", "com", "o", "meu", "cartão")),
            Sentence("Я хочу переказати гроші в Україну", listOf("Quero", "transferir", "dinheiro", "para", "a", "Ucrânia")),
            Sentence("Можна заплатити через MB WAY?", listOf("Posso", "pagar", "por", "MB", "WAY?")),
            Sentence("Я забув PIN-код картки", listOf("Esqueci-me", "do", "código", "do", "cartão")),

            // РОБОТА
            Sentence("Я шукаю роботу в Лісабоні", listOf("Estou", "à", "procura", "de", "trabalho", "em", "Lisboa")),
            Sentence("Я працюю на кухні в ресторані", listOf("Trabalho", "na", "cozinha", "de", "um", "restaurante")),
            Sentence("У мене є досвід роботи на складі", listOf("Tenho", "experiência", "de", "trabalho", "num", "armazém")),
            Sentence("Я надіслав резюме вчора", listOf("Enviei", "o", "currículo", "ontem")),
            Sentence("Коли я можу прийти на співбесіду?", listOf("Quando", "posso", "vir", "à", "entrevista?")),
            Sentence("Який графік роботи?", listOf("Qual", "é", "o", "horário", "de", "trabalho?")),
            Sentence("Скільки я заробляватиму на місяць?", listOf("Quanto", "vou", "ganhar", "por", "mês?")),
            Sentence("Чи буде в мене трудовий договір?", listOf("Vou", "ter", "contrato", "de", "trabalho?")),
            Sentence("Договір на один рік, з випробувальним терміном", listOf("O", "contrato", "é", "de", "um", "ano,", "com", "período", "experimental")),
            Sentence("Зарплату виплачують наприкінці місяця", listOf("O", "salário", "é", "pago", "no", "fim", "do", "mês")),
            Sentence("Я працюю повний робочий день", listOf("Trabalho", "a", "tempo", "inteiro")),
            Sentence("Моя дружина працює неповний день", listOf("A", "minha", "mulher", "trabalha", "a", "tempo", "parcial")),
            Sentence("Мені потрібен вихідний у п'ятницю", listOf("Preciso", "de", "folga", "na", "sexta-feira")),
            Sentence("Мій начальник дуже вимогливий, але справедливий", listOf("O", "meu", "chefe", "é", "muito", "exigente,", "mas", "justo")),
            Sentence("Я починаю працювати наступного понеділка", listOf("Começo", "a", "trabalhar", "na", "próxima", "segunda-feira")),
            Sentence("Мені потрібна довідка про доходи", listOf("Preciso", "de", "uma", "declaração", "de", "rendimentos")),
            Sentence("Я хочу вивчити португальську, щоб знайти кращу роботу", listOf("Quero", "aprender", "português", "para", "encontrar", "um", "trabalho", "melhor")),
            Sentence("У серпні я у відпустці", listOf("Em", "agosto", "estou", "de", "férias")),
            Sentence("Я отримую розрахунковий лист щомісяця", listOf("Recebo", "o", "recibo", "de", "vencimento", "todos", "os", "meses")),
            Sentence("Дякую за допомогу, гарного дня (чоловік)", listOf("Obrigado", "pela", "ajuda,", "tenha", "um", "bom", "dia"))
        )
    }
}

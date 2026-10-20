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
            Sentence("Дякую за допомогу, гарного дня (чоловік)", listOf("Obrigado", "pela", "ajuda,", "tenha", "um", "bom", "dia")),

            // ЩЕ ДОКУМЕНТИ
            Sentence("Я хочу подати заяву на посвідку на проживання", listOf("Quero", "pedir", "autorização", "de", "residência")),
            Sentence("Скільки часу триває розгляд?", listOf("Quanto", "tempo", "demora", "o", "processo?")),
            Sentence("Мою заяву ще розглядають", listOf("O", "meu", "pedido", "ainda", "está", "em", "análise")),
            Sentence("Мені потрібно змінити адресу", listOf("Preciso", "de", "atualizar", "a", "morada")),
            Sentence("Я загубив паспорт, що мені робити?", listOf("Perdi", "o", "passaporte,", "o", "que", "devo", "fazer?")),
            Sentence("Де можна зробити копії документів?", listOf("Onde", "posso", "tirar", "fotocópias", "dos", "documentos?")),
            Sentence("Треба перекласти свідоцтво про народження", listOf("É", "preciso", "traduzir", "a", "certidão", "de", "nascimento")),
            Sentence("Документ має бути завірений у нотаріуса", listOf("O", "documento", "tem", "de", "ser", "reconhecido", "no", "notário")),
            Sentence("Я хочу зареєструватися в соціальному страхуванні", listOf("Quero", "inscrever-me", "na", "Segurança", "Social")),
            Sentence("Як отримати номер пацієнта?", listOf("Como", "posso", "obter", "o", "número", "de", "utente?")),
            Sentence("Мені потрібна довідка про несудимість", listOf("Preciso", "do", "registo", "criminal")),
            Sentence("Мій запис скасували", listOf("A", "minha", "marcação", "foi", "cancelada")),
            Sentence("Де можна сплатити збір?", listOf("Onde", "posso", "pagar", "a", "taxa?")),
            Sentence("Я вже надіслав усі документи електронною поштою", listOf("Já", "enviei", "todos", "os", "documentos", "por", "e-mail")),
            Sentence("Мені потрібне підтвердження запису", listOf("Preciso", "do", "comprovativo", "da", "marcação")),
            Sentence("Податкову декларацію подають у квітні", listOf("A", "declaração", "de", "IRS", "entrega-se", "em", "abril")),
            Sentence("Мені потрібна допомога із заповненням форми", listOf("Preciso", "de", "ajuda", "para", "preencher", "o", "formulário")),
            Sentence("Мої діти мають право ходити до школи", listOf("Os", "meus", "filhos", "têm", "direito", "a", "ir", "à", "escola")),
            Sentence("Я хочу записати сина до школи", listOf("Quero", "inscrever", "o", "meu", "filho", "na", "escola")),
            Sentence("Де можна попросити соціальну допомогу?", listOf("Onde", "posso", "pedir", "apoio", "social?")),

            // ЩЕ БАНК
            Sentence("Яка процентна ставка?", listOf("Qual", "é", "a", "taxa", "de", "juro?")),
            Sentence("Я хочу взяти кредит на машину", listOf("Quero", "pedir", "um", "crédito", "para", "o", "carro")),
            Sentence("Мені потрібна виписка з рахунку", listOf("Preciso", "de", "um", "extrato", "da", "conta")),
            Sentence("Моя картка заблокована", listOf("O", "meu", "cartão", "está", "bloqueado")),
            Sentence("Скільки коштує переказ за кордон?", listOf("Quanto", "custa", "uma", "transferência", "para", "o", "estrangeiro?")),
            Sentence("Я хочу зняти двісті євро", listOf("Quero", "levantar", "duzentos", "euros")),
            Sentence("Банкомат не працює", listOf("O", "multibanco", "não", "funciona")),
            Sentence("Мені потрібен доступ до онлайн-банкінгу", listOf("Preciso", "de", "acesso", "ao", "homebanking")),
            Sentence("Гроші ще не надійшли на рахунок", listOf("O", "dinheiro", "ainda", "não", "chegou", "à", "conta")),
            Sentence("Я хочу закрити рахунок", listOf("Quero", "fechar", "a", "conta")),
            Sentence("Можна відкрити рахунок без NIF?", listOf("Posso", "abrir", "conta", "sem", "NIF?")),
            Sentence("Які документи потрібні, щоб відкрити рахунок?", listOf("Que", "documentos", "são", "precisos", "para", "abrir", "conta?")),

            // ЩЕ РОБОТА
            Sentence("Я шукаю роботу офіціантом", listOf("Procuro", "trabalho", "como", "empregado", "de", "mesa")),
            Sentence("Ви наймаєте працівників? (множина)", listOf("Vocês", "estão", "a", "contratar?")),
            Sentence("Я маю досвід роботи доглядальницею", listOf("Tenho", "experiência", "como", "cuidadora")),
            Sentence("Я можу почати з понеділка", listOf("Posso", "começar", "na", "segunda-feira")),
            Sentence("Я працюю на будівництві", listOf("Trabalho", "na", "construção", "civil")),
            Sentence("Моя дружина працює прибиральницею", listOf("A", "minha", "mulher", "trabalha", "nas", "limpezas")),
            Sentence("Скільки годин на тиждень?", listOf("Quantas", "horas", "por", "semana?")),
            Sentence("Понаднормові оплачуються?", listOf("As", "horas", "extra", "são", "pagas?")),
            Sentence("Коли я отримаю першу зарплату?", listOf("Quando", "recebo", "o", "primeiro", "salário?")),
            Sentence("Мені не заплатили за минулий місяць", listOf("Não", "me", "pagaram", "o", "mês", "passado")),
            Sentence("Я хочу звільнитися з наступного місяця", listOf("Quero", "despedir-me", "a", "partir", "do", "próximo", "mês")),
            Sentence("Мене звільнили минулого тижня", listOf("Fui", "despedido", "na", "semana", "passada")),
            Sentence("У мене нічна зміна", listOf("Estou", "no", "turno", "da", "noite")),
            Sentence("Я працюю позмінно в лікарні", listOf("Trabalho", "por", "turnos", "no", "hospital")),
            Sentence("Мені потрібна довідка з роботи", listOf("Preciso", "de", "uma", "declaração", "da", "empresa")),
            Sentence("Я хочу пройти курс португальської", listOf("Quero", "fazer", "um", "curso", "de", "português")),
            Sentence("Мій український диплом визнають?", listOf("O", "meu", "diploma", "ucraniano", "é", "reconhecido?")),
            Sentence("Мені треба нострифікувати диплом", listOf("Preciso", "de", "pedir", "a", "equivalência", "do", "diploma")),
            Sentence("У нас робоча нарада о десятій", listOf("Temos", "uma", "reunião", "de", "trabalho", "às", "dez")),
            Sentence("Можна взяти відпустку в серпні?", listOf("Posso", "tirar", "férias", "em", "agosto?")),
            Sentence("Цього тижня я на лікарняному", listOf("Estou", "de", "baixa", "esta", "semana")),
            Sentence("Скільки днів відпустки в мене на рік?", listOf("Quantos", "dias", "de", "férias", "tenho", "por", "ano?")),
            Sentence("Я працюю на себе", listOf("Trabalho", "por", "conta", "própria"))
        )
    }
}

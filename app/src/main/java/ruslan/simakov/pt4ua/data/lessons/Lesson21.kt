package ruslan.simakov.pt4ua.data.lessons

import ruslan.simakov.pt4ua.data.RuleTable
import ruslan.simakov.pt4ua.data.Sentence

// Житло та побут: оренда, комунальні послуги, ремонт, сусіди
object Lesson21 {

    val rules = listOf(
        RuleTable(
            "Оренда",
            listOf(
                listOf("Українською", "Português"),
                listOf("орендодавець", "o senhorio"),
                listOf("орендар", "o inquilino"),
                listOf("орендна плата", "a renda"),
                listOf("застава", "a caução"),
                listOf("поручитель", "o fiador"),
                listOf("договір оренди", "o contrato de arrendamento"),
                listOf("мебльований", "mobilado"),
                listOf("студія / 1 спальня / 2 спальні", "T0 / T1 / T2")
            ),
            note = "Поверхи рахують інакше: наш перший поверх – o rés-do-chão, другий – o primeiro andar, третій – o segundo andar."
        ),
        RuleTable(
            "Побут",
            listOf(
                listOf("Українською", "Português"),
                listOf("рахунки за світло, воду, газ", "as contas da luz, da água, do gás"),
                listOf("лічильник", "o contador"),
                listOf("поломка", "a avaria"),
                listOf("сантехнік / електрик", "o canalizador / o eletricista"),
                listOf("пральна машина", "a máquina de lavar"),
                listOf("кран", "a torneira"),
                listOf("пліснява", "o bolor"),
                listOf("обігрівач", "o aquecedor"),
                listOf("утримання будинку", "o condomínio"),
                listOf("сміття", "o lixo")
            )
        )
    )

    fun getSentences(): List<Sentence> {
        return listOf(
            // ПОШУК І ОРЕНДА
            Sentence("Я шукаю квартиру з однією спальнею в Лісабоні", listOf("Procuro", "um", "T1", "em", "Lisboa")),
            Sentence("Скільки коштує оренда на місяць?", listOf("Quanto", "é", "a", "renda", "por", "mês?")),
            Sentence("Квартира мебльована?", listOf("O", "apartamento", "é", "mobilado?")),
            Sentence("Комунальні послуги включені в оренду?", listOf("As", "despesas", "estão", "incluídas", "na", "renda?")),
            Sentence("Треба заплатити заставу за два місяці", listOf("É", "preciso", "pagar", "dois", "meses", "de", "caução")),
            Sentence("Мені потрібен поручитель, щоб орендувати?", listOf("Preciso", "de", "fiador", "para", "arrendar?")),
            Sentence("Коли можна подивитися квартиру?", listOf("Quando", "posso", "ver", "o", "apartamento?")),
            Sentence("Скільки спалень у квартирі?", listOf("Quantos", "quartos", "tem", "o", "apartamento?")),
            Sentence("Є ліфт і місце в гаражі?", listOf("Tem", "elevador", "e", "lugar", "de", "garagem?")),
            Sentence("У квартирі багато світла і є балкон", listOf("O", "apartamento", "tem", "muita", "luz", "e", "varanda")),
            Sentence("Я підпишу договір оренди на рік", listOf("Vou", "assinar", "um", "contrato", "de", "arrendamento", "por", "um", "ano")),
            Sentence("Орендодавець живе на першому поверсі", listOf("O", "senhorio", "mora", "no", "rés-do-chão")),
            Sentence("Ми живемо на третьому поверсі без ліфта", listOf("Nós", "moramos", "no", "segundo", "andar", "sem", "elevador")),

            // РАХУНКИ
            Sentence("Мені треба оплатити рахунки за світло і воду", listOf("Tenho", "de", "pagar", "as", "contas", "da", "luz", "e", "da", "água")),
            Sentence("Рахунок за газ цього місяця дуже великий", listOf("A", "conta", "do", "gás", "este", "mês", "está", "muito", "alta")),
            Sentence("Я хотів би підключити інтернет удома", listOf("Queria", "instalar", "internet", "em", "casa")),
            Sentence("Як передати показники лічильника?", listOf("Como", "envio", "a", "leitura", "do", "contador?")),
            Sentence("Світло вимкнули в усьому будинку", listOf("Falhou", "a", "luz", "no", "prédio", "todo")),
            Sentence("Уже два дні немає гарячої води", listOf("Não", "há", "água", "quente", "há", "dois", "dias")),

            // ПОЛОМКИ І РЕМОНТ
            Sentence("Пральна машина не працює", listOf("A", "máquina", "de", "lavar", "não", "funciona")),
            Sentence("На кухні капає кран", listOf("A", "torneira", "da", "cozinha", "está", "a", "pingar")),
            Sentence("Унітаз засмітився", listOf("A", "sanita", "está", "entupida")),
            Sentence("Мені терміново потрібен сантехнік", listOf("Preciso", "de", "um", "canalizador", "com", "urgência")),
            Sentence("Можете прислати електрика? (ввічливо)", listOf("Pode", "mandar", "um", "eletricista?")),
            Sentence("Коли прийде майстер?", listOf("Quando", "vem", "o", "técnico?")),
            Sentence("Хто платить за ремонт: я чи орендодавець?", listOf("Quem", "paga", "a", "reparação,", "eu", "ou", "o", "senhorio?")),
            Sentence("У ванній з'явилася пліснява", listOf("Há", "bolor", "na", "casa", "de", "banho")),
            Sentence("Узимку в квартирі дуже холодно", listOf("No", "inverno", "o", "apartamento", "é", "muito", "frio")),
            Sentence("Мені потрібен обігрівач для спальні", listOf("Preciso", "de", "um", "aquecedor", "para", "o", "quarto")),
            Sentence("Вікна погано зачиняються", listOf("As", "janelas", "não", "fecham", "bem")),

            // СУСІДИ ТА БУДИНОК
            Sentence("Сусіди зверху дуже шумлять уночі", listOf("Os", "vizinhos", "de", "cima", "fazem", "muito", "barulho", "à", "noite")),
            Sentence("Куди викидати сміття на переробку?", listOf("Onde", "ponho", "o", "lixo", "para", "reciclar?")),
            Sentence("Скло – у зелений контейнер", listOf("O", "vidro", "vai", "para", "o", "contentor", "verde")),
            Sentence("Сміття виносять після восьмої вечора", listOf("O", "lixo", "deita-se", "fora", "depois", "das", "oito", "da", "noite")),
            Sentence("Скільки ми платимо за утримання будинку?", listOf("Quanto", "pagamos", "de", "condomínio?")),
            Sentence("Збори мешканців у четвер о сьомій", listOf("A", "reunião", "de", "condomínio", "é", "na", "quinta-feira", "às", "sete")),
            Sentence("Чи можна тримати в квартирі собаку?", listOf("Posso", "ter", "um", "cão", "no", "apartamento?")),

            // ДОМАШНІ СПРАВИ
            Sentence("Я прибираю квартиру щосуботи", listOf("Eu", "limpo", "a", "casa", "todos", "os", "sábados")),
            Sentence("Ти можеш винести сміття?", listOf("Podes", "deitar", "o", "lixo", "fora?")),
            Sentence("Я перу одяг увечері, коли світло дешевше", listOf("Lavo", "a", "roupa", "à", "noite,", "quando", "a", "luz", "é", "mais", "barata")),
            Sentence("Треба купити нову лампочку", listOf("É", "preciso", "comprar", "uma", "lâmpada", "nova")),
            Sentence("Ми переїжджаємо в нову квартиру в березні", listOf("Vamos", "mudar", "de", "casa", "em", "março")),
            Sentence("Я хочу розірвати договір оренди", listOf("Quero", "rescindir", "o", "contrato", "de", "arrendamento")),
            Sentence("Орендодавець має повернути заставу", listOf("O", "senhorio", "tem", "de", "devolver", "a", "caução")),
            Sentence("Нарешті ми почуваємося тут як удома", listOf("Finalmente", "sentimo-nos", "em", "casa", "aqui"))
        )
    }
}

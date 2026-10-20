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
            Sentence("Нарешті ми почуваємося тут як удома", listOf("Finalmente", "sentimo-nos", "em", "casa", "aqui")),

            // ЩЕ ОРЕНДА
            Sentence("Я шукаю кімнату в оренду", listOf("Procuro", "um", "quarto", "para", "arrendar")),
            Sentence("Скільки коштує кімната?", listOf("Quanto", "custa", "o", "quarto?")),
            Sentence("Квартира близько до метро?", listOf("O", "apartamento", "fica", "perto", "do", "metro?")),
            Sentence("Там є пральна машина?", listOf("Tem", "máquina", "de", "lavar?")),
            Sentence("Чи можна тут жити з дітьми?", listOf("Posso", "viver", "aqui", "com", "crianças?")),
            Sentence("Можна з домашніми тваринами?", listOf("Aceitam", "animais", "de", "estimação?")),
            Sentence("На скільки часу договір?", listOf("O", "contrato", "é", "por", "quanto", "tempo?")),
            Sentence("Чи можна зареєструвати тут адресу?", listOf("Posso", "registar", "a", "morada", "aqui?")),
            Sentence("Ви даєте квитанції за оренду? (ввічливо)", listOf("Passa", "recibos", "de", "renda?")),
            Sentence("Оренду платять до восьмого числа", listOf("A", "renda", "paga-se", "até", "ao", "dia", "oito")),
            Sentence("У квартирі є опалення?", listOf("O", "apartamento", "tem", "aquecimento?")),
            Sentence("Скільки приблизно коштують рахунки на місяць?", listOf("Quanto", "são", "as", "despesas", "por", "mês,", "mais", "ou", "menos?")),
            Sentence("Квартиру нещодавно відремонтували", listOf("O", "apartamento", "foi", "renovado", "recentemente")),
            Sentence("Хто живе в сусідніх квартирах?", listOf("Quem", "mora", "nos", "apartamentos", "ao", "lado?")),
            Sentence("Мені подобається ця квартира, я її беру", listOf("Gosto", "deste", "apartamento,", "fico", "com", "ele")),

            // ЩЕ РАХУНКИ
            Sentence("Як змінити постачальника електроенергії?", listOf("Como", "mudo", "de", "fornecedor", "de", "eletricidade?")),
            Sentence("Рахунок за воду приходить раз на два місяці", listOf("A", "conta", "da", "água", "chega", "de", "dois", "em", "dois", "meses")),
            Sentence("Я хотів би укласти договір на газ", listOf("Queria", "fazer", "contrato", "do", "gás")),
            Sentence("Інтернет дуже повільний", listOf("A", "internet", "está", "muito", "lenta")),
            Sentence("Роутер не працює", listOf("O", "router", "não", "funciona")),
            Sentence("Коли прийде технік з інтернету?", listOf("Quando", "vem", "o", "técnico", "da", "internet?")),
            Sentence("Мені треба оплатити рахунок у банкоматі", listOf("Tenho", "de", "pagar", "a", "conta", "no", "multibanco")),
            Sentence("Узимку ми витрачаємо забагато електрики", listOf("Gastamos", "eletricidade", "demais", "no", "inverno")),
            Sentence("Вимикай світло, коли виходиш", listOf("Apaga", "a", "luz", "quando", "sais")),
            Sentence("Я забув заплатити за газ", listOf("Esqueci-me", "de", "pagar", "o", "gás")),
            Sentence("Лічильник на сходах", listOf("O", "contador", "está", "nas", "escadas")),
            Sentence("На кухні немає світла", listOf("Não", "há", "luz", "na", "cozinha")),

            // ЩЕ ПОЛОМКИ І РЕМОНТ
            Sentence("Протікає дах", listOf("O", "telhado", "tem", "infiltrações")),
            Sentence("На стелі пляма від води", listOf("Há", "uma", "mancha", "de", "água", "no", "teto")),
            Sentence("Холодильник не охолоджує", listOf("O", "frigorífico", "não", "arrefece")),
            Sentence("Духовка не вмикається", listOf("O", "forno", "não", "liga")),
            Sentence("Двері не замикаються на ключ", listOf("A", "porta", "não", "fecha", "à", "chave")),
            Sentence("Я загубив ключі від квартири", listOf("Perdi", "as", "chaves", "de", "casa")),
            Sentence("Мені потрібен слюсар", listOf("Preciso", "de", "um", "serralheiro")),
            Sentence("Злив у душі засмічений", listOf("O", "ralo", "do", "duche", "está", "entupido")),
            Sentence("У квартирі таргани", listOf("Há", "baratas", "no", "apartamento")),
            Sentence("Можете полагодити це до п'ятниці? (ввічливо)", listOf("Pode", "arranjar", "isto", "até", "sexta-feira?")),
            Sentence("Скільки коштуватиме ремонт?", listOf("Quanto", "vai", "custar", "a", "reparação?")),
            Sentence("Я сам пофарбую стіни", listOf("Eu", "próprio", "pinto", "as", "paredes")),
            Sentence("Треба поміняти замок", listOf("É", "preciso", "mudar", "a", "fechadura")),
            Sentence("Вікно розбите", listOf("A", "janela", "está", "partida")),

            // ЩЕ СУСІДИ ТА ПОБУТ
            Sentence("Ми нові сусіди з третього поверху", listOf("Somos", "os", "novos", "vizinhos", "do", "segundo", "andar")),
            Sentence("Будь ласка, не шуміть після десятої (множина)", listOf("Por", "favor,", "não", "façam", "barulho", "depois", "das", "dez")),
            Sentence("Ліфт не працює вже тиждень", listOf("O", "elevador", "está", "avariado", "há", "uma", "semana")),
            Sentence("Хто прибирає сходи?", listOf("Quem", "limpa", "as", "escadas?")),
            Sentence("Можна залишити велосипед біля входу в будинок?", listOf("Posso", "deixar", "a", "bicicleta", "à", "entrada", "do", "prédio?")),
            Sentence("Пластик – у жовтий контейнер", listOf("O", "plástico", "vai", "para", "o", "contentor", "amarelo")),
            Sentence("Папір – у синій контейнер", listOf("O", "papel", "vai", "para", "o", "contentor", "azul")),
            Sentence("Великі речі вивозять у визначений день", listOf("Os", "monos", "são", "recolhidos", "num", "dia", "marcado")),
            Sentence("Я перу одяг щодня", listOf("Lavo", "roupa", "todos", "os", "dias")),
            Sentence("Де можна розвісити білизну?", listOf("Onde", "posso", "estender", "a", "roupa?")),
            Sentence("Я прасую сорочки в неділю", listOf("Passo", "as", "camisas", "a", "ferro", "ao", "domingo")),
            Sentence("Треба помити посуд", listOf("É", "preciso", "lavar", "a", "loiça")),
            Sentence("Ми купили нові меблі для вітальні", listOf("Nós", "compramos", "móveis", "novos", "para", "a", "sala")),
            Sentence("Вітаю з новосіллям!", listOf("Parabéns", "pela", "casa", "nova!"))
        )
    }
}

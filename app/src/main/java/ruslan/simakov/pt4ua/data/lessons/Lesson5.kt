package ruslan.simakov.pt4ua.data.lessons

import ruslan.simakov.pt4ua.data.Sentence

object Lesson5 {

    fun getSentences(): List<Sentence> {
        return listOf(
            // VERBOS EM -ER (Presente)
            // COMER - їсти
            Sentence("Я їм суп на обід", listOf("Eu", "como", "sopa", "ao", "almoço")),
            Sentence("Ти їси м'ясо чи рибу?", listOf("Tu", "comes", "carne", "ou", "peixe?")),
            Sentence("Він їсть фрукти щоранку", listOf("Ele", "come", "fruta", "todas", "as", "manhãs")),
            Sentence("Ми їмо разом по неділях", listOf("Nós", "comemos", "juntos", "ao", "domingo")),
            Sentence("Вони їдять у ресторані по п'ятницях", listOf("Eles", "comem", "num", "restaurante", "às", "sextas-feiras")),

            // BEBER - пити
            Sentence("Я п'ю каву з молоком уранці", listOf("Eu", "bebo", "café", "com", "leite", "de", "manhã")),
            Sentence("Ти п'єш багато води влітку?", listOf("Tu", "bebes", "muita", "água", "no", "verão?")),
            Sentence("Вона п'є чай без цукру", listOf("Ela", "bebe", "chá", "sem", "açúcar")),
            Sentence("Ми п'ємо вино тільки на свята", listOf("Nós", "bebemos", "vinho", "só", "nas", "festas")),
            Sentence("Вони п'ють сік на сніданок", listOf("Eles", "bebem", "sumo", "ao", "pequeno-almoço")),

            // VERBOS EM -IR (Presente)
            // PARTIR - від'їжджати / розбивати
            Sentence("Я від'їжджаю до Порту завтра вранці", listOf("Eu", "parto", "para", "o", "Porto", "amanhã", "de", "manhã")),
            Sentence("Ти від'їжджаєш сьогодні ввечері?", listOf("Tu", "partes", "hoje", "à", "noite?")),
            Sentence("Він від'їжджає о сьомій годині", listOf("Ele", "parte", "às", "sete", "horas")),
            Sentence("Ми від'їжджаємо у відпустку в п'ятницю", listOf("Nós", "partimos", "de", "férias", "na", "sexta-feira")),
            Sentence("Вони від'їжджають зі станції Оріенте", listOf("Eles", "partem", "da", "estação", "do", "Oriente")),

            // ABRIR - відкривати
            Sentence("Я відчиняю вікно, бо тут жарко", listOf("Eu", "abro", "a", "janela", "porque", "está", "calor")),
            Sentence("Ти відчиняєш двері гостям?", listOf("Tu", "abres", "a", "porta", "aos", "convidados?")),
            Sentence("Вона відкриває магазин о дев'ятій", listOf("Ela", "abre", "a", "loja", "às", "nove")),
            Sentence("Ми відкриваємо подарунки на Різдво", listOf("Nós", "abrimos", "os", "presentes", "no", "Natal")),
            Sentence("Вони відкривають рахунок у банку", listOf("Eles", "abrem", "uma", "conta", "no", "banco")),

            // VERBOS EM -ER (Pretérito Perfeito - Минулий час)
            // COMER
            Sentence("Я з'їв увесь торт учора", listOf("Eu", "comi", "o", "bolo", "todo", "ontem")),
            Sentence("Ти вже з'їв сніданок?", listOf("Tu", "já", "comeste", "o", "pequeno-almoço?")),
            Sentence("Він з'їв дві тарілки супу", listOf("Ele", "comeu", "dois", "pratos", "de", "sopa")),
            Sentence("Ми їли рибу в ресторані на пляжі", listOf("Nós", "comemos", "peixe", "num", "restaurante", "na", "praia")),
            Sentence("Вони з'їли всі тістечка", listOf("Eles", "comeram", "todos", "os", "bolos")),

            // VERBOS EM -IR (Pretérito Perfeito - Минулий час)
            // ABRIR
            Sentence("Я відкрив лист від мами", listOf("Eu", "abri", "a", "carta", "da", "mãe")),
            Sentence("Ти відчинив вікно в спальні?", listOf("Tu", "abriste", "a", "janela", "do", "quarto?")),
            Sentence("Вона відкрила нове кафе в Лісабоні", listOf("Ela", "abriu", "um", "café", "novo", "em", "Lisboa")),
            Sentence("Ми відкрили пляшку вина на святі", listOf("Nós", "abrimos", "uma", "garrafa", "de", "vinho", "na", "festa")),
            Sentence("Вони відчинили двері й увійшли", listOf("Eles", "abriram", "a", "porta", "e", "entraram")),

            // FRASES ÚTEIS
            Sentence("Я п'ю каву щоранку перед роботою", listOf("Eu", "bebo", "café", "todas", "as", "manhãs", "antes", "do", "trabalho")),
            Sentence("Ми їмо хліб із сиром на вечерю", listOf("Nós", "comemos", "pão", "com", "queijo", "ao", "jantar")),
            Sentence("Він відчиняє двері своїм ключем", listOf("Ele", "abre", "a", "porta", "com", "a", "sua", "chave")),
            Sentence("Вони вже від'їхали до аеропорту", listOf("Eles", "já", "partiram", "para", "o", "aeroporto"))
        )
    }
}

package ruslan.simakov.pt4ua.data.lessons

import ruslan.simakov.pt4ua.data.RuleTable
import ruslan.simakov.pt4ua.data.Sentence

// Кафе, ресторан і магазин
object Lesson19 {

    val rules = listOf(
        RuleTable(
            "Кафе і ресторан",
            listOf(
                listOf("Português", "Українською"),
                listOf("uma bica", "маленька чорна кава (еспресо)"),
                listOf("um galão", "кава з молоком у склянці"),
                listOf("uma meia de leite", "кава з молоком у чашці"),
                listOf("uma tosta mista", "гарячий бутерброд з шинкою і сиром"),
                listOf("um pastel de nata", "тістечко із заварним кремом"),
                listOf("a esplanada", "тераса"),
                listOf("a ementa", "меню"),
                listOf("o prato do dia", "страва дня"),
                listOf("a conta", "рахунок"),
                listOf("a gorjeta", "чайові")
            ),
            note = "Ввічливе замовлення: Queria… / Vou querer… / Pode trazer…?"
        ),
        RuleTable(
            "Магазин",
            listOf(
                listOf("Português", "Українською"),
                listOf("a padaria", "пекарня"),
                listOf("o talho", "м'ясна крамниця"),
                listOf("a peixaria", "рибна крамниця"),
                listOf("o tamanho", "розмір"),
                listOf("o provador", "примірочна"),
                listOf("os saldos", "розпродаж"),
                listOf("o talão", "чек"),
                listOf("fatura com contribuinte", "чек з податковим номером (NIF)")
            )
        )
    )

    fun getSentences(): List<Sentence> {
        return listOf(
            // КАФЕ
            Sentence("Одне еспресо й одне тістечко паштел де ната, будь ласка", listOf("Uma", "bica", "e", "um", "pastel", "de", "nata,", "por", "favor")),
            Sentence("Я хотів би каву з молоком у склянці, будь ласка", listOf("Queria", "um", "galão,", "por", "favor")),
            Sentence("Гарячий бутерброд з шинкою і сиром, будь ласка", listOf("Uma", "tosta", "mista,", "por", "favor")),
            Sentence("Скільки з мене за все разом?", listOf("Quanto", "é", "tudo", "junto?")),
            Sentence("Можна заплатити карткою?", listOf("Posso", "pagar", "com", "cartão?")),
            Sentence("Вам чек з податковим номером? (ввічливо)", listOf("Quer", "fatura", "com", "contribuinte?")),
            Sentence("Так, ось мій податковий номер", listOf("Sim,", "aqui", "está", "o", "meu", "número", "de", "contribuinte")),
            Sentence("У Вас є вільний столик на терасі? (ввічливо)", listOf("Tem", "uma", "mesa", "livre", "na", "esplanada?")),

            // РЕСТОРАН
            Sentence("Я забронював столик на ім'я Петренко", listOf("Reservei", "uma", "mesa", "em", "nome", "de", "Petrenko")),
            Sentence("Можна меню, будь ласка?", listOf("Pode", "trazer", "a", "ementa,", "por", "favor?")),
            Sentence("Яка сьогодні страва дня?", listOf("Qual", "é", "o", "prato", "do", "dia?")),
            Sentence("Що Ви мені порадите? (ввічливо)", listOf("O", "que", "me", "aconselha?")),
            Sentence("Я візьму тріску з картоплею", listOf("Vou", "querer", "bacalhau", "com", "batatas")),
            Sentence("Мені смажені сардини", listOf("Para", "mim,", "sardinhas", "assadas")),
            Sentence("Без цибулі, будь ласка, у мене алергія (жінка)", listOf("Sem", "cebola,", "por", "favor,", "sou", "alérgica")),
            Sentence("У Вас є вегетаріанська страва? (ввічливо)", listOf("Tem", "algum", "prato", "vegetariano?")),
            Sentence("Пляшку води без газу, будь ласка", listOf("Uma", "garrafa", "de", "água", "sem", "gás,", "por", "favor")),
            Sentence("Келих червоного вина для мене", listOf("Um", "copo", "de", "vinho", "tinto", "para", "mim")),
            Sentence("Можна ще хліба?", listOf("Pode", "trazer", "mais", "pão?")),
            Sentence("Було дуже смачно, дякую (чоловік)", listOf("Estava", "muito", "bom,", "obrigado")),
            Sentence("Рахунок, будь ласка", listOf("A", "conta,", "por", "favor")),
            Sentence("У рахунку помилка", listOf("Há", "um", "erro", "na", "conta")),
            Sentence("Чайові включені?", listOf("A", "gorjeta", "está", "incluída?")),
            Sentence("Можна забрати решту з собою?", listOf("Posso", "levar", "o", "resto", "para", "casa?")),

            // МАГАЗИН І РИНОК
            Sentence("Де можна купити свіжу рибу?", listOf("Onde", "posso", "comprar", "peixe", "fresco?")),
            Sentence("Пів кіло фаршу, будь ласка", listOf("Meio", "quilo", "de", "carne", "picada,", "por", "favor")),
            Sentence("Я хотів би десяток яєць", listOf("Queria", "uma", "dúzia", "de", "ovos")),
            Sentence("Цей хліб свіжий?", listOf("Este", "pão", "é", "fresco?")),
            Sentence("Де молочні продукти?", listOf("Onde", "ficam", "os", "lacticínios?")),
            Sentence("Мені потрібен пакет", listOf("Preciso", "de", "um", "saco")),
            Sentence("Можна приміряти цю сорочку?", listOf("Posso", "experimentar", "esta", "camisa?")),
            Sentence("Де примірочна?", listOf("Onde", "é", "o", "provador?")),
            Sentence("У Вас є це в розмірі M? (ввічливо)", listOf("Tem", "isto", "no", "tamanho", "M?")),
            Sentence("Це завелике, мені потрібен менший розмір", listOf("É", "grande", "demais,", "preciso", "de", "um", "tamanho", "mais", "pequeno")),
            Sentence("Ці черевики дуже зручні", listOf("Estes", "sapatos", "são", "muito", "confortáveis")),
            Sentence("Скільки коштують ці джинси?", listOf("Quanto", "custam", "estas", "calças", "de", "ganga?")),
            Sentence("Ці речі зі знижкою?", listOf("Estas", "peças", "estão", "em", "saldo?")),
            Sentence("Я просто дивлюся, дякую (чоловік)", listOf("Estou", "só", "a", "ver,", "obrigado")),
            Sentence("Можна обміняти, якщо не підійде?", listOf("Posso", "trocar", "se", "não", "servir?")),
            Sentence("Мені потрібен чек для обміну", listOf("Preciso", "do", "talão", "para", "a", "troca")),
            Sentence("Можете запакувати як подарунок? (ввічливо)", listOf("Pode", "embrulhar", "para", "presente,", "por", "favor?")),
            Sentence("О котрій зачиняється супермаркет?", listOf("A", "que", "horas", "fecha", "o", "supermercado?")),
            Sentence("Я шукаю аптеку або супермаркет поблизу", listOf("Procuro", "uma", "farmácia", "ou", "um", "supermercado", "aqui", "perto")),
            Sentence("Тут приймають тільки готівку?", listOf("Aqui", "só", "aceitam", "dinheiro?")),
            Sentence("Дякую, до побачення, гарного дня (чоловік)", listOf("Obrigado,", "adeus,", "bom", "dia"))
        )
    }
}

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
            Sentence("Дякую, до побачення, гарного дня (чоловік)", listOf("Obrigado,", "adeus,", "bom", "dia")),

            // ЩЕ КАФЕ
            Sentence("Дві кави з молоком і два тости", listOf("Dois", "galões", "e", "duas", "torradas")),
            Sentence("Один чай з лимоном, будь ласка", listOf("Um", "chá", "de", "limão,", "por", "favor")),
            Sentence("Ще одну воду, будь ласка", listOf("Mais", "uma", "água,", "por", "favor")),
            Sentence("У Вас є безлактозне молоко? (ввічливо)", listOf("Tem", "leite", "sem", "lactose?")),
            Sentence("Це з собою, не тут", listOf("É", "para", "levar,", "não", "é", "para", "aqui")),
            Sentence("Який пароль від вайфаю?", listOf("Qual", "é", "a", "palavra-passe", "do", "wi-fi?")),
            Sentence("Свіжий апельсиновий сік, будь ласка", listOf("Um", "sumo", "de", "laranja", "natural,", "por", "favor")),
            Sentence("Що у Вас є на сніданок? (ввічливо)", listOf("O", "que", "tem", "para", "o", "pequeno-almoço?")),
            Sentence("Без цукру, будь ласка", listOf("Sem", "açúcar,", "por", "favor")),
            Sentence("Цей столик вільний?", listOf("Esta", "mesa", "está", "livre?")),
            Sentence("Можна тут зарядити телефон?", listOf("Posso", "carregar", "o", "telemóvel", "aqui?")),
            Sentence("Скільки коштує паштел де ната?", listOf("Quanto", "custa", "um", "pastel", "de", "nata?")),

            // ЩЕ РЕСТОРАН
            Sentence("Столик на чотирьох, будь ласка", listOf("Uma", "mesa", "para", "quatro,", "por", "favor")),
            Sentence("Можна нам сісти на терасі?", listOf("Podemos", "sentar-nos", "na", "esplanada?")),
            Sentence("Що це за страва?", listOf("Que", "prato", "é", "este?")),
            Sentence("Ця страва дуже гостра?", listOf("Este", "prato", "é", "muito", "picante?")),
            Sentence("Я візьму суп дня і салат", listOf("Vou", "querer", "a", "sopa", "do", "dia", "e", "uma", "salada")),
            Sentence("У Вас є дитяче меню? (ввічливо)", listOf("Tem", "menu", "para", "crianças?")),
            Sentence("Стейк добре просмажений, будь ласка", listOf("O", "bife", "bem", "passado,", "por", "favor")),
            Sentence("Можна без солі?", listOf("Pode", "ser", "sem", "sal?")),
            Sentence("Це не те, що я замовляв", listOf("Isto", "não", "é", "o", "que", "eu", "pedi")),
            Sentence("Суп холодний", listOf("A", "sopa", "está", "fria")),
            Sentence("Можна ще серветок?", listOf("Pode", "trazer", "mais", "guardanapos?")),
            Sentence("Що у Вас на десерт? (ввічливо)", listOf("O", "que", "tem", "de", "sobremesa?")),
            Sentence("Дві кави наприкінці, будь ласка", listOf("Dois", "cafés", "no", "fim,", "por", "favor")),
            Sentence("Можна розділити рахунок?", listOf("Podemos", "dividir", "a", "conta?")),
            Sentence("Сьогодні я плачу за всіх", listOf("Hoje", "eu", "pago", "para", "todos")),
            Sentence("Усе було чудово, дякую (чоловік)", listOf("Estava", "tudo", "ótimo,", "obrigado")),
            Sentence("Можна забронювати столик на суботу?", listOf("Posso", "reservar", "uma", "mesa", "para", "sábado?")),
            Sentence("Ви приймаєте картку чи тільки готівку? (ввічливо)", listOf("Aceita", "cartão", "ou", "só", "dinheiro?")),

            // ЩЕ МАГАЗИН І РИНОК
            Sentence("Де можна купити українські продукти?", listOf("Onde", "posso", "comprar", "produtos", "ucranianos?")),
            Sentence("Кілограм помідорів, будь ласка", listOf("Um", "quilo", "de", "tomates,", "por", "favor")),
            Sentence("Це свіже чи заморожене?", listOf("Isto", "é", "fresco", "ou", "congelado?")),
            Sentence("Можна скуштувати цей сир?", listOf("Posso", "provar", "este", "queijo?")),
            Sentence("Можете нарізати скибочками? (ввічливо)", listOf("Pode", "cortar", "às", "fatias,", "por", "favor?")),
            Sentence("Двісті грамів шинки", listOf("Duzentos", "gramas", "de", "fiambre")),
            Sentence("Де хліб без глютену?", listOf("Onde", "está", "o", "pão", "sem", "glúten?")),
            Sentence("Ця акція діє до неділі?", listOf("Esta", "promoção", "é", "válida", "até", "domingo?")),
            Sentence("Друга одиниця за пів ціни", listOf("A", "segunda", "unidade", "é", "a", "metade", "do", "preço")),
            Sentence("У Вас є картка клієнта? (ввічливо)", listOf("Tem", "cartão", "de", "cliente?")),
            Sentence("Каса самообслуговування не працює", listOf("A", "caixa", "automática", "não", "funciona")),
            Sentence("Мені потрібен більший пакет", listOf("Preciso", "de", "um", "saco", "maior")),
            Sentence("Скільки коштує цей светр?", listOf("Quanto", "custa", "esta", "camisola?")),
            Sentence("Є такий самий, але синій?", listOf("Tem", "igual,", "mas", "em", "azul?")),
            Sentence("Ці штани замалі", listOf("Estas", "calças", "são", "pequenas", "demais")),
            Sentence("Можна приміряти на розмір більше?", listOf("Posso", "experimentar", "um", "tamanho", "acima?")),
            Sentence("Я хотів би повернути цю річ", listOf("Queria", "devolver", "esta", "peça")),
            Sentence("Ось чек", listOf("Aqui", "está", "o", "talão")),
            Sentence("Можна обміняти на інший колір?", listOf("Posso", "trocar", "por", "outra", "cor?")),
            Sentence("Коли починається розпродаж?", listOf("Quando", "começam", "os", "saldos?")),
            Sentence("Я шукаю подарунок для дружини", listOf("Procuro", "um", "presente", "para", "a", "minha", "mulher")),
            Sentence("Це задорого для мене", listOf("Isso", "é", "caro", "demais", "para", "mim")),
            Sentence("Ви доставляєте додому? (множина)", listOf("Fazem", "entregas", "ao", "domicílio?")),
            Sentence("Де найближчий ринок?", listOf("Onde", "fica", "o", "mercado", "mais", "próximo?")),
            Sentence("Ринок працює тільки зранку", listOf("O", "mercado", "só", "abre", "de", "manhã"))
        )
    }
}

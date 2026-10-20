package ruslan.simakov.pt4ua.data.lessons

import ruslan.simakov.pt4ua.data.RuleTable
import ruslan.simakov.pt4ua.data.Sentence

object Lesson2 {

    val rules = listOf(
        RuleTable(
            "Минулий час: дієслова на -AR",
            listOf(
                listOf("", "Закінчення", "AMAR", "TRABALHAR"),
                listOf("eu", "-ei", "amei", "trabalhei"),
                listOf("tu", "-aste", "amaste", "trabalhaste"),
                listOf("você, ele, ela", "-ou", "amou", "trabalhou"),
                listOf("nós", "-amos", "amamos", "trabalhamos"),
                listOf("vocês, eles, elas", "-aram", "amaram", "trabalharam")
            ),
            note = "Форма nós однакова в теперішньому й минулому часі: trabalhamos. " +
                "Що це минуле, підказують слова ontem, no ano passado."
        ),
        RuleTable(
            "Заперечення",
            listOf(
                listOf("+", "–"),
                listOf("Eu trabalhei ontem", "Eu não trabalhei ontem"),
                listOf("Ela comprou pão", "Ela não comprou pão"),
                listOf("Tu ajudaste-me", "Tu não me ajudaste")
            ),
            note = "Não стоїть перед дієсловом. Займенник (me, te, nos) після não переходить перед дієслово."
        ),
        RuleTable(
            "Особливості написання (форма eu)",
            listOf(
                listOf("Закінчення", "Приклад"),
                listOf("-car → -quei", "explicar → expliquei"),
                listOf("-gar → -guei", "pagar → paguei"),
                listOf("-çar → -cei", "começar → comecei")
            )
        ),
        RuleTable(
            "Коли?",
            listOf(
                listOf("Українською", "Português"),
                listOf("учора", "ontem"),
                listOf("учора ввечері", "ontem à noite"),
                listOf("сьогодні вранці", "esta manhã"),
                listOf("минулої суботи", "no sábado passado"),
                listOf("минулого тижня", "na semana passada"),
                listOf("минулого місяця", "no mês passado"),
                listOf("минулого року", "no ano passado"),
                listOf("два дні тому", "há dois dias")
            )
        )
    )
    fun getSentences(): List<Sentence> {
        // 10 verbs × 5 pairs (statement + negation); the persons rotate so each one appears 5–6 times
        return listOf(
            // AMAR – любити
            Sentence("Я любила цю квартиру всі ці роки", listOf("Eu", "amei", "este", "apartamento", "durante", "todos", "estes", "anos")),
            Sentence("Я не любила того хлопця", listOf("Eu", "não", "amei", "aquele", "rapaz")),
            Sentence("Ви любили свою роботу в Україні? (ввічливо)", listOf("Você", "amou", "o", "seu", "trabalho", "na", "Ucrânia?")),
            Sentence("Ви не любили це місто? (ввічливо)", listOf("Você", "não", "amou", "esta", "cidade?")),
            Sentence("Вона любила свого чоловіка до кінця життя", listOf("Ela", "amou", "o", "marido", "até", "ao", "fim", "da", "vida")),
            Sentence("Вона не любила свого першого чоловіка", listOf("Ela", "não", "amou", "o", "primeiro", "marido")),
            Sentence("Вони любили свою країну все життя (чоловіки)", listOf("Eles", "amaram", "o", "seu", "país", "toda", "a", "vida")),
            Sentence("Вони не любили ту роботу на фабриці (чоловіки)", listOf("Eles", "não", "amaram", "aquele", "trabalho", "na", "fábrica")),
            Sentence("Вони любили своїх дітей понад усе (жінки)", listOf("Elas", "amaram", "os", "filhos", "acima", "de", "tudo")),
            Sentence("Вони не любили життя у великому місті (жінки)", listOf("Elas", "não", "amaram", "a", "vida", "na", "cidade", "grande")),

            // AJUDAR – допомагати
            Sentence("Учора я допомагав мамі на кухні", listOf("Ontem", "eu", "ajudei", "a", "minha", "mãe", "na", "cozinha")),
            Sentence("Я не допоміг братові з домашнім завданням", listOf("Eu", "não", "ajudei", "o", "meu", "irmão", "com", "os", "trabalhos", "de", "casa")),
            Sentence("Ти допоміг другові з переїздом", listOf("Tu", "ajudaste", "o", "teu", "amigo", "com", "a", "mudança")),
            Sentence("Ти не допоміг мені вчора", listOf("Tu", "não", "me", "ajudaste", "ontem")),
            Sentence("У суботу він допоміг сусідам", listOf("No", "sábado", "ele", "ajudou", "os", "vizinhos")),
            Sentence("Він не допоміг батькові в саду", listOf("Ele", "não", "ajudou", "o", "pai", "no", "jardim")),
            Sentence("Ми допомогли туристам на вокзалі", listOf("Nós", "ajudamos", "os", "turistas", "na", "estação")),
            Sentence("Ми не допомогли їм із багажем", listOf("Nós", "não", "os", "ajudamos", "com", "a", "bagagem")),
            Sentence("Ви допомогли бабусі вчора ввечері (множина)", listOf("Vocês", "ajudaram", "a", "avó", "ontem", "à", "noite")),
            Sentence("Ви не допомогли вчителю після уроку (множина)", listOf("Vocês", "não", "ajudaram", "o", "professor", "depois", "da", "aula")),

            // VISITAR – відвідувати
            Sentence("Минулого літа я відвідав бабусю в Україні", listOf("No", "verão", "passado", "eu", "visitei", "a", "avó", "na", "Ucrânia")),
            Sentence("Я не відвідав музей у Лісабоні", listOf("Eu", "não", "visitei", "o", "museu", "em", "Lisboa")),
            Sentence("Ви відвідали замок у Сінтрі? (ввічливо)", listOf("Você", "visitou", "o", "castelo", "em", "Sintra?")),
            Sentence("Ви не відвідали нашу виставку (ввічливо)", listOf("Você", "não", "visitou", "a", "nossa", "exposição")),
            Sentence("Вона відвідала багато країн Європи", listOf("Ela", "visitou", "muitos", "países", "da", "Europa")),
            Sentence("Вона не відвідала подругу в неділю", listOf("Ela", "não", "visitou", "a", "amiga", "no", "domingo")),
            Sentence("Вони відвідали ринок у суботу вранці (чоловіки)", listOf("Eles", "visitaram", "o", "mercado", "no", "sábado", "de", "manhã")),
            Sentence("Вони не відвідали родичів цього року (чоловіки)", listOf("Eles", "não", "visitaram", "os", "familiares", "este", "ano")),
            Sentence("Вони відвідали Алгарве в серпні (жінки)", listOf("Elas", "visitaram", "o", "Algarve", "em", "agosto")),
            Sentence("Вони не відвідали жодного музею (жінки)", listOf("Elas", "não", "visitaram", "nenhum", "museu")),

            // TRABALHAR – працювати
            Sentence("Ти працював у ресторані минулого літа", listOf("Tu", "trabalhaste", "num", "restaurante", "no", "verão", "passado")),
            Sentence("Ти не працював учора ввечері?", listOf("Tu", "não", "trabalhaste", "ontem", "à", "noite?")),
            Sentence("Ви працювали вчителем в Україні? (ввічливо)", listOf("Você", "trabalhou", "como", "professor", "na", "Ucrânia?")),
            Sentence("Ви не працювали цього тижня (ввічливо)", listOf("Você", "não", "trabalhou", "esta", "semana")),
            Sentence("Він працював на фабриці десять років", listOf("Ele", "trabalhou", "numa", "fábrica", "durante", "dez", "anos")),
            Sentence("Він не працював у понеділок", listOf("Ele", "não", "trabalhou", "na", "segunda-feira")),
            Sentence("Ми працювали разом у тій компанії", listOf("Nós", "trabalhamos", "juntos", "naquela", "empresa")),
            Sentence("Ми не працювали на Різдво", listOf("Nós", "não", "trabalhamos", "no", "Natal")),
            Sentence("Ви працювали допізна вчора? (множина)", listOf("Vocês", "trabalharam", "até", "tarde", "ontem?")),
            Sentence("Ви не працювали в суботу (множина)", listOf("Vocês", "não", "trabalharam", "no", "sábado")),

            // COMPRAR – купувати
            Sentence("Я купив новий телефон учора", listOf("Eu", "comprei", "um", "telemóvel", "novo", "ontem")),
            Sentence("Я не купив хліба сьогодні вранці", listOf("Eu", "não", "comprei", "pão", "esta", "manhã")),
            Sentence("Ти купив квитки на потяг?", listOf("Tu", "compraste", "os", "bilhetes", "para", "o", "comboio?")),
            Sentence("Ти не купив молока в магазині", listOf("Tu", "não", "compraste", "leite", "na", "loja")),
            Sentence("Вона купила квіти для мами", listOf("Ela", "comprou", "flores", "para", "a", "mãe")),
            Sentence("Вона не купила ту дорогу сумку", listOf("Ela", "não", "comprou", "aquela", "mala", "cara")),
            Sentence("Вони купили велосипеди для дітей (чоловіки)", listOf("Eles", "compraram", "bicicletas", "para", "os", "filhos")),
            Sentence("Вони не купили газету сьогодні (чоловіки)", listOf("Eles", "não", "compraram", "o", "jornal", "hoje")),
            Sentence("Вони купили новий диван для вітальні (жінки)", listOf("Elas", "compraram", "um", "sofá", "novo", "para", "a", "sala")),
            Sentence("Вони нічого не купили на розпродажі (жінки)", listOf("Elas", "não", "compraram", "nada", "nos", "saldos")),

            // PERGUNTAR – питати
            Sentence("Ви запитали лікаря про ліки? (ввічливо)", listOf("Você", "perguntou", "ao", "médico", "sobre", "os", "medicamentos?")),
            Sentence("Ви не запитали його номер телефону (ввічливо)", listOf("Você", "não", "perguntou", "o", "número", "de", "telefone", "dele")),
            Sentence("Він запитав, котра година", listOf("Ele", "perguntou", "que", "horas", "eram")),
            Sentence("Він не питав мене про роботу", listOf("Ele", "não", "me", "perguntou", "sobre", "o", "trabalho")),
            Sentence("Вона запитала, де зупинка автобуса", listOf("Ela", "perguntou", "onde", "fica", "a", "paragem", "do", "autocarro")),
            Sentence("Вона нічого не запитала на співбесіді", listOf("Ela", "não", "perguntou", "nada", "na", "entrevista")),
            Sentence("Ми запитали офіціанта про меню", listOf("Nós", "perguntamos", "ao", "empregado", "sobre", "o", "menu")),
            Sentence("Ми не запитали, скільки коштує квиток", listOf("Nós", "não", "perguntamos", "quanto", "custa", "o", "bilhete")),
            Sentence("Ви запитали дорогу в поліцейського? (множина)", listOf("Vocês", "perguntaram", "o", "caminho", "ao", "polícia?")),
            Sentence("Ви не запитали про розклад потягів (множина)", listOf("Vocês", "não", "perguntaram", "pelo", "horário", "dos", "comboios")),

            // EXPLICAR – пояснювати
            Sentence("Я пояснив правило ще раз", listOf("Eu", "expliquei", "a", "regra", "outra", "vez")),
            Sentence("Я не пояснив проблему начальнику", listOf("Eu", "não", "expliquei", "o", "problema", "ao", "chefe")),
            Sentence("Ти пояснив дорогу туристам?", listOf("Tu", "explicaste", "o", "caminho", "aos", "turistas?")),
            Sentence("Ти не пояснив мені, що сталося", listOf("Tu", "não", "me", "explicaste", "o", "que", "aconteceu")),
            Sentence("Він пояснив урок дуже добре", listOf("Ele", "explicou", "a", "lição", "muito", "bem")),
            Sentence("Він не пояснив нам нове завдання", listOf("Ele", "não", "nos", "explicou", "a", "nova", "tarefa")),
            Sentence("Вони пояснили мені, як працює кавоварка (чоловіки)", listOf("Eles", "explicaram-me", "como", "funciona", "a", "máquina", "de", "café")),
            Sentence("Вони не пояснили свого рішення (чоловіки)", listOf("Eles", "não", "explicaram", "a", "sua", "decisão")),
            Sentence("Вони пояснили маршрут на карті (жінки)", listOf("Elas", "explicaram", "o", "percurso", "no", "mapa")),
            Sentence("Вони не пояснили нам ціни (жінки)", listOf("Elas", "não", "nos", "explicaram", "os", "preços")),

            // VIAJAR – подорожувати
            Sentence("Ви подорожували літаком з Варшави? (ввічливо)", listOf("Você", "viajou", "de", "avião", "desde", "Varsóvia?")),
            Sentence("Ви не подорожували з родиною (ввічливо)", listOf("Você", "não", "viajou", "com", "a", "família")),
            Sentence("Вона подорожувала автобусом до Мадрида", listOf("Ela", "viajou", "de", "autocarro", "para", "Madrid")),
            Sentence("Вона не подорожувала цього року", listOf("Ela", "não", "viajou", "este", "ano")),
            Sentence("Ми подорожували разом минулого місяця", listOf("Nós", "viajamos", "juntos", "no", "mês", "passado")),
            Sentence("Ми не подорожували під час пандемії", listOf("Nós", "não", "viajamos", "durante", "a", "pandemia")),
            Sentence("Ви подорожували машиною до Франції (множина)", listOf("Vocês", "viajaram", "de", "carro", "para", "França")),
            Sentence("Ви не подорожували взимку (множина)", listOf("Vocês", "não", "viajaram", "no", "inverno")),
            Sentence("Вони подорожували всю ніч (чоловіки)", listOf("Eles", "viajaram", "toda", "a", "noite")),
            Sentence("Вони не подорожували без дітей (чоловіки)", listOf("Eles", "não", "viajaram", "sem", "os", "filhos")),

            // ENSINAR – навчати
            Sentence("Я викладав математику в школі п'ять років", listOf("Eu", "ensinei", "matemática", "na", "escola", "durante", "cinco", "anos")),
            Sentence("Я не навчив сина плавати", listOf("Eu", "não", "ensinei", "o", "meu", "filho", "a", "nadar")),
            Sentence("Ти навчив брата грати в шахи", listOf("Tu", "ensinaste", "o", "teu", "irmão", "a", "jogar", "xadrez")),
            Sentence("Ти не навчив мене цього слова", listOf("Tu", "não", "me", "ensinaste", "esta", "palavra")),
            Sentence("Він навчив мене їздити на велосипеді", listOf("Ele", "ensinou-me", "a", "andar", "de", "bicicleta")),
            Sentence("Він нічого нового не навчив учнів", listOf("Ele", "não", "ensinou", "nada", "de", "novo", "aos", "alunos")),
            Sentence("Ми навчили наших дітей говорити португальською", listOf("Nós", "ensinamos", "os", "nossos", "filhos", "a", "falar", "português")),
            Sentence("Ми не викладали в цій школі минулого року", listOf("Nós", "não", "ensinamos", "nesta", "escola", "no", "ano", "passado")),
            Sentence("Вони навчили дітей нової пісні (жінки)", listOf("Elas", "ensinaram", "uma", "canção", "nova", "às", "crianças")),
            Sentence("Вони не викладали в неділю (жінки)", listOf("Elas", "não", "ensinaram", "no", "domingo")),

            // ESTUDAR – вчитися
            Sentence("Ви вивчали медицину в Лісабоні? (ввічливо)", listOf("Você", "estudou", "medicina", "em", "Lisboa?")),
            Sentence("Ви не вчилися цього тижня (ввічливо)", listOf("Você", "não", "estudou", "esta", "semana")),
            Sentence("Вона вчилася в бібліотеці до вечора", listOf("Ela", "estudou", "na", "biblioteca", "até", "à", "noite")),
            Sentence("Вона не вчилася в суботу", listOf("Ela", "não", "estudou", "no", "sábado")),
            Sentence("Ви вчилися онлайн під час карантину? (множина)", listOf("Vocês", "estudaram", "online", "durante", "a", "quarentena?")),
            Sentence("Ви не вчилися до контрольної (множина)", listOf("Vocês", "não", "estudaram", "para", "o", "teste")),
            Sentence("Вони вчилися за кордоном два роки (чоловіки)", listOf("Eles", "estudaram", "no", "estrangeiro", "durante", "dois", "anos")),
            Sentence("Вони не вчилися в тій школі (чоловіки)", listOf("Eles", "não", "estudaram", "naquela", "escola")),
            Sentence("Вони вчили граматику з учителем (жінки)", listOf("Elas", "estudaram", "gramática", "com", "o", "professor")),
            Sentence("Вони не вчилися вчора через свято (жінки)", listOf("Elas", "não", "estudaram", "ontem", "por", "causa", "do", "feriado"))
        )
    }
}

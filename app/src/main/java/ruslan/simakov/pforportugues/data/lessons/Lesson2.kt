package ruslan.simakov.pforportugues.data.lessons

import ruslan.simakov.pforportugues.data.Sentence

object Lesson2 {

    //ê
    fun getSentences(): List<Sentence> {
        return listOf(
            Sentence("Як справи? Дуже добре. А Ви?", listOf("Como", "vai", "?", "Muito", "bem.", "E", "você", "?")),
            // AMAR – любити
            Sentence("Я любив", listOf("Eu", "amei")),
            Sentence("Ти любив", listOf("Tu", "amaste")),
            Sentence("Ти любив (ввічливо)", listOf("Você", "amou")),
            Sentence("Він любив", listOf("Ele", "amou")),
            Sentence("Вона любила", listOf("Ela", "amou")),
            Sentence("Ми любили", listOf("Nós", "amamos")),
            Sentence("Ви любили", listOf("Vocês", "amaram")),
            Sentence("Вони любили (чоловіки)", listOf("Eles", "amaram")),
            Sentence("Вони любили (жінки)", listOf("Elas", "amaram")),

// FALAR – говорити
            Sentence("Я говорив", listOf("Eu", "falei")),
            Sentence("Ти говорив", listOf("Tu", "falaste")),
            Sentence("Ти говорив (ввічливо)", listOf("Você", "falou")),
            Sentence("Він говорив", listOf("Ele", "falou")),
            Sentence("Вона говорила", listOf("Ela", "falou")),
            Sentence("Ми говорили", listOf("Nós", "falamos")),
            Sentence("Ви говорили", listOf("Vocês", "falaram")),
            Sentence("Вони говорили (чоловіки)", listOf("Eles", "falaram")),
            Sentence("Вони говорили (жінки)", listOf("Elas", "falaram")),

// CANTAR – співати
            Sentence("Я співав", listOf("Eu", "cantei")),
            Sentence("Ти співав", listOf("Tu", "cantaste")),
            Sentence("Ти співав (ввічливо)", listOf("Você", "cantou")),
            Sentence("Він співав", listOf("Ele", "cantou")),
            Sentence("Вона співала", listOf("Ela", "cantou")),
            Sentence("Ми співали", listOf("Nós", "cantamos")),
            Sentence("Ви співали", listOf("Vocês", "cantaram")),
            Sentence("Вони співали (чоловіки)", listOf("Eles", "cantaram")),
            Sentence("Вони співали (жінки)", listOf("Elas", "cantaram")),

// TRABALHAR – працювати
            Sentence("Я працював", listOf("Eu", "trabalhei")),
            Sentence("Ти працював", listOf("Tu", "trabalhaste")),
            Sentence("Ти працював (ввічливо)", listOf("Você", "trabalhou")),
            Sentence("Він працював", listOf("Ele", "trabalhou")),
            Sentence("Вона працювала", listOf("Ela", "trabalhou")),
            Sentence("Ми працювали", listOf("Nós", "trabalhamos")),
            Sentence("Ви працювали", listOf("Vocês", "trabalharam")),
            Sentence("Вони працювали (чоловіки)", listOf("Eles", "trabalharam")),
            Sentence("Вони працювали (жінки)", listOf("Elas", "trabalharam")),

// COMPRAR – купувати
            Sentence("Я купив", listOf("Eu", "comprei")),
            Sentence("Ти купив", listOf("Tu", "compraste")),
            Sentence("Ти купив (ввічливо)", listOf("Você", "comprou")),
            Sentence("Він купив", listOf("Ele", "comprou")),
            Sentence("Вона купила", listOf("Ela", "comprou")),
            Sentence("Ми купили", listOf("Nós", "compramos")),
            Sentence("Ви купили", listOf("Vocês", "compraram")),
            Sentence("Вони купили (чоловіки)", listOf("Eles", "compraram")),
            Sentence("Вони купили (жінки)", listOf("Elas", "compraram")),

// PERGUNTAR – питати
            Sentence("Я питав", listOf("Eu", "perguntei")),
            Sentence("Ти питав", listOf("Tu", "perguntaste")),
            Sentence("Ти питав (ввічливо)", listOf("Você", "perguntou")),
            Sentence("Він питав", listOf("Ele", "perguntou")),
            Sentence("Вона питала", listOf("Ela", "perguntou")),
            Sentence("Ми питали", listOf("Nós", "perguntamos")),
            Sentence("Ви питали", listOf("Vocês", "perguntaram")),
            Sentence("Вони питали (чоловіки)", listOf("Eles", "perguntaram")),
            Sentence("Вони питали (жінки)", listOf("Elas", "perguntaram")),

// MORAR – жити
            Sentence("Я жив", listOf("Eu", "morei")),
            Sentence("Ти жив", listOf("Tu", "moraste")),
            Sentence("Ти жив (ввічливо)", listOf("Você", "morou")),
            Sentence("Він жив", listOf("Ele", "morou")),
            Sentence("Вона жила", listOf("Ela", "morou")),
            Sentence("Ми жили", listOf("Nós", "moramos")),
            Sentence("Ви жили", listOf("Vocês", "moraram")),
            Sentence("Вони жили (чоловіки)", listOf("Eles", "moraram")),
            Sentence("Вони жили (жінки)", listOf("Elas", "moraram")),

// ESCUTAR – слухати
            Sentence("Я слухав", listOf("Eu", "escutei")),
            Sentence("Ти слухав", listOf("Tu", "escutaste")),
            Sentence("Ти слухав (ввічливо)", listOf("Você", "escutou")),
            Sentence("Він слухав", listOf("Ele", "escutou")),
            Sentence("Вона слухала", listOf("Ela", "escutou")),
            Sentence("Ми слухали", listOf("Nós", "escutamos")),
            Sentence("Ви слухали", listOf("Vocês", "escutaram")),
            Sentence("Вони слухали (чоловіки)", listOf("Eles", "escutaram")),
            Sentence("Вони слухали (жінки)", listOf("Elas", "escutaram")),

// OLHAR – дивитись
            Sentence("Я дивився", listOf("Eu", "olhei")),
            Sentence("Ти дивився", listOf("Tu", "olhaste")),
            Sentence("Ти дивився (ввічливо)", listOf("Você", "olhou")),
            Sentence("Він дивився", listOf("Ele", "olhou")),
            Sentence("Вона дивилася", listOf("Ela", "olhou")),
            Sentence("Ми дивилися", listOf("Nós", "olhamos")),
            Sentence("Ви дивилися", listOf("Vocês", "olharam")),
            Sentence("Вони дивилися (чоловіки)", listOf("Eles", "olharam")),
            Sentence("Вони дивилися (жінки)", listOf("Elas", "olharam")),

// DANÇAR – танцювати
            Sentence("Я танцював", listOf("Eu", "dancei")),
            Sentence("Ти танцював", listOf("Tu", "dançaste")),
            Sentence("Ти танцював (ввічливо)", listOf("Você", "dançou")),
            Sentence("Він танцював", listOf("Ele", "dançou")),
            Sentence("Вона танцювала", listOf("Ela", "dançou")),
            Sentence("Ми танцювали", listOf("Nós", "dançamos")),
            Sentence("Ви танцювали", listOf("Vocês", "dançaram")),
            Sentence("Вони танцювали (чоловіки)", listOf("Eles", "dançaram")),
            Sentence("Вони танцювали (жінки)", listOf("Elas", "dançaram"))
        )
    }
}

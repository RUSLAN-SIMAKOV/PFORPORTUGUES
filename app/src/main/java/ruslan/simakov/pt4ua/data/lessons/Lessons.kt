package ruslan.simakov.pt4ua.data.lessons

import ruslan.simakov.pt4ua.R
import ruslan.simakov.pt4ua.data.RuleTable
import ruslan.simakov.pt4ua.data.Sentence

data class LessonInfo(
    val title: String,
    val sentences: () -> List<Sentence>,
    val helpImage: Int? = null,
    val rules: List<RuleTable> = emptyList()
)

// All lessons in the order shown on the main screen; lesson number = index + 1
object Lessons {
    val all = listOf(
        LessonInfo("Lesson 1: Теперішній час", Lesson1::getSentences, helpImage = R.drawable.less1),
        LessonInfo("Lesson 2: Минулий час", Lesson2::getSentences, helpImage = R.drawable.less2),
        LessonInfo("Lesson 3: SER / ESTAR / TER", Lesson3::getSentences, helpImage = R.drawable.less3),
        LessonInfo("Lesson 4: Питання", Lesson4::getSentences, helpImage = R.drawable.less4),
        LessonInfo("Lesson 5: Дієслова -ER / -IR", Lesson5::getSentences, rules = Lesson5.rules),
        LessonInfo("Lesson 6: Базова схема Петрова (-AR)", Lesson6::getSentences, rules = Lesson6.rules),
        LessonInfo("Lesson 7: Базова схема (-ER / -IR)", Lesson7::getSentences, rules = Lesson7.rules),
        LessonInfo("Lesson 8: SER, ESTAR, TER, IR, FAZER", Lesson8::getSentences, rules = Lesson8.rules),
        LessonInfo("Lesson 9: Модальні дієслова", Lesson9::getSentences, rules = Lesson9.rules),
        LessonInfo("Lesson 10: Займенники", Lesson10::getSentences, rules = Lesson10.rules),
        LessonInfo("Lesson 11: Зворотні дієслова", Lesson11::getSentences, rules = Lesson11.rules),
        LessonInfo("Lesson 12: Числа, час і дати", Lesson12::getSentences, rules = Lesson12.rules),
        LessonInfo("Lesson 13: DIZER, DAR, VIR, VER, PÔR, TRAZER", Lesson13::getSentences, rules = Lesson13.rules),
        LessonInfo("Lesson 14: Тривалі дії та імперфект", Lesson14::getSentences, rules = Lesson14.rules),
        LessonInfo("Lesson 15: Наказовий спосіб і конжунтив", Lesson15::getSentences, rules = Lesson15.rules),
        LessonInfo("Lesson 16: Умовний спосіб і порівняння", Lesson16::getSentences, rules = Lesson16.rules)
    )
}

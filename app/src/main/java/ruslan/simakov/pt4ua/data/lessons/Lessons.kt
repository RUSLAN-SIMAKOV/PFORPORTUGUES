package ruslan.simakov.pt4ua.data.lessons

import ruslan.simakov.pt4ua.data.RuleTable
import ruslan.simakov.pt4ua.data.Sentence

data class LessonInfo(
    val title: String,
    val sentences: () -> List<Sentence>,
    val helpImage: Int? = null,
    val rules: List<RuleTable> = emptyList()
)

data class LessonSection(
    val emoji: String,
    val title: String,
    val subtitle: String,
    val lessons: IntRange
)

// All lessons in the order shown on the main screen; lesson number = index + 1
object Lessons {
    val all = listOf(
        LessonInfo("Теперішній час", Lesson1::getSentences, rules = Lesson1.rules),
        LessonInfo("Минулий час", Lesson2::getSentences, rules = Lesson2.rules),
        LessonInfo("SER / ESTAR / TER", Lesson3::getSentences, rules = Lesson3.rules),
        LessonInfo("Питання", Lesson4::getSentences, rules = Lesson4.rules),
        LessonInfo("Дієслова -ER / -IR", Lesson5::getSentences, rules = Lesson5.rules),
        LessonInfo("Базова схема (-AR)", Lesson6::getSentences, rules = Lesson6.rules),
        LessonInfo("Базова схема (-ER / -IR)", Lesson7::getSentences, rules = Lesson7.rules),
        LessonInfo("SER, ESTAR, TER, IR, FAZER", Lesson8::getSentences, rules = Lesson8.rules),
        LessonInfo("Модальні дієслова", Lesson9::getSentences, rules = Lesson9.rules),
        LessonInfo("Займенники", Lesson10::getSentences, rules = Lesson10.rules),
        LessonInfo("Зворотні дієслова", Lesson11::getSentences, rules = Lesson11.rules),
        LessonInfo("Числа, час і дати", Lesson12::getSentences, rules = Lesson12.rules),
        LessonInfo("Ще неправильні дієслова", Lesson13::getSentences, rules = Lesson13.rules),
        LessonInfo("Тривалі дії та імперфект", Lesson14::getSentences, rules = Lesson14.rules),
        LessonInfo("Наказовий спосіб і конжунтив", Lesson15::getSentences, rules = Lesson15.rules),
        LessonInfo("Умовний спосіб і порівняння", Lesson16::getSentences, rules = Lesson16.rules),
        LessonInfo("У лікаря та в аптеці", Lesson17::getSentences, rules = Lesson17.rules),
        LessonInfo("Документи, банк і робота", Lesson18::getSentences, rules = Lesson18.rules),
        LessonInfo("Кафе, ресторан і магазин", Lesson19::getSentences, rules = Lesson19.rules),
        LessonInfo("Транспорт і місто", Lesson20::getSentences, rules = Lesson20.rules),
        LessonInfo("Житло та побут", Lesson21::getSentences, rules = Lesson21.rules)
    )

    val sections = listOf(
        LessonSection("🌱", "Основи", "Теперішній і минулий час, питання", 1..5),
        LessonSection("📘", "Граматика", "Три часи, неправильні дієслова, займенники та інше", 6..16),
        LessonSection("🇵🇹", "Життя в Португалії", "Лікар, документи, кафе, транспорт, житло", 17..21)
    )
}

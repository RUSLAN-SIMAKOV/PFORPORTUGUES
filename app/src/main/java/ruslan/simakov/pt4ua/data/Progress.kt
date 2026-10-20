package ruslan.simakov.pt4ua.data

// Keys for lesson progress stored in SharedPreferences
object Progress {
    const val PREFS_NAME = "LessonState"
    const val KEY_LAST_LESSON = "last_lesson"

    fun progressKey(lesson: Int) = "lesson_${lesson}_progress"
    fun completedKey(lesson: Int) = "lesson_${lesson}_completed"
}

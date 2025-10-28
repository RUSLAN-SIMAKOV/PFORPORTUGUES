package ruslan.simakov.pforportugues

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class LessonAdapter(context: Context, private val lessons: Array<String>) : ArrayAdapter<String>(context, 0, lessons) {

    private val completedLessons = mutableSetOf<String>()

    fun setLessonCompleted(lesson: String) {
        completedLessons.add(lesson)
        notifyDataSetChanged()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_1, parent, false)
        val textView = view.findViewById<TextView>(android.R.id.text1)
        val lesson = lessons[position]
        textView.text = lesson

        if (completedLessons.contains(lesson)) {
            view.setBackgroundColor(Color.GREEN)
        } else {
            view.setBackgroundColor(Color.TRANSPARENT)
        }

        return view
    }
}

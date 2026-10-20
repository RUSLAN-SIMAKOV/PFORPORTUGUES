package ruslan.simakov.pt4ua.data

// A grammar table shown in the lesson help. The first row is the header.
data class RuleTable(
    val title: String,
    val rows: List<List<String>>,
    val note: String? = null
)

package sample.graph.wordladder

data class WordNode(
    val data: String,
    val previous: WordNode? = null
)
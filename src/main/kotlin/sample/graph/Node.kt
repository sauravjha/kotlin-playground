package sample.graph

data class Node(
    val data: String,
    val neighbours: MutableList<Node> = mutableListOf(),
    var source: Node? = null,
) {
    override fun toString() = "$data: [${neighbours.joinToString(", ") { it.data }}]"
}
package sample.graph

import java.util.*

fun bfs(start: Node, target: String): List<Node>? {
    val next: Queue<Node> = LinkedList()
    val visitedNode: MutableList<Node> = mutableListOf()

    next.add(start)
    visitedNode.add(start)

    while (next.isNotEmpty()) {
        val current = next.remove()
        if (current.data == target) {
            println("Found the Node!!: $current")
            return getThePathFromTheNode(current)
        }

        current.neighbours.forEach {
            if(it !in visitedNode) {
                it.source = current
                next.add(it)
                visitedNode.add(it)
            }
        }
    }

    return null
}

fun getThePathFromTheNode(node: Node?): List<Node>? {
    val path = mutableListOf<Node>()

    var current: Node? = node
    while (current != null) {
        println(current.toString())
        //Thread.sleep(2000)
        path.add(current)
        current = current.source
    }
    path.reverse()

    return path
}

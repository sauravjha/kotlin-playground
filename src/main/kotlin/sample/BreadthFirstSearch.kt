package sample

fun breathFirstSearch() {

}


fun bfs(nodes: List<List<Int>>) {
    val visited = BooleanArray(nodes.size) { false }
    // Create a queue and add 0 to represent the index of the
    // first node
    val queue: MutableList<Int> = mutableListOf(0)
    while (queue.isNotEmpty()) {
        // Dequeue a node from queue
        val node = queue.removeAt(0)
        // Add all of the node's unvisited neighbors to the queue
        if (!visited[node]) {
            nodes[node].forEach {
                println(it)
                queue.add(it)
            }
            // Mark the dequeued node as visited
            visited[node] = true
        }
    }
    println(queue)
}
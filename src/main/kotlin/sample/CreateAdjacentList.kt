package sample

fun createAdjacentList(pairs: Array<IntArray>): HashMap<Int, MutableList<Int>> {
    val graph: HashMap<Int, MutableList<Int>> = hashMapOf()
    pairs.forEach { (key, value) ->
        graph.getOrPut(key) {
            mutableListOf()
        }.add(value)
    }
    return graph
}

fun createAdjacentListConventional(pairs: Array<IntArray>): HashMap<Int, MutableList<Int>> {
    val graph: HashMap<Int, MutableList<Int>> = hashMapOf()
    pairs.forEach { (key, value) ->
        if (!graph.containsKey(key)) {
            graph[key] = mutableListOf(value)
        } else {
            val values = graph[key]
            values!!.add(value)
            graph[key] = values
        }
    }
    return graph
}
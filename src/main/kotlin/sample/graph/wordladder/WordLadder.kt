package sample.graph.wordladder

import java.util.*

/**
 * Given a starting word, HEAD, and an ending word, TAIL
 * Find the sequence of single letter transformations of valid words
 * that turns HEAD into TAIL.
 *
 * Ex. HEAD > HEAL > TEAL > TELL > TALL > TAIL
 */

fun wordLadder(start:String, final: String): List<String> {
    val next: Queue<WordNode> = LinkedList()
    val visitedNode: MutableList<String> = mutableListOf<String>()

    val dictionary = Dictionary()

    if (!dictionary.isValidWord(start)) return emptyList()
    if (!dictionary.isValidWord(final)) return emptyList()

    if (start.length != final.length) return emptyList()

    next.add(WordNode(start))
    visitedNode.add(start)

    while (next.isNotEmpty()) {
        val current = next.remove()

        if (current.data == final) {
            println("Found! ${current.data}")
            return getThePathFromTheNodeGeneric(current).map { it.data }
        }
        println("For ${current.data} Neighbour are: ")
        getWordsOneLetterDifferent(current.data).forEach {
            if (it !in visitedNode) {
                next.add(WordNode(it, current))
                visitedNode.add(it)
            }
        }
        println()

    }
    return emptyList()
}

fun getThePathFromTheNodeGeneric(node: WordNode?):  List<WordNode> {
    val path: MutableList<WordNode> = mutableListOf()

    var current: WordNode? = node
    while (current != null) {
        path.add(current)
        current = current.previous
    }
    path.reverse()
    return path
}

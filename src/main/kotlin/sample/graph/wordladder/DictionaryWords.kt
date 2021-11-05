package sample.graph.wordladder

import sample.getResourceAsText

const val filePath = "/Dictionary.txt"

object DictionaryWords {
    val words = getAllDictionaryWords()

    private fun getAllDictionaryWords(): HashSet<String> {
        println("I have been called ${++count}")
        return getResourceAsText(filePath).split("\n").toHashSet()
    }
}

package sample.graph.wordladder

var count = 0

class Dictionary {
    fun isValidWord(word: String) = word in DictionaryWords.words
}


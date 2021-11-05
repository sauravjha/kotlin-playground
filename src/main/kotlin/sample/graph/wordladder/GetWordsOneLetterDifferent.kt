package sample.graph.wordladder

fun getWordsOneLetterDifferent(word: String): List<String> {
    val words = mutableListOf<String>()
    val dictionary = Dictionary()

    if (!dictionary.isValidWord(word)) return emptyList()

    val charArrayOfString = word.toCharArray()

    charArrayOfString.mapIndexed { index, c ->
        ('A'..'Z').map {
            if (c != it) {
                val newWord = charArrayOfString.clone()
                newWord[index] = it
                words.add(String(newWord))
            }
        }
    }
    return words.filter { dictionary.isValidWord(it) }
}

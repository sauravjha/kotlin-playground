package sample

enum class Color {
    RED,
    BLACK
}

data class Card(val number: Int, val color: Color): Comparable<Card> {
    override fun compareTo(other: Card): Int {

        return when (this.color) {
            other.color -> this.number - other.number
            Color.BLACK -> 1
            else -> -1
        }
    }
}
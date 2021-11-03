package sample

fun countingValleys(n: Int, s: String): Int {
    var start = 0
    var numberOfValley = 0
    s.split("").slice(1 until n).forEach { char ->
        when (char.uppercase()) {
            "U" -> start += 1
            "D" -> start -= 1
            else -> throw IllegalArgumentException("Illegal char")
        }
        if (start == 0) {
            numberOfValley++
        }
    }
    return numberOfValley
}
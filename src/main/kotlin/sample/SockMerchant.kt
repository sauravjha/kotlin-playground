package sample

/*
Question
In this question, we are given an array of integers, where each number represents a particular colour of socks. We need to count how many pairs of socks are present, such that two socks of the same colour form a pair.

It is also mentioned that the highest number of distinct colours in the given array is 100.
 */

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    var total = 0
   ar.groupBy { it }.forEach { i, entries ->
       if(i == n) {
           total = (entries.size / 2)
       }
    }
    return total
}
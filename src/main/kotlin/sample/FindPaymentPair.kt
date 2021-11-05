package sample

/*
Find a pair with the given sum in an array
Given an unsorted integer array, find a pair with the given sum in it.


nums = [8, 7, 2, 5, 3, 1]
target = 10

Output:

Pair found (8, 2)
or
Pair found (7, 3)
 */

fun findPaymentPair(payments: Array<Int>, target: Int = 10): List<Pair<Int, Int>> {
    return payments.mapIndexed { index, i ->
        payments.drop(index + 1).filter { (i + it) % target == 0 }.map {
            i to it
        }
    }.toList().flatten()
}

fun findPaymentPair(payments: List<Int>, target: Int = 10): List<Pair<Int, Int>> {
    return payments.mapIndexed { index, i ->
        payments.drop(index + 1).filter { (i + it) % target == 0 }.map {
            i to it
        }
    }.toList().flatten()
}
package zendesk

/*
A credit card number must have between 13 and 16 digits, inclusive.

 */
/*
Credit card numbers can be validated with a process called the Luhn algorithm. The Luhn algorithm works like this:
1. Starting with the second last digit and continuing with every second digit going back to the beginning of the card, double the digit.
2. Sum all doubled and untouched digits in the number.
3. If that total is a multiple of 10, the number is valid.

For example, given the card number 4408041234567893:
Orig :  4 4 0 8 0 4 1 2 3 4 5  6 7  8 9  3
Step 1: 8 4 0 8 0 4 2 2 6 4 10 6 14 8 18 3
Step 2: 8+4+0+8+0+4+2+2+6+4+1+0+6+1+4+8+1+8+3 = 70
Step 3: 70 % 10 == 0
 */


fun creditCardValidator(value: String): Boolean {
    var index = value.length-1
    //val allNumber = mutableListOf<Int>()
    var needsTobeDoubled = false
    val lengthCheck = value.length in 13..16
    var sum = 0
    return if(lengthCheck) {
        while (index >= 0) {
            val toInt = value[index].toString().toInt()
            var number = if (!needsTobeDoubled) toInt else toInt * 2
            while(number!=0){
                val digit = number % 10
                number /= 10
                sum +=digit
            }
            needsTobeDoubled = !needsTobeDoubled
            index--
        }
        sum % 10 == 0
    } else {
        false
    }
}
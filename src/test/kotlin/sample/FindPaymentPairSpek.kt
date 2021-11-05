package sample

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object FindPaymentPairSpek: Spek({
    describe("findPaymentPair when input is array") {
        val input = arrayOf(8, 7, 2, 5 , 3, 1)
        context("when the input is 8, 7, 2, 5 , 3, 1") {
            val findPaymentPair = findPaymentPair(input)
            it("returns two pair") {
                assertThat(findPaymentPair.size, equalTo(2) )
            }
            it("returns the pair that matches (8,2)") {
                val expectedPairOne = Pair(8, 2)
                assertThat(findPaymentPair.contains(expectedPairOne), equalTo(true))
            }
            it("returns the pair that matches (7.3)") {
                val expectedPairTwo = Pair(7, 3)
                assertThat(findPaymentPair.contains(expectedPairTwo), equalTo(true))
            }
        }
        val input2 = arrayOf(5, 2, 6, 8, 1, 9)
        context("when the input is 5, 2, 6, 8, 1, 9") {
            val findPaymentPair = findPaymentPair(input2, 12)
            it("returns 0 pair") {
                assertThat(findPaymentPair.size, equalTo(0) )
            }
        }
    }
    describe("findPaymentPair when input is list") {
        val input = listOf(8, 7, 2, 5 , 3, 1)
        context("when the input is 8, 7, 2, 5 , 3, 1") {
            val findPaymentPair = findPaymentPair(input)
            it("returns two pair") {
                assertThat(findPaymentPair.size, equalTo(2) )
            }
            it("returns the pair that matches (8,2)") {
                val expectedPairOne = Pair(8, 2)
                assertThat(findPaymentPair.contains(expectedPairOne), equalTo(true))
            }
            it("returns the pair that matches (7.3)") {
                val expectedPairTwo = Pair(7, 3)
                assertThat(findPaymentPair.contains(expectedPairTwo), equalTo(true))
            }
        }
        val input2 = listOf(5, 2, 6, 8, 1, 9)
        context("when the input is 5, 2, 6, 8, 1, 9") {
            val findPaymentPair = findPaymentPair(input2, 12)
            it("returns 0 pair") {
                assertThat(findPaymentPair.size, equalTo(0) )
            }
        }
    }
})
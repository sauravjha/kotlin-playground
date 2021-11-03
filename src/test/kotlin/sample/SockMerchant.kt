package sample

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object SockMerchant: Spek({
    describe("sockMerchant") {
        context("and list is  10, 20, 20, 10, 10, 30, 50, 10, 20 and find pair for 20") {
            val sockArray =  arrayOf(
                10, 20, 20, 10, 10, 30, 50, 10, 20
            )
            val numberOfPair = sockMerchant(20, sockArray)
            it("returns 1") {
                assertThat(numberOfPair, equalTo(1))
            }
            val numberOfPairFor10 = sockMerchant(10, sockArray)
            it("returns 2") {
                assertThat(numberOfPairFor10, equalTo(2))
            }
            val numberOfPairFor30 = sockMerchant(30, sockArray)
            it("returns 0") {
                assertThat(numberOfPairFor30, equalTo(0))
            }
        }

        context("and list is  10, 20, 20, 10, 10, 30, 50, 10, 20, 20 and find pair for 20") {
            val sockArray =  arrayOf(
                10, 20, 20, 10, 10, 30, 50, 10, 20, 20
            )
            val numberOfPair = sockMerchant(20, sockArray)
            it("returns 1") {
                assertThat(numberOfPair, equalTo(2))
            }
        }
    }
})
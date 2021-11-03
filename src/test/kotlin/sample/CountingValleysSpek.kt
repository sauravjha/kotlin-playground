package sample

import com.natpryce.hamkrest.Matcher
import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import com.natpryce.hamkrest.has
import com.natpryce.hamkrest.throws
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object CountingValleysSpek: Spek({

    describe("countingValleys") {
        context("and string is \"UDDDUDUUDU\" and number of step is 10") {
            val n = countingValleys(10, "UDDDUDUUDU")
            it("number of valley is 2") {
                assertThat(n, equalTo(2))
            }
        }

        context("and string is \"UDDDUDUU\" and number of step is 8") {
            val n = countingValleys(8, "UDDDUDUU")
            it("number of valley is 1") {
                assertThat(n, equalTo(1))
            }
        }

        context("and the string is \"UDSDUDUU\" and number of s") {

            it("throws Exception") {
                assertThat({
                    countingValleys(8, "UDSDUDUU")
                },
                  throws<IllegalArgumentException>(withMessage("Illegal char"))
                )
            }
        }
    }
})

fun withMessage(s: String): Matcher<IllegalArgumentException>? =
    has(IllegalArgumentException::message, equalTo(s))




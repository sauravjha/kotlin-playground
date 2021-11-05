package sample

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object JumpOnTheCloudSpek: Spek({
    describe("jumpOnClouds") {
        context("when the input 0 0 1 0 0 1 0") {
            val input = arrayOf(0, 0, 1, 0, 0, 1, 0)
            val expected = jumpOnClouds(input)
            it("returns number of jump as 4") {
                assertThat(expected, equalTo(4))
            }
        }

        context("when the input 0 0 1 0 0 1 0") {
            val input = arrayOf(0, 0, 0, 0, 1, 0)
            val expected = jumpOnClouds(input)
            it("returns number of jump as 3") {
                assertThat(expected, equalTo(3))
            }
        }
    }
})
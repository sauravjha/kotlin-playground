package sample

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object RotateLeftSpek: Spek({
    describe("rotateLeft") {
        val arr = arrayOf(1, 2, 3, 4, 5)

        context("when the number of rotation is 1 and array is 1 2 3 4 5") {
            val d = 1
            val output = rotateLeft(d, arr)
            val expectedOutput = arrayOf(2, 3, 4, 5, 1)
            it("returns 2, 3, 4, 5, 1") {
                assertThat(output contentEquals expectedOutput, equalTo(true))
            }
        }

        context("when the number of rotation is 2 and array is 1 2 3 4 5") {
            val d = 2
            val output = rotateLeft(d, arr)
            val expectedOutput = arrayOf(3, 4, 5, 1, 2)
            it("returns 3, 4, 5, 1, 2") {
                assertThat(output contentEquals expectedOutput, equalTo(true))
            }
        }

        context("when the number of rotation is 3 and array is 1 2 3 4 5") {
            val d = 3
            val output = rotateLeft(d, arr)
            val expectedOutput = arrayOf(4, 5, 1, 2, 3)
            it("returns 4, 5, 1, 2, 3") {
                assertThat(output contentEquals expectedOutput, equalTo(true))
            }
        }

        context("when the number of rotation is 4 and array is 1 2 3 4 5") {
            val d = 4
            val output = rotateLeft(d, arr)
            val expectedOutput = arrayOf(5, 1, 2, 3, 4)
            it("returns 5 1 2 3 4") {
                assertThat(output contentEquals expectedOutput, equalTo(true))
            }
        }

        context("when the number of rotation is 5 and array is 1 2 3 4 5") {
            val d = 5
            val output = rotateLeft(d, arr)
            val expectedOutput = arrayOf(1, 2, 3, 4, 5)
            it("returns 1, 2, 3, 4, 5") {
                assertThat(output contentEquals expectedOutput, equalTo(true))
            }
        }

        context("when the number of rotation is 6 and array is 1 2 3 4 5") {
            val d = 6
            val output = rotateLeft(d, arr)
            output.forEach {
                println(it)
            }
            val expectedOutput = arrayOf(2, 3, 4, 5, 1)
            it("returns 2, 3, 4, 5, 1") {
                assertThat(output contentEquals expectedOutput, equalTo(true))
            }
        }

    }

})
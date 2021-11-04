package sample

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object CreateAdjacentListSpek : Spek({
    describe("createAdjacentList") {
        val pair = arrayOf(intArrayOf(1,2), intArrayOf(1, 3), intArrayOf(1, 4), intArrayOf(2, 4), intArrayOf(2, 5), intArrayOf(3, 6), intArrayOf(4, 3), intArrayOf(4, 6))
        context("when the list is $pair") {
            val createAdjacentList = createAdjacentList(pair)
            val expected = hashMapOf(
                Pair(1, listOf(2, 3, 4)),
                Pair(2, listOf(4, 5)),
                Pair(3, listOf(6)),
                Pair(4, listOf(3, 6)),
            )
            it("returns $expected") {
                assertThat(createAdjacentList, equalTo(expected))
            }
        }
    }
    describe("createAdjacentListConventional") {
        val pair = arrayOf(intArrayOf(1,2), intArrayOf(1, 3), intArrayOf(1, 4), intArrayOf(2, 4), intArrayOf(2, 5), intArrayOf(3, 6), intArrayOf(4, 3), intArrayOf(4, 6))
        context("when the list is $pair") {
            val createAdjacentList = createAdjacentListConventional(pair)
            val expected = hashMapOf(
                Pair(1, listOf(2, 3, 4)),
                Pair(2, listOf(4, 5)),
                Pair(3, listOf(6)),
                Pair(4, listOf(3, 6)),
            )
            it("returns $expected") {
                assertThat(createAdjacentList, equalTo(expected))
            }
        }
    }
})
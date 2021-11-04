package sample

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object CardSpek: Spek({
    describe("sort card") {
        val cards = listOf(
            Card(4, Color.RED),
            Card(2, Color.BLACK),
            Card(1, Color.RED),
            Card(3, Color.BLACK),
        )
        context("and $cards") {
            val expected = listOf(
                Card(1, Color.RED),
                Card(4, Color.RED),
                Card(2, Color.BLACK),
                Card(3, Color.BLACK),
            )
            it("returns the sorted list") {
                assertThat(cards.sorted(), equalTo(expected))
            }
        }
    }
})
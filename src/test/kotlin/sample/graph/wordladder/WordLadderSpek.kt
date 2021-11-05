package sample.graph.wordladder

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object WordLadderSpek: Spek({
    describe("worldLadder") {
        context("and the starting point is HEAD and endpoint is TAIL") {
            it("returns the path") {
                val expectedList = listOf(
                    "HEAD",
                    "HEAL",
                    "TEAL",
                    "TELL",
                    "TALL",
                    "TAIL"
                )
                val wordLadder = wordLadder("HEAD", "TAIL")

                assertThat(wordLadder, equalTo(expectedList))
            }
        }
    }
})
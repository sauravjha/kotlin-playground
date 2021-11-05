package sample.graph.wordladder

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object DictionarySpek: Spek({
    describe("Dictionary") {
        context("when initialized verify the word that exists") {
            it("returns true for ABLE") {
                val validWord = Dictionary().isValidWord("ABLE")
                assertThat(validWord, equalTo(true))
            }
            it("returns true for ZONE") {
                val validWord = Dictionary().isValidWord("ZONE")
                assertThat(validWord, equalTo(true))
            }
        }
        context("when initialized verify the word that does not exist") {
            it("returns false for XXX") {
                val validWord = Dictionary().isValidWord("XXX")
                assertThat(validWord, equalTo(false))
            }
        }
    }
})
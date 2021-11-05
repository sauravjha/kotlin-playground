package sample.graph.wordladder

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object GetWordsOneLetterDifferentSpek: Spek({
    describe("getWordsOneLetterDifferent") {
        context("when the word is as valid word WILL") {
            DictionaryWords.words
            it("returned list should contain TILL") {
                val wordsOneLetterDifferent = getWordsOneLetterDifferent("WILL")
                assertThat(wordsOneLetterDifferent.contains("TILL"), equalTo(true))
            }
            DictionaryWords.words
            it("returned list should contain WELL") {
                val wordsOneLetterDifferent = getWordsOneLetterDifferent("WILL")
                assertThat(wordsOneLetterDifferent.contains("WELL"), equalTo(true))
            }
            DictionaryWords.words
            it("returned list should contain WILD") {
                val wordsOneLetterDifferent = getWordsOneLetterDifferent("WILL")
                assertThat(wordsOneLetterDifferent.contains("WILD"), equalTo(true))
            }
        }
        val invalidWord = "XXXX"
        context("when the word is as invalid $invalidWord") {
            it("returned list should be empty") {
                val wordsOneLetterDifferent = getWordsOneLetterDifferent(invalidWord)
                assertThat(wordsOneLetterDifferent.isEmpty(), equalTo(true))
            }
        }
        val invalidWord2 = "XILL"
        context("when the word is as invalid $invalidWord2") {
            it("returned list should be empty") {
                val wordsOneLetterDifferent = getWordsOneLetterDifferent(invalidWord2)
                assertThat(wordsOneLetterDifferent.isEmpty(), equalTo(true))
            }
        }
    }

})
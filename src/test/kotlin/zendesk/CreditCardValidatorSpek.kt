package zendesk

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object CreditCardValidatorSpek: Spek({
    describe("CreditCardValidator") {
        context("when input is 123456789") {
            it("return false") {
                assertThat(creditCardValidator("123456789"), equalTo(false))
            }
        }
        context("when input is 1234567891111") {
            it("return false") {
                assertThat(creditCardValidator("1234567891111"), equalTo(false))
            }
        }
        context("when input is 4408041234567893") {
            it("return true") {
                assertThat(creditCardValidator("4408041234567893"), equalTo(true))
            }
        }

        context("when input is 4408041234567899") {
            it("return true") {
                assertThat(creditCardValidator("4408041234567899"), equalTo(false))
            }
        }
    }

})
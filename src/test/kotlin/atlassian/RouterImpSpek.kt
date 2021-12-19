package atlassian

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import com.natpryce.hamkrest.throws
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object RouterImpSpek: Spek({
    describe("withRoute") {
        context("when it is called with path and result") {
            val router = RouterImp()
            router.withRoute("foo", "bar")
            val result1 = router.route("foo")
            it("update the routerPath with path and result") {
                assertThat(result1, equalTo("bar"))
            }
            router.withRoute("foo", "boo")
            val result2 = router.route("foo")
            it("update the routerPath with path and result") {
                assertThat(result2, equalTo("boo"))
            }

            it("update the routerPath with path and result") {
                assertThat({router.route("dose-not-exist")}, throws<IllegalPathException>())
            }
            router.withRoute("bla/*", "blabla")
            val result3 = router.route("bla/saurav")
            it("update the routerPath with path and result") {
                assertThat(result3, equalTo("blabla"))
            }
        }
    }
})
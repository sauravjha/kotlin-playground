package atlassian

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object FileReporterSpek: Spek({
    describe("when we call fileREporter") {
        context("when the input is case1") {
            val inputFileDetail = listOf(
                FileDetail("file1.txt", 100),
                FileDetail("file2.txt", 200, "collection1"),
                FileDetail("file3.txt", 200, "collection1"),
                FileDetail("file4.txt", 300, "collection2"),
                FileDetail("file5.txt", 10),
            )
            val output = fileReporter(inputFileDetail, 1)

            it("returns total file size 810") {
                assertThat(output.totalSize, equalTo(810))
            }
            val expectCollection = listOf(
                "collection1"
            )
            it("returns n collection file names of collection1") {
                assertThat(output.collectionNames, equalTo(expectCollection))
            }
        }
        context("when the input is case2") {
            val inputFileDetail = listOf(
                FileDetail("file1.txt", 100),
                FileDetail("file2.txt", 200, "collection1"),
                FileDetail("file3.txt", 200, "collection1"),
                FileDetail("file4.txt", 500, "collection2"),
                FileDetail("file5.txt", 10),
            )
            val output = fileReporter(inputFileDetail, 1)

            it("returns total file size 810+200") {
                assertThat(output.totalSize, equalTo(810+200))
            }
            val expectCollection = listOf(
                "collection2"
            )
            it("returns n collection file names of collection2") {
                assertThat(output.collectionNames, equalTo(expectCollection))
            }
        }
        context("when the input is case3") {
            val inputFileDetail = listOf(
                FileDetail("file1.txt", 100),
                FileDetail("file2.txt", 200, "collection1"),
                FileDetail("file3.txt", 200, "collection1"),
                FileDetail("file4.txt", 400, "collection2"),
                FileDetail("file5.txt", 10),
            )
            val output = fileReporter(inputFileDetail, 1)

            it("returns total file size 910") {
                assertThat(output.totalSize, equalTo(910))
            }
            val expectCollection = listOf(
                "collection1"
            )
            it("returns n collection file names of collection1") {
                assertThat(output.collectionNames, equalTo(expectCollection))
            }
        }
        context("when the input is case5") {
            val inputFileDetail = listOf(
                FileDetail("file1.txt", 100),
                FileDetail("file2.txt", 200, "zcollection1"),
                FileDetail("file3.txt", 200, "zcollection1"),
                FileDetail("file4.txt", 400, "collection2"),
                FileDetail("file5.txt", 10),
            )
            val output = fileReporter(inputFileDetail, 1)

            it("returns total file size 910") {
                assertThat(output.totalSize, equalTo(910))
            }
            val expectCollection = listOf(
                "collection2"
            )
            it("returns n collection file names of collection1") {
                assertThat(output.collectionNames, equalTo(expectCollection))
            }
        }
    }
})
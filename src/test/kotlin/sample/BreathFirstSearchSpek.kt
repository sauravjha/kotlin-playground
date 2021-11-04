package sample

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object BreathFirstSearchSpek: Spek({
    describe("bsf") {
        val graph = listOf(
            listOf(0, 1),
        listOf(0, 2),
        listOf(1, 2),
        listOf(2, 0),
        listOf(2, 3),
        listOf(3, 3),
        )
        context("and the graph is $graph") {
            val bfs = bfs(graph)
            println(bfs)
        }
    }
})
package sample.graph

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

typealias Graph = List<Node>

object BfsSpek: Spek({
    describe("bfs") {
        val startingPoint = generateGraph().first()
        context("when the starting point is $startingPoint and the target is \"G\"") {
            it("returns the shortest path \"A: [B, D, F], B: [A, C], C: [B, E, G], G: [C]\"") {
                val shortestPathNode = bfs(startingPoint, "G")
                val expectedOutput = shortestPathNode.toString()
                assertThat(expectedOutput, equalTo("[A: [B, D, F], B: [A, C], C: [B, E, G], G: [C]]"))
            }
        }
    }

})

fun generateGraph(): List<Node> {
    val a = Node("A")
    val b = Node("B")
    val c = Node("C")
    val d = Node("D")
    val e = Node("E")
    val f = Node("F")
    val g = Node("G")

    a.neighbours.add(b)
    a.neighbours.add(d)
    a.neighbours.add(f)

    b.neighbours.add(a)
    b.neighbours.add(c)

    c.neighbours.add(b)
    c.neighbours.add(e)
    c.neighbours.add(g)

    d.neighbours.add(a)
    d.neighbours.add(f)

    e.neighbours.add(f)
    e.neighbours.add(c)

    f.neighbours.add(a)
    f.neighbours.add(d)
    f.neighbours.add(e)

    g.neighbours.add(c)

    return listOf(
        a, b, c, d, e, f, g
    )
}

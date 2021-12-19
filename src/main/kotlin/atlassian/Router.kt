package atlassian

/*
Define
    route path
    A -> B
 */

interface Router {
    fun withRoute(path: String, result: String)
    fun route(path: String) : String;
}
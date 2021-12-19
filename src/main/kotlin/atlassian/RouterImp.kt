package atlassian

class RouterImp: Router {

    private val routerPath: HashMap<String, String>  = hashMapOf()
    override fun withRoute(path: String, result: String) {
        routerPath[path] = result
    }

    override fun route(path: String): String {
        routerPath.keys.forEach {
            if (it.toRegex().matches(path)) {
                return routerPath[it]!!
            }
        }
        throw IllegalPathException("")
    }

}

class IllegalPathException(s: String) : Throwable()

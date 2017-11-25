
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Chris/codebase/weddingapp/workspace/scala-getting-started/conf/routes
// @DATE:Fri Nov 24 14:16:10 CST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}

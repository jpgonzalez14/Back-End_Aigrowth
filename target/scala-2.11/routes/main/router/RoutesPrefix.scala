
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Sofia/Documents/Back-End_Aigrowth/conf/routes
// @DATE:Mon May 08 11:15:02 COT 2017


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

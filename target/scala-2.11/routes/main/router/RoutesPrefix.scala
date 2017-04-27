
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/aj.paredes10/Documents/pmc/Back-End_Aigrowth/conf/routes
// @DATE:Thu Apr 27 21:35:52 GMT+05:00 2017


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

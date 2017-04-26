
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/jp.gonzalez14/Documents/workspace/backaigrowth/conf/routes
// @DATE:Wed Apr 26 15:21:57 COT 2017


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

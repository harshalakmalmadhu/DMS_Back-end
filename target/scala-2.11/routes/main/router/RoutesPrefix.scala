// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Harsha/Music/SWPM/conf/routes
// @DATE:Fri Sep 13 21:14:25 IST 2019


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

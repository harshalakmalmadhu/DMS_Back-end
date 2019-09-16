// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Harsha/Music/SWPM/DMS_Back-end/conf/routes
// @DATE:Sun Sep 15 00:00:32 IST 2019


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

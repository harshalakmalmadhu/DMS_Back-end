// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Harsha/Music/SWPM/DMS_Back-end/conf/routes
// @DATE:Sun Sep 15 00:00:32 IST 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {

  // @LINE:13
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file0)})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseUploadController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def insertDoc: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UploadController.insertDoc",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "insertDoc"})
        }
      """
    )
  
    // @LINE:21
    def insertDocParam: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UploadController.insertDocParam",
      """
        function(id0,document_id1,patient_id2,tenant3) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "insertDocPar" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("id", id0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("document_id", document_id1), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("patient_id", patient_id2), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("tenant", tenant3)])})
        }
      """
    )
  
    // @LINE:19
    def getAllDocs: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UploadController.getAllDocs",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getAllDocs"})
        }
      """
    )
  
    // @LINE:17
    def getFirstDoc: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UploadController.getFirstDoc",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getFirstDoc"})
        }
      """
    )
  
    // @LINE:23
    def insertBody: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UploadController.insertBody",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "insertBody"})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }


}

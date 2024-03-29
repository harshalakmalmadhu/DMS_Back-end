// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Harsha/Music/SWPM Final/DMS Backend/conf/routes
// @DATE:Mon Sep 16 10:20:26 IST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned(file:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:15
  class ReverseUploadController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def insertDoc(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "insertDoc")
    }
  
    // @LINE:21
    def insertDocParam(id:Int, document_id:String, patient_id:String, tenant:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "insertDocPar" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("id", id)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("document_id", document_id)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("patient_id", patient_id)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("tenant", tenant)))))
    }
  
    // @LINE:19
    def getAllDocs(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getAllDocs")
    }
  
    // @LINE:17
    def getFirstDoc(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getFirstDoc")
    }
  
    // @LINE:23
    def insertBody(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "insertBody")
    }
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }


}

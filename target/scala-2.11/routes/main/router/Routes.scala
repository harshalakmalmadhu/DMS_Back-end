// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Harsha/Music/SWPM/conf/routes
// @DATE:Fri Sep 13 21:14:25 IST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_4: controllers.HomeController,
  // @LINE:8
  CountController_1: controllers.CountController,
  // @LINE:10
  AsyncController_3: controllers.AsyncController,
  // @LINE:13
  Assets_2: controllers.Assets,
  // @LINE:15
  UploadController_0: controllers.UploadController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_4: controllers.HomeController,
    // @LINE:8
    CountController_1: controllers.CountController,
    // @LINE:10
    AsyncController_3: controllers.AsyncController,
    // @LINE:13
    Assets_2: controllers.Assets,
    // @LINE:15
    UploadController_0: controllers.UploadController
  ) = this(errorHandler, HomeController_4, CountController_1, AsyncController_3, Assets_2, UploadController_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_4, CountController_1, AsyncController_3, Assets_2, UploadController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """insertDoc""", """controllers.UploadController.insertDoc"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getFirstDoc""", """controllers.UploadController.getFirstDoc"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getAllDocs""", """controllers.UploadController.getAllDocs"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """insertDocPar""", """controllers.UploadController.insertDocParam(id:Int, document_id:String, patient_id:String, tenant:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_4.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_1.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_3.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_UploadController_insertDoc4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("insertDoc")))
  )
  private[this] lazy val controllers_UploadController_insertDoc4_invoker = createInvoker(
    UploadController_0.insertDoc,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UploadController",
      "insertDoc",
      Nil,
      "GET",
      this.prefix + """insertDoc""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_UploadController_getFirstDoc5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getFirstDoc")))
  )
  private[this] lazy val controllers_UploadController_getFirstDoc5_invoker = createInvoker(
    UploadController_0.getFirstDoc,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UploadController",
      "getFirstDoc",
      Nil,
      "GET",
      this.prefix + """getFirstDoc""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_UploadController_getAllDocs6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getAllDocs")))
  )
  private[this] lazy val controllers_UploadController_getAllDocs6_invoker = createInvoker(
    UploadController_0.getAllDocs,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UploadController",
      "getAllDocs",
      Nil,
      "GET",
      this.prefix + """getAllDocs""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_UploadController_insertDocParam7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("insertDocPar")))
  )
  private[this] lazy val controllers_UploadController_insertDocParam7_invoker = createInvoker(
    UploadController_0.insertDocParam(fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UploadController",
      "insertDocParam",
      Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),
      "POST",
      this.prefix + """insertDocPar""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_4.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params@_) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_1.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params@_) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_3.message)
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_Assets_versioned3_invoker.call(Assets_2.versioned(file))
      }
  
    // @LINE:15
    case controllers_UploadController_insertDoc4_route(params@_) =>
      call { 
        controllers_UploadController_insertDoc4_invoker.call(UploadController_0.insertDoc)
      }
  
    // @LINE:17
    case controllers_UploadController_getFirstDoc5_route(params@_) =>
      call { 
        controllers_UploadController_getFirstDoc5_invoker.call(UploadController_0.getFirstDoc)
      }
  
    // @LINE:19
    case controllers_UploadController_getAllDocs6_route(params@_) =>
      call { 
        controllers_UploadController_getAllDocs6_invoker.call(UploadController_0.getAllDocs)
      }
  
    // @LINE:21
    case controllers_UploadController_insertDocParam7_route(params@_) =>
      call(params.fromQuery[Int]("id", None), params.fromQuery[String]("document_id", None), params.fromQuery[String]("patient_id", None), params.fromQuery[String]("tenant", None)) { (id, document_id, patient_id, tenant) =>
        controllers_UploadController_insertDocParam7_invoker.call(UploadController_0.insertDocParam(id, document_id, patient_id, tenant))
      }
  }
}

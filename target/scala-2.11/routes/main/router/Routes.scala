
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/jp.gonzalez14/Documents/workspace/backaigrowth/conf/routes
// @DATE:Wed Apr 26 15:21:57 COT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_2: controllers.HomeController,
  // @LINE:8
  CountController_1: controllers.CountController,
  // @LINE:10
  AsyncController_3: controllers.AsyncController,
  // @LINE:13
  Assets_5: controllers.Assets,
  // @LINE:15
  PlantaController_4: controllers.PlantaController,
  // @LINE:21
  CategoriaController_0: controllers.CategoriaController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_2: controllers.HomeController,
    // @LINE:8
    CountController_1: controllers.CountController,
    // @LINE:10
    AsyncController_3: controllers.AsyncController,
    // @LINE:13
    Assets_5: controllers.Assets,
    // @LINE:15
    PlantaController_4: controllers.PlantaController,
    // @LINE:21
    CategoriaController_0: controllers.CategoriaController
  ) = this(errorHandler, HomeController_2, CountController_1, AsyncController_3, Assets_5, PlantaController_4, CategoriaController_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, CountController_1, AsyncController_3, Assets_5, PlantaController_4, CategoriaController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """plantas""", """controllers.PlantaController.getPlantas()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """planta/""" + "$" + """id<[^/]+>""", """controllers.PlantaController.getPlanta(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categoria/""" + "$" + """id<[^/]+>/planta""", """controllers.PlantaController.createPlantaEnCategoria(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """planta/""" + "$" + """id<[^/]+>""", """controllers.PlantaController.updatePlanta(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """planta/""" + "$" + """id<[^/]+>""", """controllers.PlantaController.deletePlanta(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categoria""", """controllers.CategoriaController.getCategorias()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categoria/""" + "$" + """id<[^/]+>""", """controllers.CategoriaController.getPlanta(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categoria""", """controllers.CategoriaController.createCategoria()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categoria/""" + "$" + """id<[^/]+>""", """controllers.CategoriaController.updateCategoria(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categoria/""" + "$" + """id<[^/]+>""", """controllers.CategoriaController.deleteCategoria(id:Long)"""),
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
    HomeController_2.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_1.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_3.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_PlantaController_getPlantas4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("plantas")))
  )
  private[this] lazy val controllers_PlantaController_getPlantas4_invoker = createInvoker(
    PlantaController_4.getPlantas(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PlantaController",
      "getPlantas",
      Nil,
      "GET",
      """""",
      this.prefix + """plantas"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_PlantaController_getPlanta5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("planta/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PlantaController_getPlanta5_invoker = createInvoker(
    PlantaController_4.getPlanta(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PlantaController",
      "getPlanta",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """planta/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_PlantaController_createPlantaEnCategoria6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categoria/"), DynamicPart("id", """[^/]+""",true), StaticPart("/planta")))
  )
  private[this] lazy val controllers_PlantaController_createPlantaEnCategoria6_invoker = createInvoker(
    PlantaController_4.createPlantaEnCategoria(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PlantaController",
      "createPlantaEnCategoria",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """categoria/""" + "$" + """id<[^/]+>/planta"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_PlantaController_updatePlanta7_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("planta/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PlantaController_updatePlanta7_invoker = createInvoker(
    PlantaController_4.updatePlanta(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PlantaController",
      "updatePlanta",
      Seq(classOf[Long]),
      "PUT",
      """""",
      this.prefix + """planta/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_PlantaController_deletePlanta8_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("planta/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PlantaController_deletePlanta8_invoker = createInvoker(
    PlantaController_4.deletePlanta(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PlantaController",
      "deletePlanta",
      Seq(classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """planta/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_CategoriaController_getCategorias9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categoria")))
  )
  private[this] lazy val controllers_CategoriaController_getCategorias9_invoker = createInvoker(
    CategoriaController_0.getCategorias(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoriaController",
      "getCategorias",
      Nil,
      "GET",
      """""",
      this.prefix + """categoria"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_CategoriaController_getPlanta10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categoria/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CategoriaController_getPlanta10_invoker = createInvoker(
    CategoriaController_0.getPlanta(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoriaController",
      "getPlanta",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """categoria/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_CategoriaController_createCategoria11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categoria")))
  )
  private[this] lazy val controllers_CategoriaController_createCategoria11_invoker = createInvoker(
    CategoriaController_0.createCategoria(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoriaController",
      "createCategoria",
      Nil,
      "POST",
      """""",
      this.prefix + """categoria"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_CategoriaController_updateCategoria12_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categoria/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CategoriaController_updateCategoria12_invoker = createInvoker(
    CategoriaController_0.updateCategoria(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoriaController",
      "updateCategoria",
      Seq(classOf[Long]),
      "PUT",
      """""",
      this.prefix + """categoria/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_CategoriaController_deleteCategoria13_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categoria/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CategoriaController_deleteCategoria13_invoker = createInvoker(
    CategoriaController_0.deleteCategoria(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoriaController",
      "deleteCategoria",
      Seq(classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """categoria/""" + "$" + """id<[^/]+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_1.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_3.message)
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_5.versioned(path, file))
      }
  
    // @LINE:15
    case controllers_PlantaController_getPlantas4_route(params) =>
      call { 
        controllers_PlantaController_getPlantas4_invoker.call(PlantaController_4.getPlantas())
      }
  
    // @LINE:16
    case controllers_PlantaController_getPlanta5_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PlantaController_getPlanta5_invoker.call(PlantaController_4.getPlanta(id))
      }
  
    // @LINE:17
    case controllers_PlantaController_createPlantaEnCategoria6_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PlantaController_createPlantaEnCategoria6_invoker.call(PlantaController_4.createPlantaEnCategoria(id))
      }
  
    // @LINE:18
    case controllers_PlantaController_updatePlanta7_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PlantaController_updatePlanta7_invoker.call(PlantaController_4.updatePlanta(id))
      }
  
    // @LINE:19
    case controllers_PlantaController_deletePlanta8_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PlantaController_deletePlanta8_invoker.call(PlantaController_4.deletePlanta(id))
      }
  
    // @LINE:21
    case controllers_CategoriaController_getCategorias9_route(params) =>
      call { 
        controllers_CategoriaController_getCategorias9_invoker.call(CategoriaController_0.getCategorias())
      }
  
    // @LINE:22
    case controllers_CategoriaController_getPlanta10_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CategoriaController_getPlanta10_invoker.call(CategoriaController_0.getPlanta(id))
      }
  
    // @LINE:23
    case controllers_CategoriaController_createCategoria11_route(params) =>
      call { 
        controllers_CategoriaController_createCategoria11_invoker.call(CategoriaController_0.createCategoria())
      }
  
    // @LINE:24
    case controllers_CategoriaController_updateCategoria12_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CategoriaController_updateCategoria12_invoker.call(CategoriaController_0.updateCategoria(id))
      }
  
    // @LINE:25
    case controllers_CategoriaController_deleteCategoria13_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CategoriaController_deleteCategoria13_invoker.call(CategoriaController_0.deleteCategoria(id))
      }
  }
}


// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/jp.gonzalez14/Documents/workspace/Back-End_Aigrowth/conf/routes
// @DATE:Wed May 03 16:14:19 COT 2017

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
  Assets_7: controllers.Assets,
  // @LINE:15
  PlantaController_6: controllers.PlantaController,
  // @LINE:21
  CategoriaController_0: controllers.CategoriaController,
  // @LINE:29
  UsuarioController_5: controllers.UsuarioController,
  // @LINE:37
  TablaDeCrecimientoController_4: controllers.TablaDeCrecimientoController,
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
    Assets_7: controllers.Assets,
    // @LINE:15
    PlantaController_6: controllers.PlantaController,
    // @LINE:21
    CategoriaController_0: controllers.CategoriaController,
    // @LINE:29
    UsuarioController_5: controllers.UsuarioController,
    // @LINE:37
    TablaDeCrecimientoController_4: controllers.TablaDeCrecimientoController
  ) = this(errorHandler, HomeController_2, CountController_1, AsyncController_3, Assets_7, PlantaController_6, CategoriaController_0, UsuarioController_5, TablaDeCrecimientoController_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, CountController_1, AsyncController_3, Assets_7, PlantaController_6, CategoriaController_0, UsuarioController_5, TablaDeCrecimientoController_4, prefix)
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios""", """controllers.UsuarioController.getUsuarios()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario/""" + "$" + """id<[^/]+>""", """controllers.UsuarioController.getUsuario(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario""", """controllers.UsuarioController.createUsuario()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario/""" + "$" + """id<[^/]+>""", """controllers.UsuarioController.updateUsuario(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario/""" + "$" + """id<[^/]+>""", """controllers.UsuarioController.deleteUsuario(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tablas""", """controllers.TablaDeCrecimientoController.getTablas()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tabla/""" + "$" + """id<[^/]+>""", """controllers.TablaDeCrecimientoController.getTabla(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tabla""", """controllers.TablaDeCrecimientoController.createTabla()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tabla/""" + "$" + """id<[^/]+>""", """controllers.TablaDeCrecimientoController.updateTabla(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tabla/""" + "$" + """id<[^/]+>""", """controllers.TablaDeCrecimientoController.deleteTabla(id:Long)"""),
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
    Assets_7.versioned(fakeValue[String], fakeValue[Asset]),
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
    PlantaController_6.getPlantas(),
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
    PlantaController_6.getPlanta(fakeValue[Long]),
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
    PlantaController_6.createPlantaEnCategoria(fakeValue[Long]),
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
    PlantaController_6.updatePlanta(fakeValue[Long]),
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
    PlantaController_6.deletePlanta(fakeValue[Long]),
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

  // @LINE:29
  private[this] lazy val controllers_UsuarioController_getUsuarios14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios")))
  )
  private[this] lazy val controllers_UsuarioController_getUsuarios14_invoker = createInvoker(
    UsuarioController_5.getUsuarios(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "getUsuarios",
      Nil,
      "GET",
      """""",
      this.prefix + """usuarios"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_UsuarioController_getUsuario15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UsuarioController_getUsuario15_invoker = createInvoker(
    UsuarioController_5.getUsuario(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "getUsuario",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """usuario/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_UsuarioController_createUsuario16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario")))
  )
  private[this] lazy val controllers_UsuarioController_createUsuario16_invoker = createInvoker(
    UsuarioController_5.createUsuario(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "createUsuario",
      Nil,
      "POST",
      """""",
      this.prefix + """usuario"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_UsuarioController_updateUsuario17_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UsuarioController_updateUsuario17_invoker = createInvoker(
    UsuarioController_5.updateUsuario(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "updateUsuario",
      Seq(classOf[Long]),
      "PUT",
      """""",
      this.prefix + """usuario/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_UsuarioController_deleteUsuario18_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UsuarioController_deleteUsuario18_invoker = createInvoker(
    UsuarioController_5.deleteUsuario(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "deleteUsuario",
      Seq(classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """usuario/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_TablaDeCrecimientoController_getTablas19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tablas")))
  )
  private[this] lazy val controllers_TablaDeCrecimientoController_getTablas19_invoker = createInvoker(
    TablaDeCrecimientoController_4.getTablas(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TablaDeCrecimientoController",
      "getTablas",
      Nil,
      "GET",
      """""",
      this.prefix + """tablas"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_TablaDeCrecimientoController_getTabla20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tabla/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TablaDeCrecimientoController_getTabla20_invoker = createInvoker(
    TablaDeCrecimientoController_4.getTabla(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TablaDeCrecimientoController",
      "getTabla",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """tabla/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_TablaDeCrecimientoController_createTabla21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tabla")))
  )
  private[this] lazy val controllers_TablaDeCrecimientoController_createTabla21_invoker = createInvoker(
    TablaDeCrecimientoController_4.createTabla(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TablaDeCrecimientoController",
      "createTabla",
      Nil,
      "POST",
      """""",
      this.prefix + """tabla"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_TablaDeCrecimientoController_updateTabla22_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tabla/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TablaDeCrecimientoController_updateTabla22_invoker = createInvoker(
    TablaDeCrecimientoController_4.updateTabla(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TablaDeCrecimientoController",
      "updateTabla",
      Seq(classOf[Long]),
      "PUT",
      """""",
      this.prefix + """tabla/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_TablaDeCrecimientoController_deleteTabla23_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tabla/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TablaDeCrecimientoController_deleteTabla23_invoker = createInvoker(
    TablaDeCrecimientoController_4.deleteTabla(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TablaDeCrecimientoController",
      "deleteTabla",
      Seq(classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """tabla/""" + "$" + """id<[^/]+>"""
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
        controllers_Assets_versioned3_invoker.call(Assets_7.versioned(path, file))
      }
  
    // @LINE:15
    case controllers_PlantaController_getPlantas4_route(params) =>
      call { 
        controllers_PlantaController_getPlantas4_invoker.call(PlantaController_6.getPlantas())
      }
  
    // @LINE:16
    case controllers_PlantaController_getPlanta5_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PlantaController_getPlanta5_invoker.call(PlantaController_6.getPlanta(id))
      }
  
    // @LINE:17
    case controllers_PlantaController_createPlantaEnCategoria6_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PlantaController_createPlantaEnCategoria6_invoker.call(PlantaController_6.createPlantaEnCategoria(id))
      }
  
    // @LINE:18
    case controllers_PlantaController_updatePlanta7_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PlantaController_updatePlanta7_invoker.call(PlantaController_6.updatePlanta(id))
      }
  
    // @LINE:19
    case controllers_PlantaController_deletePlanta8_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PlantaController_deletePlanta8_invoker.call(PlantaController_6.deletePlanta(id))
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
  
    // @LINE:29
    case controllers_UsuarioController_getUsuarios14_route(params) =>
      call { 
        controllers_UsuarioController_getUsuarios14_invoker.call(UsuarioController_5.getUsuarios())
      }
  
    // @LINE:30
    case controllers_UsuarioController_getUsuario15_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UsuarioController_getUsuario15_invoker.call(UsuarioController_5.getUsuario(id))
      }
  
    // @LINE:31
    case controllers_UsuarioController_createUsuario16_route(params) =>
      call { 
        controllers_UsuarioController_createUsuario16_invoker.call(UsuarioController_5.createUsuario())
      }
  
    // @LINE:32
    case controllers_UsuarioController_updateUsuario17_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UsuarioController_updateUsuario17_invoker.call(UsuarioController_5.updateUsuario(id))
      }
  
    // @LINE:33
    case controllers_UsuarioController_deleteUsuario18_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UsuarioController_deleteUsuario18_invoker.call(UsuarioController_5.deleteUsuario(id))
      }
  
    // @LINE:37
    case controllers_TablaDeCrecimientoController_getTablas19_route(params) =>
      call { 
        controllers_TablaDeCrecimientoController_getTablas19_invoker.call(TablaDeCrecimientoController_4.getTablas())
      }
  
    // @LINE:38
    case controllers_TablaDeCrecimientoController_getTabla20_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TablaDeCrecimientoController_getTabla20_invoker.call(TablaDeCrecimientoController_4.getTabla(id))
      }
  
    // @LINE:39
    case controllers_TablaDeCrecimientoController_createTabla21_route(params) =>
      call { 
        controllers_TablaDeCrecimientoController_createTabla21_invoker.call(TablaDeCrecimientoController_4.createTabla())
      }
  
    // @LINE:40
    case controllers_TablaDeCrecimientoController_updateTabla22_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TablaDeCrecimientoController_updateTabla22_invoker.call(TablaDeCrecimientoController_4.updateTabla(id))
      }
  
    // @LINE:41
    case controllers_TablaDeCrecimientoController_deleteTabla23_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TablaDeCrecimientoController_deleteTabla23_invoker.call(TablaDeCrecimientoController_4.deleteTabla(id))
      }
  }
}

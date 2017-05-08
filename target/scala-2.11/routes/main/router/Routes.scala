
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Sofia/Documents/Back-End_Aigrowth/conf/routes
// @DATE:Mon May 08 11:15:02 COT 2017

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
  Assets_9: controllers.Assets,
  // @LINE:15
  PlantaController_8: controllers.PlantaController,
  // @LINE:21
  CategoriaController_0: controllers.CategoriaController,
  // @LINE:29
  UsuarioController_5: controllers.UsuarioController,
  // @LINE:37
  TablaDeCrecimientoController_4: controllers.TablaDeCrecimientoController,
  // @LINE:45
  TablaEstaticaController_6: controllers.TablaEstaticaController,
  // @LINE:53
  ReporteController_7: controllers.ReporteController,
  // @LINE:61
  SensorController_10: controllers.SensorController,
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
    Assets_9: controllers.Assets,
    // @LINE:15
    PlantaController_8: controllers.PlantaController,
    // @LINE:21
    CategoriaController_0: controllers.CategoriaController,
    // @LINE:29
    UsuarioController_5: controllers.UsuarioController,
    // @LINE:37
    TablaDeCrecimientoController_4: controllers.TablaDeCrecimientoController,
    // @LINE:45
    TablaEstaticaController_6: controllers.TablaEstaticaController,
    // @LINE:53
    ReporteController_7: controllers.ReporteController,
    // @LINE:61
    SensorController_10: controllers.SensorController
  ) = this(errorHandler, HomeController_2, CountController_1, AsyncController_3, Assets_9, PlantaController_8, CategoriaController_0, UsuarioController_5, TablaDeCrecimientoController_4, TablaEstaticaController_6, ReporteController_7, SensorController_10, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, CountController_1, AsyncController_3, Assets_9, PlantaController_8, CategoriaController_0, UsuarioController_5, TablaDeCrecimientoController_4, TablaEstaticaController_6, ReporteController_7, SensorController_10, prefix)
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
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """planta""", """controllers.PlantaController.createPlantaEnCategoria()"""),
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
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """planta/""" + "$" + """id<[^/]+>/tabla""", """controllers.TablaDeCrecimientoController.createTabla(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tabla/""" + "$" + """id<[^/]+>""", """controllers.TablaDeCrecimientoController.updateTabla(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tabla/""" + "$" + """id<[^/]+>""", """controllers.TablaDeCrecimientoController.deleteTabla(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tablas_estatica""", """controllers.TablaEstaticaController.getTablas()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tabla_estatica/""" + "$" + """id<[^/]+>""", """controllers.TablaEstaticaController.getTabla(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tabla_estatica""", """controllers.TablaEstaticaController.createTabla()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tabla_estatica/""" + "$" + """id<[^/]+>""", """controllers.TablaEstaticaController.updateTabla(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tabla_estatica/""" + "$" + """id<[^/]+>""", """controllers.TablaEstaticaController.deleteTabla(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """planta/""" + "$" + """id<[^/]+>/reportes""", """controllers.ReporteController.getReportes(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sensores""", """controllers.SensorController.getSensores()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sensor/""" + "$" + """id<[^/]+>""", """controllers.SensorController.getSensor(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """planta/""" + "$" + """id<[^/]+>/sensor""", """controllers.SensorController.createSensor(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """planta/""" + "$" + """idP<[^/]+>/sensor/""" + "$" + """id<[^/]+>""", """controllers.SensorController.updateSensor(id:Long, idP:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sensor/""" + "$" + """id<[^/]+>""", """controllers.SensorController.deleteSensor(id:Long)"""),
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
    Assets_9.versioned(fakeValue[String], fakeValue[Asset]),
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
    PlantaController_8.getPlantas(),
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
    PlantaController_8.getPlanta(fakeValue[Long]),
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
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("planta")))
  )
  private[this] lazy val controllers_PlantaController_createPlantaEnCategoria6_invoker = createInvoker(
    PlantaController_8.createPlantaEnCategoria(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PlantaController",
      "createPlantaEnCategoria",
      Nil,
      "POST",
      """""",
      this.prefix + """planta"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_PlantaController_updatePlanta7_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("planta/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PlantaController_updatePlanta7_invoker = createInvoker(
    PlantaController_8.updatePlanta(fakeValue[Long]),
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
    PlantaController_8.deletePlanta(fakeValue[Long]),
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
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("planta/"), DynamicPart("id", """[^/]+""",true), StaticPart("/tabla")))
  )
  private[this] lazy val controllers_TablaDeCrecimientoController_createTabla21_invoker = createInvoker(
    TablaDeCrecimientoController_4.createTabla(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TablaDeCrecimientoController",
      "createTabla",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """planta/""" + "$" + """id<[^/]+>/tabla"""
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

  // @LINE:45
  private[this] lazy val controllers_TablaEstaticaController_getTablas24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tablas_estatica")))
  )
  private[this] lazy val controllers_TablaEstaticaController_getTablas24_invoker = createInvoker(
    TablaEstaticaController_6.getTablas(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TablaEstaticaController",
      "getTablas",
      Nil,
      "GET",
      """""",
      this.prefix + """tablas_estatica"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_TablaEstaticaController_getTabla25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tabla_estatica/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TablaEstaticaController_getTabla25_invoker = createInvoker(
    TablaEstaticaController_6.getTabla(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TablaEstaticaController",
      "getTabla",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """tabla_estatica/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_TablaEstaticaController_createTabla26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tabla_estatica")))
  )
  private[this] lazy val controllers_TablaEstaticaController_createTabla26_invoker = createInvoker(
    TablaEstaticaController_6.createTabla(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TablaEstaticaController",
      "createTabla",
      Nil,
      "POST",
      """""",
      this.prefix + """tabla_estatica"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_TablaEstaticaController_updateTabla27_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tabla_estatica/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TablaEstaticaController_updateTabla27_invoker = createInvoker(
    TablaEstaticaController_6.updateTabla(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TablaEstaticaController",
      "updateTabla",
      Seq(classOf[Long]),
      "PUT",
      """""",
      this.prefix + """tabla_estatica/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:49
  private[this] lazy val controllers_TablaEstaticaController_deleteTabla28_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tabla_estatica/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TablaEstaticaController_deleteTabla28_invoker = createInvoker(
    TablaEstaticaController_6.deleteTabla(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TablaEstaticaController",
      "deleteTabla",
      Seq(classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """tabla_estatica/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:53
  private[this] lazy val controllers_ReporteController_getReportes29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("planta/"), DynamicPart("id", """[^/]+""",true), StaticPart("/reportes")))
  )
  private[this] lazy val controllers_ReporteController_getReportes29_invoker = createInvoker(
    ReporteController_7.getReportes(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReporteController",
      "getReportes",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """planta/""" + "$" + """id<[^/]+>/reportes"""
    )
  )

  // @LINE:61
  private[this] lazy val controllers_SensorController_getSensores30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sensores")))
  )
  private[this] lazy val controllers_SensorController_getSensores30_invoker = createInvoker(
    SensorController_10.getSensores(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SensorController",
      "getSensores",
      Nil,
      "GET",
      """""",
      this.prefix + """sensores"""
    )
  )

  // @LINE:62
  private[this] lazy val controllers_SensorController_getSensor31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sensor/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SensorController_getSensor31_invoker = createInvoker(
    SensorController_10.getSensor(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SensorController",
      "getSensor",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """sensor/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:63
  private[this] lazy val controllers_SensorController_createSensor32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("planta/"), DynamicPart("id", """[^/]+""",true), StaticPart("/sensor")))
  )
  private[this] lazy val controllers_SensorController_createSensor32_invoker = createInvoker(
    SensorController_10.createSensor(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SensorController",
      "createSensor",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """planta/""" + "$" + """id<[^/]+>/sensor"""
    )
  )

  // @LINE:64
  private[this] lazy val controllers_SensorController_updateSensor33_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("planta/"), DynamicPart("idP", """[^/]+""",true), StaticPart("/sensor/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SensorController_updateSensor33_invoker = createInvoker(
    SensorController_10.updateSensor(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SensorController",
      "updateSensor",
      Seq(classOf[Long], classOf[Long]),
      "PUT",
      """""",
      this.prefix + """planta/""" + "$" + """idP<[^/]+>/sensor/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:65
  private[this] lazy val controllers_SensorController_deleteSensor34_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sensor/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SensorController_deleteSensor34_invoker = createInvoker(
    SensorController_10.deleteSensor(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SensorController",
      "deleteSensor",
      Seq(classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """sensor/""" + "$" + """id<[^/]+>"""
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
        controllers_Assets_versioned3_invoker.call(Assets_9.versioned(path, file))
      }
  
    // @LINE:15
    case controllers_PlantaController_getPlantas4_route(params) =>
      call { 
        controllers_PlantaController_getPlantas4_invoker.call(PlantaController_8.getPlantas())
      }
  
    // @LINE:16
    case controllers_PlantaController_getPlanta5_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PlantaController_getPlanta5_invoker.call(PlantaController_8.getPlanta(id))
      }
  
    // @LINE:17
    case controllers_PlantaController_createPlantaEnCategoria6_route(params) =>
      call { 
        controllers_PlantaController_createPlantaEnCategoria6_invoker.call(PlantaController_8.createPlantaEnCategoria())
      }
  
    // @LINE:18
    case controllers_PlantaController_updatePlanta7_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PlantaController_updatePlanta7_invoker.call(PlantaController_8.updatePlanta(id))
      }
  
    // @LINE:19
    case controllers_PlantaController_deletePlanta8_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PlantaController_deletePlanta8_invoker.call(PlantaController_8.deletePlanta(id))
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
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TablaDeCrecimientoController_createTabla21_invoker.call(TablaDeCrecimientoController_4.createTabla(id))
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
  
    // @LINE:45
    case controllers_TablaEstaticaController_getTablas24_route(params) =>
      call { 
        controllers_TablaEstaticaController_getTablas24_invoker.call(TablaEstaticaController_6.getTablas())
      }
  
    // @LINE:46
    case controllers_TablaEstaticaController_getTabla25_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TablaEstaticaController_getTabla25_invoker.call(TablaEstaticaController_6.getTabla(id))
      }
  
    // @LINE:47
    case controllers_TablaEstaticaController_createTabla26_route(params) =>
      call { 
        controllers_TablaEstaticaController_createTabla26_invoker.call(TablaEstaticaController_6.createTabla())
      }
  
    // @LINE:48
    case controllers_TablaEstaticaController_updateTabla27_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TablaEstaticaController_updateTabla27_invoker.call(TablaEstaticaController_6.updateTabla(id))
      }
  
    // @LINE:49
    case controllers_TablaEstaticaController_deleteTabla28_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TablaEstaticaController_deleteTabla28_invoker.call(TablaEstaticaController_6.deleteTabla(id))
      }
  
    // @LINE:53
    case controllers_ReporteController_getReportes29_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ReporteController_getReportes29_invoker.call(ReporteController_7.getReportes(id))
      }
  
    // @LINE:61
    case controllers_SensorController_getSensores30_route(params) =>
      call { 
        controllers_SensorController_getSensores30_invoker.call(SensorController_10.getSensores())
      }
  
    // @LINE:62
    case controllers_SensorController_getSensor31_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SensorController_getSensor31_invoker.call(SensorController_10.getSensor(id))
      }
  
    // @LINE:63
    case controllers_SensorController_createSensor32_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SensorController_createSensor32_invoker.call(SensorController_10.createSensor(id))
      }
  
    // @LINE:64
    case controllers_SensorController_updateSensor33_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromPath[Long]("idP", None)) { (id, idP) =>
        controllers_SensorController_updateSensor33_invoker.call(SensorController_10.updateSensor(id, idP))
      }
  
    // @LINE:65
    case controllers_SensorController_deleteSensor34_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SensorController_deleteSensor34_invoker.call(SensorController_10.deleteSensor(id))
      }
  }
}

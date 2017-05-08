
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Sofia/Documents/Back-End_Aigrowth/conf/routes
// @DATE:Mon May 08 11:15:02 COT 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:37
  class ReverseTablaDeCrecimientoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def createTabla: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TablaDeCrecimientoController.createTabla",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "planta/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/tabla"})
        }
      """
    )
  
    // @LINE:41
    def deleteTabla: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TablaDeCrecimientoController.deleteTabla",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "tabla/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:40
    def updateTabla: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TablaDeCrecimientoController.updateTabla",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "tabla/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:37
    def getTablas: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TablaDeCrecimientoController.getTablas",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tablas"})
        }
      """
    )
  
    // @LINE:38
    def getTabla: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TablaDeCrecimientoController.getTabla",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tabla/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseCategoriaController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def getPlanta: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoriaController.getPlanta",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categoria/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:24
    def updateCategoria: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoriaController.updateCategoria",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "categoria/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:25
    def deleteCategoria: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoriaController.deleteCategoria",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "categoria/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:21
    def getCategorias: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoriaController.getCategorias",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categoria"})
        }
      """
    )
  
    // @LINE:23
    def createCategoria: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoriaController.createCategoria",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "categoria"})
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

  // @LINE:15
  class ReversePlantaController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def deletePlanta: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PlantaController.deletePlanta",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "planta/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:17
    def createPlantaEnCategoria: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PlantaController.createPlantaEnCategoria",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "planta"})
        }
      """
    )
  
    // @LINE:16
    def getPlanta: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PlantaController.getPlanta",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "planta/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:18
    def updatePlanta: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PlantaController.updatePlanta",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "planta/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:15
    def getPlantas: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PlantaController.getPlantas",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "plantas"})
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

  // @LINE:61
  class ReverseSensorController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:64
    def updateSensor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SensorController.updateSensor",
      """
        function(id0,idP1) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "planta/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idP", idP1) + "/sensor/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:63
    def createSensor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SensorController.createSensor",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "planta/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/sensor"})
        }
      """
    )
  
    // @LINE:65
    def deleteSensor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SensorController.deleteSensor",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "sensor/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:62
    def getSensor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SensorController.getSensor",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sensor/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:61
    def getSensores: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SensorController.getSensores",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sensores"})
        }
      """
    )
  
  }

  // @LINE:53
  class ReverseReporteController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:53
    def getReportes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReporteController.getReportes",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "planta/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/reportes"})
        }
      """
    )
  
  }

  // @LINE:45
  class ReverseTablaEstaticaController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def createTabla: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TablaEstaticaController.createTabla",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tabla_estatica"})
        }
      """
    )
  
    // @LINE:49
    def deleteTabla: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TablaEstaticaController.deleteTabla",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "tabla_estatica/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:48
    def updateTabla: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TablaEstaticaController.updateTabla",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "tabla_estatica/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:45
    def getTablas: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TablaEstaticaController.getTablas",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tablas_estatica"})
        }
      """
    )
  
    // @LINE:46
    def getTabla: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TablaEstaticaController.getTabla",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tabla_estatica/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }

  // @LINE:29
  class ReverseUsuarioController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def getUsuarios: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.getUsuarios",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios"})
        }
      """
    )
  
    // @LINE:30
    def getUsuario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.getUsuario",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:33
    def deleteUsuario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.deleteUsuario",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:32
    def updateUsuario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.updateUsuario",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:31
    def createUsuario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.createUsuario",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario"})
        }
      """
    )
  
  }


}

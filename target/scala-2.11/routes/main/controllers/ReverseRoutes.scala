
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Sofia/Documents/Back-End_Aigrowth/conf/routes
// @DATE:Mon May 08 11:15:02 COT 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:37
  class ReverseTablaDeCrecimientoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def createTabla(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "planta/" + implicitly[PathBindable[Long]].unbind("id", id) + "/tabla")
    }
  
    // @LINE:41
    def deleteTabla(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "tabla/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:40
    def updateTabla(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "tabla/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:37
    def getTablas(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "tablas")
    }
  
    // @LINE:38
    def getTabla(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "tabla/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:21
  class ReverseCategoriaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def getPlanta(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "categoria/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:24
    def updateCategoria(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "categoria/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:25
    def deleteCategoria(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "categoria/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:21
    def getCategorias(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "categoria")
    }
  
    // @LINE:23
    def createCategoria(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "categoria")
    }
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:15
  class ReversePlantaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def deletePlanta(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "planta/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:17
    def createPlantaEnCategoria(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "planta")
    }
  
    // @LINE:16
    def getPlanta(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "planta/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:18
    def updatePlanta(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "planta/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:15
    def getPlantas(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "plantas")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
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
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:61
  class ReverseSensorController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:64
    def updateSensor(id:Long, idP:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "planta/" + implicitly[PathBindable[Long]].unbind("idP", idP) + "/sensor/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:63
    def createSensor(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "planta/" + implicitly[PathBindable[Long]].unbind("id", id) + "/sensor")
    }
  
    // @LINE:65
    def deleteSensor(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "sensor/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:62
    def getSensor(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "sensor/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:61
    def getSensores(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "sensores")
    }
  
  }

  // @LINE:53
  class ReverseReporteController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:53
    def getReportes(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "planta/" + implicitly[PathBindable[Long]].unbind("id", id) + "/reportes")
    }
  
  }

  // @LINE:45
  class ReverseTablaEstaticaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def createTabla(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "tabla_estatica")
    }
  
    // @LINE:49
    def deleteTabla(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "tabla_estatica/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:48
    def updateTabla(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "tabla_estatica/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:45
    def getTablas(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "tablas_estatica")
    }
  
    // @LINE:46
    def getTabla(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "tabla_estatica/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:29
  class ReverseUsuarioController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def getUsuarios(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "usuarios")
    }
  
    // @LINE:30
    def getUsuario(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:33
    def deleteUsuario(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:32
    def updateUsuario(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:31
    def createUsuario(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "usuario")
    }
  
  }


}

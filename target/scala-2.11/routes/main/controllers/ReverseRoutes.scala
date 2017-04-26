
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/jp.gonzalez14/Documents/workspace/backaigrowth/conf/routes
// @DATE:Wed Apr 26 15:21:57 COT 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

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
    def createPlantaEnCategoria(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "categoria/" + implicitly[PathBindable[Long]].unbind("id", id) + "/planta")
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


}

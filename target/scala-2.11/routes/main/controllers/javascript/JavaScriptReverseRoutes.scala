
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/jp.gonzalez14/Documents/workspace/backaigrowth/conf/routes
// @DATE:Wed Apr 26 15:21:57 COT 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

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
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "categoria/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/planta"})
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


}

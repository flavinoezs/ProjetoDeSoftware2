// @SOURCE:/home/flavio/workspace/ProjetoSW2/conf/routes
// @HASH:1a1ec2ef8948dedf431d5032c49f623b26472b4a
// @DATE:Mon Jun 03 12:05:05 BRT 2013

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:9
val controllers_SignUp_blank1 = Route("GET", PathPattern(List(StaticPart("/signup"))))
                    

// @LINE:11
val controllers_SignUp_create2 = Route("GET", PathPattern(List(StaticPart("/users/fakeuser"))))
                    

// @LINE:12
val controllers_SignUp_submit3 = Route("POST", PathPattern(List(StaticPart("/signup"))))
                    

// @LINE:26
val controllers_Assets_at4 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index()"""),("""GET""","""/signup""","""controllers.SignUp.blank()"""),("""GET""","""/users/fakeuser""","""controllers.SignUp.create()"""),("""POST""","""/signup""","""controllers.SignUp.submit()"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:9
case controllers_SignUp_blank1(params) => {
   call { 
        invokeHandler(_root_.controllers.SignUp.blank(), HandlerDef(this, "controllers.SignUp", "blank", Nil))
   }
}
                    

// @LINE:11
case controllers_SignUp_create2(params) => {
   call { 
        invokeHandler(_root_.controllers.SignUp.create(), HandlerDef(this, "controllers.SignUp", "create", Nil))
   }
}
                    

// @LINE:12
case controllers_SignUp_submit3(params) => {
   call { 
        invokeHandler(_root_.controllers.SignUp.submit(), HandlerDef(this, "controllers.SignUp", "submit", Nil))
   }
}
                    

// @LINE:26
case controllers_Assets_at4(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                
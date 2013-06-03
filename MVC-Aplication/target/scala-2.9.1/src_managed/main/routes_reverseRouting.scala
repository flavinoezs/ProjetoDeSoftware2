// @SOURCE:/home/flavio/workspace/ProjetoSW2/conf/routes
// @HASH:1a1ec2ef8948dedf431d5032c49f623b26472b4a
// @DATE:Mon Jun 03 12:05:05 BRT 2013

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:26
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:6
package controllers {

// @LINE:12
// @LINE:11
// @LINE:9
class ReverseSignUp {
    


 
// @LINE:12
def submit() = {
   Call("POST", "/signup")
}
                                                        
 
// @LINE:9
def blank() = {
   Call("GET", "/signup")
}
                                                        
 
// @LINE:11
def create() = {
   Call("GET", "/users/fakeuser")
}
                                                        

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        

                      
    
}
                            

// @LINE:26
class ReverseAssets {
    


 
// @LINE:26
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:26
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:12
// @LINE:11
// @LINE:9
class ReverseSignUp {
    


 
// @LINE:12
def submit = JavascriptReverseRoute(
   "controllers.SignUp.submit",
   """
      function() {
      return _wA({method:"POST", url:"/signup"})
      }
   """
)
                                                        
 
// @LINE:9
def blank = JavascriptReverseRoute(
   "controllers.SignUp.blank",
   """
      function() {
      return _wA({method:"GET", url:"/signup"})
      }
   """
)
                                                        
 
// @LINE:11
def create = JavascriptReverseRoute(
   "controllers.SignUp.create",
   """
      function() {
      return _wA({method:"GET", url:"/users/fakeuser"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:26
class ReverseAssets {
    


 
// @LINE:26
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:26
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:12
// @LINE:11
// @LINE:9
class ReverseSignUp {
    


 
// @LINE:12
def submit() = new play.api.mvc.HandlerRef(
   controllers.SignUp.submit(), HandlerDef(this, "controllers.SignUp", "submit", Seq())
)
                              
 
// @LINE:9
def blank() = new play.api.mvc.HandlerRef(
   controllers.SignUp.blank(), HandlerDef(this, "controllers.SignUp", "blank", Seq())
)
                              
 
// @LINE:11
def create() = new play.api.mvc.HandlerRef(
   controllers.SignUp.create(), HandlerDef(this, "controllers.SignUp", "create", Seq())
)
                              

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:26
class ReverseAssets {
    


 
// @LINE:26
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                
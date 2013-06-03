
package views.html.signup

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object summary extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[User,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(user: User):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.14*/("""

"""),_display_(Seq[Any](/*3.2*/main(Html("Account created!"), nav = "signup")/*3.48*/ {_display_(Seq[Any](format.raw/*3.50*/("""
    
    <h2>Your account:</h2>
    
    <h6>Username</h6>
    
    <p>
        """),_display_(Seq[Any](/*10.10*/user/*10.14*/.username)),format.raw/*10.23*/("""
    </p>
    
    <h6>Email</h6>
    
    <p>
        """),_display_(Seq[Any](/*16.10*/user/*16.14*/.email)),format.raw/*16.20*/("""
    </p>
    
    <h6>Password</h6>
    
    <p>
        """),_display_(Seq[Any](/*22.10*/user/*22.14*/.password)),format.raw/*22.23*/("""
    </p>
    
""")))})))}
    }
    
    def render(user:User) = apply(user)
    
    def f:((User) => play.api.templates.Html) = (user) => apply(user)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 12:05:07 BRT 2013
                    SOURCE: /home/flavio/workspace/ProjetoSW2/app/views/signup/summary.scala.html
                    HASH: 342906599ab3aba4b3bc8057e840f79163e6772d
                    MATRIX: 762->1|851->13|888->16|942->62|981->64|1099->146|1112->150|1143->159|1235->215|1248->219|1276->225|1371->284|1384->288|1415->297
                    LINES: 27->1|30->1|32->3|32->3|32->3|39->10|39->10|39->10|45->16|45->16|45->16|51->22|51->22|51->22
                    -- GENERATED --
                */
            
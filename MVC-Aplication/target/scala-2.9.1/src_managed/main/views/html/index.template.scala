
package views.html

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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main(Html("Sorteios"))/*1.24*/ {_display_(Seq[Any](format.raw/*1.26*/("""
    
    <h2>Sign up form</h2>

    <p>
        Demonstrate a classical sign up form.
    </p>

    <p>
        <a class="btn" href=""""),_display_(Seq[Any](/*10.31*/routes/*10.37*/.SignUp.blank)),format.raw/*10.50*/("""">View sample »</a>
    </p>

    <h2>Contact form</h2>

    <p>
        Demonstrate a contact manager that allow to add complex contact informations.
    </p>

    <p>

    </p>
    
""")))})))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 12:06:13 BRT 2013
                    SOURCE: /home/flavio/workspace/ProjetoSW2/app/views/index.scala.html
                    HASH: cd82956721ec4221b783bb2cba064e9e8da47fc2
                    MATRIX: 828->1|858->23|897->25|1068->160|1083->166|1118->179
                    LINES: 30->1|30->1|30->1|39->10|39->10|39->10
                    -- GENERATED --
                */
            
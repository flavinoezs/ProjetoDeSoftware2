
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
object form extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Login],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(signupForm: Form[Login]):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*6.2*/title/*6.7*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*6.11*/("""
Logar
<small><a href=""""),_display_(Seq[Any](/*8.18*/routes/*8.24*/.SignUp.create)),format.raw/*8.38*/("""">ou, criar conta.</a></small>
""")))};
Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*9.2*/("""

"""),_display_(Seq[Any](/*11.2*/main(title, nav = "signup")/*11.29*/ {_display_(Seq[Any](format.raw/*11.31*/("""

"""),_display_(Seq[Any](/*13.2*/helper/*13.8*/.form(action = routes.SignUp.submit)/*13.44*/ {_display_(Seq[Any](format.raw/*13.46*/("""


<fieldset>
    """),_display_(Seq[Any](/*17.6*/if(signupForm.hasGlobalErrors)/*17.36*/ {_display_(Seq[Any](format.raw/*17.38*/("""
    <p class="error">
        """),_display_(Seq[Any](/*19.10*/signupForm/*19.20*/.globalError.message)),format.raw/*19.40*/("""
    </p>
    """)))})),format.raw/*21.6*/("""

    """),_display_(Seq[Any](/*23.6*/if(flash.contains("success"))/*23.35*/ {_display_(Seq[Any](format.raw/*23.37*/("""
    <p class="success">
        """),_display_(Seq[Any](/*25.10*/flash/*25.15*/.get("success"))),format.raw/*25.30*/("""
    </p>
    """)))})),format.raw/*27.6*/("""

    <p>
        <input type="email" name="email" placeholder="Email" value=""""),_display_(Seq[Any](/*30.70*/signupForm("email")/*30.89*/.value)),format.raw/*30.95*/("""">
    </p>
    <p>
        <input type="password" name="password" placeholder="Password">
    </p>
    <p>
        <input type="submit" class="btn primary" value="Vai">
    </p>

</fieldset>

<!-- <fieldset>

    """),_display_(Seq[Any](/*43.6*/checkbox(
        signupForm("accept"),
        '_label -> None, '_text -> "You aggree the Terms and conditions",
        '_showConstraints -> false
    ))),format.raw/*47.6*/("""

</fieldset>

<div class="actions">
    <input type="submit" class="btn primary" value="Ir">
</div>

""")))})),format.raw/*55.2*/("""  -->

""")))})))}
    }
    
    def render(signupForm:Form[Login]) = apply(signupForm)
    
    def f:((Form[Login]) => play.api.templates.Html) = (signupForm) => apply(signupForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 12:05:07 BRT 2013
                    SOURCE: /home/flavio/workspace/ProjetoSW2/app/views/signup/form.scala.html
                    HASH: 9571d4b1cdac271e435b56e50554ab71cc0c47ec
                    MATRIX: 766->1|901->81|913->86|980->90|1039->114|1053->120|1088->134|1159->26|1187->79|1214->166|1252->169|1288->196|1328->198|1366->201|1380->207|1425->243|1465->245|1519->264|1558->294|1598->296|1666->328|1685->338|1727->358|1773->373|1815->380|1853->409|1893->411|1963->445|1977->450|2014->465|2060->480|2175->559|2203->578|2231->584|2481->799|2656->953|2790->1056
                    LINES: 27->1|32->6|32->6|34->6|36->8|36->8|36->8|38->1|40->5|41->9|43->11|43->11|43->11|45->13|45->13|45->13|45->13|49->17|49->17|49->17|51->19|51->19|51->19|53->21|55->23|55->23|55->23|57->25|57->25|57->25|59->27|62->30|62->30|62->30|75->43|79->47|87->55
                    -- GENERATED --
                */
            
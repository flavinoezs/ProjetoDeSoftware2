
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
object form2 extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[User],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(signupForm2: Form[User]):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*6.2*/title/*6.7*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*6.11*/("""
Criar conta
""")))};
Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*8.2*/("""

"""),_display_(Seq[Any](/*10.2*/main(title, nav = "signup2")/*10.30*/ {_display_(Seq[Any](format.raw/*10.32*/("""

"""),_display_(Seq[Any](/*12.2*/helper/*12.8*/.form(action = routes.SignUp.submit)/*12.44*/ {_display_(Seq[Any](format.raw/*12.46*/("""

<fieldset>
    <legend>Informações</legend>

    """),_display_(Seq[Any](/*17.6*/inputText(
    signupForm2("username"),
    '_label -> "Username",
    '_help -> "Favor entrar com um Username válido.",
    '_error -> signupForm2.globalError
    ))),format.raw/*22.6*/("""

    """),_display_(Seq[Any](/*24.6*/inputText(
    signupForm2("email"), '_label -> "Email",
    '_help -> "Entre com um Email válido."
    ))),format.raw/*27.6*/("""

    """),_display_(Seq[Any](/*29.6*/inputPassword(
    signupForm2("password"),
    '_label -> "Password",
    '_help -> "Um password com no mínimo 6 caracteres. "
    ))),format.raw/*33.6*/("""

    """),_display_(Seq[Any](/*35.6*/inputPassword(
    signupForm2("repeatPassword"),
    '_label -> "Repita o password",
    '_help -> "Favor repetir o password.",
    '_error -> signupForm2.error("password")
    ))),format.raw/*40.6*/("""

</fieldset>

 <fieldset>

    """),_display_(Seq[Any](/*46.6*/checkbox(
        signupForm2("accept"),
        '_label -> None, '_text -> "Você concorca com nossos termos.",
        '_showConstraints -> false
    ))),format.raw/*50.6*/("""

</fieldset>

<div class="actions">
    <input type="submit" class="btn primary" value="Vai">
    <a href=""""),_display_(Seq[Any](/*56.15*/routes/*56.21*/.Application.index)),format.raw/*56.39*/("""" class="btn">Cancelar</a>
</div>

""")))})),format.raw/*59.2*/("""

""")))})))}
    }
    
    def render(signupForm2:Form[User]) = apply(signupForm2)
    
    def f:((Form[User]) => play.api.templates.Html) = (signupForm2) => apply(signupForm2)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 12:05:07 BRT 2013
                    SOURCE: /home/flavio/workspace/ProjetoSW2/app/views/signup/form2.scala.html
                    HASH: 91b23d8aeba1ee00f77e22eaec895dc3318e074e
                    MATRIX: 766->1|901->81|913->86|980->90|1033->26|1061->79|1088->104|1126->107|1163->135|1203->137|1241->140|1255->146|1300->182|1340->184|1427->236|1613->401|1655->408|1781->513|1823->520|1977->653|2019->660|2219->839|2287->872|2460->1024|2605->1133|2620->1139|2660->1157|2727->1193
                    LINES: 27->1|32->6|32->6|34->6|37->1|39->5|40->8|42->10|42->10|42->10|44->12|44->12|44->12|44->12|49->17|54->22|56->24|59->27|61->29|65->33|67->35|72->40|78->46|82->50|88->56|88->56|88->56|91->59
                    -- GENERATED --
                */
            
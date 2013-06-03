
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Html,String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: Html, nav: String = "")(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.48*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>Dado Virtual</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("/stylesheets/bootstrap.css"))),format.raw/*8.100*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("/stylesheets/main.css"))),format.raw/*9.95*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.59*/routes/*10.65*/.Assets.at("/images/dado.png"))),format.raw/*10.95*/("""">
        <script src=""""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*11.74*/("""" type="text/javascript"></script>
    </head>
    <body>
        
        <div class="topbar">
            <div class="fill">
                <div class="container">
                    <a class="brand" href=""""),_display_(Seq[Any](/*18.45*/routes/*18.51*/.Application.index())),format.raw/*18.71*/("""">Dado Virtual</a>
                    <ul class="nav">
                        <li class=""""),_display_(Seq[Any](/*20.37*/("active".when(nav == "login")))),format.raw/*20.68*/("""">
                            <a href=""""),_display_(Seq[Any](/*21.39*/routes/*21.45*/.SignUp.blank())),format.raw/*21.60*/("""">Entrar</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>

        <div class="container">

            <div class="content">
                
                <div class="page-header">
                    <h1>"""),_display_(Seq[Any](/*33.26*/title)),format.raw/*33.31*/("""</h1>
                </div>

                <div class="row">
                    <div class="span14">
                        """),_display_(Seq[Any](/*38.26*/content)),format.raw/*38.33*/("""
                    </div>
                </div>
                
            </div>

        </div>
        
    </body>
</html>
"""))}
    }
    
    def render(title:Html,nav:String,content:Html) = apply(title,nav)(content)
    
    def f:((Html,String) => (Html) => play.api.templates.Html) = (title,nav) => (content) => apply(title,nav)(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 03 12:05:07 BRT 2013
                    SOURCE: /home/flavio/workspace/ProjetoSW2/app/views/main.scala.html
                    HASH: 7c59e03892fd6204f7d7b0604374dced32879b90
                    MATRIX: 764->1|887->47|1048->173|1062->179|1124->219|1215->275|1229->281|1285->316|1382->377|1397->383|1449->413|1510->438|1525->444|1592->489|1839->700|1854->706|1896->726|2024->818|2077->849|2154->890|2169->896|2206->911|2520->1189|2547->1194|2713->1324|2742->1331
                    LINES: 27->1|30->1|37->8|37->8|37->8|38->9|38->9|38->9|39->10|39->10|39->10|40->11|40->11|40->11|47->18|47->18|47->18|49->20|49->20|50->21|50->21|50->21|62->33|62->33|67->38|67->38
                    -- GENERATED --
                */
            
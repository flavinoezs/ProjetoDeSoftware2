package controllers;

import models.Event;
import models.User;
import play.*;
import play.data.Form;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
    public static Result index() {
        return ok(index.render());
    }

    //public criarEvento(Event evento){
        //evento.save();
    //}
}
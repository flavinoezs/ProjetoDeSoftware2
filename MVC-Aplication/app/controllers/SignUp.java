package controllers;

import play.*;
import play.mvc.*;
import play.data.*;

import views.html.signup.*;

import models.*;

public class SignUp extends Controller {
    // -- Authentication

    /**
     * Defines a form wrapping the User class.
     */
    //final static Form<Login> signupForm = form(Login.class);

    /**
     * Display a blank form.
     */
    public static Result blank() {
        return ok(
                form.render(form(Login.class))
        );
    }

    /**
     * Display a form pre-filled with an existing account.
     */
    public static Result create() {
        return ok(
                form2.render(form(User.class))
        );
    }

    /**
     * Handle the form submission.
    */
    public static Result submit() {
        /*Form<User> filledForm = form.bindFromRequest();

        // Check accept conditions
        if(!"true".equals(filledForm.field("accept").value())) {
            filledForm.reject("accept", "You must accept the terms and conditions");
        }

        // Check repeated password
        if(!filledForm.field("password").valueOr("").isEmpty()) {
            if(!filledForm.field("password").valueOr("").equals(filledForm.field("repeatPassword").value())) {
                filledForm.reject("repeatPassword", "Password don't match");
            }
        }

        // Check if the username is valid
        if(!filledForm.hasErrors()) {
            if(filledForm.get().username.equals("admin") || filledForm.get().username.equals("guest")) {
                filledForm.reject("username", "This username is already taken");
            }
        }

        if(filledForm.hasErrors()) {
            return badRequest(form.render(filledForm));
        } else {
            User created = filledForm.get();
            return ok(summary.render(created));
        } */
        return ok();
    }
/*
    public static Result authenticate() {
        Form<Form> loginForm = form(Form.class).bindFromRequest();
        if(loginForm.hasErrors()) {
            return badRequest(login.render(loginForm));
        } else {
            session("email", loginForm.get().email);
            return redirect(
                    routes.Projects.index()
            );
        }
    }

    /**
     * Logout and clean the session.
     */
/*    public static Result logout() {
        session().clear();
        flash("success", "You've been logged out");
        return redirect(
                routes.Application.login()
        );
    }*/
}
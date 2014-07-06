package controllers;

import play.*;
import play.mvc.*;

/**
 * To work with new view, we need to import it as a normal Java dependency.
 */
import views.html.User.*;

public class User extends Controller {

    public static Result register() {
        return ok(register.render("Message used in view file"));
    }
}
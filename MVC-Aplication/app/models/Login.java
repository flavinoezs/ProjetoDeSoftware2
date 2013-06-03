package models;

/**
 * Created with IntelliJ IDEA.
 * User: flavio
 * Date: 02/04/13
 * Time: 22:37
 * To change this template use File | Settings | File Templates.
 */
public class Login {

    public String email;
    public String password;

    public String validate() {
        if(User.authenticate(email, password) == null) {
            return "Invalid user or password";
        }
        return null;
    }

}

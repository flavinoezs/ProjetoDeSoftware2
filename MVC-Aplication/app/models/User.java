package models;

import play.data.validation.Constraints.*;
import play.db.ebean.Model;
import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
@Table(name="account")
public class User extends Model{

//    @Required
//    @MinLength(4)
//    public int type;

    @Constraints.Required
    public String name;

    @Constraints.Required
    public String password;

    @Required
    @MinLength(4)
    public String username;
    
    @Required
    @Email
    public String email;

    
    public User(String username, String email, String password) {
//        this.type = type;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
// -- Queries

    public static Model.Finder<String,User> find = new Model.Finder(String.class, User.class);

    /**
     * Retrieve all users.
     */
    public static List<User> findAll() {
        return find.all();
    }

    /**
     * Retrieve a User from email.
     */
    public static User findByEmail(String email) {
        return find.where().eq("email", email).findUnique();
    }

    /**
     * Authenticate a User.
     */
    public static User authenticate(String email, String password) {
        return find.where()
                .eq("email", email)
                .eq("password", password)
                .findUnique();
    }

    // --

    public String toString() {
        return "User(" + email + ")";
    }

}

package models;

import play.data.format.*;
import play.data.validation.*;
import play.data.validation.Constraints.*;
import play.db.ebean.*;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="event")
public class Event extends Model{

    @Id
    @Constraints.Required
    @Formats.NonEmpty
    public int id;

    @Constraints.Required
    public String name;

    @Constraints.Required
    public boolean situation;

    @Formats.DateTime(pattern="MM/dd/yy HH:mm")
    @Constraints.Required
    public Date dueDate;

    public int result;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSituation() {
        return situation;
    }

    public void setSituation(boolean situation) {
        this.situation = situation;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public Event(String name, boolean situation, Date dueDate) {
//        this.type = type;
        this.name = name;
        this.situation = situation;
        this.dueDate = dueDate;
    }
}

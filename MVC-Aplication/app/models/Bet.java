package models;

import ch.qos.logback.classic.pattern.DateConverter;
import play.data.validation.Constraints.*;
import play.db.ebean.Model;
import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
@Table(name="bet")
public class Bet extends Model{

    @Id
    @Constraints.Required
    @Formats.NonEmpty
    public int id;

    @Constraints.Required
    public int assigned_event;

    @Constraints.Required
    public String assigned_account;

    @Constraints.Required
    public int bet;

    public Bet(Event event, User account, int bet) {
//        this.type = type;
        this.assigned_event = event.getId();
        this.assigned_account = account.getEmail();
        this.bet = bet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAssigned_event() {
        return assigned_event;
    }

    public void setAssigned_event(int assigned_event) {
        this.assigned_event = assigned_event;
    }

    public String getAssigned_account() {
        return assigned_account;
    }

    public void setAssigned_account(String assigned_account) {
        this.assigned_account = assigned_account;
    }

    public int getBet() {
        return bet;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }
}
package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 * Created by cryst on 9/14/2017.
 */

public abstract class CurrentMood {
    private Date date;
    private String message = "I am feeling";

    public CurrentMood(Date date) {
        this.date = date;
    }

    public CurrentMood(){
        this.date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String Feeling(String message){
        return "I am feeling" + message;
    }
}

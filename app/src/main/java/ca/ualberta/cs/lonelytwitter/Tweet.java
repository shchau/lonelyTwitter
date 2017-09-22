package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;
/**
 * Created by cryst on 9/14/2017.
 */

public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;

    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    @Override
    public String toString(){
        return date.toString()+" | " + message;
    }

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() <=140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    public Date getDate(){
        return date;
    }

    public String getMessage() {
        return message;
    }

    public ArrayList<CurrentMood> currentMood = new ArrayList<CurrentMood>();

    public abstract Boolean isImportant();
}

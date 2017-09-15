package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by cryst on 9/14/2017.
 */

public class ImportantTweet extends Tweet {
    public ImportantTweet(String message){
        super(message);
    }

    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}

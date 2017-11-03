package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

import io.searchbox.annotations.JestId;

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;
    @JestId
    private String id;

    public void setId(String id) {
        this.id = id;
    }

// --Commented out by Inspection START (11/2/2017 6:31 PM):
//    public String getId() {
//        return id;
//    }
// --Commented out by Inspection STOP (11/2/2017 6:31 PM)

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    @Override
    public String toString(){
        return message;
    }

    // --Commented out by Inspection (11/2/2017 6:31 PM):public abstract Boolean isImportant();


// --Commented out by Inspection START (11/2/2017 6:31 PM):
//    public void setMessage(String message) throws TweetTooLongException {
//        if (message.length() > 140){
//            //Do Something!
//            throw new TweetTooLongException();
//        }
//        this.message = message;
//    }
// --Commented out by Inspection STOP (11/2/2017 6:31 PM)

// --Commented out by Inspection START (11/2/2017 6:31 PM):
//    public void setDate(Date date) {
//        this.date = date;
//    }
// --Commented out by Inspection STOP (11/2/2017 6:31 PM)

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }
}

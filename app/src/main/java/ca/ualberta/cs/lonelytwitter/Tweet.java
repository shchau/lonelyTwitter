/*
 * Class Name: Tweet
 *
 * Version: Version 1.0
 *
 * Date: September 28th, 2017
 *
 * Copyright (c) Team SSMAD CMPUT301 University of Alberta.
 * All Rights Reserved. You may not use, distribute,
 * or modify this code under terms and conditions of the Code of Students Behaviour of University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 *Represents a Tweet
 * @author Simon Chau
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */

public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;

    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    /**
     * Constructs Tweet objects
     *
     * @param message Tweet message
     * @param date Tweet date
     */



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
        } else{
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


    /**
     * Sets Tweet messages
     *
     * @param message Tweet Message
     *
     * @throws TweetTooLongException
     */
}

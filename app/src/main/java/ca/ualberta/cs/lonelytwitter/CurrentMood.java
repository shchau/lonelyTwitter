/*
 * Class Name: CurrentMood
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

import java.util.Date;

/**
 * Represents current mood
 * @author Simon Chau
 * @version 1.0
 * @see HappyMood
 * @see SadMood
 * @since 1.0
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

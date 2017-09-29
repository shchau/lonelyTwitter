/*
 * Class Name: SadMood
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
 * Represents a Sad Mood for a user
 * @author Simon Chau
 * @version 1.0
 * @see CurrentMood
 * @since 1.0
 */

public class SadMood extends CurrentMood {
    private String message = "sad";

    public SadMood(Date date) {
        super(date);
    }

    @Override
    public String Feeling(String message) {
        return super.Feeling(message);
    }
}
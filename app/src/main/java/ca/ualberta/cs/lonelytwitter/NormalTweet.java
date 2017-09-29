/*
 * Class Name: NormalTweet
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
 * Represents a normal (non-important) Tweet
 * @author Simon Chau
 * @version 1.0
 * @see Tweet
 * @since 1.0
 */

public class NormalTweet extends Tweet {
    public NormalTweet(String message) {
        super(message);
    }

    public NormalTweet(String message, Date date) {
        super(message, date);
    }
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}

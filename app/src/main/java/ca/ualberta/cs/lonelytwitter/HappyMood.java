/*
 * Class Name: HappyMood
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
 * Represents a happy mood
 * @author Simon Chau
 * @version 1.0
 * @see CurrentMood
 * @since 1.0
 */

public class HappyMood extends CurrentMood{
    private String message = "happy";

    public HappyMood(Date date) {
        super(date);
    }

    @Override
    public String Feeling(String message) {
        return super.Feeling(message);
    }
}

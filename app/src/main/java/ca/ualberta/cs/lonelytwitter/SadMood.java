package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 * Created by cryst on 9/14/2017.
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
package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by henrywei on 1/17/17.
 */

public class SadMood extends Mood {
    public SadMood(Date date) {
        super(date);
    }

    public SadMood() {
        super();
    }

    @Override
    public String getMood() {
        return ":(";
    }
}

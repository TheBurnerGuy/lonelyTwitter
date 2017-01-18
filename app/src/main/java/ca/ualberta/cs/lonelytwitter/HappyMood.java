package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by henrywei on 1/17/17.
 */

public class HappyMood extends Mood {
    public HappyMood(Date date) {
        super(date);
    }

    public HappyMood() {
        super();
    }

    @Override
    public String getMood() {
        return ":)";
    }
}

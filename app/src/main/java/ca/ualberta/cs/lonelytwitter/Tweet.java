package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by shida3 on 1/19/17.
 *
 * Tweet class is a super class that implements Tweetable
 */

public abstract class Tweet implements Tweetable{
    private Date date;
    private String message;

    /**
     * Instantiates a tweet
     * @param message the message for tweet
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * Instantiates a tweet
     * @param date the date for tweet
     * @param message the message for tweet
     */

    public Tweet(Date date, String message){
        this.message = message;
        this.date = date;
    }

    /**
     * Obtains the date of the tweet
     *
     * @return the date
     */

    public Date getDate() {
        return date;
    }

    /**
     * Sets the date of the tweet
     *
     * @param date the date to be changed to
     */

    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Obtains the message of the tweet
     *
     * @return the message
     */

    public String getMessage() {
        return message;
    }

    /**
     * Sets the message of the tweet.
     *
     * @param message the message
     * @throws TweetTooLongException if the tweet is too long
     */

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public abstract Boolean isImportant();

    /**
     * Turns the tweet object into a String object
     *
     * @return the tweet's date and message as a String
     */

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }
}

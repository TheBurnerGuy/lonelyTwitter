package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class ImportantTweet extends Tweet{
  public ImportantTweet(String message) throws TweetTooLongException{
    super(message);
  }
  
  public ImportantTweet(Date date, String message) throws TweetTooLongException{
    super(date message);
  }
}

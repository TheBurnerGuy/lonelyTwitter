//package

public astract class Tweet{
  private Date date;
  private String message;
  
  public Tweet(Date date, String message) throws TweetTooLongException{
    this.date = date;
    this.message = message;
  }
  public Tweet(String message) throws TweetTooLongException{
    this.message = message;
  }
  
  public abstract isImportant;
}

//package

public astract class Tweet implements Tweetable{
  private Date date;
  private String message;
  
  public Tweet(Date date, String message) throws TweetTooLongException{
    this.date = date;
    this.setMessage(message);
  }
  public Tweet(String message) throws TweetTooLongException{
    this.setMessage(message);
    this.date = new Date();
  }
  
  public abstract Boolean isImportant();
  
  public void setDate(Date date){
   this.date = date; 
  }
  
  
}

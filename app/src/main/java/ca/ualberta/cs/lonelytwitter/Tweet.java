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
  
  public Date getDate(){
   return this.date; 
  }
  
  public void setDate(Date date){
   this.date = date; 
  }
  
  public String getMessage(){
   return message; 
  }
  
  public Date setMessage(String message) throws TweetTooLongException{
    if(message.length() > 144){
      throw new TweetTooLongException();
    }else{
      this.message = message;
    }
  }
}

package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by henrywei on 2/14/17.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    public void testAdd(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test tweet");

        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Another Test Tweet");

        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);

        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Last Tweet");

        tweets.add(tweet);
        tweets.delete(tweet);

        assertFalse(tweets.hasTweet(tweet));
    }

    public void testStrings(){
        assertEquals("'test' should be 'test'", "test", "test");
        assertTrue("'test' should start with 't'", "test".startsWith("t"));
    }

    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("Test Tweet");

        tweets.addTweet(tweet1);
        try{
            tweets.addTweet(tweet1);
        }
        catch(IllegalArgumentException e){
            return;
        }

        assertFalse(true);
    }

    public void testGetTweets(){
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("Test Tweet");
        Tweet tweet2 = new NormalTweet("Another Test Tweet");

        tweets.addTweet(tweet1);
        tweets.addTweet(tweet2);
        TweetList returnedTweets = tweets.getTweets();

        assertEquals(returnedTweets.getTweet(0).getMessage(),tweet1.getMessage());
        assertEquals(returnedTweets.getTweet(1).getMessage(),tweet2.getMessage());
        assertEquals(returnedTweets.getTweet(0).getDate(),tweet1.getDate());
        assertEquals(returnedTweets.getTweet(1).getDate(),tweet2.getDate());
    }

    public void testGetCount(){
        TweetList tweets = new TweetList();
        assertEquals(tweets.getCount(), 0);

        Tweet tweet1 = new NormalTweet("Test Tweet");
        tweets.addTweet(tweet1);
        assertEquals(tweets.getCount(), 1);

        Tweet tweet2 = new NormalTweet("Another Test Tweet");
        tweets.addTweet(tweet2);
        assertEquals(tweets.getCount(), 2);
    }
}


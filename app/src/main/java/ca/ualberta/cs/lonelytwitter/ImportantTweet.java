package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by song on 2017/9/12.
 */

public class ImportantTweet extends tweet implements Tweetable{
    public ImportantTweet(String message) {
        super(message);//call the constructor from tweet
    }

    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by song on 2017/9/12.
 */

public class NormalTweet extends tweet{
    public NormalTweet(String message) {
        super(message);
    }

    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }
}

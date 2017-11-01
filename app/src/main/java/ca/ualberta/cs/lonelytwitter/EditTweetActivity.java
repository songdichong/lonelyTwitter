package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

//in tweetable, I change 2 methods in interface since public is not required
//in tweetlist, declaration can have final modifier so I add a final
//in lonelytwitteractivity, declaration can have final modifier so I add a final
//in lonelytwitteractivity, I delete 2 unused imports
//in lonelytwitteractivitytest, I add tag description for 'throws' tag
public class EditTweetActivity extends Activity {

    //private TextView tweetText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView tweetText;// field can be converted to a local variable
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        tweetText = (TextView) findViewById(R.id.new_tweet_text);
        Intent intent = getIntent();
        String msg = intent.getStringExtra(LonelyTwitterActivity.EXTRA_MESSAGE);
        tweetText.setText(msg);
    }
}

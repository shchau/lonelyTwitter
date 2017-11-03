package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        TextView tweetText = (TextView) findViewById(R.id.tweet_content);

        String s = getIntent().getStringExtra("TWEET");
        tweetText.setText(s);
    }
}
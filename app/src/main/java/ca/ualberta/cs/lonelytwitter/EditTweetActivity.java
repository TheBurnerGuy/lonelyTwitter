package ca.ualberta.cs.lonelytwitter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by henrywei on 2/28/17.
 */

public class EditTweetActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_tweet_activity);

        TextView textView = (TextView) findViewByid(R.id.textField);

        Bundle extras = getIntent().getExtras();
        textView.setText(extras.getString("message"));

    }
}

package com.listengoodmusic.loguitlsexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.phuche.rssfeedlibrary.RssFeedProvider;
import com.phuche.rssfeedlibrary.RssItem;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private TextView display_text_view;

    public MainActivity(TextView display_text_view) {
        this.display_text_view = display_text_view;
    }

    /**
     * Constructor
     * @param savedInstanceState savedInstance
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display_text_view = findViewById(R.id.display_text_view);
        List<RssItem> items = RssFeedProvider.parse("url");

        StringBuilder message = new StringBuilder();
        for (RssItem item : items) {
            message.append(item.getLink()).append("\n");
        }

        display_text_view.setText(message);

    }
}

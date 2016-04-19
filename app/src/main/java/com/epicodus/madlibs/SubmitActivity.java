package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class SubmitActivity extends AppCompatActivity {
    public static final String TAG = SubmitActivity.class.getSimpleName();
    private TextView mStoryTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);

        mStoryTextView = (TextView) findViewById(R.id.storyTextView);

        Intent intent = getIntent();
        ArrayList<String> userInput = intent.getStringArrayListExtra("userInput");
        mStoryTextView.setText("This is a story about " + userInput.get(0) + " " + userInput.get(1) + ".");
    }
}

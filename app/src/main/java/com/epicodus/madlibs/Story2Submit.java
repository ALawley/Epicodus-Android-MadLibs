package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class Story2Submit extends AppCompatActivity {
    private TextView mStoryTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story2_submit);

        mStoryTextView = (TextView) findViewById(R.id.storyTextView);

        Intent intent = getIntent();
        ArrayList<String> userInput = intent.getStringArrayListExtra("userInput");
        String storyText = "One day there was a " + userInput.get(1) + " named Alice. Like all " +
                "other " + userInput.get(1) + "s, Alice did her job in a " + userInput.get(0) +
                ". One day, a " + userInput.get(5) + " stranger came to the " + userInput.get(0)
                + " and shouted '" + userInput.get(3) + ", Alice, I swear that I'm better at " +
                userInput.get(2) + " than you will ever be!' In a moment of pure rage, Alice spun" +
                " around in her chair, " + userInput.get(4) + " drew her " + userInput.get(6) +
                " and brought revenge like no other " + userInput.get(1) + " ever had, or ever " +
                "will again.";
        mStoryTextView.setText(storyText);
    }
}

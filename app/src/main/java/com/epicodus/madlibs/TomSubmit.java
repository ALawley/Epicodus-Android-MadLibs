package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class TomSubmit extends AppCompatActivity {
    public static final String TAG = TomSubmit.class.getSimpleName();
    private TextView mStoryTextView;
    private Button mBackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tom_submit);

        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mBackButton = (Button) findViewById(R.id.backButton);

        Intent intent = getIntent();
        ArrayList<String> userInput = intent.getStringArrayListExtra("userInput");
        String storyString = "This is a story about " + userInput.get(0) + " Tom's " +
                userInput.get(1) + " problem. One day, he went to town to buy a " + userInput.get
                (2) + " but found that he was so bad at " + userInput.get(1) + " he couldn't get " +
                "there. After lots of practice " + userInput.get(3) + " " + userInput.get(1) +
                ", getting to the store " + userInput.get(3) + " wasn't a problem at all, even " +
                "when " + userInput.get(1) + " with Tom's super " + userInput.get(0) + " friend, " +
                "" + userInput.get(4) + "!";
        mStoryTextView.setText(storyString);

        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TomSubmit.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

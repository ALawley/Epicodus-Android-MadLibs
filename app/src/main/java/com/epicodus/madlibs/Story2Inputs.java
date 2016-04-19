package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Story2Inputs extends AppCompatActivity {
    private Button mSubmitWordsButton;
    private EditText mNounText;
    private EditText mOccupationText;
    private EditText mVerbText;
    private EditText mExclamationText;
    private EditText mAdverbText;
    private EditText mAdjectiveText;
    private ArrayList<String> userInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story2_inputs);
        mNounText = (EditText) findViewById(R.id.nounText);
        mOccupationText = (EditText) findViewById(R.id.occupationText);
        mVerbText = (EditText) findViewById(R.id.verbText);
        mExclamationText = (EditText) findViewById(R.id.exclamationText);
        mAdverbText = (EditText) findViewById(R.id.adverbText);
        mAdjectiveText = (EditText) findViewById(R.id.adjectiveText);
        userInput = new ArrayList<String>();

        mSubmitWordsButton = (Button) findViewById(R.id.submitWordsButton);
            mSubmitWordsButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    userInput.clear();
                    userInput.add(mNounText.getText().toString());
                    userInput.add(mOccupationText.getText().toString());
                    userInput.add(mVerbText.getText().toString());
                    userInput.add(mExclamationText.getText().toString());
                    userInput.add(mAdverbText.getText().toString());
                    userInput.add(mAdjectiveText.getText().toString());

                    Intent intent = new Intent(Story2Inputs.this, Story2Submit.class);
                    intent.putExtra("userInput", userInput);
                    startActivity(intent);
                }
            });
    }
}
package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class TomInputs extends AppCompatActivity {
    public static final String TAG = TomInputs.class.getSimpleName();
    private Button mSubmitWordsButton;
    private EditText mAdjectiveText;
    private EditText mVerbText;
    private EditText mNounText;
    private EditText mAdverbText;
    private EditText mProperNounText;
    private ArrayList<String> userInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tom_inputs);

        mAdjectiveText = (EditText) findViewById(R.id.adjectiveText);
        mVerbText = (EditText) findViewById(R.id.verbText);
        mNounText = (EditText) findViewById(R.id.nounText);
        mAdverbText = (EditText) findViewById(R.id.adverbText);
        mProperNounText = (EditText) findViewById(R.id.properNounText);
        userInput = new ArrayList<String>();
        mSubmitWordsButton = (Button) findViewById(R.id.submitWordsButton);
        mSubmitWordsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userInput.clear();
                userInput.add(mAdjectiveText.getText().toString());
                userInput.add(mVerbText.getText().toString());
                userInput.add(mNounText.getText().toString());
                userInput.add(mAdverbText.getText().toString());
                userInput.add(mProperNounText.getText().toString());
                Log.d(TAG, userInput.get(0));
                Intent intent = new Intent(TomInputs.this, TomSubmitActivity.class);
                intent.putExtra("userInput", userInput);
                startActivity(intent);
            }
        });
    }
}

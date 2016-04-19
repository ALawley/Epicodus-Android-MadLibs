package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class AliceInputs extends AppCompatActivity {
    private Button mSubmitWordsButton;
    private EditText mNounText;
    private EditText mOccupationText;
    private EditText mVerbText;
    private EditText mExclamationText;
    private EditText mAdverbText;
    private EditText mAdjectiveText;
    private EditText mWeaponText;
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
        mWeaponText = (EditText) findViewById(R.id.weaponText);
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
                    userInput.add(mWeaponText.getText().toString());

                    Intent intent = new Intent(AliceInputs.this, AliceSubmit.class);
                    intent.putExtra("userInput", userInput);
                    startActivity(intent);
                }
            });
    }
}

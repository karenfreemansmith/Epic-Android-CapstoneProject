package com.karenfreemansmith.flashcards.ui;

import android.app.ListActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.karenfreemansmith.flashcards.Constants;
import com.karenfreemansmith.flashcards.R;
import com.karenfreemansmith.flashcards.adapters.HighScoreAdapter;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class HighScoresActivity extends AppCompatActivity {
    private ListView mListView;
    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;

    private String mUser = "";
    private String mHighScores[]=new String[10];
    private String mScore;
    private String mTotal;
    private float mPercentScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_scores);
        ButterKnife.bind(this);

        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        mEditor = mSharedPreferences.edit();

        mScore = mSharedPreferences.getString(Constants.PREFERENCES_SCORE_KEY, null);
        mTotal = mSharedPreferences.getString(Constants.PREFERENCES_TOTAL_KEY, null);

        // get latest score and compare to list to see if it belongs in the list
        float mTop = Float.parseFloat(mScore);
        float mBottom = Float.parseFloat(mTotal);

        //mPercentScore = Double.parseDouble(mScore)/Double.parseDouble(mTotal);
        mPercentScore = (mTop/mBottom)*100;

        // Get list of high scores
        mHighScores[0] = mSharedPreferences.getString(Constants.PREFERENCES_HIGHSCORE01_KEY, null);
        mHighScores[1] = mSharedPreferences.getString(Constants.PREFERENCES_HIGHSCORE02_KEY, null);
        mHighScores[2] = mSharedPreferences.getString(Constants.PREFERENCES_HIGHSCORE03_KEY, null);
        mHighScores[3] = mSharedPreferences.getString(Constants.PREFERENCES_HIGHSCORE04_KEY, null);
        mHighScores[4] = mSharedPreferences.getString(Constants.PREFERENCES_HIGHSCORE05_KEY, null);
        mHighScores[5] = mSharedPreferences.getString(Constants.PREFERENCES_HIGHSCORE06_KEY, null);
        mHighScores[6] = mSharedPreferences.getString(Constants.PREFERENCES_HIGHSCORE07_KEY, null);
        mHighScores[7] = mSharedPreferences.getString(Constants.PREFERENCES_HIGHSCORE08_KEY, null);
        mHighScores[8] = mSharedPreferences.getString(Constants.PREFERENCES_HIGHSCORE09_KEY, null);
        mHighScores[9] = mSharedPreferences.getString(Constants.PREFERENCES_HIGHSCORE10_KEY, null);

        for(int i=0; i<mHighScores.length; i++) {
            if (mHighScores[i] == null) {
                mHighScores[i] = "0";
            }
        }

        // Check for new high score
        for(int i=0; i<mHighScores.length; i++) {
            //for resetting scores if neeed:
            //  mHighScores[i]="0.1";
            if (Float.parseFloat(mHighScores[i]) <= mPercentScore) {
                String temp = mHighScores[i];
                mHighScores[i] = String.valueOf(mPercentScore);
                mPercentScore = Float.parseFloat(temp);
            }
        }

            // Get name if high score
            // Insert new high score in list
            // Save new list
            mEditor.putString(Constants.PREFERENCES_HIGHSCORE01_KEY, mHighScores[0]).apply();
            mEditor.putString(Constants.PREFERENCES_HIGHSCORE02_KEY, mHighScores[1]).apply();
            mEditor.putString(Constants.PREFERENCES_HIGHSCORE03_KEY, mHighScores[2]).apply();
            mEditor.putString(Constants.PREFERENCES_HIGHSCORE04_KEY, mHighScores[3]).apply();
            mEditor.putString(Constants.PREFERENCES_HIGHSCORE05_KEY, mHighScores[4]).apply();
            mEditor.putString(Constants.PREFERENCES_HIGHSCORE06_KEY, mHighScores[5]).apply();
            mEditor.putString(Constants.PREFERENCES_HIGHSCORE07_KEY, mHighScores[6]).apply();
            mEditor.putString(Constants.PREFERENCES_HIGHSCORE08_KEY, mHighScores[7]).apply();
            mEditor.putString(Constants.PREFERENCES_HIGHSCORE09_KEY, mHighScores[8]).apply();
            mEditor.putString(Constants.PREFERENCES_HIGHSCORE10_KEY, mHighScores[9]).apply();

        // Show list
        mListView = (ListView) findViewById(R.id.listView);
        HighScoreAdapter adapter = new HighScoreAdapter(this, android.R.layout.simple_list_item_1, mHighScores, mUser);
        mListView.setAdapter(adapter);
    }

    @OnClick(R.id.buttonPlayAgain)
    public void playAgain() {
        Intent intent = new Intent(HighScoresActivity.this, MainActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.buttonReset)
    public void reset() {
        for(int i=0; i<mHighScores.length; i++) {
            mHighScores[i]="0.001";
        }

        // display scores with list adapter
        mListView = (ListView) findViewById(R.id.listView);
        HighScoreAdapter adapter = new HighScoreAdapter(this, android.R.layout.simple_list_item_1, mHighScores, mUser);
        mListView.setAdapter(adapter);

        // save new scores to shared preferences
        mEditor.putString(Constants.PREFERENCES_HIGHSCORE01_KEY, mHighScores[0]).apply();
        mEditor.putString(Constants.PREFERENCES_HIGHSCORE02_KEY, mHighScores[1]).apply();
        mEditor.putString(Constants.PREFERENCES_HIGHSCORE03_KEY, mHighScores[2]).apply();
        mEditor.putString(Constants.PREFERENCES_HIGHSCORE04_KEY, mHighScores[3]).apply();
        mEditor.putString(Constants.PREFERENCES_HIGHSCORE05_KEY, mHighScores[4]).apply();
        mEditor.putString(Constants.PREFERENCES_HIGHSCORE06_KEY, mHighScores[5]).apply();
        mEditor.putString(Constants.PREFERENCES_HIGHSCORE07_KEY, mHighScores[6]).apply();
        mEditor.putString(Constants.PREFERENCES_HIGHSCORE08_KEY, mHighScores[7]).apply();
        mEditor.putString(Constants.PREFERENCES_HIGHSCORE09_KEY, mHighScores[8]).apply();
        mEditor.putString(Constants.PREFERENCES_HIGHSCORE10_KEY, mHighScores[9]).apply();
    }

    @OnClick(R.id.buttonStudy)
    public void test() {
        Intent intent = new Intent(HighScoresActivity.this, StudyActivity.class);
        startActivity(intent);
    }

}

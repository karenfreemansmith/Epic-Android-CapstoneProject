package com.karenfreemansmith.flashcards.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.karenfreemansmith.flashcards.Constants;
import com.karenfreemansmith.flashcards.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.buttonMedium) Button mMedium;
    @Bind(R.id.buttonDifficult) Button mDifficult;

    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        mEditor = mSharedPreferences.edit();

        // hiding buttons until level feature is developed
        mMedium.setVisibility(View.GONE);
        mDifficult.setVisibility(View.GONE);
    }

    private void addToSharedPreferences(String score) {
        mEditor.putString(Constants.PREFERENCES_SCORE_KEY, score).apply();
    }

    @OnClick(R.id.buttonPlay)
    public void startEasy() {
        String score = "0";
        addToSharedPreferences(score);
        Intent intent = new Intent(MainActivity.this, TextClueActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.buttonMedium)
    public void startMedium() {
        Intent intent = new Intent(MainActivity.this, TextClueActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.buttonDifficult)
    public void startDifficult() {
        Intent intent = new Intent(MainActivity.this, PhotoClueActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.buttonHighScores)
    public void viewHighScores() {
        Intent intent = new Intent(MainActivity.this, HighScoresActivity.class);
        startActivity(intent);
    }
}

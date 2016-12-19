package com.karenfreemansmith.flashcards;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.buttonEasy)
    public void startEasy() {
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

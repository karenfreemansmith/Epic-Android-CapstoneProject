package com.karenfreemansmith.flashcards.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.karenfreemansmith.flashcards.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class HighScoresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_scores);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.buttonPlayAgain)
    public void playAgain() {
        Intent intent = new Intent(HighScoresActivity.this, MainActivity.class);
        startActivity(intent);
    }
}

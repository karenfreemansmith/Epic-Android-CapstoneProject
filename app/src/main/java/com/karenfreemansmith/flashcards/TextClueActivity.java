package com.karenfreemansmith.flashcards;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class TextClueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_clue);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.imageButtonA)
    public void chooseA() {
        Intent intent = new Intent(TextClueActivity.this, MainActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.imageButtonB)
    public void chooseB() {
        Intent intent = new Intent(TextClueActivity.this, MainActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.imageButtonC)
    public void chooseC() {
        Intent intent = new Intent(TextClueActivity.this, MainActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.imageButtonD)
    public void chooseD() {
        Intent intent = new Intent(TextClueActivity.this, MainActivity.class);
        startActivity(intent);
    }
}

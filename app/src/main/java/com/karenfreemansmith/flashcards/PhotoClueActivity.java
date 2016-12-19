package com.karenfreemansmith.flashcards;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class PhotoClueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_clue);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.buttonA)
    public void chooseA() {
        Intent intent = new Intent(PhotoClueActivity.this, MainActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.buttonB)
    public void chooseB() {
        Intent intent = new Intent(PhotoClueActivity.this, MainActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.buttonC)
    public void chooseC() {
        Intent intent = new Intent(PhotoClueActivity.this, MainActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.buttonD)
    public void chooseD() {
        Intent intent = new Intent(PhotoClueActivity.this, MainActivity.class);
        startActivity(intent);
    }
}

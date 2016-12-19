package com.karenfreemansmith.flashcards;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class NewAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_account);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.buttonRegister)
    public void register() {
        Intent intent = new Intent(NewAccountActivity.this, MainActivity.class);
        startActivity(intent);
    }
}

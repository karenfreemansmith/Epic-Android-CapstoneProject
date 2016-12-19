package com.karenfreemansmith.flashcards.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.karenfreemansmith.flashcards.R;
import com.karenfreemansmith.flashcards.models.Person;
import com.squareup.picasso.Picasso;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TextClueActivity extends AppCompatActivity {
    @Bind(R.id.imageButtonA) ImageView mA;
    @Bind(R.id.imageButtonB) ImageView mB;
    @Bind(R.id.imageButtonC) ImageView mC;
    @Bind(R.id.imageButtonD) ImageView mD;
    @Bind(R.id.textViewClue) TextView mClue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_clue);
        ButterKnife.bind(this);

        mClue.setText(Person.getRandomPerson().getCountry());

        Picasso.with(TextClueActivity.this)
                .load(Person.getRandomPerson().getPhoto())
                .resize(180, 180)
                .centerCrop()
                .into(mA);

        Picasso.with(TextClueActivity.this)
                .load(Person.getRandomPerson().getPhoto())
                .resize(180, 180)
                .centerCrop()
                .into(mB);

        Picasso.with(TextClueActivity.this)
                .load(Person.getRandomPerson().getPhoto())
                .resize(180, 180)
                .centerCrop()
                .into(mC);

        Picasso.with(TextClueActivity.this)
                .load(Person.getRandomPerson().getPhoto())
                .resize(180, 180)
                .centerCrop()
                .into(mD);


    }

    @OnClick(R.id.imageButtonA)
    public void chooseA() {
        Intent intent = new Intent(TextClueActivity.this, DetailViewActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.imageButtonB)
    public void chooseB() {
        Intent intent = new Intent(TextClueActivity.this, DetailViewActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.imageButtonC)
    public void chooseC() {
        Intent intent = new Intent(TextClueActivity.this, DetailViewActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.imageButtonD)
    public void chooseD() {
        Intent intent = new Intent(TextClueActivity.this, DetailViewActivity.class);
        startActivity(intent);
    }
}

package com.karenfreemansmith.flashcards.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.karenfreemansmith.flashcards.R;
import com.karenfreemansmith.flashcards.models.Person;
import com.squareup.picasso.Picasso;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PhotoClueActivity extends AppCompatActivity {
    @Bind(R.id.imageViewClue) ImageView mClue;
    @Bind(R.id.buttonA) Button mA;
    @Bind(R.id.buttonB) Button mB;
    @Bind(R.id.buttonC) Button mC;
    @Bind(R.id.buttonD) Button mD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_clue);
        ButterKnife.bind(this);

        Picasso.with(PhotoClueActivity.this)
                .load(Person.getRandomPerson().getPhoto())
                .resize(360, 360)
                .centerCrop()
                .into(mClue);

        mA.setText(Person.getRandomPerson().getName());
        mB.setText(Person.getRandomPerson().getName());
        mC.setText(Person.getRandomPerson().getName());
        mD.setText(Person.getRandomPerson().getName());
    }

    @OnClick(R.id.buttonA)
    public void chooseA() {
        Intent intent = new Intent(PhotoClueActivity.this, DetailViewActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.buttonB)
    public void chooseB() {
        Intent intent = new Intent(PhotoClueActivity.this, DetailViewActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.buttonC)
    public void chooseC() {
        Intent intent = new Intent(PhotoClueActivity.this, DetailViewActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.buttonD)
    public void chooseD() {
        Intent intent = new Intent(PhotoClueActivity.this, DetailViewActivity.class);
        startActivity(intent);
    }
}

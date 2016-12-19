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

public class DetailViewActivity extends AppCompatActivity {
    @Bind(R.id.imageViewPerson) ImageView mPortrait;
    @Bind(R.id.textViewName) TextView mName;
    @Bind(R.id.textViewTitle) TextView mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_view);
        ButterKnife.bind(this);

        Person currentPerson = Person.getRandomPerson();

        mName.setText(currentPerson.getName());
        mTitle.setText(currentPerson.getTitle());

        Picasso.with(DetailViewActivity.this)
                .load(currentPerson.getPhoto())
                .resize(240, 240)
                .centerCrop()
                .into(mPortrait);
    }

    @OnClick(R.id.buttonAboutPerson)
    public void viewPersonWiki() {}

    @OnClick(R.id.buttonAboutTitle)
    public void viewTitleWiki() {}

    @OnClick(R.id.buttonQuitScore)
    public void quit() {
        Intent intent = new Intent(DetailViewActivity.this, HighScoresActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.buttonNextQuestion)
    public void next() {
        Intent intent = new Intent(DetailViewActivity.this, PhotoClueActivity.class);
        startActivity(intent);
    }
}

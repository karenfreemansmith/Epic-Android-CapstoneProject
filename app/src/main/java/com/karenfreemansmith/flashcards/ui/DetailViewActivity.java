package com.karenfreemansmith.flashcards.ui;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.karenfreemansmith.flashcards.R;
import com.karenfreemansmith.flashcards.models.Person;
import com.squareup.picasso.Picasso;

import java.util.Random;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DetailViewActivity extends AppCompatActivity {
    @Bind(R.id.imageViewPerson) ImageView mPortrait;
    @Bind(R.id.textViewName) TextView mName;
    @Bind(R.id.textViewTitle) TextView mTitle;

    private String mHistoryWiki;
    private String mOfficeWiki;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_view);
        ButterKnife.bind(this);

        Intent intent = getIntent();

        mHistoryWiki = intent.getStringExtra("history");
        mOfficeWiki = intent.getStringExtra("office");

        mName.setText(intent.getStringExtra("name"));
        mTitle.setText(intent.getStringExtra("title") + " of " + intent.getStringExtra("country"));

        Picasso.with(DetailViewActivity.this)
                .load(intent.getStringExtra("photo"))
                .resize(240, 240)
                .centerCrop()
                .into(mPortrait);
    }

    @OnClick(R.id.buttonAboutPerson)
    public void viewPersonWiki() {
        Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(mHistoryWiki));
        startActivity(webIntent);
    }

    @OnClick(R.id.buttonAboutTitle)
    public void viewTitleWiki() {
        Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(mOfficeWiki));
        startActivity(webIntent);
    }

    @OnClick(R.id.buttonQuitScore)
    public void quit() {
        Intent intent = new Intent(DetailViewActivity.this, HighScoresActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.buttonNextQuestion)
    public void next() {
        Random randomGenerator = new Random();
        int rand = randomGenerator.nextInt(2);
        if(rand==0) {
            Intent intent = new Intent(DetailViewActivity.this, PhotoClueActivity.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(DetailViewActivity.this, TextClueActivity.class);
            startActivity(intent);
        }

    }
}

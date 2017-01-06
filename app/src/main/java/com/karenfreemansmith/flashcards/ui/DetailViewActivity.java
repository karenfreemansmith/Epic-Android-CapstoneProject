package com.karenfreemansmith.flashcards.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.karenfreemansmith.flashcards.Constants;
import com.karenfreemansmith.flashcards.R;
import com.karenfreemansmith.flashcards.adapters.CircleImage;
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

    private SharedPreferences mSharedPreferences;

    private String mHistoryWiki;
    private String mOfficeWiki;
    private String mScore;
    private String mTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_view);
        ButterKnife.bind(this);

        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        mScore = mSharedPreferences.getString(Constants.PREFERENCES_SCORE_KEY, null);
        mTotal = mSharedPreferences.getString(Constants.PREFERENCES_TOTAL_KEY, null);
        getSupportActionBar().setTitle("News Worthy - Score: " + mScore + "/" + mTotal);


        Intent intent = getIntent();

        mHistoryWiki = intent.getStringExtra("history");
        mOfficeWiki = intent.getStringExtra("office");

        mName.setText(intent.getStringExtra("name"));
        mTitle.setText(intent.getStringExtra("title") + " of " + intent.getStringExtra("country"));

        Picasso.with(DetailViewActivity.this)
                .load(intent.getStringExtra("photo"))
                .resize(240, 240)
                .centerCrop()
                .transform(new CircleImage())
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

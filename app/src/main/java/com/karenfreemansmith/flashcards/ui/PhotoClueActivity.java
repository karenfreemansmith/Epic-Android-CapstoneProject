package com.karenfreemansmith.flashcards.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.karenfreemansmith.flashcards.Constants;
import com.karenfreemansmith.flashcards.R;
import com.karenfreemansmith.flashcards.models.Person;
import com.karenfreemansmith.flashcards.models.Question;
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

    private Question mQuestion;
    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;
    private String mScore;
    private String mTotal;
    private int mLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_clue);
        ButterKnife.bind(this);

        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        mEditor = mSharedPreferences.edit();
        mScore = mSharedPreferences.getString(Constants.PREFERENCES_SCORE_KEY, null);
        mTotal = mSharedPreferences.getString(Constants.PREFERENCES_TOTAL_KEY, null);
        mLevel = Integer.parseInt(mSharedPreferences.getString(Constants.PREFERENCES_LEVEL_KEY, null));
        getSupportActionBar().setTitle("News Worthy - Score: " + mScore + "/" + mTotal);

        mQuestion = new Question(mLevel);
        String clueUrl="http://allsoulschurch.org/media/1811/avatar_blank_male_300-390x390.jpg";
        // set clue = "correct" person...
        if(mQuestion.getPerson1()==mQuestion.getCorrectAnswer()) {
            clueUrl=Person.getPersonById(mQuestion.getPerson1()).getPhoto();
        }
        if(mQuestion.getPerson2()==mQuestion.getCorrectAnswer()) {
            clueUrl=Person.getPersonById(mQuestion.getPerson2()).getPhoto();
        }
        if(mQuestion.getPerson3()==mQuestion.getCorrectAnswer()) {
            clueUrl=Person.getPersonById(mQuestion.getPerson3()).getPhoto();
        }
        if(mQuestion.getPerson4()==mQuestion.getCorrectAnswer()) {
            clueUrl=Person.getPersonById(mQuestion.getPerson4()).getPhoto();
        }

        if(clueUrl.equals("nophoto")) {
            //mClue.setImageResource(R.drawable.nophoto);
            Picasso.with(PhotoClueActivity.this)
                .load(R.drawable.nophoto)
                .resize(360,360)
                .centerCrop()
                .into(mClue);
        } else {
            Picasso.with(PhotoClueActivity.this)
                .load(clueUrl)
                .resize(360,360)
                .centerCrop()
                .into(mClue);
        }

        mA.setText(Person.getPersonById(mQuestion.getPerson1()).getName());
        mB.setText(Person.getPersonById(mQuestion.getPerson2()).getName());
        mC.setText(Person.getPersonById(mQuestion.getPerson3()).getName());
        mD.setText(Person.getPersonById(mQuestion.getPerson4()).getName());
    }

    @OnClick(R.id.buttonA)
    public void chooseA() {
        if(mQuestion.getPerson1()==mQuestion.getCorrectAnswer()) {
            Toast.makeText(PhotoClueActivity.this, "Congratulations, that is the right answer!", Toast.LENGTH_SHORT).show();
            increaseScore();
        } else {
            Toast.makeText(PhotoClueActivity.this, "Sorry, you need to study more!", Toast.LENGTH_LONG).show();
        }
        increaseTotal();
        Intent intent = new Intent(PhotoClueActivity.this, DetailViewActivity.class);
        intent.putExtra("id", mQuestion.getPerson1());
        startActivity(intent);
    }

    @OnClick(R.id.buttonB)
    public void chooseB() {
        if(mQuestion.getPerson2()==mQuestion.getCorrectAnswer()) {
            Toast.makeText(PhotoClueActivity.this, "Congratulations, that is the right answer!", Toast.LENGTH_SHORT).show();
            increaseScore();
        } else {
            Toast.makeText(PhotoClueActivity.this, "Sorry, you need to study more!", Toast.LENGTH_LONG).show();
        }
        increaseTotal();
        Intent intent = new Intent(PhotoClueActivity.this, DetailViewActivity.class);
        intent.putExtra("id", mQuestion.getPerson2());
        startActivity(intent);
    }

    @OnClick(R.id.buttonC)
    public void chooseC() {
        if(mQuestion.getPerson3()==mQuestion.getCorrectAnswer()) {
            Toast.makeText(PhotoClueActivity.this, "Congratulations, that is the right answer!", Toast.LENGTH_SHORT).show();
            increaseScore();
        } else {
            Toast.makeText(PhotoClueActivity.this, "Sorry, you need to study more!", Toast.LENGTH_LONG).show();
        }
        increaseTotal();
        Intent intent = new Intent(PhotoClueActivity.this, DetailViewActivity.class);
        intent.putExtra("id", mQuestion.getPerson3());
        startActivity(intent);
    }

    @OnClick(R.id.buttonD)
    public void chooseD() {
        if(mQuestion.getPerson4()==mQuestion.getCorrectAnswer()) {
            Toast.makeText(PhotoClueActivity.this, "Congratulations, that is the right answer!", Toast.LENGTH_SHORT).show();
            increaseScore();
        } else {
            Toast.makeText(PhotoClueActivity.this, "Sorry, you need to study more!", Toast.LENGTH_LONG).show();
        }
        increaseTotal();
        Intent intent = new Intent(PhotoClueActivity.this, DetailViewActivity.class);
        intent.putExtra("id", mQuestion.getPerson4());
        startActivity(intent);
    }

    private void increaseScore() {
        int score = Integer.parseInt(mScore);
        score++;
        String newScore = String.valueOf(score);
        mEditor.putString(Constants.PREFERENCES_SCORE_KEY, newScore).apply();
    }

    private void increaseTotal() {
        int total = Integer.parseInt(mTotal);
        total++;
        String newTotal = String.valueOf(total);
        mEditor.putString(Constants.PREFERENCES_TOTAL_KEY, newTotal).apply();
    }
}

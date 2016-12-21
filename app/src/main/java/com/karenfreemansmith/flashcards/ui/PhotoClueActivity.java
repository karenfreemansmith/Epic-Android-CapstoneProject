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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_clue);
        ButterKnife.bind(this);

        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        mEditor = mSharedPreferences.edit();
        mScore = mSharedPreferences.getString(Constants.PREFERENCES_SCORE_KEY, null);
        getSupportActionBar().setTitle("News Worthy - Score: " + mScore);

        mQuestion = new Question();
        String clueUrl="http://allsoulschurch.org/media/1811/avatar_blank_male_300-390x390.jpg";
        // set clue = "correct" person...
        if(mQuestion.getPerson1().isCorrectAnswer()) {
            clueUrl=mQuestion.getPerson1().getPhoto();
            Log.d("1: ", mQuestion.getPerson1().getName());
        }
        if(mQuestion.getPerson2().isCorrectAnswer()) {
            clueUrl=mQuestion.getPerson2().getPhoto();
            Log.d("2: ", mQuestion.getPerson2().getName());
        }
        if(mQuestion.getPerson3().isCorrectAnswer()) {
            clueUrl=mQuestion.getPerson3().getPhoto();
            Log.d("3: ", mQuestion.getPerson3().getName());
        }
        if(mQuestion.getPerson4().isCorrectAnswer()) {
            clueUrl=mQuestion.getPerson4().getPhoto();
            Log.d("4: ", mQuestion.getPerson4().getName());
        }

        Picasso.with(PhotoClueActivity.this)
                .load(clueUrl)
                .resize(360, 360)
                .centerCrop()
                .into(mClue);

        mA.setText(mQuestion.getPerson1().getName());
        mB.setText(mQuestion.getPerson2().getName());
        mC.setText(mQuestion.getPerson3().getName());
        mD.setText(mQuestion.getPerson4().getName());
    }

    @OnClick(R.id.buttonA)
    public void chooseA() {
        if(mQuestion.getPerson1().isCorrectAnswer()) {
            Toast.makeText(PhotoClueActivity.this, "Congratulations, that is the right answer!", Toast.LENGTH_SHORT).show();
            increaseScore();
        } else {
            Toast.makeText(PhotoClueActivity.this, "Sorry, you need to study more!", Toast.LENGTH_LONG).show();
        }
        Intent intent = new Intent(PhotoClueActivity.this, DetailViewActivity.class);
        intent.putExtra("name", mQuestion.getPerson1().getName());
        intent.putExtra("photo", mQuestion.getPerson1().getPhoto());
        intent.putExtra("history", mQuestion.getPerson1().getHistory());
        intent.putExtra("office", mQuestion.getPerson1().getOffice());
        intent.putExtra("title", mQuestion.getPerson1().getTitle());
        intent.putExtra("country", mQuestion.getPerson1().getCountry());
        startActivity(intent);
    }

    @OnClick(R.id.buttonB)
    public void chooseB() {
        if(mQuestion.getPerson2().isCorrectAnswer()) {
            Toast.makeText(PhotoClueActivity.this, "Congratulations, that is the right answer!", Toast.LENGTH_SHORT).show();
            increaseScore();
        } else {
            Toast.makeText(PhotoClueActivity.this, "Sorry, you need to study more!", Toast.LENGTH_LONG).show();
        }
        Intent intent = new Intent(PhotoClueActivity.this, DetailViewActivity.class);
        intent.putExtra("name", mQuestion.getPerson2().getName());
        intent.putExtra("photo", mQuestion.getPerson2().getPhoto());
        intent.putExtra("history", mQuestion.getPerson2().getHistory());
        intent.putExtra("office", mQuestion.getPerson2().getOffice());
        intent.putExtra("title", mQuestion.getPerson2().getTitle());
        intent.putExtra("country", mQuestion.getPerson2().getCountry());
        startActivity(intent);
    }

    @OnClick(R.id.buttonC)
    public void chooseC() {
        if(mQuestion.getPerson3().isCorrectAnswer()) {
            Toast.makeText(PhotoClueActivity.this, "Congratulations, that is the right answer!", Toast.LENGTH_SHORT).show();
            increaseScore();
        } else {
            Toast.makeText(PhotoClueActivity.this, "Sorry, you need to study more!", Toast.LENGTH_LONG).show();
        }
        Intent intent = new Intent(PhotoClueActivity.this, DetailViewActivity.class);
        intent.putExtra("name", mQuestion.getPerson3().getName());
        intent.putExtra("photo", mQuestion.getPerson3().getPhoto());
        intent.putExtra("history", mQuestion.getPerson3().getHistory());
        intent.putExtra("office", mQuestion.getPerson3().getOffice());
        intent.putExtra("title", mQuestion.getPerson3().getTitle());
        intent.putExtra("country", mQuestion.getPerson3().getCountry());
        startActivity(intent);
    }

    @OnClick(R.id.buttonD)
    public void chooseD() {
        if(mQuestion.getPerson4().isCorrectAnswer()) {
            Toast.makeText(PhotoClueActivity.this, "Congratulations, that is the right answer!", Toast.LENGTH_SHORT).show();
            increaseScore();
        } else {
            Toast.makeText(PhotoClueActivity.this, "Sorry, you need to study more!", Toast.LENGTH_LONG).show();
        }
        Intent intent = new Intent(PhotoClueActivity.this, DetailViewActivity.class);
        intent.putExtra("name", mQuestion.getPerson4().getName());
        intent.putExtra("photo", mQuestion.getPerson4().getPhoto());
        intent.putExtra("history", mQuestion.getPerson4().getHistory());
        intent.putExtra("office", mQuestion.getPerson4().getOffice());
        intent.putExtra("title", mQuestion.getPerson4().getTitle());
        intent.putExtra("country", mQuestion.getPerson4().getCountry());
        startActivity(intent);
    }

    private void increaseScore() {
        int score = Integer.parseInt(mScore);
        score++;
        String newScore = String.valueOf(score);
        mEditor.putString(Constants.PREFERENCES_SCORE_KEY, newScore).apply();
    }
}

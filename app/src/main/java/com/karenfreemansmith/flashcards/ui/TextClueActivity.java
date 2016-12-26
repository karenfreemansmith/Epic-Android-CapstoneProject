package com.karenfreemansmith.flashcards.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.karenfreemansmith.flashcards.Constants;
import com.karenfreemansmith.flashcards.R;
import com.karenfreemansmith.flashcards.models.Person;
import com.karenfreemansmith.flashcards.models.Question;
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

    private Question mQuestion;
    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;
    private String mScore;
    private String mTotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_clue);
        ButterKnife.bind(this);

        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        mEditor = mSharedPreferences.edit();
        mScore = mSharedPreferences.getString(Constants.PREFERENCES_SCORE_KEY, null);
        mTotal = mSharedPreferences.getString(Constants.PREFERENCES_TOTAL_KEY, null);
        getSupportActionBar().setTitle("News Worthy - Score: " + mScore + "/" + mTotal);


        mQuestion = new Question(1);
        String clueText="something bad happened";

        if(mQuestion.getPerson1().isCorrectAnswer()) {
            clueText=mQuestion.getPerson1().getName();
            Log.d("1: ", clueText);
        }
        if(mQuestion.getPerson2().isCorrectAnswer()) {
            clueText=mQuestion.getPerson2().getName();
            Log.d("2: ", clueText);
        }
        if(mQuestion.getPerson3().isCorrectAnswer()) {
            clueText=mQuestion.getPerson3().getName();
            Log.d("3: ", clueText);
        }
        if(mQuestion.getPerson4().isCorrectAnswer()) {
            clueText=mQuestion.getPerson4().getName();
            Log.d("4: ", clueText);
        }


        mClue.setText(clueText);

        Picasso.with(TextClueActivity.this)
                .load(mQuestion.getPerson1().getPhoto())
                .resize(180, 180)
                .centerCrop()
                .into(mA);

        Picasso.with(TextClueActivity.this)
                .load(mQuestion.getPerson2().getPhoto())
                .resize(180, 180)
                .centerCrop()
                .into(mB);

        Picasso.with(TextClueActivity.this)
                .load(mQuestion.getPerson3().getPhoto())
                .resize(180, 180)
                .centerCrop()
                .into(mC);

        Picasso.with(TextClueActivity.this)
                .load(mQuestion.getPerson4().getPhoto())
                .resize(180, 180)
                .centerCrop()
                .into(mD);


    }
    private void increaseScore() {
        int score = Integer.parseInt(mScore);
        score++;
        mEditor.putString(Constants.PREFERENCES_SCORE_KEY, String.valueOf(score)).apply();
    }

    private void increaseTotal() {
        int total = Integer.parseInt(mTotal);
        total++;
        String newTotal = String.valueOf(total);
        mEditor.putString(Constants.PREFERENCES_TOTAL_KEY, newTotal).apply();
    }


    @OnClick(R.id.imageButtonA)
    public void chooseA() {
        if(mQuestion.getPerson1().isCorrectAnswer()) {
            Toast.makeText(TextClueActivity.this, "Congratulations, that is the right answer!", Toast.LENGTH_SHORT).show();
            increaseScore();
        } else {
            Toast.makeText(TextClueActivity.this, "Sorry, you need to study more!", Toast.LENGTH_LONG).show();
        }
        increaseTotal();
        Intent intent = new Intent(TextClueActivity.this, DetailViewActivity.class);
        intent.putExtra("name", mQuestion.getPerson1().getName());
        intent.putExtra("photo", mQuestion.getPerson1().getPhoto());
        intent.putExtra("history", mQuestion.getPerson1().getHistory());
        intent.putExtra("office", mQuestion.getPerson1().getOffice());
        intent.putExtra("title", mQuestion.getPerson1().getTitle());
        intent.putExtra("country", mQuestion.getPerson1().getCountry());
        startActivity(intent);
    }

    @OnClick(R.id.imageButtonB)
    public void chooseB() {
        if(mQuestion.getPerson2().isCorrectAnswer()) {
            Toast.makeText(TextClueActivity.this, "Congratulations, that is the right answer!", Toast.LENGTH_SHORT).show();
            increaseScore();
        } else {
            Toast.makeText(TextClueActivity.this, "Sorry, you need to study more!", Toast.LENGTH_LONG).show();
        }
        increaseTotal();
        Intent intent = new Intent(TextClueActivity.this, DetailViewActivity.class);
        intent.putExtra("name", mQuestion.getPerson2().getName());
        intent.putExtra("photo", mQuestion.getPerson2().getPhoto());
        intent.putExtra("history", mQuestion.getPerson2().getHistory());
        intent.putExtra("office", mQuestion.getPerson2().getOffice());
        intent.putExtra("title", mQuestion.getPerson2().getTitle());
        intent.putExtra("country", mQuestion.getPerson2().getCountry());
        startActivity(intent);
    }

    @OnClick(R.id.imageButtonC)
    public void chooseC() {
        if(mQuestion.getPerson3().isCorrectAnswer()) {
            Toast.makeText(TextClueActivity.this, "Congratulations, that is the right answer!", Toast.LENGTH_SHORT).show();
            increaseScore();
        } else {
            Toast.makeText(TextClueActivity.this, "Sorry, you need to study more!", Toast.LENGTH_LONG).show();
        }
        increaseTotal();
        Intent intent = new Intent(TextClueActivity.this, DetailViewActivity.class);
        intent.putExtra("name", mQuestion.getPerson3().getName());
        intent.putExtra("photo", mQuestion.getPerson3().getPhoto());
        intent.putExtra("history", mQuestion.getPerson3().getHistory());
        intent.putExtra("office", mQuestion.getPerson3().getOffice());
        intent.putExtra("title", mQuestion.getPerson3().getTitle());
        intent.putExtra("country", mQuestion.getPerson3().getCountry());
        startActivity(intent);
    }

    @OnClick(R.id.imageButtonD)
    public void chooseD() {
        if(mQuestion.getPerson4().isCorrectAnswer()) {
            Toast.makeText(TextClueActivity.this, "Congratulations, that is the right answer!", Toast.LENGTH_SHORT).show();
            increaseScore();
        } else {
            Toast.makeText(TextClueActivity.this, "Sorry, you need to study more!", Toast.LENGTH_LONG).show();
        }
        increaseTotal();
        Intent intent = new Intent(TextClueActivity.this, DetailViewActivity.class);
        intent.putExtra("name", mQuestion.getPerson4().getName());
        intent.putExtra("photo", mQuestion.getPerson4().getPhoto());
        intent.putExtra("history", mQuestion.getPerson4().getHistory());
        intent.putExtra("office", mQuestion.getPerson4().getOffice());
        intent.putExtra("title", mQuestion.getPerson4().getTitle());
        intent.putExtra("country", mQuestion.getPerson4().getCountry());
        startActivity(intent);
    }


}

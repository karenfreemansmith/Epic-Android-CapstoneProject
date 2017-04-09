package com.karenfreemansmith.flashcards.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
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
    private int mLevel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_clue);
        ButterKnife.bind(this);

        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        mEditor = mSharedPreferences.edit();
        mScore = mSharedPreferences.getString(Constants.PREFERENCES_SCORE_KEY, null);
        mTotal = mSharedPreferences.getString(Constants.PREFERENCES_TOTAL_KEY, null);
        mLevel = Integer.parseInt(mSharedPreferences.getString(Constants.PREFERENCES_LEVEL_KEY, null));
        getSupportActionBar().setTitle("News Worthy - Score: " + mScore + "/" + mTotal);


        mQuestion = new Question(mLevel);
        String clueText="something bad happened";

        if(mQuestion.getPerson1()==mQuestion.getCorrectAnswer()) {
            clueText=Person.getPersonById(mQuestion.getPerson1()).getName();
            Log.d("1: ", clueText);
        }
        if(mQuestion.getPerson2()==mQuestion.getCorrectAnswer()) {
            clueText=Person.getPersonById(mQuestion.getPerson2()).getName();
            Log.d("2: ", clueText);
        }
        if(mQuestion.getPerson3()==mQuestion.getCorrectAnswer()) {
            clueText=Person.getPersonById(mQuestion.getPerson3()).getName();
            Log.d("3: ", clueText);
        }
        if(mQuestion.getPerson4()==mQuestion.getCorrectAnswer()) {
            clueText=Person.getPersonById(mQuestion.getPerson4()).getName();
            Log.d("4: ", clueText);
        }

        mClue.setText(clueText);

        if(Person.getPersonById(mQuestion.getPerson1()).getPhoto().equals("nophoto")) {
            Picasso.with(TextClueActivity.this)
                .load(R.drawable.nophoto)
                .resize(180, 180)
                .centerCrop()
                .into(mA);
        } else {
            Picasso.with(TextClueActivity.this)
                .load(Person.getPersonById(mQuestion.getPerson1()).getPhoto())
                .resize(180, 180)
                .centerCrop()
                .into(mA);
        }

        if(Person.getPersonById(mQuestion.getPerson2()).getPhoto().equals("nophoto")) {
            Picasso.with(TextClueActivity.this)
                .load(R.drawable.nophoto)
                .resize(180, 180)
                .centerCrop()
                .into(mB);
        } else {
            Picasso.with(TextClueActivity.this)
                .load(Person.getPersonById(mQuestion.getPerson2()).getPhoto())
                .resize(180, 180)
                .centerCrop()
                .into(mB);
        }

        if(Person.getPersonById(mQuestion.getPerson3()).getPhoto().equals("nophoto")) {
            Picasso.with(TextClueActivity.this)
                .load(R.drawable.nophoto)
                .resize(180, 180)
                .centerCrop()
                .into(mC);
        } else {
            Picasso.with(TextClueActivity.this)
                .load(Person.getPersonById(mQuestion.getPerson3()).getPhoto())
                .resize(180, 180)
                .centerCrop()
                .into(mC);
        }

        if(Person.getPersonById(mQuestion.getPerson4()).getPhoto().equals("nophoto")) {
            Picasso.with(TextClueActivity.this)
                .load(R.drawable.nophoto)
                .resize(180, 180)
                .centerCrop()
                .into(mD);
        } else {
            Picasso.with(TextClueActivity.this)
                .load(Person.getPersonById(mQuestion.getPerson4()).getPhoto())
                .resize(180, 180)
                .centerCrop()
                .into(mD);
        }
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
        if(mQuestion.getPerson1()==mQuestion.getCorrectAnswer()) {
            Toast toast = Toast.makeText(TextClueActivity.this, "Congratulations, that is the right answer!", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP|Gravity.LEFT,0,0);
            toast.show();
            increaseScore();
        } else {
            Toast toast = Toast.makeText(TextClueActivity.this, "Sorry, you need to study more!", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.TOP|Gravity.LEFT,0,0);
            toast.show();
        }
        increaseTotal();
        Intent intent = new Intent(TextClueActivity.this, DetailViewActivity.class);
        intent.putExtra("id", mQuestion.getPerson1());
        startActivity(intent);
    }

    @OnClick(R.id.imageButtonB)
    public void chooseB() {
        if(mQuestion.getPerson2()==mQuestion.getCorrectAnswer()) {
            Toast toast = Toast.makeText(TextClueActivity.this, "Congratulations, that is the right answer!", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP|Gravity.LEFT,0,0);
            toast.show();
            increaseScore();
        } else {
            Toast toast = Toast.makeText(TextClueActivity.this, "Sorry, you need to study more!", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.TOP|Gravity.LEFT,0,0);
            toast.show();
        }
        increaseTotal();
        Intent intent = new Intent(TextClueActivity.this, DetailViewActivity.class);
        intent.putExtra("id", mQuestion.getPerson2());
        startActivity(intent);
    }

    @OnClick(R.id.imageButtonC)
    public void chooseC() {
        if(mQuestion.getPerson3()==mQuestion.getCorrectAnswer()) {
            Toast toast = Toast.makeText(TextClueActivity.this, "Congratulations, that is the right answer!", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP|Gravity.LEFT,0,0);
            toast.show();
            increaseScore();
        } else {
            Toast toast = Toast.makeText(TextClueActivity.this, "Sorry, you need to study more!", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.TOP|Gravity.LEFT,0,0);
            toast.show();
        }
        increaseTotal();
        Intent intent = new Intent(TextClueActivity.this, DetailViewActivity.class);
        intent.putExtra("id", mQuestion.getPerson3());
        startActivity(intent);
    }

    @OnClick(R.id.imageButtonD)
    public void chooseD() {
        if(mQuestion.getPerson4()==mQuestion.getCorrectAnswer()) {
            Toast toast = Toast.makeText(TextClueActivity.this, "Congratulations, that is the right answer!", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP|Gravity.LEFT,0,0);
            toast.show();
            increaseScore();
        } else {
            Toast toast = Toast.makeText(TextClueActivity.this, "Sorry, you need to study more!", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.TOP|Gravity.LEFT,0,0);
            toast.show();
        }
        increaseTotal();
        Intent intent = new Intent(TextClueActivity.this, DetailViewActivity.class);
        intent.putExtra("id", mQuestion.getPerson4());
        startActivity(intent);
    }


}

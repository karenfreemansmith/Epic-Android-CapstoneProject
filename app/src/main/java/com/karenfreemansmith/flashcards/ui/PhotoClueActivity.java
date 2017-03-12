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
    private static final String KEY_A = "KEY_A";
    private static final String KEY_B = "KEY_B";
    private static final String KEY_C = "KEY_C";
    private static final String KEY_D = "KEY_D";
    private static final String KEY_CORRECT = "KEY_CORRECT";

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
    private int mAid;
    private int mBid;
    private int mCid;
    private int mDid;
    private int mCorrectId=-1;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt(KEY_A, mAid);
        outState.putInt(KEY_B, mBid);
        outState.putInt(KEY_C, mCid);
        outState.putInt(KEY_D, mDid);
        outState.putInt(KEY_CORRECT, mCorrectId);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        mAid = savedInstanceState.getInt(KEY_A);
        mBid = savedInstanceState.getInt(KEY_B);
        mCid = savedInstanceState.getInt(KEY_C);
        mDid = savedInstanceState.getInt(KEY_D);
        mCorrectId = savedInstanceState.getInt(KEY_CORRECT);
    }

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

        //Toast.makeText(PhotoClueActivity.this, mCorrectId, Toast.LENGTH_LONG).show();
        if(mCorrectId==-1) {
            mQuestion = new Question(mLevel);
        }


        String clueUrl="nophoto";
        mCorrectId = mQuestion.getCorrectAnswer();
        mAid = mQuestion.getPerson1();
        mBid = mQuestion.getPerson2();
        mCid = mQuestion.getPerson3();
        mDid = mQuestion.getPerson4();

        if(mQuestion.getPerson1() == mCorrectId) {
            clueUrl=Person.getPersonById(mAid).getPhoto();
        }
        if(mQuestion.getPerson2() == mCorrectId) {
            clueUrl=Person.getPersonById(mBid).getPhoto();
        }
        if(mQuestion.getPerson3() == mCorrectId) {
            clueUrl=Person.getPersonById(mCid).getPhoto();
        }
        if(mQuestion.getPerson4() == mCorrectId) {
            clueUrl=Person.getPersonById(mDid).getPhoto();
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

        mA.setText(Person.getPersonById(mAid).getName());
        mB.setText(Person.getPersonById(mBid).getName());
        mC.setText(Person.getPersonById(mCid).getName());
        mD.setText(Person.getPersonById(mDid).getName());
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
        intent.putExtra("id", mCid);
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
        intent.putExtra("id", mBid);
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
        intent.putExtra("id", mCid);
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
        intent.putExtra("id", mDid);
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

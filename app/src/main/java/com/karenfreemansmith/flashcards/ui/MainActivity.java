package com.karenfreemansmith.flashcards.ui;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.karenfreemansmith.flashcards.Constants;
import com.karenfreemansmith.flashcards.R;
import com.karenfreemansmith.flashcards.util.IabBroadcastReceiver;
import com.karenfreemansmith.flashcards.util.IabHelper;
import com.karenfreemansmith.flashcards.util.IabResult;
import com.karenfreemansmith.flashcards.util.Inventory;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.karenfreemansmith.flashcards.Constants.TBD;

public class MainActivity extends AppCompatActivity implements IabBroadcastReceiver.IabBroadcastListener {
    @Bind(R.id.buttonMedium) Button mMedium;
    @Bind(R.id.buttonDifficult) Button mDifficult;

    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;


    static final String TAG = "NewsWorthy";
    boolean mHasUpgradeUS = false;
    boolean mHasUpgradeWorld = false;

    static final String US_LEADERS = "us_leaders";
    static final String WORLD_LEADERS = "world_leaders";
    String[] mProducts = { US_LEADERS, WORLD_LEADERS };

    static final int RC_REQUEST = 10001;

    private IabHelper mHelper;
    IabBroadcastReceiver mBroadcastReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        mEditor = mSharedPreferences.edit();

        createPurchaseHelper();
    }

    private void createPurchaseHelper() {
        String publicKey = TBD;
        Log.d(TAG, "Creating IAB helper");
        mHelper = new IabHelper(this, publicKey);
        mHelper.enableDebugLogging(true);
        mHelper.startSetup(new IabHelper.OnIabSetupFinishedListener() {
            public void onIabSetupFinished(IabResult result) {
                Log.d(TAG, "Setup finished");

                if (!result.isSuccess()) {
                    Log.d(TAG, "Error: Problem setting up in-app billing" + result);
                    return;
                }
                if (mHelper == null) return;

                mBroadcastReceiver = new IabBroadcastReceiver(MainActivity.this);
                IntentFilter broadcastFilter = new IntentFilter(IabBroadcastReceiver.ACTION);
                registerReceiver(mBroadcastReceiver, broadcastFilter);

                // IAB is fully set up. Now, let's get an inventory of stuff we own.
                Log.d(TAG, "Setup successful. Querying inventory.");

                try {
                    mHelper.queryInventoryAsync(mGotInventoryListener);
                } catch (IabHelper.IabAsyncInProgressException e) {
                    Log.d(TAG, "Error querying inventory, another async operation in progress");
                    e.printStackTrace();
                }
            }
        });
    }

    IabHelper.QueryInventoryFinishedListener
        mGotInventoryListener = new IabHelper.QueryInventoryFinishedListener() {
        public void onQueryInventoryFinished(IabResult result, Inventory inventory)
        {
            if(mHelper == null) return;
            if(result.isFailure()) {
                Log.e("Main", "Failed to query Inventory: " + result);
                return;
            }

            String usLeadersPrice = "$1.99"; //inventory.getSkuDetails(US_LEADERS).getPrice();
            String worldLeadersPrice = "$1.99"; //inventory.getSkuDetails(WORLD_LEADERS).getPrice();

            // update the UI
            mMedium.setText("Expanded US Leaders - " + usLeadersPrice);
            mDifficult.setText("Expanded World Leaders - " + worldLeadersPrice);
        }
    };

    private void addToSharedPreferences(String score, String total, String level) {
        mEditor.putString(Constants.PREFERENCES_SCORE_KEY, score).apply();
        mEditor.putString(Constants.PREFERENCES_TOTAL_KEY, total).apply();
        mEditor.putString(Constants.PREFERENCES_LEVEL_KEY, level).apply();
    }

    @OnClick(R.id.buttonPlay)
    public void startEasy() {
        String score = "0";
        String total = "0";
        String level = "1";
        addToSharedPreferences(score, total, level);
        Intent intent = new Intent(MainActivity.this, TextClueActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.buttonMedium)
    public void startMedium() {
        //mHelper.launchPurchaseFlow(MainActivity.this, US_LEADERS, RC_REQUEST, mPurchaseFinishedListener, "");
        String score = "0";
        String total = "0";
        String level = "2";
        addToSharedPreferences(score, total, level);
        Intent intent = new Intent(MainActivity.this, TextClueActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.buttonDifficult)
    public void startDifficult() {
        String score = "0";
        String total = "0";
        String level = "3";
        addToSharedPreferences(score, total, level);
        Intent intent = new Intent(MainActivity.this, PhotoClueActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.buttonHighScores)
    public void viewHighScores() {
        Intent intent = new Intent(MainActivity.this, HighScoresActivity.class);
        startActivity(intent);
    }

    @Override
    public void receivedBroadcast() {

    }
}

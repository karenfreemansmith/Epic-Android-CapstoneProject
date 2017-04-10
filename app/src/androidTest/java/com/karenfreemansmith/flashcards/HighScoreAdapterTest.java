package com.karenfreemansmith.flashcards;

import android.app.Application;
import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.ApplicationTestCase;
import android.test.suitebuilder.annotation.LargeTest;

import com.karenfreemansmith.flashcards.adapters.HighScoreAdapter;
import com.karenfreemansmith.flashcards.ui.MainActivity;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class HighScoreAdapterTest {
  private Context instrumentationCtx;
    @Before
    public void setup() {
      instrumentationCtx= InstrumentationRegistry.getContext();
    }

    @Test
    public void getItem(){
      String[] mHighScores = new String[] {"1","2","3"};
      String mUser = "KAS";
      HighScoreAdapter adapter = new HighScoreAdapter(instrumentationCtx, android.R.layout.simple_list_item_1, mHighScores, mUser);
      assertEquals("KAS: 1.00%", adapter.getItem(0));
    }
}
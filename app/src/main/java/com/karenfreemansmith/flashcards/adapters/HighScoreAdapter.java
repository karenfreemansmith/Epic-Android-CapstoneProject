package com.karenfreemansmith.flashcards.adapters;

import android.content.Context;
import android.widget.ArrayAdapter;

/**
 * Created by Karen Freeman-Smith on 12/21/2016.
 */

public class HighScoreAdapter extends ArrayAdapter {
  private String[] mScores;
  private String mUsername;

  public HighScoreAdapter(Context context, int resource, String[] scores, String username) {
    super(context, resource, scores);
    mScores=scores;
    mUsername=username;
  }

  @Override
  public Object getItem(int position) {
    float score = Float.parseFloat(mScores[position]);
    String formattedScore =  String.format("%.2f", score);
    return mUsername + ": " + formattedScore + "%";
  }
}

package com.karenfreemansmith.flashcards.adapters;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.karenfreemansmith.flashcards.models.Person;

/**
 * Created by Karen Freeman-Smith on 6/10/2017.
 */

public class PersonAdapter extends ArrayAdapter {
  private Person[] mPeople;

  public PersonAdapter(Context context, int resource, Person[] people) {
    super(context, resource, people);
    mPeople=people;
  }

  @Override
  public Object getItem(int position) {
    return mPeople[position].getName();
  }
}

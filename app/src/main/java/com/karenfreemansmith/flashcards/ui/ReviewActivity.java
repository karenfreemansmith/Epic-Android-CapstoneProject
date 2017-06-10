package com.karenfreemansmith.flashcards.ui;

import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.karenfreemansmith.flashcards.R;
import com.karenfreemansmith.flashcards.adapters.PersonAdapter;
import com.karenfreemansmith.flashcards.models.Person;

public class ReviewActivity extends AppCompatActivity {
  private TextView mTitle;
  private ListView mListView;
  //private Person[] mPeople = Person.getPeople();
  private String[] mPeople = new String[] {"Karen Freeman-Smith", "Christopher Carter", "Rebecca Freeman", "Johnathan Smith", "William Carter"};
  //private PersonAdapter mAdapter;
  private ArrayAdapter mAdapter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_review);

    mTitle = (TextView)findViewById(R.id.reviewTitle);
    mListView = (ListView)findViewById(R.id.leaderList);
    //mAdapter = new PersonAdapter(this, android.R.layout.simple_list_item_1, mPeople);
    mAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, mPeople);
    mListView.setAdapter(mAdapter);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.search, menu);
    MenuItem searchItem = menu.findItem(R.id.action_search);
    SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);
    searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

      @Override
      public boolean onQueryTextSubmit(String query) {
        return false;
      }

      @Override
      public boolean onQueryTextChange(String newText) {
        mAdapter.getFilter().filter(newText);
        return false;
      }
    });
    return super.onCreateOptionsMenu(menu);
  }
}

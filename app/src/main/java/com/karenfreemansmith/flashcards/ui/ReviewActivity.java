package com.karenfreemansmith.flashcards.ui;

import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.karenfreemansmith.flashcards.R;
import com.karenfreemansmith.flashcards.adapters.PersonAdapter;
import com.karenfreemansmith.flashcards.models.Person;

public class ReviewActivity extends AppCompatActivity {
  private TextView mTitle;
  private RecyclerView mListView;
  private Person[] mPeople;
  private PersonAdapter mAdapter;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_review);

    mTitle = (TextView)findViewById(R.id.reviewTitle);
    mListView = (RecyclerView)findViewById(R.id.leaderList);
    mPeople = Person.getPeople();
    mAdapter = new PersonAdapter(this, mPeople);
    mListView.setAdapter(mAdapter);
    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ReviewActivity.this);
    mListView.setLayoutManager(layoutManager);
    mListView.setHasFixedSize(false);
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
        mAdapter.filter(newText);
        return false;
      }
    });
    return super.onCreateOptionsMenu(menu);
  }
}

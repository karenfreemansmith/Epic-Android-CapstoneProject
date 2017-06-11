package com.karenfreemansmith.flashcards.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.karenfreemansmith.flashcards.R;
import com.karenfreemansmith.flashcards.models.Person;
import com.karenfreemansmith.flashcards.ui.StudyActivity;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Karen Freeman-Smith on 6/10/2017.
 */

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {
  private Person[] mCopy;
  private ArrayList<Person> mPeople = new ArrayList<>();
  private Context mContext;

  public PersonAdapter(Context context, Person[] people) {
    mContext = context;
    mCopy = people;
    Collections.addAll(mPeople, mCopy);
  }

  public class PersonViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    TextView mName;
    TextView mTitle;
    TextView mLocation;
    ImageView mPhoto;

    public PersonViewHolder(View itemView) {
      super(itemView);
      mName = (TextView)itemView.findViewById(R.id.nameTextView);
      mTitle = (TextView)itemView.findViewById(R.id.titleTextView);
      mLocation = (TextView)itemView.findViewById(R.id.locationTextView);
      mPhoto = (ImageView)itemView.findViewById(R.id.profileImage);
      mContext = itemView.getContext();
    }

    @Override
    public void onClick(View view) {
      int position = getLayoutPosition();
      Intent intent = new Intent(view.getContext(), StudyActivity.class);
      intent.putExtra("id", position);
      mContext.startActivity(intent);
    }

    public void bindPerson(Person person) {
      mName.setText(person.getName());
      mTitle.setText(person.getTitle());
      mLocation.setText(person.getCountry());

      if(person.getPhoto().equals("nophoto")) {
        mPhoto.setImageResource(R.drawable.nophoto);
      } else {
        Picasso.with(mContext)
            .load(person.getPhoto())
            .resize(60, 60)
            .centerCrop()
            .transform(new CircleImage())
            .into(mPhoto);
      }
      itemView.setOnClickListener(this);
    }

  }

  @Override
  public PersonAdapter.PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.summary_list_view, parent, false);
    PersonViewHolder viewHolder = new PersonViewHolder(view);
    return viewHolder;
  }

  @Override
  public void onBindViewHolder(PersonAdapter.PersonViewHolder holder, int position) {
    holder.bindPerson(mPeople.get(position));
  }

  @Override
  public int getItemCount() {
    return mPeople.size();
  }

  public void filter(String text) {
    mPeople.clear();
    if(text.isEmpty()) {
      Collections.addAll(mPeople, mCopy);
    } else {
      text = text.toLowerCase();
      for(Person person: mCopy) {
        if(person!=null) {
          if(person.getName().toLowerCase().contains(text)) {
            mPeople.add(person);
          }
        }
      }
    }
    notifyDataSetChanged();
  }
}

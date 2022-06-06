package com.example.muse;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListActivity extends AppCompatActivity {

    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.listView) ListView songList;
    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.listTextView) TextView songView;

    String[] songs = new String[] {"Smells Like Teen Spirit", "Billie Jean", "Stayin' Alive", "I Will Survive", "Whole Lotta Love", "Sweet Child O'Mine"};
    String[] artists = new String[] {"Nirvana", "Michael Jackson", "Bee Gees", "Gloria Gaynor", "Led Zeppelin", "Guns N' Roses"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        String song = intent.getStringExtra("song");
        songView.setText(getString(R.string.songs, song));
        ListAdapter adapter = new ListAdapter(this, android.R.layout.simple_list_item_1, songs, artists);
        songList.setAdapter(adapter);

        songList.setOnItemClickListener((adapterView, view, i, l) ->{
            String eachSong = ((TextView)view).getText().toString();
            Toast.makeText(ListActivity.this, eachSong, Toast.LENGTH_LONG).show();
        });
    }
}
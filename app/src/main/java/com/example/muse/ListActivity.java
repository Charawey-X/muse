package com.example.muse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ListActivity extends AppCompatActivity {

    String[] searchItems = new String[] {"Smells Like Teen Spirit", "Billie Jean", "Stayin' Alive", "I Will Survive", "Whole Lotta Love", "Sweet Child O'Mine"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Intent intent = getIntent();
        String song = intent.getStringExtra("song");
        TextView songView = findViewById(R.id.listTextView);
        songView.setText(getString(R.string.songs, song));
    }
}
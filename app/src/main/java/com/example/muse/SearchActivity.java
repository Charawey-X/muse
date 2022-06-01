package com.example.muse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class SearchActivity extends AppCompatActivity {
    
    String[] searchItems = new String[] {"Your Song Title Will","Smells Like Teen Spirit", "Billie Jean", "Stayin' Alive", "I Will Survive", "Whole Lotta Love", "Sweet Child O'Mine"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

    }

    
}
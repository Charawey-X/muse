package com.example.muse;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;


public class SearchActivity extends AppCompatActivity implements View.OnClickListener {

    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.button_find) Button mFind;
    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.editTextInput) EditText mSong;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        ButterKnife.bind(this);
        mFind.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String song = mSong.getText().toString();
        Toast.makeText(SearchActivity.this,song,Toast.LENGTH_LONG).show();
        Intent intent = new Intent(SearchActivity.this,ListActivity.class);
        intent.putExtra("song",song);
        startActivity(intent);
    }

}
package com.example.muse.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.muse.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchActivity extends AppCompatActivity implements View.OnClickListener {

    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.userNameView) TextView user;

    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.searchInput) EditText searchInput;
    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.submit) Button submit;
    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.cancel) Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        user.setText(getString(R.string.user,username));

        cancel.setOnClickListener(v -> {
            Intent intentCancel = new Intent(SearchActivity.this, MainActivity.class);
            startActivity(intentCancel);
        });

        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String search = searchInput.getText().toString();
        Intent intentSubmit = new Intent(SearchActivity.this, ListActivity.class);
        intentSubmit.putExtra("search",search);
        startActivity(intentSubmit);
    }
}
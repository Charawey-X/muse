package com.example.muse;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.button_home) Button mHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mHome.setOnClickListener(view -> {
            Toast.makeText(MainActivity.this,R.string.toast_home_button,Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this,SearchActivity.class);
            startActivity(intent);
        });
    }
}
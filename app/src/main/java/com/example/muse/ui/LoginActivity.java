package com.example.muse.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.muse.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.log_username) EditText userLog;
    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.log_password) EditText userPass;
    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.log_in) Button logIn;

    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.arrow2) View back;
    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.not_have) TextView signInstead;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        back.setOnClickListener(v -> {
            Intent intentBack = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intentBack);
        });
        signInstead.setOnClickListener(v -> {
            Intent intentSign = new Intent(LoginActivity.this, SignUpActivity.class);
            startActivity(intentSign);
        });

        logIn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        String email = intent.getStringExtra("email");
        String password = intent.getStringExtra("password");

        String user = userLog.getText().toString();
        String pass = userPass.getText().toString();
        if(!user.isEmpty() && !pass.isEmpty()){
            if ((user.equals(username) || user.equals(email)) && pass.equals(password)){
                Intent intent1 = new Intent(LoginActivity.this, SearchActivity.class);
                intent1.putExtra("username",username);
                startActivity(intent1);
            } else {
                Toast.makeText(LoginActivity.this, "Wrong Username or Password! Please try again.", Toast.LENGTH_LONG).show();
            }
        } else {
            Toast.makeText(LoginActivity.this, "All Fields are Required!", Toast.LENGTH_LONG).show();
        }


    }
}
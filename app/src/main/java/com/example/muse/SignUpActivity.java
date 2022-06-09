package com.example.muse;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.username) EditText userEdit;
    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.email) EditText emailEdit;
    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.password) EditText passwordEdit;
    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.confirm_password) EditText confirmPasswordEdit;
    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.sign_up) Button signUp;

    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.arrow1) View back;

    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.already_have) TextView logInstead;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        ButterKnife.bind(this);
        back.setOnClickListener(v -> {
            Intent intentBack = new Intent(SignUpActivity.this, MainActivity.class);
            startActivity(intentBack);
        });
        logInstead.setOnClickListener(v -> {
            Intent intentLog = new Intent(SignUpActivity.this, LoginActivity.class);
            startActivity(intentLog);
        });
        signUp.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        String username = userEdit.getText().toString();
        String email = emailEdit.getText().toString();
        String password = passwordEdit.getText().toString();
        String confirm = confirmPasswordEdit.getText().toString();

        if(!username.isEmpty() && !email.isEmpty() && !password.isEmpty() && !confirm.isEmpty()){
            if(password.equals(confirm)){
                Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
                intent.putExtra("username",username);
                intent.putExtra("email",email);
                intent.putExtra("password",password);
                startActivity(intent);
            } else {
                Toast.makeText(SignUpActivity.this,"Your Passwords do not match!",Toast.LENGTH_LONG).show();
            }
        } else {
            Toast.makeText(SignUpActivity.this,"All Fields are Required!",Toast.LENGTH_LONG).show();
        }
    }
}
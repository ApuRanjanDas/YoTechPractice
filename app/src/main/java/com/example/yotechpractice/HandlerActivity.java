package com.example.yotechpractice;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HandlerActivity extends AppCompatActivity {

    Button loginButton, logoutButton;
    TextView textView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);

        loginButton = findViewById(R.id.loginId);
        logoutButton = findViewById(R.id.logoutId);
        textView = findViewById(R.id.textViewID);

        Handler handler = new Handler();

        loginButton.setOnClickListener(handler);
        logoutButton.setOnClickListener(handler);

    }

    class Handler implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            if (v.getId()==R.id.loginId){
                textView.setText("Login button is clicked.");
            }else if (v.getId()==R.id.logoutId){
                textView.setText("Logout button is clicked.");
            }
        }
    }



}
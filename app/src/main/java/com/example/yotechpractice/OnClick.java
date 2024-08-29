package com.example.yotechpractice;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class OnClick extends AppCompatActivity implements View.OnClickListener {

    Button login, logout;
    TextView txtView;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_click);

        login = (Button) findViewById(R.id.loginId);
        logout = findViewById(R.id.logoutId);
        txtView = findViewById(R.id.textViewID);

        login.setOnClickListener(this);
        logout.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.loginId){
            txtView.setText("Login button is clicked.");
        }else if(v.getId()==R.id.logoutId){
            txtView.setText("Logout button is clicked");
        }

    }
}
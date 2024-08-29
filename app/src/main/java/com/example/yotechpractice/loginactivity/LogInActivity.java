package com.example.yotechpractice.loginactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yotechpractice.R;

public class LogInActivity extends AppCompatActivity {

    private EditText usernameeditText, passwordeditText;
    private Button loginButton;
    private TextView textView;
    private int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        usernameeditText = findViewById(R.id.userNameID);
        passwordeditText = findViewById(R.id.passwordID);

        loginButton = findViewById(R.id.loginBtnID);
        textView = findViewById(R.id.worningID);
        textView.setText("Number of attempts remaining: 3");

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = usernameeditText.getText().toString();
                String password = passwordeditText.getText().toString();

                if (username.equals("admin") && password.equals("1234"))
                {
                    Intent intent = new Intent(LogInActivity.this, LogInSecondActivity.class);
                    startActivity(intent);
                }else {
                    counter--;
                    textView.setText("Number of attempts remaining: "+counter);
                    if (counter==0)
                    {
                        loginButton.setEnabled(false);
                    }
                }
            }
        });


    }
}
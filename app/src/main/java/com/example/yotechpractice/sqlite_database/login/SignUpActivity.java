package com.example.yotechpractice.sqlite_database.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yotechpractice.R;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText nameEditText, emailEditText, usernameEditText, passwordEditText;
    private Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        nameEditText = findViewById(R.id.nameEditTextID);
        emailEditText = findViewById(R.id.emailEditTextID);
        usernameEditText = findViewById(R.id.usernameEditTextID);
        passwordEditText = findViewById(R.id.passwordEditTextID);
        signUpButton = findViewById(R.id.signupBtnID);

        signUpButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String name = nameEditText.getText().toString();
        String email = emailEditText.getText().toString();
        String username = usernameEditText.getText().toString();
        String password = passwordEditText.getText().toString();

    }
}
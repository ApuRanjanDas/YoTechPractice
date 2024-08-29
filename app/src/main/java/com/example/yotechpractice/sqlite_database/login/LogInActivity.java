package com.example.yotechpractice.sqlite_database.login;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
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
import com.example.yotechpractice.sqlite_database.DatabaseHelper;

public class LogInActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText userNameEditText, passwordEditText;
    private Button signIn, signUp;

    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in2);

        userNameEditText = findViewById(R.id.userNameEditTextID);
        passwordEditText = findViewById(R.id.passwordEditTextID);
        signIn = findViewById(R.id.signInBtnID);
        signUp = findViewById(R.id.signUpBtnID);

        dbHelper = new DBHelper(this);
        SQLiteDatabase sqLiteDatabase = dbHelper.getWritableDatabase();

        signIn.setOnClickListener(this);
        signUp.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String userName = userNameEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        if (v.getId()==R.id.signInBtnID){

        } else if (v.getId()==R.id.signUpBtnID) {
            Intent intent = new Intent(LogInActivity.this, SignUpActivity.class);
            startActivity(intent);
        }

    }
}
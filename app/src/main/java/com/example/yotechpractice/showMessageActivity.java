package com.example.yotechpractice;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class showMessageActivity extends AppCompatActivity {

    Button buttonLogIn, buttonLogOut;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_message);

        buttonLogIn = findViewById(R.id.loginId);
        buttonLogOut = findViewById(R.id.logoutId);
        textView = findViewById(R.id.textViewID);


    }

    public void showMessage(View view){
        if (view.getId()==R.id.loginId){
            textView.setText("Login button is clicked.");
        }else if (view.getId()==R.id.logoutId){
            textView.setText("Logout button is clicked.");
        }

    }


//    public void showMessage(View view){
//        if (view.getId()==R.id.loginId){
//            textView.setText("Login button is clicked.");
//        } else if (view.getId()==R.id.logoutId){
//            textView.setText("Logout button is clicked.");
//        }
//
//    }
}
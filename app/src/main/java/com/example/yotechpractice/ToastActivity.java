package com.example.yotechpractice;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ToastActivity extends AppCompatActivity {
    Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);

        Log.d("OnCreate", "OnCreate Running");

        button = findViewById(R.id.buttonId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Tag","button is clicked");
//                Toast t = Toast.makeText(ToastActivity.this, "Button is clicked", Toast.LENGTH_SHORT);
//                t.setGravity(Gravity.CENTER_VERTICAL,10,20);
//                t.show();
            }
        });

    }
}
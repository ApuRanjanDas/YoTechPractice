package com.example.yotechpractice.intent;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yotechpractice.R;

public class M extends AppCompatActivity {

    private Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m);

        button = findViewById(R.id.button1ID);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //To go another app
                Intent intent = new Intent("android.intent.action.SecondActivity");
                startActivity(intent);
            }
        });

    }
}
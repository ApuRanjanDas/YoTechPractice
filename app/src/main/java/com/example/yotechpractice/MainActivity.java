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

public class MainActivity extends AppCompatActivity {
    TextView textView, textYoTech, settxt;
    Button button;
    int count;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.txtId);
        textYoTech = findViewById(R.id.txtYoTech);
        button = findViewById(R.id.pictxtButton);
        settxt = findViewById(R.id.setText);

        textYoTech.setText("Yo Tech IT Company");



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                settxt.setText("Button is clicked");
            }
        });
    }
}
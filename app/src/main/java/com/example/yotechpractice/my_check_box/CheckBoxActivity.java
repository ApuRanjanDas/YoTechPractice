package com.example.yotechpractice.my_check_box;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yotechpractice.R;

public class CheckBoxActivity extends AppCompatActivity {
    CheckBox checkCricket, checkFootball, checkCarram;
    Button buttonShow;
    TextView textView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        checkCricket = findViewById(R.id.cricketId);
        checkFootball = findViewById(R.id.footballId);
        checkCarram = findViewById(R.id.carramId);

        buttonShow = findViewById(R.id.buttonId);
        textView = findViewById(R.id.toastTxtID);

        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();

                if (checkCricket.isChecked()){
                    String value = checkCricket.getText().toString();
                    stringBuilder.append(value + " is favourite game\n");
                }

                if (checkFootball.isChecked()){
                    String value = checkFootball.getText().toString();
                    stringBuilder.append(value + " is favourite game\n");
                }

                if (checkCarram.isChecked()){
                    String value = checkCarram.getText().toString();
                    stringBuilder.append(value+" is favourite game.");
                }

                textView.setText(stringBuilder);
            }
        });


    }
}
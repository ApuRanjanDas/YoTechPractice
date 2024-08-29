package com.example.yotechpractice.radio_button;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yotechpractice.R;

public class RadioButtonActivity extends AppCompatActivity {
    TextView toastView;
    RadioGroup radioGroup;
    RadioButton radioButton1, radioButton2, radioButton3;
    Button button1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        radioGroup = findViewById(R.id.radiogroupID);

        radioButton1 = findViewById(R.id.radiobtn1);
        radioButton2 = findViewById(R.id.radiobtn2);
        radioButton3 = findViewById(R.id.radiobtn3);

        button1 = findViewById(R.id.showbtnId);

        toastView = findViewById(R.id.toastID);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selectedID = radioGroup.getCheckedRadioButtonId();
                button1 = findViewById(selectedID);

                String value = button1.getText().toString();
                toastView.setText(value+" is my favourite.");

            }
        });

    }
}
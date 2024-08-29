package com.example.yotechpractice.timepicker;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yotechpractice.R;

public class TimePickerActivity extends AppCompatActivity {

    private TimePicker timePicker;
    private Button button;
    private TextView textView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);

        timePicker = findViewById(R.id.timePickerID);
        timePicker.setIs24HourView(true);
        button = findViewById(R.id.timePickerBtnID);
        textView = findViewById(R.id.timePickerTxtID);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String time = timePicker.getCurrentHour()+":"+timePicker.getCurrentMinute();

                textView.setText(time);
            }
        });

    }
}
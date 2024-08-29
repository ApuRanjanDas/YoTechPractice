package com.example.yotechpractice.timepicker;

import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.TextClock;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yotechpractice.R;

public class ClockActivity extends AppCompatActivity implements View.OnClickListener {

    AnalogClock analogClock;
    TextClock textClock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock);

        analogClock = findViewById(R.id.analogClockID);
        textClock = findViewById(R.id.textClockID);

        analogClock.setOnClickListener(this);
        textClock.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.analogClockID){
            Toast.makeText(ClockActivity.this,"Analog Clock", Toast.LENGTH_SHORT).show();
        }if (v.getId()==R.id.textClockID){
            Toast.makeText(ClockActivity.this,"Text Clock", Toast.LENGTH_SHORT).show();
        }
    }
}
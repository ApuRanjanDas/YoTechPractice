package com.example.yotechpractice.timepicker;

import android.annotation.SuppressLint;
import android.app.TimePickerDialog;
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

public class TimePickerDialogActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1;
    private TextView textView;
    private TimePickerDialog timePickerDialog;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker_dialog);

        button1 = findViewById(R.id.timePickerDialogButtonID);
        textView = findViewById(R.id.timePickerDailogTextID);

        button1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        TimePicker timePicker = new TimePicker(this);
        int currentHour = timePicker.getCurrentHour();
        int currentMinute = timePicker.getCurrentMinute();


        timePickerDialog = new TimePickerDialog(TimePickerDialogActivity.this,

                new TimePickerDialog.OnTimeSetListener(){
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        textView.setText(hourOfDay + ":" +minute);
                    }
                },currentHour,currentMinute,true);

        timePickerDialog.show();
    }
}
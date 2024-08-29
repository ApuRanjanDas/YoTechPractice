package com.example.yotechpractice.datepicker;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yotechpractice.R;

public class DatePickerDialogActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private Button button;
    private DatePickerDialog datePickerDialog;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker_dialog);

        textView = findViewById(R.id.txtID);
        button = findViewById(R.id.datepickerBtnId);

        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        DatePicker datePicker = new DatePicker(this);

        int currentDay = datePicker.getDayOfMonth();
        int currentMonth = (datePicker.getMonth())+1;
        int currentYear = datePicker.getYear();

        datePickerDialog = new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                        textView.setText(dayOfMonth+"/"+(month+1)+"/"+year);

                    }
                }, currentYear, currentMonth, currentDay);

        datePickerDialog.show();

    }
}
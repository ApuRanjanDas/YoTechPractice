package com.example.yotechpractice.spinner;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yotechpractice.R;

public class DropDownActivity extends AppCompatActivity {
    String[] deviceIP;

    private Spinner spinner;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drop_down);

        deviceIP = getResources().getStringArray(R.array.device_ip);

        spinner = findViewById(R.id.spinnerID);
        button = findViewById(R.id.spinnerBtnId);
        textView = findViewById(R.id.spinnerTextID);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textviewSampleId,deviceIP);
        spinner.setAdapter(adapter);

        button.setOnClickListener(v -> {
            String value = spinner.getSelectedItem().toString();
            textView.setText(value);
        });

    }
}
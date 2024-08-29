package com.example.yotechpractice.switchbutton;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yotechpractice.R;

public class SwitchActivity extends AppCompatActivity {
    private Switch aSwitch;
    private TextView switchTxt;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);

        aSwitch = findViewById(R.id.switchID);
        switchTxt = findViewById(R.id.switchTxtID);

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(SwitchActivity.this, "Wifi is On", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(SwitchActivity.this, "Wifi is Off", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
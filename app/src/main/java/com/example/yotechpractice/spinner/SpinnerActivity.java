package com.example.yotechpractice.spinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yotechpractice.R;

public class SpinnerActivity extends AppCompatActivity {

    private Spinner spinner;
    private String[] deviceIP;
    private String[] deviceName;
    int[] picture = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3,
                            R.drawable.pic4, R.drawable.pic5, R.drawable.pic6,
                            R.drawable.pic7};
    private boolean isFirstSelection = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        deviceIP = getResources().getStringArray(R.array.device_ip);
        deviceName = getResources().getStringArray(R.array.device_name);

        spinner = findViewById(R.id.spinnerID2);
        CustomAdapter customAdapter = new CustomAdapter(this,picture,deviceIP,deviceName);
        spinner.setAdapter(customAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (isFirstSelection==true){
                    isFirstSelection = false;
                }else {

                    Toast.makeText(getApplicationContext(),deviceName[position]+" is selected.",Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}
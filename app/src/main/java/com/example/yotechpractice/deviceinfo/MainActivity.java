package com.example.yotechpractice.deviceinfo;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yotechpractice.R;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.txt);
        button = findViewById(R.id.btn);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Serial = ("Serial: "+ Build.SERIAL);
                String Model = ("Model: "+ Build.MODEL);
                String ID = ("ID: "+ Build.ID);
                String Manufacturer = ("Manufacturer: "+ Build.MANUFACTURER);
                String brand = ("Brand: "+ Build.BRAND);
                String type = ("Type: "+ Build.TYPE);
                String user = ("User: "+ Build.USER);
                String base = ("Base: "+ Build.VERSION_CODES.BASE);
                String incremental = ("Incremental: "+ Build.VERSION.INCREMENTAL);
                String SDK = ("SDK: "+ Build.VERSION.SDK);
                String Board = ("BOARD: "+ Build.BOARD);
                String Brand = ("Brand: "+ Build.BRAND);
                String Host = ("HOST: "+ Build.HOST);
                String Fingerprint = ("Fingerprint: "+ Build.FINGERPRINT);
                String versionCode = ("VersionCode: "+ Build.VERSION.RELEASE);


                textView.setText(Serial+"\n"+Model+"ln"+ID+"ln"+Manufacturer+"\n"+brand+"ln"+type+"\n"+user+"ln"+base+"\n"+incremental+"ln"+SDK+"\n"+Board+"ln"+Brand+"\n"+Host+"ln"+Fingerprint+"\n"+versionCode);
            }
        });
    }
}
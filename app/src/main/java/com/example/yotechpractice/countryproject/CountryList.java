package com.example.yotechpractice.countryproject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yotechpractice.R;

public class CountryList extends AppCompatActivity implements View.OnClickListener {

    Button buttonBD, buttonUK, buttonUSA;
    Intent intent;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_list);

        buttonBD = findViewById(R.id.bdBtnID);
        buttonUK = findViewById(R.id.ukBtnID);
        buttonUSA = findViewById(R.id.usaBtnID);

        buttonBD.setOnClickListener(this);
        buttonUK.setOnClickListener(this);
        buttonUSA.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.bdBtnID){
            intent = new Intent(CountryList.this, ProfileActivity.class);
            intent.putExtra("name","bangladesh");
            startActivity(intent);
        }
        if (v.getId()==R.id.ukBtnID){
            intent = new Intent(CountryList.this, ProfileActivity.class);
            intent.putExtra("name","united_kingdom");
            startActivity(intent);
        }
        if (v.getId()==R.id.usaBtnID){
            intent = new Intent(CountryList.this, ProfileActivity.class);
            intent.putExtra("name","united_state_of_america");
            startActivity(intent);
        }

    }
}
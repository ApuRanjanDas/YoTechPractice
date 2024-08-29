package com.example.yotechpractice.cardview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.yotechpractice.R;

public class CardViewActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView noahCardView, airplineCardView, trainCardView, walkCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);

        noahCardView = findViewById(R.id.vehicleCardViewID);
        airplineCardView = findViewById(R.id.airvehicleCardViewID);
        trainCardView = findViewById(R.id.trainCardViewID);
        walkCardView = findViewById(R.id.walkCardViewID);

        noahCardView.setOnClickListener(this);
        airplineCardView.setOnClickListener(this);
        trainCardView.setOnClickListener(this);
        walkCardView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.vehicleCardViewID)
        {
            Intent intent = new Intent(CardViewActivity.this, VehicleActivity.class);
            startActivity(intent);
        }
        else if (v.getId()==R.id.airvehicleCardViewID)
        {
            
        }else if (v.getId()==R.id.trainCardViewID)
        {
            
        } else if (v.getId()==R.id.walkCardViewID) {
            
        }

    }
}
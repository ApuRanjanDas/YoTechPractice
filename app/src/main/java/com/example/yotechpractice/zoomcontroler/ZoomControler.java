package com.example.yotechpractice.zoomcontroler;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ZoomControls;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yotechpractice.R;

public class ZoomControler extends AppCompatActivity {
    ImageView imageView;
    ZoomControls zoomControls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom_controler);

        imageView = findViewById(R.id.zoomImageID);
        zoomControls = findViewById(R.id.zoomControlID);

        zoomControls.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float x = imageView.getScaleX();
                float y = imageView.getScaleY();

                imageView.setScaleX((float) x+1);
                imageView.setScaleY((float) y+1);

                Toast.makeText(getApplicationContext(), "Zoom In",Toast.LENGTH_SHORT).show();
            }
        });

        zoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float x = imageView.getScaleX();
                float y = imageView.getScaleY();

                if (x>1 && y>1){
                    imageView.setScaleX((float) x-1);
                    imageView.setScaleY((float) y-1);
                }

                Toast.makeText(getApplicationContext(), "Zoom Out",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
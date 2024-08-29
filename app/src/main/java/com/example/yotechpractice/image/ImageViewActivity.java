package com.example.yotechpractice.image;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yotechpractice.R;

public class ImageViewActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imageview1, imageview2;
    TextView textView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        imageview1 = findViewById(R.id.imageviewID1);
        imageview2 = findViewById(R.id.imageviewID2);
        textView = findViewById(R.id.textView);

        imageview1.setOnClickListener(this);
        imageview2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.imageviewID1){
            textView.setText("Inspector image is clicked.");
        }else{
            textView.setText("Boy image is clicked.");
        }

    }
}
package com.example.yotechpractice.framelayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yotechpractice.R;

public class FrameLayoutActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView imageView1, imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);

        imageView1 = findViewById(R.id.boyID);
        imageView2 = findViewById(R.id.inspectorID);

        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.boyID){
            imageView1.setVisibility(View.GONE);
            imageView2.setVisibility(View.VISIBLE);
        }
        if (v.getId()==R.id.inspectorID){
            imageView1.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.GONE);
        }

    }
}
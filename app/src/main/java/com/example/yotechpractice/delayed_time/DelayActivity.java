package com.example.yotechpractice.delayed_time;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yotechpractice.R;

public class DelayActivity extends AppCompatActivity {

    TextView delayTextView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delay);

        delayTextView = findViewById(R.id.delayedTxvId);

    }//OnCreate

    public void delayButton(View view) {

        long longTime1 = System.currentTimeMillis();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                long longTime2 = System.currentTimeMillis();

                long longTimeDifference = longTime2 -longTime1;

                delayTextView.setText(String.valueOf(longTimeDifference));
            }
        };

        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(runnable, 3000); //3 seconds delay
    }
}
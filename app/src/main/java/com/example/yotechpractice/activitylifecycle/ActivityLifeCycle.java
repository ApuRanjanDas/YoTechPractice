package com.example.yotechpractice.activitylifecycle;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yotechpractice.R;

public class ActivityLifeCycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Toast.makeText(ActivityLifeCycle.this,"onCreate",Toast.LENGTH_SHORT).show();
        //after enter in app 1
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(ActivityLifeCycle.this,"onStart",Toast.LENGTH_SHORT).show();
        //after enter in app 2
        //from minimise to enter the app 2
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(ActivityLifeCycle.this,"onResume",Toast.LENGTH_SHORT).show();
        //after enter in app 3
        //from minimise to enter the app 3
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(ActivityLifeCycle.this,"onPause",Toast.LENGTH_SHORT).show();
        //after out from app 1
        //after minimise the screen 1
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(ActivityLifeCycle.this,"onStop",Toast.LENGTH_SHORT).show();
        //after out from app 2
        //after minimise the screen 2
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(ActivityLifeCycle.this,"onRestart",Toast.LENGTH_SHORT).show();
        //from minimise to enter the app 1
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(ActivityLifeCycle.this,"onDestroy",Toast.LENGTH_SHORT).show();
        //after out from app 3
    }


}
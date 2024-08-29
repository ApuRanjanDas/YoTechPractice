package com.example.yotechpractice.sharedpreference;

import android.content.Context;
import android.content.SharedPreferences;
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

public class Project1Activity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private Button increaseButton, decreaseButton;
    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project1);

        textView = findViewById(R.id.textViewID);
        increaseButton = findViewById(R.id.increaseID);
        decreaseButton = findViewById(R.id.decreaseID);

        if (loadScore()!=0){
            textView.setText("Score: "+loadScore());
        }

        increaseButton.setOnClickListener(this);
        decreaseButton.setOnClickListener(this);

    }//On Create

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.increaseID){
            score = score+10;
            textView.setText("Score: "+score);
            saveScore(score);

        }else if (v.getId()==R.id.decreaseID){
            score = score-10;
            textView.setText("Score: "+score);
            saveScore(score);
        }

    }

    private void saveScore(int score){
        SharedPreferences sharedPreferences = getSharedPreferences("gameScore", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("lastScore",score);
        editor.commit();
    }

    private int loadScore(){
        SharedPreferences sharedPreferences = getSharedPreferences("gameScore", Context.MODE_PRIVATE);
        int score = sharedPreferences.getInt("lastScore",0);
        return score;
    }
}
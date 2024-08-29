package com.example.yotechpractice.feedback;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yotechpractice.R;

public class FeedbackActivity2 extends AppCompatActivity implements View.OnClickListener {

    private EditText nameEditText, feedbackEditText;
    private Button sendButton, claerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback2);

        nameEditText = findViewById(R.id.edtNameID);
        feedbackEditText = findViewById(R.id.edtFeedbackID);

        sendButton = findViewById(R.id.sendBtnID);
        claerButton = findViewById(R.id.clearBtnID);

        sendButton.setOnClickListener(this);
        claerButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

//        try {
            String name = nameEditText.getText().toString();
            String feedback = feedbackEditText.getText().toString();

            if (v.getId()==R.id.sendBtnID)
            {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/email");

                intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"apu.ranjan57@gmail.com","apurbodas046@gmail.com"});

                intent.putExtra(Intent.EXTRA_SUBJECT,"Feedback from user");
                intent.putExtra(Intent.EXTRA_TEXT,"Name: "+name +"\nFeedback: "+feedback);
                startActivity(Intent.createChooser(intent,"Feedback with"));

            }else if (v.getId()==R.id.clearBtnID){

                nameEditText.setText("");
                feedbackEditText.setText("");

            }
//
//        }catch (Exception e){
//
//            Toast.makeText(getApplicationContext(),"Exception "+e, Toast.LENGTH_SHORT).show();
//
//        }


    }
}
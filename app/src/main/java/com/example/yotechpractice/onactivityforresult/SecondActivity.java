package com.example.yotechpractice.onactivityforresult;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yotechpractice.R;

public class SecondActivity extends AppCompatActivity {
    private Button button1;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        button1 = findViewById(R.id.secondActivityBtnID);
        editText = findViewById(R.id.secondactivityEditID);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText.getText().toString();

                Intent intent = new Intent(SecondActivity.this, FirstActivity.class);
                intent.putExtra("key",value);
                setResult(1,intent);
                finish();
            }
        });

    }
}
package com.example.yotechpractice.edittext;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yotechpractice.R;

public class EditTextActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonAdd, buttonSub;
    private EditText editText1, editText2;
    private TextView resultTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        editText1 = findViewById(R.id.edittxtID1);
        editText2 = findViewById(R.id.edittxtID2);

        buttonAdd = findViewById(R.id.addbtnID);
        buttonSub = findViewById(R.id.subbtnID);

        resultTextview = findViewById(R.id.resultID);

        buttonAdd.setOnClickListener(this);
        buttonSub.setOnClickListener(this);


    }//On Create

    @Override
    public void onClick(View v) {

        try {
            String number1 = editText1.getText().toString();
            String number2 = editText2.getText().toString();

            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);

            if (v.getId()==R.id.addbtnID){
                double sum = num1+num2;
                resultTextview.setText("Result : "+sum);
            }else if(v.getId()==R.id.subbtnID){
                double sub = num1-num2;
                resultTextview.setText("Result : "+sub);
            }


        }catch (Exception e){
            Toast.makeText(EditTextActivity.this,"Please enter number",Toast.LENGTH_SHORT).show();

        }

    }
}
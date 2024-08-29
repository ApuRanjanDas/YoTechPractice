package com.example.yotechpractice.sharedpreference;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
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

public class SharedPreferenceActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText userName, password;
    private Button saveButton, loadButton;
    private TextView textView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference);

        userName = findViewById(R.id.userNameID);
        password = findViewById(R.id.passwordID);
        saveButton = findViewById(R.id.saveBtnID);
        loadButton = findViewById(R.id.loadID);
        textView = findViewById(R.id.txtViewID);


        saveButton.setOnClickListener(this);
        loadButton.setOnClickListener(this);


    }//On Create

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.saveBtnID){
            String userNameData = userName.getText().toString();
            String passwordData = password.getText().toString();

            if (userNameData.equals("") || passwordData.equals(""))
                Toast.makeText(getApplicationContext(),"Please enter data.",Toast.LENGTH_SHORT).show();
            else {
                //Writing Data
                SharedPreferences sharedPreferences = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("userNameKey",userNameData);
                editor.putString("passwordKey",passwordData);
                editor.commit();
                //data clear from edittext after save
                userName.setText("");
                password.setText("");
            }



        }else if(v.getId()==R.id.loadID){
            //To read data
            SharedPreferences sharedPreferences = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
            if (sharedPreferences.contains("userNameKey") && sharedPreferences.contains("passwordKey"))
            {
                String userName = sharedPreferences.getString("userNameKey","Data not found");
                String password = sharedPreferences.getString("passwordKey","Password not found");
                textView.setText(userName+"\n"+password);
            }

        }



    }
}
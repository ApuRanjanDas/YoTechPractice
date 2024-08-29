package com.example.yotechpractice.sqlite_database;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yotechpractice.R;

public class SQLITEMainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText idEditText, nameEditText, ageEditText, genderEditText;
    private Button addBtn, showBtn, updateBtn, deleteBtn;

    DatabaseHelper databaseHelper;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlitemain);

        databaseHelper = new DatabaseHelper(this);
        SQLiteDatabase sqLiteDatabase = databaseHelper.getWritableDatabase();

        idEditText = findViewById(R.id.idEdtTextID);
        nameEditText = findViewById(R.id.nameEdtTextID);
        ageEditText = findViewById(R.id.ageEdtTextID);
        genderEditText = findViewById(R.id.genderEdtTextID);
        addBtn = findViewById(R.id.btnAdd);
        showBtn = findViewById(R.id.showBtnID);
        updateBtn = findViewById(R.id.updateBtnID);
        deleteBtn = findViewById(R.id.deleteBtnID);

        addBtn.setOnClickListener(this);
        showBtn.setOnClickListener(this);
        updateBtn.setOnClickListener(this);
        deleteBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String id = idEditText.getText().toString();
        String name = nameEditText.getText().toString();
        String age = ageEditText.getText().toString();
        String gender = genderEditText.getText().toString();
        
        if (v.getId()==R.id.btnAdd){
            long rowID = databaseHelper.insertData(id, name, age, gender);
            if (rowID==-1)
            {
                Toast.makeText(getApplicationContext(),"Row "+rowID+" is unsuccessfully inserted.",Toast.LENGTH_LONG).show();
            }else
            {
                Toast.makeText(getApplicationContext(),"Row "+rowID+" is successfully inserted.",Toast.LENGTH_LONG).show();
            }
        }


//full data table show in alert dialog
        if (v.getId()==R.id.showBtnID){
            Cursor showDB = databaseHelper.showAllInformation();
            if (showDB.getCount()==0){
                showData("Error", "No Data Found");
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            while (showDB.moveToNext())
            {
                stringBuffer.append("ID: "+showDB.getString(0)+"\n");
                stringBuffer.append("Name: "+showDB.getString(1)+"\n");
                stringBuffer.append("AGE: "+showDB.getString(2)+"\n");
                stringBuffer.append("GENDER: "+showDB.getString(3)+"\n\n\n");
            }
            showData("ResultSet",stringBuffer.toString());
        }

//To Update data
        if (v.getId()==R.id.updateBtnID)
        {
            boolean isUpdated = databaseHelper.updateData(id,name,age,gender);
            if (isUpdated==true){
                Toast.makeText(getApplicationContext(),"Data is updated.",Toast.LENGTH_LONG).show();
            }else {
                Toast.makeText(getApplicationContext(),"Data is not updated.",Toast.LENGTH_LONG).show();
            }
        }


//To delete data
        if (v.getId()==R.id.deleteBtnID)
        {
            int value = databaseHelper.deleteData(id);
            if (value>0){
                Toast.makeText(getApplicationContext(),"Data is deleted.",Toast.LENGTH_LONG).show();
            }else {
                Toast.makeText(getApplicationContext(),"Data is not deleted.",Toast.LENGTH_LONG).show();
            }
        }
    }

//full data table show in alert dialog
    public void showData(String title, String message)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setCancelable(true);
        builder.show();

    }





}
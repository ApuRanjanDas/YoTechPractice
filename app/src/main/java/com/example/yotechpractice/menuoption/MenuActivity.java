package com.example.yotechpractice.menuoption;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yotechpractice.R;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()==R.id.settingID){
            Toast.makeText(MenuActivity.this,"Setting is selected",Toast.LENGTH_SHORT).show();
            return true;
        }
        if (item.getItemId()==R.id.sunmiID){
            Toast.makeText(MenuActivity.this,"Sunmi is selected",Toast.LENGTH_SHORT).show();
            return true;
        }
        if (item.getItemId()==R.id.v8ID){
            Toast.makeText(MenuActivity.this,"V8 is selected",Toast.LENGTH_SHORT).show();
            return true;
        }
        if (item.getItemId()==R.id.t80ID){
            Toast.makeText(MenuActivity.this,"T80 is selected",Toast.LENGTH_SHORT).show();
            return true;
        }



        return super.onOptionsItemSelected(item);
    }
}
package com.example.yotechpractice.grideview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yotechpractice.R;
import com.example.yotechpractice.spinner.CustomAdapter;

public class GrideViewActivity extends AppCompatActivity {

    GridView gridView;

    int[] pictures = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4, R.drawable.pic5, R.drawable.pic6, R.drawable.pic7, R.drawable.pic3};
    String[] deviceName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gride_view);

        gridView = findViewById(R.id.gridviewID);

        deviceName = getResources().getStringArray(R.array.device_name);

        Customadapter adapter = new Customadapter(this,deviceName,pictures);
        gridView.setAdapter(adapter);







        //Toast Add
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = deviceName[position];
                Toast.makeText(GrideViewActivity.this,value,Toast.LENGTH_SHORT).show();
            }
        });

    }
}
package com.example.yotechpractice.listview;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yotechpractice.R;
import com.example.yotechpractice.spinner.CustomAdapter;

public class ListViewActivity2 extends AppCompatActivity {

    private ListView listView;
    private String[] deviceName;
    private String[] deviceDescription;
    private int[] picture = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3,R.drawable.pic4, R.drawable.pic5, R.drawable.pic6, R.drawable.pic7};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view2);

        listView = findViewById(R.id.listViewID2);
        deviceName = getResources().getStringArray(R.array.device_name);
        deviceDescription = getResources().getStringArray(R.array.device_description);

        CustomAdapter2 adapter = new CustomAdapter2(this, deviceName, new String[][]{deviceDescription}, picture);
        listView.setAdapter(adapter);


    }
}
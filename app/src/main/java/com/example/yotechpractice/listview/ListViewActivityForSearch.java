package com.example.yotechpractice.listview;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yotechpractice.R;

public class ListViewActivityForSearch extends AppCompatActivity {
    private ListView listView;
    private String[] deviceName;
    private String[] deviceDescription;
    private int[] picture = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3,R.drawable.pic4, R.drawable.pic5, R.drawable.pic6, R.drawable.pic7};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_for_search);

        listView = findViewById(R.id.listViewID2);
        deviceName = getResources().getStringArray(R.array.device_name);
        deviceDescription = getResources().getStringArray(R.array.device_description);

//        adapter = new ArrayAdapter<String>(ListViewActivityForSearch.this, R.layout.sample_listview_layout, R.id.imageViewID);
//        listView.setAdapter(adapter);
//        listView.setOnItemClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu2_layout,menu);

        MenuItem menuItem = menu.findItem(R.id.searchID);
        SearchView searchView = (SearchView) menuItem.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {


                //adap


                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }
}
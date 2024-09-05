package com.example.yotechpractice.fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.yotechpractice.R;

public class MainFragmentActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragment);

        listview = findViewById(R.id.listviewID);

        String[] deviceName = {"Sunmi", "KDS", "KP", "EPOS", "V8", "T80"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, deviceName);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(this);

    }//On Create

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Fragment fragment;

        if (position==0){
            fragment = new SunmiFragment();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentID, fragment);
            fragmentTransaction.commit();
        }else if (position==1){
            fragment = new KDSFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentID, fragment).commit();
        } else if (position==2) {
            fragment = new KPFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentID, fragment).commit();
        }

    }
}
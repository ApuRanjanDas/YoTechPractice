package com.example.yotechpractice.expandablelistview;

import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yotechpractice.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListViewActivity extends AppCompatActivity {
    private ExpandableListView expandableListView;
    private CustomAdapterExpandable customAdapterExpandable;
    List<String> listDataHeader;
    HashMap<String,List<String>> listDataChild;
    int lastExpandablePosition = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandable_list_view);

        prepareList();
//        prepareList2();

        expandableListView = findViewById(R.id.expandableListViewID);
        customAdapterExpandable = new CustomAdapterExpandable(this,listDataHeader,listDataChild);
        expandableListView.setAdapter(customAdapterExpandable);


        //Toast
        expandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                String groupName = listDataHeader.get(groupPosition);
                Toast.makeText(getApplicationContext(),"Group Name "+groupName,Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        //Toast for Collapse
        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int groupPosition) {
                String groupName = listDataHeader.get(groupPosition);
                Toast.makeText(getApplicationContext(),"Collapse "+groupName,Toast.LENGTH_SHORT).show();
            }
        });
        //Toast for Child
        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                String childString = listDataChild.get(listDataHeader.get(groupPosition)).get(childPosition);
                Toast.makeText(getApplicationContext(),childString,Toast.LENGTH_SHORT).show();
                return false;
            }
        });


        //To collapse last expandable list
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                if (lastExpandablePosition != -1 && lastExpandablePosition != groupPosition){
                    expandableListView.collapseGroup(lastExpandablePosition);
                }
                lastExpandablePosition = groupPosition;
            }
        });

    }

    private void prepareList() {
        String[] headerString = getResources().getStringArray(R.array.device_name);
        String[] childString = getResources().getStringArray(R.array.device_description);

        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();

        for (int i=0; i<headerString.length; i++)
        {
            listDataHeader.add(headerString[i]);

            List<String> child = new ArrayList<>();
            child.add(childString[i]);

            listDataChild.put(listDataHeader.get(i),child);
        }
    }

    //For more child list
//    private void prepareList2() {
//        listDataHeader = new ArrayList<>();
//        listDataChild = new HashMap<>();
//
//        listDataHeader.add("1, Overview");
//        listDataHeader.add("2, Environment Set Up");
//        listDataHeader.add("3, Program Structure");
//
//
//
//        List<String> overView = new ArrayList<>();
//        overView.add("1.1 What is sunmi device?");
//        overView.add("1.2 What the advantage of this?");
//        overView.add("1.3 Which company produce it??");
//        overView.add("1.4 What is sunmi device?");
//        overView.add("1.5 What is sunmi device?");
//
//        List<String> environmentSetUp = new ArrayList<>();
//        environmentSetUp.add("2.1 What is sunmi device?");
//        environmentSetUp.add("2.2 What the advantage of this?");
//        environmentSetUp.add("2.3 Which company produce it??");
//        environmentSetUp.add("2.4 What is sunmi device?");
//
//        List<String> programStructure = new ArrayList<>();
//        programStructure.add("3.1 What is sunmi device?");
//        programStructure.add("3.2 What the advantage of this?");
//        programStructure.add("3.3 Which company produce it??");
//        programStructure.add("3.4 What is sunmi device?");
//
//
//
//        listDataChild.put(listDataHeader.get(0),overView);
//        listDataChild.put(listDataHeader.get(1),environmentSetUp);
//        listDataChild.put(listDataHeader.get(2),programStructure);
//
//    }
}
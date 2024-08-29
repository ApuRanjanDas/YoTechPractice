package com.example.yotechpractice.scrolltab;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.yotechpractice.R;

public class ScrollTabActivity extends FragmentActivity {
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_tab);

        viewPager = findViewById(R.id.viewPagerID);
        FragmentManager fragmentManager = getSupportFragmentManager();
        CustomAdapter customAdapter = new CustomAdapter(fragmentManager);
        viewPager.setAdapter(customAdapter);

    }
}

class CustomAdapter extends FragmentStatePagerAdapter{

    public CustomAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position==0){
            fragment = new FragmentOne();
        }
        if (position==1){
            fragment = new FragmentTwo();
        }
        if (position==2){
            fragment = new FragmentThree();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }





    //Page Top Bar
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        if (position==0){
            return "Tab1";
        }
        else if (position==1){
            return "Tab2";
        }
        else if (position==2){
            return "Tab3";
        }
        return null;

    }
}
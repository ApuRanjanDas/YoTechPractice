package com.example.yotechpractice.countryproject;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yotechpractice.R;

public class ProfileActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imageView = findViewById(R.id.imageID);
        textView = findViewById(R.id.textViewId);

        Bundle bundle = getIntent().getExtras();
        if (bundle!=null){
            String countryName = bundle.getString("name");
            showDetails(countryName);
        }



        //Adding a back button to the tool bar (menu bar)
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }

    void showDetails(String countryName) {
        if (countryName.equals("bangladesh")){
            imageView.setImageResource(R.drawable.bd_flag);
            textView.setText(R.string.bd_text);
        }
        if (countryName.equals("united_kingdom")){
            imageView.setImageResource(R.drawable.uk_flag);
            textView.setText(R.string.uk_text);
        }
        if (countryName.equals("united_state_of_america")){
            imageView.setImageResource(R.drawable.usa_flag);
            textView.setText(R.string.usa_text);
        }
    }




    //Adding a back button to the tool bar (menu bar)
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        if (item.getItemId()==android.R.id.home)
//        {
//            this.finish();
//        }
//        return super.onOptionsItemSelected(item);
//    }
}
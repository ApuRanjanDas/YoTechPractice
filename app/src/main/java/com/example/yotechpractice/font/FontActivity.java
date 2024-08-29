package com.example.yotechpractice.font;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yotechpractice.R;

public class FontActivity extends AppCompatActivity {

    private TextView textView1, textView2;
    private Typeface typeface1, typeface2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_font);

        textView1 = findViewById(R.id.font1);
        textView2 = findViewById(R.id.font2);

        typeface1 = Typeface.createFromAsset(getAssets(),"FiraSans_Bold.otf");
        textView1.setTypeface(typeface1);


        //font website...................https://www.fontsquirrel.com/


        typeface2 = Typeface.createFromAsset(getAssets(),"FiraSans_Italic.otf");
        textView2.setTypeface(typeface2);
    }
}



package com.example.yotechpractice.htmlcontent;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yotechpractice.R;

public class HTMLContent2 extends AppCompatActivity {

    private TextView textView;
    String mytxt = "<h1>This is Heading 1 </h1>\n" +
            "<h2>This is Heading 2 </h2>\n" +
            "<h3>This is Heading 3 </h3>\n" +
            "<p>This is Paragraph </p>\n" +
            "<p><u>This is underline </u></p>\n" +
            "<p><b>This is bold </b></p>\n" +
            "<p><i>This is italic </i></p>\n\n" +
            "<p>This is Pagramming language order list: </p>\n" +
            "<ol>\n" +
            "<li>C</li>" +
            "<li>C++</li>" +
            "<li>Java</li>" +
            "<li>OOP</li>" +
            "</ol>\n\n" +
            "<p>(a+b)<sup>2</sup> = a<sup>2</sup> + 2ab + b<sup>2</sup></p>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_htmlcontent2);

        //WebView use kora best

        textView = findViewById(R.id.txtViewID);

        textView.setText(Html.fromHtml(mytxt));

    }
}
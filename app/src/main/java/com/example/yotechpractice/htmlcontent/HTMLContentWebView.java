package com.example.yotechpractice.htmlcontent;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.yotechpractice.R;

public class HTMLContentWebView extends AppCompatActivity {
    private WebView webView;
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
        setContentView(R.layout.activity_htmlcontent);

        webView = findViewById(R.id.webViewID);
        webView.loadDataWithBaseURL(null,mytxt,"text/html","utf-8",null);

    }
}
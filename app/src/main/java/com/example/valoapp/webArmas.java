package com.example.valoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class webArmas extends AppCompatActivity {

    Button cerrar;
    WebView webNews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_armas);


        webNews = (WebView) findViewById(R.id.wbNews);

        String URL = "https://playvalorant.com/en-us/news/tags/patch-notes/";

        webNews.setWebViewClient(new WebViewClient());
        webNews.loadUrl(URL);
        WebSettings webSettings = webNews.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }
}
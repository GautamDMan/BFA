package com.example.businessfinanceassistant;


import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    WebView mywebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setContentView(R.layout.activity_main);
            mywebView = findViewById(R.id.webview);
            mywebView.loadUrl("https://businessfinanceassistant.lloydsbank.com");
            //mywebView.loadUrl("https://www.google.com/");
            mywebView.getSettings().setJavaScriptEnabled(true);
            mywebView.getSettings();
            // Line of Code for opening links in app
            mywebView.setWebViewClient(new WebViewClient());
        }
        /*
        mywebView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.toString());
                return true;
            }
        });
        */
    }
    @Override
    protected void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        mywebView.saveState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState)
    {
        super.onRestoreInstanceState(savedInstanceState);
        mywebView.restoreState(savedInstanceState);
    }
}


package com.it_group_o.owntimetable.sch_webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.it_group_o.owntimetable.*;
public class sch_webview_IT38 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sch_webview_it38);

        WebView webview;




        webview = findViewById(R.id.Webviewsch_IT38);
        try {
            webview.setWebViewClient(new WebViewClient());
            webview.loadUrl("https://drive.google.com/drive/folders/1e0Ag3TFdST7ErA2yI4ExsMzZ9dYy2s8J?usp=share_link");
            WebSettings websettings= webview.getSettings();
            websettings.setJavaScriptEnabled(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
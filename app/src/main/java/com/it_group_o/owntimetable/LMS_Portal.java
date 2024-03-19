package com.it_group_o.owntimetable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class LMS_Portal extends AppCompatActivity {

    WebView webview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lms_portal);

        webview = findViewById(R.id.Webview1);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("http://nw.lms.kdu.ac.lk/lms/login/index.php");
        WebSettings websettings= webview.getSettings();
        websettings.setJavaScriptEnabled(true);


    }
}
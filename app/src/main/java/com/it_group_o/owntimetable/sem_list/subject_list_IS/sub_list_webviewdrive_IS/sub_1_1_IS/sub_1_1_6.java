package com.it_group_o.owntimetable.sem_list.subject_list_IS.sub_list_webviewdrive_IS.sub_1_1_IS;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.it_group_o.owntimetable.R;

public class sub_1_1_6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub116);

        WebView webview;




        webview = findViewById(R.id.Webviewsub116);
        try {
            webview.setWebViewClient(new WebViewClient());
            webview.loadUrl("https://drive.google.com/drive/folders/1TdPjcfB1424z0KNvstDHpucR6jXAsjpe?usp=share_link");
            WebSettings websettings= webview.getSettings();
            websettings.setJavaScriptEnabled(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
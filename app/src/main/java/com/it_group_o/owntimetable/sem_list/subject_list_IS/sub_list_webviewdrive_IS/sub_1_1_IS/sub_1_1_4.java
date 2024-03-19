package com.it_group_o.owntimetable.sem_list.subject_list_IS.sub_list_webviewdrive_IS.sub_1_1_IS;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.it_group_o.owntimetable.R;

public class sub_1_1_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub114);

        WebView webview;




        webview = findViewById(R.id.Webviewsub114);
        try {
            webview.setWebViewClient(new WebViewClient());
            webview.loadUrl("https://drive.google.com/drive/folders/1QAPwNFNtO2GcorSzU3crb82aErPAk5fO?usp=share_link");
            WebSettings websettings= webview.getSettings();
            websettings.setJavaScriptEnabled(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
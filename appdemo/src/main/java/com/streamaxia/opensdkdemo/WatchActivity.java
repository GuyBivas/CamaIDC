package com.streamaxia.opensdkdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WatchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch_acticity);

        String html = "<iframe width=\"640\" height=\"480\" frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" src=\"http://play.streamaxia.com/guy_url\"></iframe>";
//        String html = "<iframe width=\"250\" height=\"700\" style=\"border: 1px solid #cccccc;\" src=\"http://api.thingspeak.com/channels/31592/charts/1?width=450&height=260&results=60&dynamic=true\" ></iframe>";
//        String html = "<iframe width=\"250\" height=\"700\" style=\"border: 1px solid #cccccc;\" src=\"http://play.streamaxia.com/guy_url\" ></iframe>";

        WebView webview;
        webview = (WebView) findViewById(R.id.guyView);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadData(html, "text/html", null);
        webview.setWebViewClient(new WebViewClient());
    }
}
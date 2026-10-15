package com.carrom.online;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
public class MainActivity extends Activity {
 public void onCreate(Bundle b){super.onCreate(b); WebView v=new WebView(this); v.setWebViewClient(new WebViewClient()); WebSettings s=v.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true); v.loadUrl("file:///android_asset/index.html"); setContentView(v);}
}
package com.mugerwa.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    private  val webView:WebView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title="Intellectssoft"  //giving labels, the manifest only works for the first screen
        val webView=findViewById<WebView>(R.id.webview)
        webView.webViewClient= WebViewClient()
        webView.loadUrl("https://kyu.ac.ug/")

//        since most websites run on javascript
        val webSettings=webView.settings
        webSettings.javaScriptEnabled=true

    }

    override fun onBackPressed() {
        if(webView?.canGoBack() == true){
            webView.goBack()

        }else{

        }
    }
}
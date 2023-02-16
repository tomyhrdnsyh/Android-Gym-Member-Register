package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast

class MyWebView : AppCompatActivity() {

    lateinit var webView: WebView

    companion object {
        const val URL = ""
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        val url = intent.getStringExtra(URL)

        webView = findViewById(R.id.CustomWebView)
        webView.webViewClient = WebViewClient()

        Toast.makeText(this, "Beralih ke webview", Toast.LENGTH_SHORT).show()

        webView.loadUrl("$url")

        // web settings
        val webSettings = webView.settings
        // enable javascript
        webSettings.javaScriptEnabled = true

        // enable other tools, such boostrap
        webSettings.domStorageEnabled = true

    }
}
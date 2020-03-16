package com.example.mywebview;

import android.webkit.JavascriptInterface;

/**
 * Android 里面的方 供 js 调用
 */
public class AndroidtoJs {
    // 定义JS需要调用的方法
    // 被JS调用的方法必须加入@JavascriptInterface注解
    @JavascriptInterface
    public void hello(String msg) {
        System.out.println("JS调用了Android的hello方法");
    }
}

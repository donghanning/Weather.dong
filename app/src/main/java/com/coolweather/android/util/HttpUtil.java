package com.coolweather.android.util;
/**
 * 省市县的数据都是从服务器端获取到的，此处和服务器的交互必不可少，因此创建HttpUtil类
 *  1）请求地址
 *  2）注册一个回调来处理服务器响应
 */

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
/**
 * OkHttpClient----Factory for {@linkplain Call calls}, which can be used to send HTTP requests and read their
 * responses.(发送http请求并读取他们的响应)
 */
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}

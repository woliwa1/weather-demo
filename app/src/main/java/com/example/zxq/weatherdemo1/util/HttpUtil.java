package com.example.zxq.weatherdemo1.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by ${zxq} on 2017/10/27.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address, Callback callback){

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);

    }
}

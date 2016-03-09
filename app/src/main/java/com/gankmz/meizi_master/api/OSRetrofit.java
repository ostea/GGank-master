package com.gankmz.meizi_master.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by ostea on 2016/3/8.
 * 17:05
 */
public class OSRetrofit {
    static OSApi osApiService = null;

    final static Gson mGson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
            .serializeNulls()
            .create();
    //构造函数
    OSRetrofit() {
        OkHttpClient okHttpClient = new OkHttpClient();
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://gank.io/api/")
                .addConverterFactory(GsonConverterFactory.create(mGson))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(okHttpClient)
                .build();
        osApiService = retrofit.create(OSApi.class);
    }

    public  OSApi getOSApi() {
        return osApiService;
    }

}

package com.gankmz.meizi_master.api;

/**
 * Created by ostea on 2016/3/8.
 * 17:05
 */
public class OSFactory {

    protected static final Object monitor = new Object();
    public static final int meizhiSize = 10;
    public static final int gankSize = 5;

    static OSApi sGankIOSingleton = null;

    public static OSApi getOSApi() {
        synchronized (monitor) {
            if (sGankIOSingleton == null) {
                sGankIOSingleton = new OSRetrofit().getOSApi();
            }
            return sGankIOSingleton;
        }
    }
}

package com.gankmz.meizi_master;

import android.app.Application;
import android.content.Context;

import com.litesuits.orm.LiteOrm;

/**
 * Created by ostea on 2016/3/8.
 * 16:44
 */
public class AppContext extends Application{


    public static LiteOrm DB_liteOrm=null;
    private static String DB_NAME="meizi.db";
    public static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();

        //设置数据库相关
        sContext=this;
        DB_liteOrm=LiteOrm.newSingleInstance(sContext,DB_NAME);
        if (BuildConfig.DEBUG) {
            DB_liteOrm.setDebugged(true);
        }

    }
}

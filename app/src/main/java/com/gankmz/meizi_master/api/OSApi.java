package com.gankmz.meizi_master.api;

import com.gankmz.meizi_master.model.AndroidData;
import com.gankmz.meizi_master.model.GankData;
import com.gankmz.meizi_master.model.MeiZhiData;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 *
 * 本接口来源于http://gank.io/api
 * Created by ostea on 2016/3/8.
 * 17:05
 */
public interface OSApi {

//    分类数据: http://gank.io/api/data/数据类型/请求个数/第几页
//
//    数据类型： 福利 | Android | iOS | 休息视频 | 拓展资源 | 前端 | all
//    请求个数： 数字，大于0
//    第几页：数字，大于0
//
//    例：
//
//    http://gank.io/api/data/Android/10/1
//    http://gank.io/api/data/福利/10/1
//    http://gank.io/api/data/iOS/20/2
//    http://gank.io/api/data/all/20/2

    /**
     * 1.获取当天的干货
     * @param year
     * @param month
     * @param day
     * @return
     */
    @GET("day/{year}/{month}/{day}")
    Observable<GankData> getGankData(
            @Path("year") int year,
            @Path("month") int month,
            @Path("day") int day);
    /**
     * 2.获取妹纸福利，嘻嘻嘻嘻嘻嘻嘻
     * @param page
     * @return
     */
    @GET(value = "data/福利/" + OSFactory.meizhiSize + "/{page}")
    Observable<MeiZhiData> getMeizhiData(
            @Path("page") int page);


    /**
     * 3.获取android消息
     * @param page
     * @return
     */
    @GET("data/Android/"+OSFactory.meizhiSize+"/{page}")
    Observable<AndroidData>getAndroidData(@Path("page") int page);


    /**
     * 4.获取iOS消息
     * @param page
     * @return
     */
    @GET("data/iOS/"+OSFactory.meizhiSize+"/{page}")
    Observable<AndroidData>getiOSData(@Path("page") int page);


    /**
     * 获取所有的消息
     * @param page
     * @return
     */
    @GET("data/all/"+OSFactory.meizhiSize+"/{page}")
    Observable<AndroidData>getAllData(@Path("page") int page);



}

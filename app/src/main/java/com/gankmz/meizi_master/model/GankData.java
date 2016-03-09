package com.gankmz.meizi_master.model;

import com.gankmz.meizi_master.model.entyty.Gank;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ostea on 2016/3/8.
 * 17:32
 */
public class GankData extends BaseData{

    public Result results;
    public List<String> category;

    public class Result {
        @SerializedName("Android") public List<Gank> androidList;
        @SerializedName("休息视频") public List<Gank> 休息视频List;
        @SerializedName("iOS") public List<Gank> iOSList;
        @SerializedName("福利") public List<Gank> 妹纸List;
        @SerializedName("拓展资源") public List<Gank> 拓展资源List;
        @SerializedName("瞎推荐") public List<Gank> 瞎推荐List;
        @SerializedName("App") public List<Gank> appList;
    }
}

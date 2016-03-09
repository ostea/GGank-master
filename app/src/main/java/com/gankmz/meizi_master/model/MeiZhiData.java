package com.gankmz.meizi_master.model;

import com.gankmz.meizi_master.model.entyty.MeiZhi;

import java.util.List;

/**
 * Created by ostea on 2016/3/8.
 * 17:32
 */
public class MeiZhiData extends BaseData {

    public List<MeiZhi> results;

    @Override
    public String toString() {
        return "MeiZhiData{" +
                "results=" + results +
                '}';
    }
}

package com.gankmz.meizi_master.ui.activity;


import com.gankmz.meizi_master.R;
import com.gankmz.meizi_master.ui.home.HomeFragment;
import com.gankmz.meizi_master.ui.mine.MineFragment;

public enum MainTab {

    HOME(0, R.string.main_tab_name_home, R.mipmap.ic_launcher,
            HomeFragment.class),
    QUICK(1, R.string.main_tab_name_quick, R.mipmap.ic_launcher,
            null),
    ME(2, R.string.main_tab_name_me, R.mipmap.ic_launcher,
            MineFragment.class);

    private int idx;
    private int resName;
    private int resIcon;
    private Class<?> clz;

    private MainTab(int idx, int resName, int resIcon, Class<?> clz) {
        this.idx = idx;
        this.resName = resName;
        this.resIcon = resIcon;
        this.clz = clz;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public int getResName() {
        return resName;
    }

    public void setResName(int resName) {
        this.resName = resName;
    }

    public int getResIcon() {
        return resIcon;
    }

    public void setResIcon(int resIcon) {
        this.resIcon = resIcon;
    }

    public Class<?> getClz() {
        return clz;
    }

    public void setClz(Class<?> clz) {
        this.clz = clz;
    }
}

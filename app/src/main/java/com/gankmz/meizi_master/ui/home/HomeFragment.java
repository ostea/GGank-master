package com.gankmz.meizi_master.ui.home;

import android.util.Log;

import com.gankmz.library.base.BaseLazyFragment;
import com.gankmz.meizi_master.R;

/**
 * Created by ostea on 2016/3/9.
 * 15:56
 */
public class HomeFragment extends BaseLazyFragment{
    @Override
    protected void onFirstUserVisible() {
        Log.d("TAG","home 第一次见");
    }

    @Override
    protected void onUserVisible() {
        Log.d("TAG","home  onresume");
    }

    @Override
    protected void onUserInvisible() {

    }
    @Override
    protected void initViewsAndEvents() {

    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_main_home;
    }
}

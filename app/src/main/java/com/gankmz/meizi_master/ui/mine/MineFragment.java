package com.gankmz.meizi_master.ui.mine;

import android.util.Log;

import com.gankmz.library.base.BaseLazyFragment;
import com.gankmz.meizi_master.R;

/**
 * Created by ostea on 2016/3/9.
 * 15:56
 */
public class MineFragment extends BaseLazyFragment{
    @Override
    protected void onFirstUserVisible() {
        Log.d("TAG","start");
    }

    @Override
    protected void onUserVisible() {

    }

    @Override
    protected void onUserInvisible() {

    }

    @Override
    protected void initViewsAndEvents() {

    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_main_mine;
    }
}

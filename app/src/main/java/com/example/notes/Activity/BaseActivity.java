package com.example.notes.Activity;

import android.content.Context;
import android.os.Bundle;

import com.example.notes.Util.StatusBarUtils;
import com.example.notes.swipe.swipebacklayout.lib.SwipeBackLayout;
import com.example.notes.swipe.swipebacklayout.lib.app.SwipeBackActivity;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;
/**
 * Created on 2017/4/7.
 * Activity基类 用于设置活动的侧滑退出
 */

public class BaseActivity extends SwipeBackActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        backSet();
        setStatusBarLightMode(true);
    }

    /**
     * 侧滑设置
     */
    private void backSet() {
        SwipeBackLayout mSwipeBackLayout = getSwipeBackLayout();
        mSwipeBackLayout.setEdgeSize(400);
        //设置滑动方向，可设置EDGE_LEFT, EDGE_RIGHT, EDGE_ALL, EDGE_BOTTOM
        mSwipeBackLayout.setEdgeTrackingEnabled(SwipeBackLayout.EDGE_LEFT);
    }

    /**
     * 状态栏黑白模式
     * true 白色 false 黑
     */
    public void setStatusBarLightMode(boolean isLightMode) {
        StatusBarUtils.setStatusBarLightMode(this, isLightMode);
    }
    /**
     * 字体链接
     *
     * @param newBase
     */
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}

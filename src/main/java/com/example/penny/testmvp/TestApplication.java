package com.example.penny.testmvp;

import android.app.Application;

import org.xutils.x;

/**
 * Created by penny on 2016/3/3.
 */
public class TestApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(true); // 是否输出debug日志
    }
}

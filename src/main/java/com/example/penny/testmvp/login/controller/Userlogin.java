package com.example.penny.testmvp.login.controller;

import android.content.Context;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

/**
 * Created by penny on 2016/3/3.
 */
public class Userlogin {
    private Context mContext;
    public Userlogin(Context context){
        mContext = context;
    }
    public void login(String username,String pwd,final Callback.CommonCallback<String> callBack){
        RequestParams params = new RequestParams("https://www.baidu.com");
        x.http().get(params, callBack);
    }
}

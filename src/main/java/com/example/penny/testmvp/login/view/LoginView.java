package com.example.penny.testmvp.login.view;

import android.content.Context;

/**
 * Created by penny on 2016/3/2.
 */
public interface LoginView {
    /**清除信息接口*/
    void clear();
    /**跳转下个界面接口*/
    void toNextActivity();
    void showLoading();
    void hideLoading();
    void showFailError(int flag);
    String getUserName();
    String getPwd();
    Context getContext();
}

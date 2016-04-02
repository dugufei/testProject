package com.example.penny.testmvp.login.controller;

import android.content.Context;

import com.example.penny.testmvp.login.view.LoginView;

import org.xutils.common.Callback;
import org.xutils.common.util.LogUtil;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.x;

/**
 * Created by penny on 2016/3/2.
 */
public class UserLoginPresenter {
    private LoginView loginView;
    public UserLoginPresenter(LoginView loginView){
        this.loginView = loginView;
    }


    public void login(){
        loginView.showLoading();

        RequestParams params = new RequestParams();
        params.addBodyParameter("","");
        x.http().request(HttpMethod.POST, params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                LogUtil.e(result);
                loginView.hideLoading();
                loginView.toNextActivity();
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                loginView.hideLoading();
                loginView.showFailError(0);
            }

            @Override
            public void onFinished() {

            }
        });

    }

    public void clear(){
        loginView.clear();
    }


}

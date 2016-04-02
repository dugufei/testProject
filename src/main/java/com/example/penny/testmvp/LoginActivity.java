package com.example.penny.testmvp;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.penny.testmvp.login.controller.UserLoginPresenter;
import com.example.penny.testmvp.login.controller.Userlogin;
import com.example.penny.testmvp.login.view.LoginView;

import org.xutils.common.util.LogUtil;
import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

/**
 * Created by penny on 2016/3/2.
 */
@ContentView(R.layout.loginactivity)
public class LoginActivity extends FragmentActivity implements LoginView{
    @ViewInject(R.id.et_username)
    private EditText mEtUsername;
    @ViewInject(R.id.et_pwd)
    private EditText mEtPassword;
    @ViewInject(R.id.btn_login)
    private Button mBtnLogin;
    @ViewInject(R.id.btn_clear)
    private Button mBtnClear;
    @ViewInject(R.id.progressBar)
    private ProgressBar mPbLoading;

    private UserLoginPresenter userLoginPresenter = new UserLoginPresenter(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        x.view().inject(this);
        super.onCreate(savedInstanceState);
    }

    @Event(value = R.id.btn_login)
    private void presstoLogin(View view){
        userLoginPresenter.login();
    }
    @Event(value = R.id.btn_clear)
    private void presstoClear(View view){
        userLoginPresenter.clear();
    }

    @Override
    public void clear() {
        mEtUsername.setText("");
    }

    @Override
    public void toNextActivity() {
        Toast.makeText(this," login success , to MainActivity", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showLoading() {
        mPbLoading.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
        mPbLoading.setVisibility(View.GONE);
    }

    @Override
    public void showFailError(int flag) {
        Toast.makeText(this," login fail", Toast.LENGTH_SHORT).show();
    }

    @Override
    public String getUserName() {
        return mEtUsername.getText().toString().trim();
    }

    @Override
    public String getPwd() {
        return mEtPassword.getText().toString().trim();
    }



    @Override
    public Context getContext() {
        return getApplicationContext();
    }
}

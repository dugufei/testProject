package com.example.penny.testmvp.login.model;

import com.example.penny.testmvp.Base.BaseBean;

/**
 * Created by penny on 2016/3/2.
 */
public class UserModel extends BaseBean{
    private String userName;
    private String pwd;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}

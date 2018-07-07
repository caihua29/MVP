package com.example.lenovo.mvp.model;

/**
 * date:2018/7/5 14:22
 * author:周志涛(lenovo)
 * function:
 */
public class LoginModelImp implements LoginModelInt {
    @Override
    public void getData(GetDataToP getDataToP) {
        String  s = "success";
        getDataToP.getToP(s);
    }
}

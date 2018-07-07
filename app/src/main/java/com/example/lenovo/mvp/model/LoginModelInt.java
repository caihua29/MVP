package com.example.lenovo.mvp.model;

/**
 * date:2018/7/5 14:22
 * author:周志涛(lenovo)
 * function:
 */
public interface LoginModelInt {
    void  getData(GetDataToP getDataToP);


    public interface GetDataToP{
        void getToP(String s);
    }

}

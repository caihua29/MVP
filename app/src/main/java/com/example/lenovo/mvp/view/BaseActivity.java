package com.example.lenovo.mvp.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.lenovo.mvp.R;
import com.example.lenovo.mvp.presenter.BasePresenter;

/**
 * date:2018/7/5 20:18
 * author:周志涛(lenovo)
 * function:
 */
public abstract class BaseActivity<V,T extends BasePresenter<V>> extends AppCompatActivity {

    public T basePresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getViewId());
        basePresenter = getBasePresenter();
        basePresenter.onAttach((V) this);
        initData();
        initView();
        setListen();
    }
    public abstract int getViewId();

    /**
     * 初使化页面上的组件  一般来写findViewById()
     */
    public abstract void initView();
    public abstract T getBasePresenter();
    /**
     * 初使化数据
     */
    public abstract void initData();
    /**
     * 设置监听事件
     */
    public abstract void setListen();
    @Override
    protected void onDestroy() {
        super.onDestroy();
        basePresenter.onDeAtttach();
    }
}

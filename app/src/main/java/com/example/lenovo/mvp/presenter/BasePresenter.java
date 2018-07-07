package com.example.lenovo.mvp.presenter;

import java.lang.ref.WeakReference;

/**
 * date:2018/7/5 15:10
 * author:周志涛(lenovo)
 * function:
 */
public class BasePresenter<T> {
    public WeakReference<T> mWeakRef;

    public  void  onAttach(T view){
        mWeakRef=new WeakReference<>(view);
    }
    public  void  onDeAtttach(){
        mWeakRef.clear();
    }

}

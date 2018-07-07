package com.example.lenovo.mvp.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lenovo.mvp.presenter.BasePresenter;

/**
 * date:2018/7/6 8:35
 * author:周志涛(lenovo)
 * function:
 */
public abstract class BaseFragment<V,T extends BasePresenter<V>> extends Fragment {

    public T basePresenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return getFragmentView(inflater,container);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        basePresenter = getBasePresenter();
        basePresenter.onAttach((V) this);
        intiView();
        intiData();
    }

    public abstract T getBasePresenter();

    protected abstract void intiView();

    protected abstract void intiData();

    public abstract View  getFragmentView(LayoutInflater inflater , ViewGroup container);

    @Override
    public void onDestroy() {
        super.onDestroy();
        basePresenter.onDeAtttach();
    }
}

package com.example.lenovo.mvp.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.lenovo.mvp.R;
import com.example.lenovo.mvp.presenter.BasePresenter;
import com.example.lenovo.mvp.presenter.LoginPresenter;
import com.example.lenovo.mvp.view.LoginViewInt;

/**
 * date:2018/7/6 8:35
 * author:周志涛(lenovo)
 * function:
 */
public class FragmentMain extends BaseFragment<LoginViewInt,LoginPresenter<LoginViewInt>>implements LoginViewInt{


    @Override
    public LoginPresenter<LoginViewInt> getBasePresenter() {
        return new LoginPresenter<>();
    }



    @Override
    protected void intiView() {
        basePresenter.OnCom();
    }

    @Override
    protected void intiData() {

    }

    @Override
    public View getFragmentView(LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(R.layout.fragment_main,container,false);
    }

    @Override
    public void setView(String s) {
        Toast.makeText(getActivity(), "--"+s, Toast.LENGTH_SHORT).show();
    }
}

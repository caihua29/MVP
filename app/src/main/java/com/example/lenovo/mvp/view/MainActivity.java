package com.example.lenovo.mvp.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.lenovo.mvp.R;
import com.example.lenovo.mvp.fragment.FragmentMain;
import com.example.lenovo.mvp.presenter.LoginPresenter;

public class MainActivity extends BaseActivity<LoginViewInt, LoginPresenter<LoginViewInt>> implements LoginViewInt {
    private FrameLayout mFrag;
    private Button mButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        basePresenter.OnCom();
    }

    @Override
    public int getViewId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        mFrag = findViewById(R.id.Frag);
        mButton = findViewById(R.id.button);
    }

    @Override
    public LoginPresenter<LoginViewInt> getBasePresenter() {
        return new LoginPresenter<>();
    }

    @Override
    public void initData() {

    }

    @Override
    public void setListen() {
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = supportFragmentManager.beginTransaction();
                transaction.replace(R.id.Frag,new FragmentMain());
                transaction.commit();
            }
        });
    }

    @Override
    public void setView(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}

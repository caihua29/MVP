package com.example.lenovo.mvp.presenter;

import com.example.lenovo.mvp.model.LoginModelImp;
import com.example.lenovo.mvp.model.LoginModelInt;
import com.example.lenovo.mvp.view.LoginViewInt;

/**
 * date:2018/7/5 14:23
 * author:周志涛(lenovo)
 * function:
 */
public class LoginPresenter <T extends  LoginViewInt>extends BasePresenter<T > {
    LoginModelInt loginModelInt = new LoginModelImp();
 /*   private LoginViewInt loginViewInt;

    public LoginPresenter(LoginViewInt loginViewInt) {
        this.loginViewInt = loginViewInt;
    }

    public void getDataToView(){
        loginModelInt.getData(new LoginModelInt.GetDataToP() {
            @Override
            public void getToP(String s) {
                loginViewInt.setView(s);
            }
        });
    }*/

 public void OnCom(){
     loginModelInt.getData(new LoginModelInt.GetDataToP() {
         @Override
         public void getToP(String s) {
             mWeakRef.get().setView(s);
         }
     });
 }

    public void onComeT(){
        loginModelInt.getData(new LoginModelInt.GetDataToP() {
            @Override
            public void getToP(String s) {
                mWeakRef.get().setView(s);
            }
        });
    }

}

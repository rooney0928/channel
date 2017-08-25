package com.qunadai.channel.content.presenter;

import com.qunadai.channel.bean.LoginBean;
import com.qunadai.channel.bean.base.BaseBean;
import com.qunadai.channel.content.contract.LoginContract;
import com.qunadai.channel.content.model.LoginModelImpl;

/**
 * Created by wayne on 2017/8/24.
 */

public class LoginPresenter implements LoginContract.Presenter {
    private LoginContract.View view;
    private LoginContract.Model model;

    public LoginPresenter(LoginContract.View iview) {
        this.view = iview;
        model = new LoginModelImpl(new LoginModelImpl.OnReturnDataListener() {
            @Override
            public void getLoginSms(String msg) {

            }

            @Override
            public void getLoginSmsFail(String error) {

            }

            @Override
            public void loginDone(BaseBean<LoginBean> bean) {
                view.loginDone(bean);
            }

            @Override
            public void loginFail(String error) {
                view.loginFail(error);
            }

            @Override
            public void requestStart() {
                view.requestStart();
            }

            @Override
            public void requestEnd() {
                view.requestEnd();
            }
        });
    }

    @Override
    public void loginByPwd(String auth) {
        model.loginByPwd(auth);
    }
}

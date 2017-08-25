package com.qunadai.channel.content.presenter;

import com.qunadai.channel.bean.User;
import com.qunadai.channel.bean.base.BaseBean;
import com.qunadai.channel.content.contract.RegisterContract;
import com.qunadai.channel.content.model.RegisterModelImpl;

/**
 * Created by wayne on 2017/8/25.
 */

public class RegisterPresenter implements RegisterContract.Presenter {
    private RegisterContract.View view;
    private RegisterContract.Model model;

    public RegisterPresenter(RegisterContract.View iview) {
        this.view = iview;
        model = new RegisterModelImpl(new RegisterModelImpl.OnReturnDataListener() {
            @Override
            public void getSignUpSms(BaseBean<User> bean) {
                view.getSignUpSms(bean);
            }

            @Override
            public void getSignUpSmsFail(String error) {
                view.getSignUpSmsFail(error);
            }

            @Override
            public void registerDone(BaseBean<User> bean) {
                view.registerDone(bean);
            }

            @Override
            public void registerFail(String error) {
                view.registerFail(error);
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
    public void requestSignUpSms(String phone) {
        model.requestSignUpSms(phone);
    }

    @Override
    public void register(String phone, String sms, String pwd) {
        model.register(phone, sms, pwd);
    }
}

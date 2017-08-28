package com.qunadai.channel.content.presenter;

import com.qunadai.channel.bean.User;
import com.qunadai.channel.bean.base.BaseBean;
import com.qunadai.channel.content.contract.ForgetContract;
import com.qunadai.channel.content.model.ForgetModelImpl;

/**
 * Created by wayne on 2017/8/28.
 */

public class ForgetPresenter implements ForgetContract.Presenter {

    private ForgetContract.View view;
    private ForgetContract.Model model;

    public ForgetPresenter(ForgetContract.View iview) {
        this.view = iview;
        model = new ForgetModelImpl(new ForgetModelImpl.OnReturnDataListener() {
            @Override
            public void getForgetSms(BaseBean<User> bean) {
                view.getForgetSms(bean);
            }

            @Override
            public void getForgetSmsFail(String error) {
                view.getForgetSmsFail(error);
            }

            @Override
            public void resetDone(BaseBean<User> bean) {
                view.resetDone(bean);
            }

            @Override
            public void resetFail(String error) {
                view.resetFail(error);
            }

            @Override
            public void requestStart() {
                view.requestStart();
            }

            @Override
            public void requestEnd() {
                view.requestEnd();
            }

            @Override
            public void tokenFail() {

            }
        });
    }

    @Override
    public void requestForgetSms(String phone) {
        model.requestForgetSms(phone);
    }

    @Override
    public void reset(String phone, String sms, String pwd) {
        model.reset(phone, sms, pwd);
    }
}

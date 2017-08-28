package com.qunadai.channel.content.contract;


import com.qunadai.channel.bean.User;
import com.qunadai.channel.bean.base.BaseBean;
import com.qunadai.channel.content.base.BaseModel;
import com.qunadai.channel.content.base.BasePresenter;
import com.qunadai.channel.content.base.BaseView;

/**
 * Created by wayne on 2017/5/5.
 */

public interface ForgetContract {
    interface View extends BaseView {
        void getForgetSms(BaseBean<User> bean);
        void getForgetSmsFail(String error);
        void resetDone(BaseBean<User> bean);
        void resetFail(String error);
    }

    interface Presenter extends BasePresenter {
        void requestForgetSms(String phone);
        void reset(String phone, String sms, String pwd);
    }

    interface Model extends BaseModel {
        void requestForgetSms(String phone);
        void reset(String phone, String sms, String pwd);
    }
}

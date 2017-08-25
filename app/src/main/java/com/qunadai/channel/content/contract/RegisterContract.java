package com.qunadai.channel.content.contract;


import com.qunadai.channel.bean.User;
import com.qunadai.channel.bean.base.BaseBean;
import com.qunadai.channel.content.base.BaseModel;
import com.qunadai.channel.content.base.BasePresenter;
import com.qunadai.channel.content.base.BaseView;

/**
 * Created by wayne on 2017/5/5.
 */

public interface RegisterContract {
    interface View extends BaseView {
        void getSignUpSms(BaseBean<User> bean);
        void getSignUpSmsFail(String error);
        void registerDone(BaseBean<User> bean);
        void registerFail(String error);
    }

    interface Presenter extends BasePresenter {
        void requestSignUpSms(String phone);
        void register(String phone, String sms, String pwd);
    }

    interface Model extends BaseModel {
        void requestSignUpSms(String phone);
        void register(String phone, String sms, String pwd);
    }
}

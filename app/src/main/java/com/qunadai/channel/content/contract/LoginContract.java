package com.qunadai.channel.content.contract;


import com.qunadai.channel.bean.LoginBean;
import com.qunadai.channel.bean.base.BaseBean;
import com.qunadai.channel.content.base.BaseModel;
import com.qunadai.channel.content.base.BasePresenter;
import com.qunadai.channel.content.base.BaseView;

/**
 * Created by wayne on 2017/5/5.
 */

public interface LoginContract {
    interface View extends BaseView {
//        void getLoginSms(String msg);
//        void getLoginSmsFail(String error);

        void loginDone(BaseBean<LoginBean> bean);
        void loginFail(String error);
    }

    interface Presenter extends BasePresenter {
//        void requestLoginSms(String phone);
        void loginByPwd(String auth);
//        void loginBySms(String phone, String sms);
    }

    interface Model extends BaseModel {
//        void requestLoginSms(String phone);
        void loginByPwd(String auth);
//        void loginBySms(String phone, String sms);
    }
}

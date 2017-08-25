package com.qunadai.channel.content.model;

import com.qunadai.channel.bean.User;
import com.qunadai.channel.bean.base.BaseBean;
import com.qunadai.channel.content.contract.LoginContract;
import com.qunadai.channel.http.ApiException;
import com.qunadai.channel.http.RxHttp;
import com.qunadai.channel.http.RxSubscriber;
import com.qunadai.channel.utils.RxHolder;

import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by wayne on 2017/8/24.
 */

public class LoginModelImpl implements LoginContract.Model{
    private OnReturnDataListener onReturnDataListener;

    public LoginModelImpl(OnReturnDataListener onReturnDataListener) {
        this.onReturnDataListener = onReturnDataListener;
    }

    public interface OnReturnDataListener{
        void getLoginSms(String msg);

        void getLoginSmsFail(String error);

        void loginDone(BaseBean<User> bean);

        void loginFail(String error);

        void requestStart();

        void requestEnd();
    }

    @Override
    public void loginByPwd(String auth) {
        Observable<BaseBean<User>> request = RxHttp.getInstance().login(auth);
        Subscription sub = request.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new RxSubscriber<BaseBean<User>>() {
                    @Override
                    public void onStart() {
                        onReturnDataListener.requestStart();
                        super.onStart();
                    }

                    @Override
                    protected void onError(ApiException ex) {
                        onReturnDataListener.loginFail(ex.getDisplayMessage());
                    }

                    @Override
                    protected void onOk(BaseBean<User> token) {
                        onReturnDataListener.loginDone(token);

                    }


                    @Override
                    protected void requestEnd() {
                        onReturnDataListener.requestEnd();
                    }
                });
        RxHolder.addSubscription(sub);
    }
}

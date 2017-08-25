package com.qunadai.channel.content.model;

import com.qunadai.channel.bean.User;
import com.qunadai.channel.bean.base.BaseBean;
import com.qunadai.channel.content.contract.RegisterContract;
import com.qunadai.channel.http.ApiException;
import com.qunadai.channel.http.RxHttp;
import com.qunadai.channel.http.RxSubscriber;
import com.qunadai.channel.utils.RxHolder;

import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by wayne on 2017/8/25.
 */

public class RegisterModelImpl implements RegisterContract.Model {

    private OnReturnDataListener onReturnDataListener;

    public RegisterModelImpl(OnReturnDataListener onReturnDataListener) {
        this.onReturnDataListener = onReturnDataListener;
    }

    public interface OnReturnDataListener {
        void getSignUpSms(BaseBean<User> bean);

        void getSignUpSmsFail(String error);

        void registerDone(BaseBean<User> bean);

        void registerFail(String error);

        void requestStart();

        void requestEnd();
    }

    @Override
    public void requestSignUpSms(String phone) {
        Observable<BaseBean<User>> request = RxHttp.getInstance().signUpSms(phone);
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
                        onReturnDataListener.getSignUpSmsFail(ex.getDisplayMessage());
                    }

                    @Override
                    protected void onOk(BaseBean<User> bean) {
                        onReturnDataListener.getSignUpSms(bean);

                    }

                    @Override
                    protected void requestEnd() {
                        onReturnDataListener.requestEnd();
                    }
                });
        RxHolder.addSubscription(sub);
    }

    @Override
    public void register(String phone, String sms, String pwd) {
        Observable<BaseBean<User>> request = RxHttp.getInstance().signUp(phone, sms, pwd);
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
                        onReturnDataListener.registerFail(ex.getDisplayMessage());
                    }

                    @Override
                    protected void onOk(BaseBean<User> bean) {
                        onReturnDataListener.registerDone(bean);

                    }

                    @Override
                    protected void requestEnd() {
                        onReturnDataListener.requestEnd();
                    }
                });
        RxHolder.addSubscription(sub);
    }
}

package com.qunadai.channel.content.model;

import com.qunadai.channel.bean.User;
import com.qunadai.channel.bean.base.BaseBean;
import com.qunadai.channel.content.base.BaseReturnListener;
import com.qunadai.channel.content.contract.ForgetContract;
import com.qunadai.channel.http.ApiException;
import com.qunadai.channel.http.RxHttp;
import com.qunadai.channel.http.RxSubscriber;
import com.qunadai.channel.utils.RxHolder;

import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by wayne on 2017/8/28.
 */

public class ForgetModelImpl implements ForgetContract.Model {


    private OnReturnDataListener onReturnDataListener;

    public ForgetModelImpl(OnReturnDataListener onReturnDataListener) {
        this.onReturnDataListener = onReturnDataListener;
    }

    public interface OnReturnDataListener extends BaseReturnListener {
        void getForgetSms(BaseBean<User> bean);

        void getForgetSmsFail(String error);

        void resetDone(BaseBean<User> bean);

        void resetFail(String error);

        void requestStart();

        void requestEnd();
    }

    @Override
    public void requestForgetSms(String phone) {
        Observable<BaseBean<User>> request = RxHttp.getInstance().forgetSms(phone);
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
                        onReturnDataListener.getForgetSmsFail(ex.getDisplayMessage());
                    }

                    @Override
                    protected void onOk(BaseBean<User> bean) {
                        onReturnDataListener.getForgetSms(bean);

                    }

                    @Override
                    protected void requestEnd() {
                        onReturnDataListener.requestEnd();
                    }
                });
        RxHolder.addSubscription(sub);
    }

    @Override
    public void reset(String phone, String sms, String pwd) {
        Observable<BaseBean<User>> request = RxHttp.getInstance().forget(phone, sms, pwd);
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
                        onReturnDataListener.resetFail(ex.getDisplayMessage());
                    }

                    @Override
                    protected void onOk(BaseBean<User> bean) {
                        onReturnDataListener.resetDone(bean);

                    }

                    @Override
                    protected void requestEnd() {
                        onReturnDataListener.requestEnd();
                    }
                });
        RxHolder.addSubscription(sub);
    }
}

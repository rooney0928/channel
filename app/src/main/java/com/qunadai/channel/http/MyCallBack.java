package com.qunadai.channel.http;


import com.qunadai.channel.http.Exception.ExceptionEngine;

import rx.Subscriber;

/**
 * Created by wayne on 2017/1/5.
 */

public abstract class MyCallBack<T> extends Subscriber<T>{
    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable e) {
        ApiException ae = ExceptionEngine.handleException(e);
        onFailed(ae);

    }

    @Override
    public void onNext(T t) {
        onOk(t);
    }

    /**
     * 错误回调
     */
    protected abstract void onFailed(ApiException ex);
    /**
     * 正确回调
     */
    protected abstract void onOk(T t);

    /**
     * 回调完成
     */
    protected abstract void requestEnd();
}

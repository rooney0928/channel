package com.qunadai.channel.http;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.qunadai.channel.ChannelFactory;
import com.qunadai.channel.bean.User;
import com.qunadai.channel.bean.base.BaseBean;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.schedulers.Schedulers;

/**
 * Created by wayne on 2017/5/10.
 */

public class RxHttp {

    //    public static final String ROOT = "https://fxt.qunadai.com/";
    public static final String ROOT = "https://fxtbackend.qunadai.com/";
//    public static final String ROOT = "https://mapit.qunadai.com/";
//    public static final String ROOT = "http://192.168.13.132:8080/";


    static ChannelApi qndApi;
    final static Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
            .serializeNulls()
            .create();

    private static class SingletonHolder {
        //单例
        private static RxHttp rxHttp = new RxHttp();
    }

    private RxHttp() {
        //超时时间设置
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder()
                .connectTimeout(12, TimeUnit.SECONDS)
                .readTimeout(12, TimeUnit.SECONDS)
//                .retryOnConnectionFailure(true)// 失败重发
                ;
        if (ChannelFactory.isDebug) {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
            httpClient.addInterceptor(logging);
        }


        OkHttpClient client = httpClient.build();

        Retrofit.Builder builder = new Retrofit.Builder();
        builder.baseUrl(ROOT)
                .client(client)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.createWithScheduler(Schedulers.io()))
                .addConverterFactory(GsonConverterFactory.create(gson));
        Retrofit qndRest = builder.build();
        qndApi = qndRest.create(ChannelApi.class);
    }

    public static RxHttp getInstance() {
        return SingletonHolder.rxHttp;
    }

    //登录
    public static Observable<BaseBean<User>> login(String auth) {
        return qndApi.login("Basic " + auth);
    }

    //注册短信
    public static Observable<BaseBean<User>> signUpSms(String phone) {
        return qndApi.signUpSms(phone);
    }

    //注册
    public static Observable<BaseBean<User>> signUp(String phone, String sms, String pwd) {
        return qndApi.signUp(phone, sms, pwd);
    }

    //忘记短信
    public static Observable<BaseBean<User>> forgetSms(String phone) {
        return qndApi.forgetSms(phone);
    }

    //忘记密码
    public static Observable<BaseBean<User>> forget(String phone, String sms, String pwd) {
        return qndApi.forget(phone, sms, pwd);
    }


    //用户部分
    //登录短信
//    public static Observable<Message> getLoginSms(String phone) {
//        return qndApi.getLoginSms(phone);
//    }
//
//    //注册短信
//    public static Observable<Message> getRegisterSms(String phone) {
//        return qndApi.getRegisterSms(phone);
//    }

    //忘记密码短信
//    public static Observable<Message> getForgetSms(String phone) {
//        return qndApi.getForgetSms("mobileNumber", "sms", phone);
//    }
//
//    //注册
//    public static Observable<RegBean> register(String phone, String sms, String pwd) {
//        return qndApi.register("mobile", phone, sms, pwd);
//    }


}

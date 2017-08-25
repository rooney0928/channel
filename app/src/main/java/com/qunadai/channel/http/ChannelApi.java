package com.qunadai.channel.http;


import com.qunadai.channel.bean.LoginBean;
import com.qunadai.channel.bean.base.BaseBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by wayne on 2017/5/10.
 */

public interface ChannelApi {

    @GET("home/users/signin")
    Observable<BaseBean<LoginBean>> login(@Header("Authorization") String auth);

    /**
     * 获取登录短信验证码
     *
     * @param mobileNumber
     * @return
     */
//    @FormUrlEncoded
//    @POST("token/sms")
//    Observable<Message> getLoginSms(@Field("mobileNumber") String mobileNumber);

    /**
     * 重置密码
     *
     * @return
     */
//    @PUT("users")
//    Observable<ResetBean> reset(@Query("filter") String filter,
//                                @Query("c") String c,
//                                @Query("mobileNumber") String mobileNumber,
//                                @Query("verifiCode") String sms,
//                                @Query("newsha1password") String pwd);


//    @PUT("home/creditinfo")
//    Observable<PersonInfo> setPersonInfo(@Query("access_token") String access_token, @Body RequestBody body);


}

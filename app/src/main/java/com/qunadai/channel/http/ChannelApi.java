package com.qunadai.channel.http;


import com.qunadai.channel.bean.User;
import com.qunadai.channel.bean.base.BaseBean;

import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by wayne on 2017/5/10.
 */

public interface ChannelApi {

    @GET("home/users/signin")
    Observable<BaseBean<User>> login(@Header("Authorization") String auth);


    @POST("home/users/signup/smscode")
    Observable<BaseBean<User>> signUpSms(@Query("mobileNumber") String phone);

    @PUT("home/users/signup/register")
    Observable<BaseBean<User>> signUp(@Query("mobileNumber") String phone,@Query("inputCode") String inputCode,
                                      @Query("password") String password);

    @POST("home/users/reset/smscode")
    Observable<BaseBean<User>> forgetSms(@Query("mobileNumber") String phone);

    @PUT("home/users/reset/password")
    Observable<BaseBean<User>> forget(@Query("mobileNumber") String phone,@Query("inputCode") String inputCode,
                                      @Query("password") String password);
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

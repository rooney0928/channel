package com.qunadai.channel.http;


/**
 * Created by 12262 on 2016/5/31.
 */
public class ApiException extends Exception {
    private int code;
    private String displayMessage;
    private boolean isTokenFail = false;


    public ApiException(Throwable throwable, int code) {
        super(throwable);
        this.code = code;
    }

    public void setDisplayMessage(String displayMessage) {
        this.displayMessage = displayMessage;
    }

    public String getDisplayMessage() {
        return displayMessage;
    }

    public int getCode() {
        return code;
    }

    public boolean isTokenFail() {
        return isTokenFail;
    }

    public void setTokenFail(boolean tokenFail) {
        isTokenFail = tokenFail;
    }
}

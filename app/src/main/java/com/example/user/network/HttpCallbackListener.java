package com.example.user.network;

/**
 * Created by user on 2016/6/21.
 */
public interface HttpCallbackListener {

    void onFinish(String response);
    void onError(Exception e);
}

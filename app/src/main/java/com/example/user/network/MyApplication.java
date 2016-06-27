package com.example.user.network;

import android.app.Application;
import android.content.Context;

/**
 * Created by user on 2016/6/27.
 */
public class MyApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}

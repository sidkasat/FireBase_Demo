package com.firebase.firebasedemo;

import android.app.Activity;
import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Sid on 12/16/2016.
 */
public class FireBaseDemo extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);

    }
}

package com.example.simpleapp;

import android.app.Application;
import android.util.Log;

/**
 * Created by admin on 8/19/2016.
 */
public class AppLibu extends Application {

    private static final String TAG = "AppLibuTAG_";

    private int mCounter = 0;

    @Override
    public void onCreate() {
        super.onCreate();

        Log.d(TAG, "onCreate: ");
    }

    public int getCounter() {
        return mCounter;
    }

    public void setCounter() {
        mCounter++;
    }

}

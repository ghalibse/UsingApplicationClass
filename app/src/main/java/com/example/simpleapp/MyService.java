package com.example.simpleapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    private static final String TAG = "MyServiceTAG_";
    private AppLibu mAppLibu;

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mAppLibu = ((AppLibu) getApplication());
        Log.d(TAG, "onCreate: ");
        mAppLibu.setCounter();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mAppLibu.setCounter();
        Log.d(TAG, "onStartCommand: ");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        mAppLibu.setCounter();
        Log.d(TAG, "onDestroy: ");
    }
}

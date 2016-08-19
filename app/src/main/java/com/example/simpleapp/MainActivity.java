package com.example.simpleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.test.mock.MockApplication;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MaingActivityTAG_";

    private AppLibu mAppLibu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAppLibu = ((AppLibu) getApplication());

        mAppLibu.setCounter();

        Log.d(TAG, "onCreate: ");
    }

    @Override
    protected void onStop() {
        super.onStop();

        mAppLibu.setCounter();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mAppLibu.setCounter();
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        mAppLibu.setCounter();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        mAppLibu.setCounter();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        mAppLibu.setCounter();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        mAppLibu.setCounter();

        Log.d(TAG, "onSaveInstanceState: ");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        mAppLibu.setCounter();
        Log.d(TAG, "onRestoreInstanceState: ");
    }

    public void startService(View view) {

        Intent intent = new Intent(getApplicationContext(), MyService.class);
        startService(intent);
    }

    public void printMagic(View view) {

        Log.d(TAG, "printMagic: " + mAppLibu.getCounter());
    }

    public void stopService(View view) {

        Intent intent = new Intent(this, MyService.class);
        stopService(intent);
    }
}

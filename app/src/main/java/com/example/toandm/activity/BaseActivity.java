package com.example.toandm.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by toandm on 10/26/17.
 */

public abstract class BaseActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayoutID());
    }

    protected abstract int getLayoutID();

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(getClassName(),"onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(getClassName(),"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(getClassName(),"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(getClassName(),"onDestroy");
    }

    protected abstract String getClassName();
}
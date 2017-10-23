package com.example.toandm.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;

/**
 * Created by toandm on 10/23/17.
 */

public class LoginActivity extends Activity {
    public static final String USER_NAME = "hoabinh223";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Intent returnIntent = new Intent();
        returnIntent.putExtra("result","hoabinh223");
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }
}

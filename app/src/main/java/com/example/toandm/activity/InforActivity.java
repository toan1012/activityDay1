package com.example.toandm.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by toandm on 10/23/17.
 */

public class InforActivity extends Activity{

    Button update;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infor);

        final String name = getIntent().getStringExtra("EMAIL");

        update = findViewById(R.id.btupdate);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(InforActivity.this,MainActivity.class);
                intent.putExtra("EMAIL",name);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP );
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("INFO","this is onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("INFO","this is onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("INFO","this is onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("INFO","this is onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("INFO","this is onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("INFO","this is onDestroy");
        Toast.makeText(this,"onDestroy",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("INFO","this is onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("INFO","this is onRestoreIntanceState");
    }
}

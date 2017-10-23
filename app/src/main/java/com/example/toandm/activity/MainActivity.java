package com.example.toandm.activity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialog;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button bLogin,bSignin;
    TextView tvUsr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("DEMO","this is onCreate");

        tvUsr = (TextView) findViewById(R.id.tvUser);
        bLogin = (Button) findViewById(R.id.btnLogin);
        bSignin = (Button) findViewById(R.id.btnSignin);

        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(getApplicationContext(), LoginActivity.class),1);
            }
        });



        bSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),SignInActivity.class));
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1) {
            if(resultCode == Activity.RESULT_OK){
                String result=data.getStringExtra("result");
                tvUsr.setText(result);
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                //Write your code if there's no result
            }
        }
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("DEMO","this is onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("DEMO","this is onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("DEMO","this is onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("DEMO","this is onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("DEMO","this is onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("DEMO","this is onDestroy");
        Toast.makeText(this,"onDestroy",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("DEMO","this is onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("DEMO","this is onRestoreIntanceState");
    }
}

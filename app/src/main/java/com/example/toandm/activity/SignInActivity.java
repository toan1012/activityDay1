package com.example.toandm.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by toandm on 10/23/17.
 */

public class SignInActivity extends Activity {
    Button nextInfor;
    EditText edEmail,edPass;


    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        edEmail =  findViewById(R.id.edEmail);
        edPass =  findViewById(R.id.edPass);
        nextInfor = findViewById(R.id.btNextInfor);
        nextInfor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this, InforActivity.class);
                intent.putExtra("EMAIL",edEmail.getText().toString());
                intent.putExtra("PASS",edPass.getText().toString());
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("SIGN","this is onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("SIGN","this is onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("SIGN","this is onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("SIGN","this is onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("SIGN","this is onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("SIGN","this is onDestroy");
        Toast.makeText(this,"onDestroy",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("SIGN","this is onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("SIGN","this is onRestoreIntanceState");
    }
}

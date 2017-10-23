package com.example.toandm.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by toandm on 10/23/17.
 */

public class SignInActivity extends Activity {
    Button nextInfor;
    EditText edEmail,edPass;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        edEmail = (EditText) findViewById(R.id.edEmail);
        edEmail = (EditText) findViewById(R.id.edPass);
        nextInfor = (Button) findViewById(R.id.btNextInfor);
        nextInfor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this, InforActivity.class);
                intent.putExtra("INFO",edEmail.getText().toString());
                intent.putExtra("PASS",edPass.getText().toString());
            }
        });

    }
}

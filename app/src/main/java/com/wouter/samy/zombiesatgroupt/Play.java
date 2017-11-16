package com.wouter.samy.zombiesatgroupt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Play extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
    }

    public void loginButton(View view){
        TextView usernameTv = findViewById(R.id.username);
        String username = usernameTv.getText().toString();

        TextView passwordTv = findViewById(R.id.password);
        String password = passwordTv.getText().toString();


    }

    public void registerButton(View view){

    }
}

package com.wouter.samy.zombiesatgroupt;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.wouter.samy.zombiesatgroupt.persistency.LoginMapper;

import java.util.ArrayList;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button register =(Button) findViewById(R.id.Register);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/PressStart2P.ttf");
        register.setTypeface(typeface);


    }

   @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void registerButton(View view){
        TextView nameTv = findViewById(R.id.username);
        String name = nameTv.getText().toString();

        TextView PassTv = findViewById(R.id.password);
        String password = PassTv.getText().toString();

        TextView PassAgTv = findViewById(R.id.passwordagain);
        String passwordAgain = PassAgTv.getText().toString();

        if(password.equals(passwordAgain)){
            Account RegAccount = new Account(name,password);
            LoginMapper.UNIQUEINSTANCE.createAccount(RegAccount);
            Toast.makeText(getApplicationContext(),"Succeeded!", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, Play.class));
        } else {
            Toast.makeText(getApplicationContext(),"Passwords don't match!", Toast.LENGTH_SHORT).show();

        }



    }

    public void testButton(View view){

    }
}

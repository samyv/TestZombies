package com.wouter.samy.zombiesatgroupt;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.wouter.samy.zombiesatgroupt.persistency.LoginMapper;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
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
            TextView passNotMatch = findViewById(R.id.PassNotMatchMsg);
            passNotMatch.setText("Passwords don't match stupid.");

        }



    }

    public void testButton(View view){

    }
}

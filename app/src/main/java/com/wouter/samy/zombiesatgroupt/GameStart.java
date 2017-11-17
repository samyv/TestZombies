package com.wouter.samy.zombiesatgroupt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.wouter.samy.zombiesatgroupt.persistency.LoginMapper;

public class GameStart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_start);
        Account user = LoginMapper.UNIQUEINSTANCE.getAccountByName(getIntent().getStringExtra("AccountName"));
        int checkPoint = user.getCheckPoint();
        switch(checkPoint){

        }
    }
}

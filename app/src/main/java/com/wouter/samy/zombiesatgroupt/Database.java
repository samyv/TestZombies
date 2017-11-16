package com.wouter.samy.zombiesatgroupt;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import java.sql.Connection;

public class Database extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_database);
        Connection con = Databasetest.UNIQUEINSTANCE.getConnection();

        if(con != null){
            TextView textview = (TextView) findViewById(R.id.textView4);
            textview.setText("true");
        } else {
            TextView textview = (TextView) findViewById(R.id.textView4);
            textview.setText("FUCK");
        }
    }
}

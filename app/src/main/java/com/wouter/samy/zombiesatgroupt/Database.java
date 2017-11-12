package com.wouter.samy.zombiesatgroupt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.wouter.samy.zombiesatgroupt.storage.Databasetest;

import java.sql.Connection;

public class Database extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);
        Connection con = Databasetest.UNIQUEINSTANCE.getConnection();
        if(con != null){
            TextView textview = (TextView) findViewById(R.id.textView4);
            textview.setText("true");
        }
    }
}

package com.wouter.samy.zombiesatgroupt;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.wouter.samy.zombiesatgroupt.storage.Databasetest;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    /** HELLOOOO**/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        Databasetest.UNIQUEINSTANCE.getConnection();
        ArrayList<Button> buttons = new ArrayList<>();

        buttons.add((Button) findViewById(R.id.Play));
        buttons.add((Button) findViewById(R.id.Settings));
        buttons.add((Button) findViewById(R.id.Exit));

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/PressStart2P.ttf");
        for (Button bt : buttons) {
            bt.setTypeface(typeface);
        }
    }

    public void playButton(View view) {
       startActivity(new Intent(this, Database.class));
    }

    public void settingButton(View view) {

    }

    public void exitButton(View view) {

    }
}

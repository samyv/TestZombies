package com.wouter.samy.zombiesatgroupt;



import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Play extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        Button play = findViewById(R.id.Login);
        Button register =(Button) findViewById(R.id.Register);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/PressStart2P.ttf");
        play.setTypeface(typeface);
        register.setTypeface(typeface);

    }

    public void loginButton(View view){
        TextView usernameTv = findViewById(R.id.username);
        String username = usernameTv.getText().toString();

        TextView passwordTv = findViewById(R.id.passwordagain);
        String password = passwordTv.getText().toString();



        if(Account.isValid(username, password)){
            Intent intent = new Intent(this,GameStart.class);
            intent.putExtra("AccountName", username);
            startActivity(new Intent(this, GameStart.class));
        } else {
            Toast.makeText(getApplicationContext(),"Wrong password or username", Toast.LENGTH_SHORT).show();
        }

    }

    public void registerButton(View view){
        startActivity(new Intent(this, Register.class));
    }
}


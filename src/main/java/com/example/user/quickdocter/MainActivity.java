package com.example.user.quickdocter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.main_name);
        Typeface myCustomFont=Typeface.createFromAsset(getAssets(),"fonts/Montserrat-Black.ttf");
        textView.setTypeface(myCustomFont);


    }
    @Override
    protected void onStart()
    {
        super.onStart();
        timer =new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent=new Intent(getApplication(),SecondActivity.class);
                startActivity(intent);
                finish();
            }
        },5000);


    }

}

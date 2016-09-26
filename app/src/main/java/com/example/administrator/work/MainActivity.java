package com.example.administrator.work;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


  public static  String tag = "come on";

    protected void onStart() {
        super.onStart();
        Log.d(tag, "onStart: ");
    }


    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "onDesroy: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "onStop: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "onResume: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag, "onRestart: ");
    }


    protected void onPause() {
        super.onPause();
        Log.d(tag, "onPause: ");
    }


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "onCreate: ");
    }
}

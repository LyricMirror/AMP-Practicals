package com.example.practical3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String tag= "Android Lifecycle Demonstration";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag,"In the onCreate() event");
    }
    public void onStart()
    {
        super.onStart();
        Log.d(tag,"In the onStart() event");
    }
    public void onRestart()
    {
        super.onRestart();
        Log.d(tag,"In the onRestart() event");
    }
    public void onPause()
    {
        super.onPause();
        Log.d(tag,"In the onPause() event");
    }
    public void onStop()
    {
        super.onStop();
        Log.d(tag,"In the onStop() event");
    }
    public void onDestroy()
    {
        super.onDestroy();
        Log.d(tag,"In the onDestroy() event");
    }
}
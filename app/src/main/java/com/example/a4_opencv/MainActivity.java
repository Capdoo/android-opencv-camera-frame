package com.example.a4_opencv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {

    public static String TAG = "MainActivity";
    static{
        if(OpenCVLoader.initDebug()){
            Log.d(TAG,"Opencv is working");
        }else{
            Log.d(TAG,"Open cv is not installed");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
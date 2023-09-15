package com.candratop3.testfirstandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.candratop3.android_demo_lib.ShowToast;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // ShowToast.superToast(MainActivity.this,"ALOW");
    }
}
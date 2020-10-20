package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("MainActivity", "这是debug代码");
        Log.e("MainActivity", "这是测试从dev合并到debug的代码");
        Log.e("MainActivity", "这是测试从dev吧需要测试的代码放到debug上");
    }
}
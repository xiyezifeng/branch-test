package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("MainActivity", "这是debug代码1");
        Log.e("MainActivity", "这是测试从dev合并到debug的代码{dev}");
        Log.e("MainActivity", "这是测试从dev吧需要测试的代码放到debug上{dev}");
        Log.e("MainActivity", "分支合并到主干代码");
    }
}
package com.example.androidactivity

import android.os.Bundle
import io.flutter.app.FlutterActivity

class SecondActivity : FlutterActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
    }
}
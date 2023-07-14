package com.example.createownlabraryeval

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sk_eval.SkEval

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SkEval.calculate("1+23-4");

    }
}
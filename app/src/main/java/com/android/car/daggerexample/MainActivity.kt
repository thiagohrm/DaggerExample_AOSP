package com.android.car.daggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint(AppCompatActivity::class)
class MainActivity : Hilt_MainActivity() {


    @Inject lateinit var daggerHiltInjectedText : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val txtView = findViewById<TextView>(R.id.textView)
        txtView.text = daggerHiltInjectedText
    }
}
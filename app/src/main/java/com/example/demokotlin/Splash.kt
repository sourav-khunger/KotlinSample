package com.example.demokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Splash : AppCompatActivity() {

    private val SPLASH_DELAY: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Navigate with delay
        Handler()!!.postDelayed(Runnable {
            val intent = Intent(applicationContext, Login::class.java)
            startActivity(intent)
            finish()
        },SPLASH_DELAY)

    }
}

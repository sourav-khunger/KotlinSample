package com.example.demokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Signup : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        this.setTitle("SignUp")
    }
}

package com.example.demokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Login : AppCompatActivity() {
var button:Button?=null
var textView:TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        this.setTitle("Login")
        button=findViewById(R.id.btn_login) as Button
        textView=findViewById(R.id.tv_signup) as TextView

        button!!.setOnClickListener{
            val intent = Intent(applicationContext, Navigationclass::class.java)
            startActivity(intent)
            finish()
        }

        textView!!.setOnClickListener {
            val intent = Intent(applicationContext, Signup::class.java)
            startActivity(intent)
        }
     //   supportActionBar!!.setDefaultDisplayHomeAsUpEnabled(true)
    }

  /*  override fun onOptionsItemSelected(item: MenuItem): Boolean {
        onBackPressed()
        return true
    }*/
}

package com.example.aplikasipendakiansumbar

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var buttonlogin : Button
    private lateinit var buttonregister : TextView
    @SuppressLint("MissingInflateid")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        buttonlogin = findViewById(R.id.btnLogin)
        buttonregister = findViewById(R.id.txt_register)

        val buttonlogin= findViewById<Button>(R.id.btnLogin)

        buttonlogin.setOnClickListener {
            val move = Intent(this@MainActivity, home_activity::class.java)
            startActivity(move)
        }

        buttonregister.setOnClickListener{
            val move = Intent(this@MainActivity, RegisterActivity::class.java)
            startActivity(move)

        }



    }
}
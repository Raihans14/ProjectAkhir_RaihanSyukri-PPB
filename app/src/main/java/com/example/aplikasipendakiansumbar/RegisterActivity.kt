package com.example.aplikasipendakiansumbar

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    private lateinit var buttonreg : Button
    @SuppressLint("MissingInflateid")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        buttonreg = findViewById(R.id.R_btn1)

        buttonreg.setOnClickListener{
            val move = Intent(this@RegisterActivity, LoginActivity::class.java)
            startActivity(move)
        }
        }
}
package com.example.aplikasipendakiansumbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class home_activity : AppCompatActivity() {
    private lateinit var buttongunung : Button
    private lateinit var buttonprofil : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        buttongunung = findViewById(R.id.gunung1)
        buttonprofil = findViewById(R.id.profil)

        buttongunung.setOnClickListener {
            val move = Intent(this@home_activity, Gunung::class.java)
            startActivity(move)
        }
        buttonprofil.setOnClickListener {
            val move = Intent(this@home_activity, Profil::class.java)
            startActivity(move)
        }
    }
}
package com.example.aplikasipendakiansumbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Profil : AppCompatActivity() {
    private lateinit var buttoneditprofil : Button
    private lateinit var buttonlogout : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)
        buttoneditprofil = findViewById(R.id.btnEdit)
        buttonlogout = findViewById(R.id.btnLogout)

        buttoneditprofil.setOnClickListener {
            val move = Intent(this@Profil, Editprofil::class.java)
            startActivity(move)
        }
        buttonlogout.setOnClickListener {
            val move = Intent(this@Profil, LoginActivity::class.java)
            startActivity(move)
        }


    }
}
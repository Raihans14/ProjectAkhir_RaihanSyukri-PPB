package com.example.aplikasipendakiansumbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Editprofil : AppCompatActivity() {
    private lateinit var buttonupdate : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editprofil)

        buttonupdate = findViewById(R.id.btnUpdate)

        buttonupdate.setOnClickListener {
            val move = Intent(this@Editprofil, LoginActivity::class.java)
            startActivity(move)
        }
    }
}
package com.example.aplikasipendakiansumbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Gunung : AppCompatActivity() {
    private lateinit var buttonsinggalang : Button
    private lateinit var buttonmarapi : Button
    private lateinit var buttontandikat : Button
    private lateinit var buttontalamau : Button
    private lateinit var buttonsago : Button
    private lateinit var buttonpasaman : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gunung)

        buttonsinggalang = findViewById(R.id.gunung_txt2)
        buttonmarapi = findViewById(R.id.gunung_txt3)
        buttontandikat = findViewById(R.id.gunung_txt4)
        buttontalamau = findViewById(R.id.gunung_txt5)
        buttonsago = findViewById(R.id.gunung_txt6)
        buttonpasaman = findViewById(R.id.gunung_txt7)

        buttonsinggalang.setOnClickListener{
            val move = Intent(this@Gunung, Singgalang::class.java)
            startActivity(move)
        }
        buttonmarapi.setOnClickListener{
            val move = Intent(this@Gunung, Marapi::class.java)
            startActivity(move)
        }
        buttontandikat.setOnClickListener{
            val move = Intent(this@Gunung, Tandikek::class.java)
            startActivity(move)
        }
        buttontalamau.setOnClickListener{
            val move = Intent(this@Gunung, Talamau::class.java)
            startActivity(move)
        }
        buttonsago.setOnClickListener{
            val move = Intent(this@Gunung, Sago::class.java)
            startActivity(move)
        }
        buttonpasaman.setOnClickListener{
            val move = Intent(this@Gunung, Pasaman::class.java)
            startActivity(move)
        }



    }
}
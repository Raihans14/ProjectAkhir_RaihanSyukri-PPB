package com.example.aplikasipendakiansumbar

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.fonts.FontStyle
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.TextUtils
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.text.style.StyleSpan
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi


class LoginActivity : AppCompatActivity() {
    private lateinit var buttonhome : Button
    private lateinit var buttonregister : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        buttonhome = findViewById(R.id.btnLogin)
        buttonregister = findViewById(R.id.txt_register)

        buttonhome.setOnClickListener{
            val move = Intent(this@LoginActivity, home_activity::class.java)
            startActivity(move)

        }

        buttonregister.setOnClickListener{
            val move = Intent(this@LoginActivity, RegisterActivity::class.java)
            startActivity(move)

        }
    }
}


package com.example.utspemogramanmobile1;

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.utspemogramanmobile1.Login

class SplashScreen : AppCompatActivity() {
private val SPLASH_TIME_OUT: Long = 3000 // Delay 3 detik

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        // Delay sebelum memulai MainActivity
        Handler().postDelayed({
        val intent = Intent(this@SplashScreen, Login::class.java)
        startActivity(intent)
        finish()
        }, SPLASH_TIME_OUT)
        }
        }


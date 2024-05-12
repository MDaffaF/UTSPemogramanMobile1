package com.example.utspemogramanmobile1;

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Register : AppCompatActivity() {
private lateinit var usernameInput: EditText
private lateinit var passwordInput: EditText
private lateinit var buttonInput: Button

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        usernameInput = findViewById(R.id.username_input)
        passwordInput = findViewById(R.id.password_input)
        buttonInput = findViewById(R.id.button_input)

        buttonInput.setOnClickListener {
        val username = usernameInput.text.toString().trim()
        val password = passwordInput.text.toString().trim()

        Log.d("Register", "Register button clicked")
        if (username.isEmpty() || password.isEmpty()) {
        Toast.makeText(this, "Username and Password must be filled in", Toast.LENGTH_SHORT).show()
        } else if (username == "daffa" && password == "daffa11") {
        Toast.makeText(this, "Register successful", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, NewsPortalDashboard::class.java)
        startActivity(intent)
        finish()
        }
        }
        }
        }

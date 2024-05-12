package com.example.utspemogramanmobile1;

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {
private lateinit var usernameInput: EditText
private lateinit var passwordInput: EditText
private lateinit var buttonInput: Button
private lateinit var buttonRegister: Button

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        usernameInput = findViewById(R.id.username_input)
        passwordInput = findViewById(R.id.password_input)
        buttonInput = findViewById(R.id.button_input)
        buttonRegister = findViewById(R.id.button_register)

        buttonInput.setOnClickListener {
        val username = usernameInput.text.toString().trim()
        val password = passwordInput.text.toString().trim()

        if (username.isEmpty() || password.isEmpty()) {
        Toast.makeText(this, "Username and Password must be filled in", Toast.LENGTH_SHORT).show()
        } else if (username == "daffa" && password == "daffa11") {
        Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, NewsPortalDashboard::class.java)
        startActivity(intent)
        finish()
        } else {
        Toast.makeText(this, "Incorrect Username or Password", Toast.LENGTH_SHORT).show()
        }
        }

        buttonRegister.setOnClickListener {
        val intent = Intent(this, Register::class.java)
        startActivity(intent)
        finish()
        }
        }
        }


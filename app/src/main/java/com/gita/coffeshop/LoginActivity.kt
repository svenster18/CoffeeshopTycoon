package com.gita.coffeshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val userPreference = UserPreference(this)

        userPreference.setPlayer()

        val edUsername = findViewById<EditText>(R.id.ed_username)
        val edPassword = findViewById<EditText>(R.id.ed_password)
        val btnLogin = findViewById<Button>(R.id.btn_login)

        btnLogin.setOnClickListener {

            val player = userPreference.getPlayer()
            if (edUsername.text.toString() != player.username) {
                Toast.makeText(this, "Username Not Found", Toast.LENGTH_SHORT).show()
            }
            else {
                if (edPassword.text.toString() != player.password) {
                    Toast.makeText(this, "Wrong Password", Toast.LENGTH_SHORT).show()
                }
                else {
                    userPreference.setLoggedIn(true)
                    finish()
                }
            }
        }
    }
}
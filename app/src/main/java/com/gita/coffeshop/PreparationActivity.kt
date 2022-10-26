package com.gita.coffeshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PreparationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preparation)
        val userPreference = UserPreference(this)
        val player = userPreference.getPlayer()
        if(!player.isLoggedIn) {
            val intent = Intent(this@PreparationActivity, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
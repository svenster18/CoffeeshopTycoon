package com.gita.coffeshop

import android.content.Context

internal class UserPreference(context: Context) {
    companion object {
        private const val PREFS_NAME = "user_pref"
        private const val USERNAME = "username"
        private const val PASSWORD = "password"
        private const val NAME = "name"
        private const val LOGGED_IN = "isloggedin"
    }

    private val preferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    fun setPlayer() {
        val editor = preferences.edit()
        editor.putString(USERNAME, "gita")
        editor.putString(PASSWORD, "gita123")
        editor.putString(NAME, "Gita")
        editor.apply()
    }

    fun setLoggedIn(isLoggedIn: Boolean) {
        val editor = preferences.edit()
        editor.putBoolean(LOGGED_IN, isLoggedIn)
        editor.apply()
    }

    fun getPlayer(): Player {
        val player = Player()
        player.username = preferences.getString(USERNAME, "")
        player.password = preferences.getString(PASSWORD, "")
        player.playerName = preferences.getString(NAME, "")

        return player
    }
}
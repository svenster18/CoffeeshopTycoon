package com.gita.coffeshop

data class Player (
    var username: String? = null,
    var password: String? = null,
    var playerName: String? = null,
    var isLoggedIn: Boolean = false
)
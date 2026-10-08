package com.example.fixture.data

import com.example.fixture.model.User

class UserRepository {
    fun interface Callback {
        fun onResult(user: User?)
    }

    private val users = mutableListOf<User>()

    fun add(user: User?) {
        if (user != null) {
            users.add(user)
        }
    }

    fun findById(id: String): User? = users.firstOrNull { it.id == id }

    fun load(id: String, callback: Callback) {
        callback.onResult(findById(id))
    }
}

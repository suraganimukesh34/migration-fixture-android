package com.example.fixture.ui

import com.example.fixture.data.UserRepository

class UserViewModel(private val repository: UserRepository) {
    var displayName: String? = null
        private set

    fun loadUser(id: String) {
        repository.load(id) { user ->
            displayName = user?.name ?: "Unknown"
        }
    }
}

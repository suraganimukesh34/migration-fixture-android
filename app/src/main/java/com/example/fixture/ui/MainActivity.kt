package com.example.fixture.ui

import android.app.Activity
import android.os.Bundle

class MainActivity : Activity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.refresh.setOnClickListener {
            binding.title.text = "Refreshed"
        }
    }
}

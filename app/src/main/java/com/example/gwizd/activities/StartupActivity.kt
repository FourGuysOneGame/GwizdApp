package com.example.gwizd.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.gwizd.databinding.StartupActivityBinding

class StartupActivity : ComponentActivity() {
    private lateinit var binding: StartupActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = StartupActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.signupButton.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}
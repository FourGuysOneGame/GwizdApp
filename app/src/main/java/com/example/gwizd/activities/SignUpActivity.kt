package com.example.gwizd.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.gwizd.databinding.SignupActivityBinding

class SignUpActivity : ComponentActivity() {

    private lateinit var binding: SignupActivityBinding
    private lateinit var username: EditText
    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var loginButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SignupActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signupButton.setOnClickListener {
            username = binding.username
            email = binding.email
            password = binding.password
            Toast.makeText(this, "Sign Up failed", Toast.LENGTH_SHORT).show()
        }

        binding.loginButton.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
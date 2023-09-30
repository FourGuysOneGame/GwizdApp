package com.example.gwizd.activities

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.gwizd.databinding.SignupActivityMainBinding

class SignUpActivity : ComponentActivity() {

    private lateinit var binding: SignupActivityMainBinding
    private lateinit var username: EditText
    private lateinit var email: EditText
    private lateinit var password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SignupActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signupButton.setOnClickListener {
            username = binding.username
            email = binding.email
            password = binding.password
            Toast.makeText(this, "Sign Up failed", Toast.LENGTH_SHORT).show()
        }
    }
}
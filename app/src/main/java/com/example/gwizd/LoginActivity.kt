package com.example.gwizd
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.gwizd.databinding.LoginActivityMainBinding

class LoginActivity : ComponentActivity() {

    private lateinit var binding: LoginActivityMainBinding
    private lateinit var username: EditText
    private lateinit var password: EditText
    private lateinit var loginButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {
            if(binding.username.text.toString() == "user" && binding.password.text.toString() == "password") {
                Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "Login failed", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

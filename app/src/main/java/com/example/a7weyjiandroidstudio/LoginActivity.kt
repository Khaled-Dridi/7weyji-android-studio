package com.example.a7weyjiandroidstudio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.a7weyjiandroidstudio.databinding.ActivityLoginBinding
import com.example.a7weyjiandroidstudio.databinding.ActivityMainBinding


class LoginActivity: AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener{
            val username=binding.editTextUsername.text.toString().trim()
            val password=binding.editTextPassword.text.toString().trim()
            if(username.isEmpty()||password.isEmpty()){
                Toast.makeText(this, "Please enter username and password", Toast.LENGTH_SHORT).show()
            }else{
                val message = "Username: $username\nPassword: $password"
                Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
                // For demonstration, navigate to HomeActivity on successful login
//                val intent = Intent(this, HomeActivity::class.java)
//                startActivity(intent)
//                finish() // Close this LoginActivity
            }
        }

    }
}
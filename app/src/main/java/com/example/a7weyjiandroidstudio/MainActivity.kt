package com.example.a7weyjiandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a7weyjiandroidstudio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
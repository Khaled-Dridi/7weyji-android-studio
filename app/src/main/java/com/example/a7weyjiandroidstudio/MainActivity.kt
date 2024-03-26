package com.example.a7weyjiandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import com.example.a7weyjiandroidstudio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var isMainLayout = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button.setOnClickListener {
            if (isMainLayout) {
                // Switch to test.xml
                val testLayout = LayoutInflater.from(this).inflate(R.layout.test, null)
                setContentView(testLayout)
                isMainLayout = false

                // Handle click for button2 in test.xml
                val button2 = testLayout.findViewById<Button>(R.id.button2)

                button2.setOnClickListener {
                    setContentView(binding.root)
                    isMainLayout = true
                }
            } else {
                // Switch back to activity_main.xml
                setContentView(binding.root)
                isMainLayout = true
            }
        }

    }
}
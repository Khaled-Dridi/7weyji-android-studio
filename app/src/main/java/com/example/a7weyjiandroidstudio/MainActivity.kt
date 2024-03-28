package com.example.a7weyjiandroidstudio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import com.example.a7weyjiandroidstudio.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var selectedOptionText: String = "null"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.myButton.setOnClickListener {
            CoroutineScope(Dispatchers.Main).launch {
                binding.myTextView.text = "Button clicked"
                delay(1000) // Delay for 1 second (1000 milliseconds)
                binding.myTextView.text = selectedOptionText
            }
        }

        binding.checkBox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                binding.myTextView.text = "Checkbox Checked"
            } else {
                binding.myTextView.text = "Checkbox Unchecked"
            }

        }
        binding.radioGroup.setOnCheckedChangeListener { group, checkedId ->
            selectedOptionText = when (checkedId) {
                R.id.radioButton -> "Option 1 selected"
                R.id.radioButton2 -> "Option 2 selected"
                else -> "No option selected"
            }
            binding.myTextView.text = "option selected check with the button "

        }

    }
}
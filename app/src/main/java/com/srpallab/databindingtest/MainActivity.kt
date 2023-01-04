package com.srpallab.databindingtest

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.srpallab.databindingtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.btnSubmit.setOnClickListener {
            displayGreetings()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun displayGreetings() {
        binding.apply {
            tvGreeting.text = "Hello ${etName.text}!"
        }
    }
}



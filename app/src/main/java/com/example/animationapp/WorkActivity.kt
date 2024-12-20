package com.example.animationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.animationapp.databinding.ActivityWorkBinding

class WorkActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWorkBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWorkBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Анимация появления текста
        binding.workTextView.animate()
            .alpha(1f)
            .setDuration(2000)
            .start()
    }
}
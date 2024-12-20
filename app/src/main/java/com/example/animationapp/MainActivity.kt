package com.example.animationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.animationapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Анимация появления ImageView
        binding.imageView.animate()
            .alpha(1f)
            .setDuration(2000)
            .start()

        // Анимация выезда кнопки "Начать" слева
        binding.startButton.animate()
            .translationX(0f)
            .alpha(1f)
            .setDuration(2000)
            .start()

        // Переход на экран регистрации
        binding.startButton.setOnClickListener {
            val intent = Intent(this, RegistrationActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
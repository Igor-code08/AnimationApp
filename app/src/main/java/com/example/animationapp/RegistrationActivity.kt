package com.example.animationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.animationapp.databinding.ActivityRegistrationBinding

class RegistrationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegistrationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Анимация заголовка "Регистрация" (сверху вниз)
        binding.registrationTitle.animate()
            .translationY(0f)
            .setDuration(1500)
            .start()

        // Анимация появления полей и кнопки
        binding.loginField.animate().alpha(1f).setDuration(2000).start()
        binding.passwordField.animate().alpha(1f).setDuration(2000).start()
        binding.registerButton.animate().alpha(1f).setDuration(2000).start()

        // Переход на основной экран
        binding.registerButton.setOnClickListener {
            val intent = Intent(this, WorkActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
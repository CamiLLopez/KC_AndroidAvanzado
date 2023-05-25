package com.example.kccentregaandroidavanzado.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.widget.doAfterTextChanged
import com.example.kccentregaandroidavanzado.UI.viewModels.LoginViewModel
import com.example.kccentregaandroidavanzado.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private val viewModel: LoginViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.emailField.doAfterTextChanged {
            binding.loginButton.isEnabled = binding.emailField.text.isNotEmpty() && binding.passwordField.text.isNotEmpty()

        }

        binding.passwordField.doAfterTextChanged {
            binding.loginButton.isEnabled = binding.emailField.text.isNotEmpty() && binding.passwordField.text.isNotEmpty()

        }

        binding.loginButton.setOnClickListener {

            val email = binding.emailField.text.toString()
            val password = binding.passwordField.text.toString()

             viewModel.login(email, password)

        }
    }
}
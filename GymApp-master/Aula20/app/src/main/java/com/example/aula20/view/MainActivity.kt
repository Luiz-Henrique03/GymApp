package com.example.aula20.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aula20.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCadastrarProfessor.setOnClickListener {
            startActivity(Intent(this, CadastroProfessorActivity::class.java))
        }

        binding.btnCadastrar.setOnClickListener {
            startActivity(Intent(this,CadastroUsuarioActivity::class.java))
        }

        binding.btnLogin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }


        binding.btnLoginUsuario.setOnClickListener {
            startActivity(Intent(this,LoginUsuarioActivity::class.java))
        }

    }
}
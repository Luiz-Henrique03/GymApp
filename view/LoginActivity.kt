package com.example.aula20.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.aula20.R
import com.example.aula20.databinding.ActivityLoginBinding
import com.example.aula20.repository.UsuarioDAO
import com.example.aula20.repository.UsuarioDataBase

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var usuarioDAO: UsuarioDAO


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        usuarioDAO = UsuarioDataBase.getInstance(this).getDao()
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEntrar.setOnClickListener {
            val nome = binding.edtNome.text.toString()
            val senha = binding.edtSenha.text.toString()

            val usuario = usuarioDAO.getUsuarioPorNome(nome)

            if (usuario != null && senha == usuario.Senha) {

                Log.d("LoginActivity", "Usuário logado - Nome: $nome, Senha: $senha")
            } else {

                Log.d("LoginActivity", "Tentativa de login inválida - Nome: $nome, Senha: $senha")
            }
        }
    }
}
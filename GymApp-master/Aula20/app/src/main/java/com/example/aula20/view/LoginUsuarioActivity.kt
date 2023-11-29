package com.example.aula20.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.aula20.R
import com.example.aula20.databinding.ActivityLoginBinding
import com.example.aula20.databinding.ActivityLoginUsuarioBinding

import com.example.aula20.repository.UsuarioDAO


class LoginUsuarioActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginUsuarioBinding
    private lateinit var usuarioDAO: UsuarioDAO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        usuarioDAO = UsuarioDataBase.getInstance(this).getDao()
        binding = ActivityLoginUsuarioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnArrumeSe.setOnClickListener {
            val nome = binding.edtNome.text.toString()
            val senha = binding.edtSenha.text.toString()

            val usuario = usuarioDAO.getUsuarioPorNome(nome)


            if (usuario != null && senha == usuario.Senha) {

                Log.d("LoginActivity", "Usuário logado - Nome: $nome, Senha: $senha")
            } else {

                Log.d("LoginActivity", "Tentativa de login inválida - Nome: $nome, Senha: $senha")
            }

            Log.d("LoginActivity", "Login válido - Nome: $nome, Senha: $senha")
            finish()
        }
    }
}
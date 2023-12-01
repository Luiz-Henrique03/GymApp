package com.example.aula20.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.aula20.R
import com.example.aula20.databinding.ActivityLoginBinding
import com.example.aula20.repository.ProfessorDAO
import com.example.aula20.repository.ProfessorDatabase
class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var professorDAO: ProfessorDAO



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        professorDAO = ProfessorDatabase.getInstance(this).getDao()
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnArrumeSe.setOnClickListener {
            val nome = binding.edtNome.text.toString()
            val senha = binding.edtSenha.text.toString()

            //val usuario = usuarioDAO.getUsuarioPorNome(nome)
            val professor = professorDAO.getProfessorPorNome(nome)

            if (professor != null && senha == professor.Senha) {

                val intent = Intent(this, ExerciciosActivity::class.java)
                intent.putExtra("professor", nome) // Passa o objeto usuário para a próxima atividade
                startActivity(intent)

            } else {

                Log.d("LoginActivity", "Tentativa de login inválida - Nome: $nome, Senha: $senha")
            }
        }
    }
}
package com.example.aula20.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.aula20.databinding.ActivityCadastroProfBinding
import com.example.aula20.viewmodel.CadastroProfessorViewModel

class CadastroProfessorActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCadastroProfBinding
    private lateinit var cadastroProfessorViewModel: CadastroProfessorViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCadastroProfBinding.inflate(layoutInflater)
        setContentView(binding.root)

        cadastroProfessorViewModel = ViewModelProvider(this).get(CadastroProfessorViewModel::class.java)
        setObserver()

        // ação de clique do botão
        binding.btnSalvar.setOnClickListener {

            var nome = binding.edtNome.text.toString()
            var email = binding.edtEmail.text.toString()
            var senha = binding.edtSenha.text.toString()

            // tentaremos salvar a tarefa no BD. Caso positivo, esta
            // activity será finalizada
            if (cadastroProfessorViewModel.salvar(nome,email,senha)){

                val intent = Intent(this, ExerciciosActivity::class.java)
                intent.putExtra("professor", nome) // Passa o objeto usuário para a próxima atividade
                startActivity(intent)

            }

        }


    }

    fun setObserver(){
        cadastroProfessorViewModel.getTxtToast().observe(this){
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        }
    }
}
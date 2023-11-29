package com.example.aula20.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.aula20.databinding.ActivityCadastroUserBinding
import com.example.aula20.repository.ProfessorDAO
import com.example.aula20.repository.ProfessorDatabase
import com.example.aula20.viewmodel.CadastroUsuarioViewModel

class CadastroUsuarioActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCadastroUserBinding
    private lateinit var professorDAO: ProfessorDAO
    private lateinit var cadastroUsuarioViewModel: CadastroUsuarioViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCadastroUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val database = ProfessorDatabase.getInstance(this)
        professorDAO = database.getDao()

        cadastroUsuarioViewModel = ViewModelProvider(this).get(CadastroUsuarioViewModel::class.java)
        setObserver()

        val professores = professorDAO.getProfessores()
        val professorNames = professores.map { it.nome }
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, professorNames)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerProfessores.adapter = adapter

        binding.btnSalvarUsuario.setOnClickListener {
            val nomeAluno = binding.edtNomeUsuario.text.toString()
            val emailAluno = binding.edtEmailUsuario.text.toString()
            val senhaAluno = binding.edtSenhaUsuario.text.toString()

            val selectedProfessorName = binding.spinnerProfessores.selectedItem.toString()
            val selectedProfessor = professores.find { it.nome == selectedProfessorName }

            if (cadastroUsuarioViewModel.salvar(nomeAluno,emailAluno,senhaAluno,selectedProfessorName)){
                finish()
            }
        }
    }
    fun setObserver(){
        cadastroUsuarioViewModel.getTxtToast().observe(this){
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        }
    }
}
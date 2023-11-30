package com.example.aula20.view

import android.R
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.aula20.databinding.ActivityExerciciosBinding
import com.example.aula20.repository.ProfessorDAO
import com.example.aula20.repository.ProfessorDatabase
import com.example.aula20.viewmodel.CadastroUsuarioViewModel
import com.example.aula20.viewmodel.ExerciciosViewModel

class ExerciciosActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExerciciosBinding
    private lateinit var exerciciosViewModel: ExerciciosViewModel
    private lateinit var professorDAO: ProfessorDAO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciciosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val database = ProfessorDatabase.getInstance(this)
        professorDAO = database.getDao()

        exerciciosViewModel = ViewModelProvider(this).get(ExerciciosViewModel::class.java)

        val checkBoxList = listOf(
            binding.exercise1,
            binding.exercise2,
            binding.exercise3,
            binding.exercise4,
            binding.exercise5,
            binding.exercise6,
            binding.exercise7,
            binding.exercise8
            )

        // Configurar o Spinner com a lista de dias da semana
        val diasDaSemana = arrayOf("Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado")
        val spinnerAdapter = ArrayAdapter(this, R.layout.simple_spinner_item, diasDaSemana)
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerDiasSemana.adapter = spinnerAdapter

        val professores = professorDAO.getProfessores()
        val professorNames = professores.map { it.nome }
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, professorNames)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerProfessores.adapter = adapter

        binding.btnCadastrar.setOnClickListener {
            val selectedExercises = mutableListOf<String>()

            for (checkBox in checkBoxList) {
                if (checkBox.isChecked) {
                    selectedExercises.add(checkBox.text.toString())

                }
            }

            if (selectedExercises.isNotEmpty()) {
                val selectedExercisesString = selectedExercises.toString()
                val selectedProfessorName = binding.spinnerProfessores.selectedItem.toString()
                val selectedDayOfWeek = binding.spinnerDiasSemana.selectedItem.toString()
                val series = binding.edtSeries.toString()

                val selectedProfessor = professorDAO.getProfessorPorNome(selectedProfessorName)
                val professorName = selectedProfessor?.nome ?: ""

                Toast.makeText(this, "Exercícios selecionados: $selectedExercisesString\nProfessor: $professorName", Toast.LENGTH_SHORT).show()

                exerciciosViewModel.salvar(professorName, selectedExercisesString, series, selectedDayOfWeek)

                startActivity(Intent(this, MainActivity::class.java))
            } else {
                Toast.makeText(this, "Nenhum exercício selecionado", Toast.LENGTH_SHORT).show()
            }
        }
    }
}


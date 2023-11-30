package com.example.aula20.view

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.aula20.databinding.ActivityExerciciosBinding

class ExerciciosActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExerciciosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciciosBinding.inflate(layoutInflater)
        setContentView(binding.root)

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

        binding.btnCadastrar.setOnClickListener {
            val selectedExercises = mutableListOf<String>()

            for (checkBox in checkBoxList) {
                if (checkBox.isChecked) {
                    selectedExercises.add(checkBox.text.toString())
                }
            }

            if (selectedExercises.isNotEmpty()) {
                val selectedExercisesString = selectedExercises.joinToString(", ")
                Toast.makeText(this, "Exercícios selecionados: $selectedExercisesString", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Nenhum exercício selecionado", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

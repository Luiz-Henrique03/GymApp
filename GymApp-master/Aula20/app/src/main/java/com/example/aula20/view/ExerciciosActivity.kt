package com.example.aula20.view

import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.aula20.databinding.ActivityExerciciosBinding

class ExerciciosActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExerciciosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciciosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Manipular a seleção do RadioButton usando vinculação de dados
        binding.btnCadastrar.setOnClickListener {
            val selectedId = binding.exerciseRadioGroup.checkedRadioButtonId
            if (selectedId != -1) {
                val selectedRadioButton = findViewById<RadioButton>(selectedId)
                val selectedExercise = selectedRadioButton.text.toString()

                Toast.makeText(this, "Exercício selecionado: $selectedExercise", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Nenhum exercício selecionado", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

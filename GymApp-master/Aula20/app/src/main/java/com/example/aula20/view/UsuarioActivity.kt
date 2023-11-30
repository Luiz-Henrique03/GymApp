package com.example.aula20.view

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.aula20.databinding.ActivityUsuarioBinding
import com.example.aula20.model.Exercicios
import com.example.aula20.repository.ExerciciosRepository

class UsuarioActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUsuarioBinding
    private lateinit var listViewDiasSemana: ListView
    private lateinit var exerciciosRepository: ExerciciosRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUsuarioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listViewDiasSemana = binding.listViewExercicios
        exerciciosRepository = ExerciciosRepository(applicationContext)

        // Obtenha os exercícios do repositório
        val exercicios: List<Exercicios> = exerciciosRepository.getExericios()

        // Crie uma lista de strings com os dias da semana e o exercício associado
        val diasExerciciosList: List<String> = exercicios.flatMap { exercicio ->
            exercicio.Dias_da_semana.split(",").map { dia ->
                "$dia - ${exercicio.nome}" // Ajuste conforme a estrutura real do seu modelo
            }
        }

        // Crie um adaptador para a ListView com os dias da semana e exercícios associados
        val diasExerciciosAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, diasExerciciosList)
        listViewDiasSemana.adapter = diasExerciciosAdapter
    }
}

package com.example.aula20.view

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.aula20.databinding.ActivityUsuarioBinding
import com.example.aula20.model.Exercicios
import com.example.aula20.model.Usuario
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

        val usuarioString = intent.getStringExtra("usuario")
        val professorString = intent.getStringExtra("professor")


        // Agora você pode acessar os campos do objeto Usuario
        val userName = usuarioString
        val professorName = professorString

        binding.tvUserName.text = "Nome: $userName\nProfessor: $professorName"

        // Obtenha os exercícios do repositório
        val exercicios: List<Exercicios> = exerciciosRepository.getExericios()

        // Crie uma lista de strings com os dias da semana
        val diasDaSemana = listOf("Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado")

        // Crie uma lista para armazenar os dias com exercícios
        val diasComExercicios = mutableListOf<String>()

        // Preencha a lista de dias com exercícios
        for (dia in diasDaSemana) {
            val exerciciosNoDia = exercicios.filter { it.Dias_da_semana.contains(dia) && it.professor == professorName  }
            if (exerciciosNoDia.isNotEmpty()) {
                diasComExercicios.add("$dia - ${exerciciosNoDia.joinToString(", ") { it.nome }}")
            } else {
                diasComExercicios.add("$dia - Nenhum exercício")
            }
        }

        // Crie um adaptador para a ListView com os dias da semana e exercícios associados
        val diasExerciciosAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, diasComExercicios)
        listViewDiasSemana.adapter = diasExerciciosAdapter
    }
}

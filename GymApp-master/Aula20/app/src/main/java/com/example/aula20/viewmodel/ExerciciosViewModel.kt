package com.example.aula20.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.aula20.model.Exercicios
import com.example.aula20.repository.ExerciciosRepository

class ExerciciosViewModel(application: Application) : AndroidViewModel(application) {

    private var txtToast = MutableLiveData<String>()
    private var exerciciosRepository = ExerciciosRepository(application.applicationContext)


    fun getTxtToast(): LiveData<String> {
        return txtToast
    }

    fun salvar(professor: String, nome: String, series: String, diasDaSemana: String): Boolean {

        // validar se campo está em branco
        if (professor.isBlank() || nome.isBlank() || series.isBlank() || diasDaSemana.isBlank()) {
            txtToast.value = "Exercício com cadastro incompleto"
            return false
        }

        // criar objeto do tipo exercicio
        var exercicio = Exercicios(0, professor, nome, series, diasDaSemana)

        // tentar salvar objeto exercicio criado acima
        if (!exerciciosRepository.salvarExercicio(exercicio)) {

            txtToast.value = "Erro ao tentar salvar exercício..."
            return false
        }

        txtToast.value = "Exercício salvo!"
        return true
    }
}


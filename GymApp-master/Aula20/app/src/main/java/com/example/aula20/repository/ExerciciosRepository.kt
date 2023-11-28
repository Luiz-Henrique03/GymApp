package com.example.aula20.repository

import android.content.Context
import com.example.aula20.model.Exercicios

class ExerciciosRepository(context: Context) {

    private var dao = ExerciciosDatabase.getInstance(context).getDao()

    fun salvarExercicio(exercicios: Exercicios) : Boolean {
        return dao.salvarExercicio(exercicios) > 0
    }

    fun deletarExercicio (exercicios: Exercicios) {
        dao.deletarExercicio(exercicios)
    }

    fun getExercicio(id: Int) : Exercicios {
        return dao.getExercicio(id)
    }

    fun getExericios() : List<Exercicios> {
        return dao.getExercicios();
    }

    fun atualizarExercicio(exercicios: Exercicios){
        dao.atualizarExercicio(exercicios)
    }

}
package com.example.aula20.repository

import android.content.Context
import com.example.aula20.model.Professor
import com.example.aula20.model.Usuario

class ProfessorRepository(context: Context) {

    private var dao = ProfessorDatabase.getInstance(context).getDao()

    fun salvarProfessor(professor: Professor) : Boolean {
        return dao.salvarProfessor(professor) > 0
    }

    fun deletarProfessor (professor: Professor) {
        dao.deletarProfessor(professor)
    }

    fun getProfessor(id: Int) : Professor {
        return dao.getProfessor(id)
    }

    fun getProfessores() : List<Professor> {
        return dao.getProfessores()
    }

    fun atualizarProfessor(professor: Professor){
        dao.atualizarProfessor(professor)
    }
}
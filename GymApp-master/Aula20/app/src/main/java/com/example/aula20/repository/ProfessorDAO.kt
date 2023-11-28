package com.example.aula20.repository

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.aula20.model.Professor

@Dao
interface ProfessorDAO {

    @Insert
    fun salvarProfessor(professor: Professor) : Long

    @Delete
    fun deletarProfessor (professor: Professor)

    @Update
    fun atualizarProfessor (professor: Professor)

    @Query("SELECT * FROM professores WHERE id = :id")
    fun getProfessor(id: Int) : Professor

    @Query("SELECT * FROM professores")
    fun getProfessores() : List<Professor>
}
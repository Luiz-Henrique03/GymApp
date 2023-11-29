package com.example.aula20.repository

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.aula20.model.Exercicios

@Dao
interface ExerciciosDAO {

    @Insert
    fun salvarExercicio(exercicios: Exercicios) : Long

    @Delete
    fun deletarExercicio (exercicios: Exercicios)

    @Update
    fun atualizarExercicio (exercicios: Exercicios)

    @Query("SELECT * FROM exercicios WHERE id = :id")
    fun getExercicio(id: Int) : Exercicios

    @Query("SELECT * FROM exercicios")
    fun getExercicios() : List<Exercicios>
}
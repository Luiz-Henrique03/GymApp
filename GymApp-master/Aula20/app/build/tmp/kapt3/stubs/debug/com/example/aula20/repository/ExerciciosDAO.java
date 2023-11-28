package com.example.aula20.repository;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000e"}, d2 = {"Lcom/example/aula20/repository/ExerciciosDAO;", "", "atualizarExercicio", "", "exercicios", "Lcom/example/aula20/model/Exercicios;", "deletarExercicio", "getExercicio", "id", "", "getExercicios", "", "salvarExercicio", "", "app_debug"})
public abstract interface ExerciciosDAO {
    
    @androidx.room.Insert
    public abstract long salvarExercicio(@org.jetbrains.annotations.NotNull
    com.example.aula20.model.Exercicios exercicios);
    
    @androidx.room.Delete
    public abstract void deletarExercicio(@org.jetbrains.annotations.NotNull
    com.example.aula20.model.Exercicios exercicios);
    
    @androidx.room.Update
    public abstract void atualizarExercicio(@org.jetbrains.annotations.NotNull
    com.example.aula20.model.Exercicios exercicios);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM exericios WHERE id = :id")
    public abstract com.example.aula20.model.Exercicios getExercicio(int id);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM exericios")
    public abstract java.util.List<com.example.aula20.model.Exercicios> getExercicios();
}
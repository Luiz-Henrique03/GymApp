package com.example.aula20.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "exercicios")
data class Exercicios (
    @ColumnInfo @PrimaryKey(autoGenerate = true) var id: Int,
    @ColumnInfo var professor: String,
    @ColumnInfo var nome: String,
    @ColumnInfo var Series: String,
    @ColumnInfo var Dias_da_semana: String
)
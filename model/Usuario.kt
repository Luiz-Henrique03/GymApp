package com.example.aula20.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "usuario")
data class Usuario (
    @ColumnInfo @PrimaryKey(autoGenerate = true) var id: Int,
    @ColumnInfo var nome: String,
    @ColumnInfo var Email: String,
    @ColumnInfo var Senha: String,
    )
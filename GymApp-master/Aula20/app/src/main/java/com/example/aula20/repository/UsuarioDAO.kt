package com.example.aula20.repository

import androidx.room.*
import com.example.aula20.model.Professor
import com.example.aula20.model.Usuario

@Dao
interface UsuarioDAO {

    @Insert
    fun salvar(usuario: Usuario) : Long

    @Delete
    fun deletar (usuario: Usuario)

    @Update
    fun atualizar (usuario: Usuario)

    @Query("SELECT * FROM usuarios1 WHERE id = :id")
    fun getUsuario(id: Int) : Usuario

    @Query("SELECT * FROM usuarios1")
    fun getUsuarios() : List<Usuario>

    @Query("SELECT * FROM usuarios1 WHERE nome = :nome")
    fun getUsuarioPorNome(nome: String): Usuario?

}
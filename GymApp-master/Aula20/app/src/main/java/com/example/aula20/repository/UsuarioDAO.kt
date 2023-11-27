package com.example.aula20.repository

import androidx.room.*
import com.example.aula20.model.Usuario

@Dao
interface UsuarioDAO {

    @Insert
    fun salvar(usuario: Usuario) : Long

    @Delete
    fun deletar (usuario: Usuario)

    @Update
    fun atualizar (usuario: Usuario)

    @Query("SELECT * FROM usuario WHERE id = :id")
    fun getUsuario(id: Int) : Usuario

    @Query("SELECT * FROM usuario")
    fun getUsuarios() : List<Usuario>

    @Query("SELECT * FROM usuario WHERE nome = :nome")
    fun getUsuarioPorNome(nome: String): Usuario?

}
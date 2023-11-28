package com.example.aula20.repository;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\'J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fH\'J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0011"}, d2 = {"Lcom/example/aula20/repository/UsuarioDAO;", "", "atualizar", "", "usuario", "Lcom/example/aula20/model/Usuario;", "deletar", "getUsuario", "id", "", "getUsuarioPorNome", "nome", "", "getUsuarios", "", "salvar", "", "app_debug"})
public abstract interface UsuarioDAO {
    
    @androidx.room.Insert
    public abstract long salvar(@org.jetbrains.annotations.NotNull
    com.example.aula20.model.Usuario usuario);
    
    @androidx.room.Delete
    public abstract void deletar(@org.jetbrains.annotations.NotNull
    com.example.aula20.model.Usuario usuario);
    
    @androidx.room.Update
    public abstract void atualizar(@org.jetbrains.annotations.NotNull
    com.example.aula20.model.Usuario usuario);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM usuario WHERE id = :id")
    public abstract com.example.aula20.model.Usuario getUsuario(int id);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM usuario")
    public abstract java.util.List<com.example.aula20.model.Usuario> getUsuarios();
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM usuario WHERE nome = :nome")
    public abstract com.example.aula20.model.Usuario getUsuarioPorNome(@org.jetbrains.annotations.NotNull
    java.lang.String nome);
}
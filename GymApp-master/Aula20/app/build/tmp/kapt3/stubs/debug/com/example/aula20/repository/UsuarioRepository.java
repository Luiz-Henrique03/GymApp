package com.example.aula20.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/aula20/repository/UsuarioRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dao", "Lcom/example/aula20/repository/UsuarioDAO;", "atualizar", "", "usuario", "Lcom/example/aula20/model/Usuario;", "deletar", "getUsuario", "id", "", "getUsuarios", "", "salvar", "", "app_debug"})
public final class UsuarioRepository {
    private com.example.aula20.repository.UsuarioDAO dao;
    
    public UsuarioRepository(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    public final boolean salvar(@org.jetbrains.annotations.NotNull
    com.example.aula20.model.Usuario usuario) {
        return false;
    }
    
    public final void deletar(@org.jetbrains.annotations.NotNull
    com.example.aula20.model.Usuario usuario) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.aula20.model.Usuario getUsuario(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.aula20.model.Usuario> getUsuarios() {
        return null;
    }
    
    public final void atualizar(@org.jetbrains.annotations.NotNull
    com.example.aula20.model.Usuario usuario) {
    }
}
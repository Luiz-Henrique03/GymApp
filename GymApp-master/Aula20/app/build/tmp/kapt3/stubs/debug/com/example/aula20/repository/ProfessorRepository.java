package com.example.aula20.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/aula20/repository/ProfessorRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dao", "Lcom/example/aula20/repository/ProfessorDAO;", "atualizarProfessor", "", "professor", "Lcom/example/aula20/model/Professor;", "deletarProfessor", "getProfessor", "id", "", "getProfessores", "", "salvarProfessor", "", "app_debug"})
public final class ProfessorRepository {
    private com.example.aula20.repository.ProfessorDAO dao;
    
    public ProfessorRepository(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    public final boolean salvarProfessor(@org.jetbrains.annotations.NotNull
    com.example.aula20.model.Professor professor) {
        return false;
    }
    
    public final void deletarProfessor(@org.jetbrains.annotations.NotNull
    com.example.aula20.model.Professor professor) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.aula20.model.Professor getProfessor(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.aula20.model.Professor> getProfessores() {
        return null;
    }
    
    public final void atualizarProfessor(@org.jetbrains.annotations.NotNull
    com.example.aula20.model.Professor professor) {
    }
}
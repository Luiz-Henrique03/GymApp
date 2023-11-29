package com.example.aula20.view;

import java.lang.System;

@androidx.room.Database(entities = {com.example.aula20.model.Usuario.class}, version = 2)
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/aula20/view/UsuarioDataBase;", "Landroidx/room/RoomDatabase;", "()V", "getDao", "Lcom/example/aula20/repository/UsuarioDAO;", "Companion", "app_debug"})
public abstract class UsuarioDataBase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final com.example.aula20.view.UsuarioDataBase.Companion Companion = null;
    private static com.example.aula20.view.UsuarioDataBase INSTANCE;
    
    public UsuarioDataBase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.aula20.repository.UsuarioDAO getDao();
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/aula20/view/UsuarioDataBase$Companion;", "", "()V", "INSTANCE", "Lcom/example/aula20/view/UsuarioDataBase;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.aula20.view.UsuarioDataBase getInstance(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}
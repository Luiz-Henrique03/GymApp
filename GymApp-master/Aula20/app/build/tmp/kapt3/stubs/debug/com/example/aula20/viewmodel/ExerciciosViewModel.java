package com.example.aula20.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bJ&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/aula20/viewmodel/ExerciciosViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "exerciciosRepository", "Lcom/example/aula20/repository/ExerciciosRepository;", "txtToast", "Landroidx/lifecycle/MutableLiveData;", "", "getTxtToast", "Landroidx/lifecycle/LiveData;", "salvar", "", "professor", "nome", "series", "diasDaSemana", "app_debug"})
public final class ExerciciosViewModel extends androidx.lifecycle.AndroidViewModel {
    private androidx.lifecycle.MutableLiveData<java.lang.String> txtToast;
    private com.example.aula20.repository.ExerciciosRepository exerciciosRepository;
    
    public ExerciciosViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getTxtToast() {
        return null;
    }
    
    public final boolean salvar(@org.jetbrains.annotations.NotNull
    java.lang.String professor, @org.jetbrains.annotations.NotNull
    java.lang.String nome, @org.jetbrains.annotations.NotNull
    java.lang.String series, @org.jetbrains.annotations.NotNull
    java.lang.String diasDaSemana) {
        return false;
    }
}
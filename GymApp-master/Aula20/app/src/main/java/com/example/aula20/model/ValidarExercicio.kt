package com.example.aula20.model

class ValidarExercicio {

    fun verificarCampoEmBrancoExercicio(nome : String,  series : String) : Boolean {
        return nome.isEmpty() || series.isEmpty();
    }
}
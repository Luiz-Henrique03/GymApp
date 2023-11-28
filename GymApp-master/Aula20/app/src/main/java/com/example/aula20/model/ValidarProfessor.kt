package com.example.aula20.model

class ValidarProfessor {

    fun verificarCampoEmBrancoProfessor(nome : String, senha : String, email: String) : Boolean {
        return nome.isEmpty() || senha.isEmpty() || email.isEmpty();
    }
}
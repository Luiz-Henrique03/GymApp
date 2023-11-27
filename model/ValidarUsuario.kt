package com.example.aula20.model

class ValidarUsuario {

    fun verificarCampoEmBranco(nome : String, senha : String, email: String) : Boolean {
        return nome.isEmpty() || senha.isEmpty() || email.isEmpty();
    }

}
package com.example.aula20.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.aula20.model.Professor
import com.example.aula20.model.Usuario
import com.example.aula20.model.ValidarUsuario
import com.example.aula20.repository.UsuarioRepository

class CadastroUsuarioViewModel(application: Application) : AndroidViewModel(application) {

    private var txtToast = MutableLiveData<String>()
    private var validarUsuario = ValidarUsuario()
    private var usuarioRepository = UsuarioRepository(application.applicationContext)

    fun getTxtToast() : LiveData<String> {
        return txtToast
    }

    fun salvar(nome: String, email: String, senha: String, professor: String) : Boolean {

        // validar se campo está em branco
        if (validarUsuario.verificarCampoEmBranco(nome,senha,email)){
            txtToast.value = "Usuario com cadastro incompleto"
            return false
        }

        // criar objeto do tipo tarefa
        var usuario = Usuario(0, nome,email,senha,professor)

        // tentar salvar objeto tarefa criado acima
        if (!usuarioRepository.salvar(usuario)) {
            // se nao conseguiu salvar
            txtToast.value  = "Erro ao tentar salvar usuário..."
            return false
        }

        txtToast.value = "usuario salvo!"
        return true
    }
}
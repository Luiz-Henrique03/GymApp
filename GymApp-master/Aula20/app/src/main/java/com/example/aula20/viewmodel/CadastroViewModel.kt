package com.example.aula20.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.aula20.model.Usuario
import com.example.aula20.model.ValidarUsuario
import com.example.aula20.repository.UsuarioRepository

class CadastroViewModel(application: Application) : AndroidViewModel(application) {

    private var txtToast = MutableLiveData<String>()
    private var validarUsuario = ValidarUsuario()
    private var tarefaRepository = UsuarioRepository(application.applicationContext)

    fun getTxtToast() : LiveData<String> {
        return txtToast
    }

    fun salvar(nome : String,email : String ,senha : String) : Boolean {

        // validar se campo está em branco
        if (validarUsuario.verificarCampoEmBranco(nome,senha,email)){
            txtToast.value = "Usuário com cadastro incompleto"
            return false
        }

        // criar objeto do tipo tarefa
        var usuario = Usuario(0, nome,email,senha)

        // tentar salvar objeto tarefa criado acima
        if (!tarefaRepository.salvar(usuario)) {
            // se nao conseguiu salvar
            txtToast.value  = "Erro ao tentar salvar usuário..."
            return false
        }

        txtToast.value = "usuario salvo!"
        return true
    }

}
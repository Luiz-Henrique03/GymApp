package com.example.aula20.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.aula20.model.Professor
import com.example.aula20.model.ValidarProfessor
import com.example.aula20.model.ValidarUsuario
import com.example.aula20.repository.ProfessorRepository

class CadastroProfessorViewModel(application: Application) : AndroidViewModel(application) {

    private var txtToast = MutableLiveData<String>()
    private var validarProfessor = ValidarProfessor()
    private var professorRepository = ProfessorRepository(application.applicationContext)

    fun getTxtToast() : LiveData<String> {
        return txtToast
    }

    fun salvar(nome : String,email : String ,senha : String) : Boolean {

        // validar se campo está em branco
        if (validarProfessor.verificarCampoEmBrancoProfessor(nome,senha,email)){
            txtToast.value = "Professor com cadastro incompleto"
            return false
        }

        // criar objeto do tipo tarefa
        var professor = Professor(0, nome,email,senha)

        // tentar salvar objeto tarefa criado acima
        if (!professorRepository.salvarProfessor(professor)) {
            // se nao conseguiu salvar
            txtToast.value  = "Erro ao tentar salvar usuário..."
            return false
        }

        txtToast.value = "usuario salvo!"
        return true
    }

}
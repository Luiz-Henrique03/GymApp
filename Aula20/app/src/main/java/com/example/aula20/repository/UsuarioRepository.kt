package com.example.aula20.repository

import android.content.Context
import com.example.aula20.model.Usuario

class UsuarioRepository(context: Context) {

    private var dao = UsuarioDataBase.getInstance(context).getDao()

    fun salvar(usuario: Usuario) : Boolean {
        return dao.salvar(usuario) > 0
    }

    fun deletar (usuario: Usuario) {
        dao.deletar(usuario)
    }

    fun getUsuario(id: Int) : Usuario {
        return dao.getUsuario(id)
    }

    fun getUsuarios() : List<Usuario> {
        return dao.getUsuarios()
    }

    fun atualizar(usuario: Usuario){
        dao.atualizar(usuario)
    }

}
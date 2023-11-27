package com.example.aula20.repository

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.aula20.model.Usuario

@Database(entities = [Usuario::class], version = 1)
abstract class UsuarioDataBase : RoomDatabase() {

    abstract fun getDao() : UsuarioDAO

    companion object{

        private lateinit var INSTANCE : UsuarioDataBase

        fun getInstance(context: Context) : UsuarioDataBase {

            if (!::INSTANCE.isInitialized) {

                INSTANCE = Room.databaseBuilder(context, UsuarioDataBase::class.java, "usuarios_db")
                    .allowMainThreadQueries()
                    .build()
            }

            return INSTANCE
        }

    }

}
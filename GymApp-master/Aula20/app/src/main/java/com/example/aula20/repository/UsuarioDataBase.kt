package com.example.aula20.view


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.aula20.model.Usuario
import com.example.aula20.repository.UsuarioDAO

@Database(entities = [Usuario::class], version = 2)
abstract class UsuarioDataBase : RoomDatabase() {

    abstract fun getDao(): UsuarioDAO

    companion object {
        private lateinit var INSTANCE: UsuarioDataBase

        fun getInstance(context: Context): UsuarioDataBase {

            if (!::INSTANCE.isInitialized) {
                INSTANCE = Room.databaseBuilder(context, UsuarioDataBase::class.java, "usuarios1_db")
                    .allowMainThreadQueries()
                    .build()
            }

            return INSTANCE
        }
    }
}

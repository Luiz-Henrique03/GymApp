package com.example.aula20.repository

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.aula20.model.Professor

@Database(entities = [Professor::class], version = 1)
abstract class ProfessorDatabase : RoomDatabase() {

    abstract fun getDao() : ProfessorDAO

    companion object{

        private lateinit var INSTANCE : ProfessorDatabase

        fun getInstance(context: Context) : ProfessorDatabase {

            if (!::INSTANCE.isInitialized) {

                INSTANCE = Room.databaseBuilder(context, ProfessorDatabase::class.java, "professores_db")
                    .allowMainThreadQueries()
                    .build()
            }

            return INSTANCE
        }

    }

}
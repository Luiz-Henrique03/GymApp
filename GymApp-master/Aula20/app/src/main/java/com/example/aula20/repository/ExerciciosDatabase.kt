package com.example.aula20.repository

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.aula20.model.Exercicios

@Database(entities = [Exercicios::class], version = 1)
abstract class ExerciciosDatabase : RoomDatabase() {

    abstract fun getDao() : ExerciciosDAO

    companion object{

        private lateinit var INSTANCE : ExerciciosDatabase

        fun getInstance(context: Context) : ExerciciosDatabase {

            if (!::INSTANCE.isInitialized) {

                INSTANCE = Room.databaseBuilder(context, ExerciciosDatabase::class.java, "exercicios_db")
                    .allowMainThreadQueries()
                    .build()
            }

            return INSTANCE
        }

    }

}
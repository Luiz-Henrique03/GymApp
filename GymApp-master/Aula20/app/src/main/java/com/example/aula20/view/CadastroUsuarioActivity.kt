package com.example.aula20.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aula20.R
import com.example.aula20.databinding.ActivityCadastroBinding

class CadastroUsuarioActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCadastroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_prof)
    }
}
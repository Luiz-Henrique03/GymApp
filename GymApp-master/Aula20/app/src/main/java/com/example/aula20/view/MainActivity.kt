package com.example.aula20.view

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.example.aula20.R
import com.example.aula20.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurar o VideoView
        val videoView = findViewById<VideoView>(R.id.videoView)

        // Configurar o URI do vídeo (o nome do arquivo pode variar)
        val videoPath = "android.resource://" + packageName + "/" + R.raw.background_video
        val uri = Uri.parse(videoPath)

        // Configurar o MediaController
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)

        // Configurar o VideoView
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()

        // Iniciar a reprodução automática do vídeo
        videoView.start()

        binding.btnCadastrarProfessor.setOnClickListener {
            startActivity(Intent(this, CadastroProfessorActivity::class.java))
        }

        binding.btnCadastrar.setOnClickListener {
            startActivity(Intent(this,CadastroUsuarioActivity::class.java))
        }

        binding.btnLogin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }


        binding.btnLoginUsuario.setOnClickListener {
            startActivity(Intent(this,LoginUsuarioActivity::class.java))
        }

    }
}
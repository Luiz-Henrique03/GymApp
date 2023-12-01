package com.example.aula20.view

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.example.aula20.R

class SobreNosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sobre_nos)

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
    }
}
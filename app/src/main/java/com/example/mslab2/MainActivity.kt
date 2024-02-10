package com.example.mslab2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bioButton = findViewById<Button>(R.id.button)
        val profileButton = findViewById<Button>(R.id.button2)
        val cameraButton = findViewById<Button>(R.id.button3)

        bioButton.setOnClickListener {
            intent = Intent(applicationContext, FullBioScreen::class.java)
            startActivity(intent)
        }

        profileButton.setOnClickListener {
            val web = Intent(Intent.ACTION_VIEW)
            web.data = Uri.parse("https://www.instagram.com/m.a.b.16/")
            startActivity(web)
        }

        cameraButton.setOnClickListener {
            val camera = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(camera)
        }
    }
}
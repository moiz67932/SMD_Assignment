package com.example.i230529_a1
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
class CreatePostActivity : AppCompatActivity() { override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_create_post); findViewById<View>(R.id.backButton).setOnClickListener { finish() }; findViewById<View>(R.id.photoButton).setOnClickListener { startActivity(Intent(this, PhotoPickerActivity::class.java)) }; findViewById<View>(R.id.cameraButton).setOnClickListener { startActivity(Intent(this, CameraActivity::class.java)) } } }

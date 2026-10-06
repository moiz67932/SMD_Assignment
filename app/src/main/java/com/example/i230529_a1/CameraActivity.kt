package com.example.i230529_a1
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
class CameraActivity : AppCompatActivity() { override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_camera); findViewById<View>(R.id.backButton).setOnClickListener { finish() }; findViewById<View>(R.id.shutterButton).setOnClickListener { startActivity(Intent(this, StoryEditorActivity::class.java)) } } }

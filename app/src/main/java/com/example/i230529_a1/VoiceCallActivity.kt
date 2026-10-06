package com.example.i230529_a1
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
class VoiceCallActivity : AppCompatActivity() { override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_voice_call); findViewById<View>(R.id.endCallButton).setOnClickListener { finish() } } }

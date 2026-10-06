package com.example.i230529_a1
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
class OtherProfileActivity : AppCompatActivity() { override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_other_profile); findViewById<View>(R.id.backButton).setOnClickListener { finish() } } }

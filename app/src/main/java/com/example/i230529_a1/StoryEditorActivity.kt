package com.example.i230529_a1
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
class StoryEditorActivity : AppCompatActivity() { override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_story_editor); findViewById<View>(R.id.backButton).setOnClickListener { finish() }; findViewById<View>(R.id.shareStoryButton).setOnClickListener { startActivity(Intent(this, YourStoryActivity::class.java)) } } }

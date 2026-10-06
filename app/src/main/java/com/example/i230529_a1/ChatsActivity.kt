package com.example.i230529_a1
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
class ChatsActivity : AppCompatActivity() { override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_chats); findViewById<View>(R.id.backButton).setOnClickListener { finish() }; findViewById<View>(R.id.chatButton).setOnClickListener { startActivity(Intent(this,ChatActivity::class.java)) } } }

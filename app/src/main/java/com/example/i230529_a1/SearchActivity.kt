package com.example.i230529_a1
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
class SearchActivity : AppCompatActivity() { override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_search); findViewById<View>(R.id.backButton).setOnClickListener { finish() }; findViewById<View>(R.id.resultButton).setOnClickListener { startActivity(Intent(this, OtherProfileActivity::class.java)) } } }

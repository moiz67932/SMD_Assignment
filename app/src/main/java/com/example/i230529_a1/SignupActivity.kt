package com.example.i230529_a1
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
class SignupActivity : AppCompatActivity() { override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_signup)
 findViewById<View>(R.id.backButton).setOnClickListener { finish() }; findViewById<View>(R.id.loginLink).setOnClickListener { finish() }
 findViewById<View>(R.id.createAccountButton).setOnClickListener { startActivity(Intent(this, HomeActivity::class.java)); finish() }
} }

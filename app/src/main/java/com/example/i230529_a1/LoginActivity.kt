package com.example.i230529_a1
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
class LoginActivity : AppCompatActivity() {
 override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_login)
  findViewById<View>(R.id.loginButton).setOnClickListener { startActivity(Intent(this, HomeActivity::class.java)); finish() }
  findViewById<View>(R.id.signupButton).setOnClickListener { startActivity(Intent(this, SignupActivity::class.java)) }
 }
}

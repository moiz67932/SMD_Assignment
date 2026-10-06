package com.example.i230529_a1
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
class MenuActivity : AppCompatActivity() { override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_menu); fun open(id:Int,target:Class<*>) { findViewById<View>(id).setOnClickListener { startActivity(Intent(this,target)) } }; open(R.id.profileCard,ProfileActivity::class.java); open(R.id.homeTab,HomeActivity::class.java); open(R.id.friendsTab,FriendsActivity::class.java); open(R.id.marketTab,MarketplaceActivity::class.java); open(R.id.notificationsTab,NotificationsActivity::class.java); findViewById<View>(R.id.logoutButton).setOnClickListener { val intent=Intent(this,LoginActivity::class.java); intent.flags=Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK; startActivity(intent) } } }

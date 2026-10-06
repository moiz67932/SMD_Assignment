package com.example.i230529_a1
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
class NotificationsActivity : AppCompatActivity() { override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_notifications); fun open(id:Int,target:Class<*>) { findViewById<View>(id).setOnClickListener { startActivity(Intent(this,target)) } }; open(R.id.homeTab,HomeActivity::class.java); open(R.id.friendsTab,FriendsActivity::class.java); open(R.id.marketTab,MarketplaceActivity::class.java); open(R.id.menuTab,MenuActivity::class.java) } }

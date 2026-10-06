package com.example.i230529_a1
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
class FriendsActivity : AppCompatActivity() { override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_friends); fun open(id:Int,target:Class<*>) { findViewById<View>(id).setOnClickListener { startActivity(Intent(this,target)) } }; open(R.id.personButton,OtherProfileActivity::class.java); open(R.id.homeTab,HomeActivity::class.java); open(R.id.marketTab,MarketplaceActivity::class.java); open(R.id.notificationsTab,NotificationsActivity::class.java); open(R.id.menuTab,MenuActivity::class.java) } }

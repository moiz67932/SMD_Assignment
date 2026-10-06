package com.example.i230529_a1
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
class HomeActivity : AppCompatActivity() { override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_home)
 fun open(id:Int, target:Class<*>) { findViewById<View>(id).setOnClickListener { startActivity(Intent(this, target)) } }
 open(R.id.searchButton, SearchActivity::class.java); open(R.id.chatsButton, ChatsActivity::class.java); open(R.id.createPostButton, CreatePostActivity::class.java); open(R.id.commentsButton, CommentsActivity::class.java); open(R.id.reactionButton, ReactionPickerActivity::class.java); open(R.id.storyButton, StoryViewerActivity::class.java); open(R.id.profileButton, ProfileActivity::class.java); open(R.id.createStoryButton, CameraActivity::class.java); open(R.id.friendsTab, FriendsActivity::class.java); open(R.id.marketTab, MarketplaceActivity::class.java); open(R.id.notificationsTab, NotificationsActivity::class.java); open(R.id.menuTab, MenuActivity::class.java)
} }

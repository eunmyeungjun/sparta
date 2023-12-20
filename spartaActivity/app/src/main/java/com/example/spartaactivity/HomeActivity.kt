package com.example.spartaactivity

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val imageList = listOf(R.drawable.dog , R.drawable.dolphin,
            R.drawable.monkey, R.drawable.panda ,R.drawable.tiger)

        var homeImage = findViewById<ImageView>(R.id.iv_home)
        homeImage.setImageResource(imageList.random())

        val userId = intent.getStringExtra("userId")

        val idView = findViewById<TextView>(R.id.tv_id)
        idView.text = "아이디 : $userId"

        val btnFinish = findViewById<Button>(R.id.btn_end)
        btnFinish.setOnClickListener {
            finish()
        }


    }


}
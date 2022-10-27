package com.example.labo_1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityPart1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_part1)

        val edit = findViewById<Button>(R.id.editButton)
        edit.setOnClickListener {
            val intent = Intent(this, ActivityPart1B::class.java)
            startActivity(intent)
        }
    }
}
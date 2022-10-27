package com.example.labo_1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityPart1B : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_part1_b)

        val save = findViewById<Button>(R.id.save)
        save.setOnClickListener {
            val intent = Intent(this, ActivityPart1::class.java)
            startActivity(intent)
        }
    }
}
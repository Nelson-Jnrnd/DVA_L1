package com.example.labo_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

var storedName = ""
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
    override fun onResume() {
        super.onResume()
        if (intent.hasExtra("userName")) {
            val name = intent.getStringExtra("userName")
            val text = findViewById<TextView>(R.id.textView2);
            val string = getString(R.string.hello)
            text.text = "$string $name !"
            storedName = name.toString()
        }
        else if (storedName != ""){
            val text = findViewById<TextView>(R.id.textView2);
            val string = getString(R.string.hello)
            text.text = "$string $storedName !"
        }
    }
    override fun onBackPressed() {
        startActivity(Intent(this, MainActivity::class.java))
    }
}
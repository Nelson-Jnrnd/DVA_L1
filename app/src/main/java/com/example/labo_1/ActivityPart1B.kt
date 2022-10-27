package com.example.labo_1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class ActivityPart1B : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_part1_b)
        val text = findViewById<EditText>(R.id.editTextTextPersonName);
        val save = findViewById<Button>(R.id.save)
        save.setOnClickListener {
            val name = text.text.toString()
            if (name == "") {
                Toast.makeText(applicationContext, "Merci de mettre ton prenom pour sauvegarder", Toast.LENGTH_SHORT).show()
            }
            else{
                val intent = Intent(this, ActivityPart1::class.java)
                intent.putExtra("userName", name);
                startActivity(intent)
            }
        }
    }
}
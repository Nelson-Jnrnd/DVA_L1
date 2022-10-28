package com.example.labo_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityPart3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_part3)
        val fragmentContainerView = findViewById<androidx.fragment.app.FragmentContainerView>(R.id.fragmentContainerView)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .setReorderingAllowed(true)
                .add(R.id.fragmentContainerView, StepFragment())
                .commit()
        }
    }
}
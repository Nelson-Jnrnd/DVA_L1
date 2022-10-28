package com.example.labo_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityPart3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_part3)

        val close = findViewById<Button>(R.id.close)
        close.setOnClickListener {
            finish()
        }

        val next = findViewById<Button>(R.id.next)
        next.setOnClickListener {
            pushStep()
        }

        val previous = findViewById<Button>(R.id.previous)
        previous.setOnClickListener {
            popStep()
        }

        pushStep()
    }

    private fun popStep() {
        if (supportFragmentManager.backStackEntryCount > 0) {
            supportFragmentManager.popBackStack()
        } else {
            finish()
        }
    }

    private fun pushStep() {
        supportFragmentManager.beginTransaction()
            .setReorderingAllowed(true)
            .add(
                R.id.fragmentContainerView,
                StepFragment.newInstance(supportFragmentManager.fragments.size + 1)
            )
            .addToBackStack(null)
            .commit()
    }
}
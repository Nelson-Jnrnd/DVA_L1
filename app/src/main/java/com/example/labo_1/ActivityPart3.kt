package com.example.labo_1

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

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
        if(savedInstanceState == null)
            pushStep()
    }

    /**
     * Push a new step fragment on the stack
     */
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

    /**
     * Pop the last step fragment from the stack
     * If there is only one fragment left, finish the activity
     */
    private fun popStep() {
        if (supportFragmentManager.backStackEntryCount > 0) {
            supportFragmentManager.popBackStack()
        } else {
            finish()
        }
    }
}

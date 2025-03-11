package com.example.tentativa2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class EmployeesListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.employees_list_activity)

        val buttonHome = findViewById<ImageButton>(R.id.buttonHome)

        buttonHome.setOnClickListener {
            // Navigate back to ManagerActivity
            val intent = Intent(this, ManagerActivity::class.java)
            startActivity(intent)
            finish() // Finish this activity to prevent going back to it on home button press
        }
    }
}

package com.example.ranstadfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var redButton = findViewById<Button>(R.id.buttonRed)
        var blueButton = findViewById<Button>(R.id.buttonBlue)

        redButton.setOnClickListener {
            var redFragment = RedFragment()
            var fragmentManager = supportFragmentManager
            // add, replace, remove
            var transactions = fragmentManager.beginTransaction()
            transactions.replace(R.id.fragmentContainerView, redFragment)
            transactions.commit()
        }

        blueButton.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, BlueFragment()).commit()
        }
    }
}
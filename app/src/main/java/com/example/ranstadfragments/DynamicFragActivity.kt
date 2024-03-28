package com.example.ranstadfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DynamicFragActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic_frag)

        supportFragmentManager.beginTransaction().add(R.id.myLayout, RedFragment()).commit()
    }
}
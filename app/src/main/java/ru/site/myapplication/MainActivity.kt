package ru.site.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener {
            Toast.makeText(this, "BUTTON ONE HAS BEEN PRESSED", Toast.LENGTH_SHORT).show()
        }
        button2.setOnClickListener {
            Toast.makeText(this, "BUTTON TWO HAS BEEN PRESSED", Toast.LENGTH_SHORT).show()
        }
        button3.setOnClickListener {
            Toast.makeText(this, "BUTTON THREE HAS BEEN PRESSED", Toast.LENGTH_SHORT).show()
        }
        button4.setOnClickListener {
            Toast.makeText(this, "BUTTON FOUR HAS BEEN PRESSED", Toast.LENGTH_SHORT).show()
        }
    }
}
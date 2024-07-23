package com.example.midtermcomplete

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalculator = findViewById<Button>(R.id.btnCalculator)
        val btnTodo = findViewById<Button>(R.id.btnTodo)
        val btnSubName = findViewById<Button>(R.id.btnSubName)
        val unameField =  findViewById<EditText>(R.id.uname)
        var uname: String = ""

        btnSubName.setOnClickListener {
            uname = unameField.text.toString()
        }

        btnCalculator.setOnClickListener {
            val intent = Intent(this, CalculatorActivity::class.java)
            intent.putExtra("username", uname)
            startActivity(intent)
        }

        btnTodo.setOnClickListener {
            val intent = Intent(this, TodoActivity::class.java)
            intent.putExtra("username", uname)
            startActivity(intent)
        }
    }
}

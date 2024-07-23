package com.example.midtermcomplete

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        val input1 = findViewById<EditText>(R.id.editText1)
        val input2 = findViewById<EditText>(R.id.editText2)
        val resultTV = findViewById<TextView>(R.id.resultView)
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnSubtract = findViewById<Button>(R.id.btnSubtract)
        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        val btnDivide = findViewById<Button>(R.id.btnDivide)


        val messageView = findViewById<TextView>(R.id.messageView)
        val uname: String = intent.getStringExtra("username").toString()
        messageView.text = "Hello, " + uname

        btnAdd.setOnClickListener(){
            val x = input1.text.toString().toIntOrNull()
            val y = input2.text.toString().toIntOrNull()
            if (x != null && y != null) {
                resultTV.text = performOperation(x, y, 1).toString()
            } else {
                resultTV.text = "Invalid input"
            }
        }

        btnSubtract.setOnClickListener(){
            val x = input1.text.toString().toIntOrNull()
            val y = input2.text.toString().toIntOrNull()

            if (x != null && y != null) {
                resultTV.text = performOperation(x, y, 2).toString()
            } else {
                resultTV.text = "Invalid input"
            }
        }

        btnMultiply.setOnClickListener(){
            val x = input1.text.toString().toIntOrNull()
            val y = input2.text.toString().toIntOrNull()
            if (x != null && y != null) {
                resultTV.text = performOperation(x, y, 3).toString()
            } else {
                resultTV.text = "Invalid input"
            }
        }

        btnDivide.setOnClickListener(){
            val x = input1.text.toString().toIntOrNull()
            val y = input2.text.toString().toIntOrNull()
            if (x != null && y != null) {
                resultTV.text = performOperation(x, y, 4).toString()
            } else {
                resultTV.text = "Invalid input"
            }
        }
    }

    private fun performOperation(firstNumber: Int, secondNumber: Int, operand: Int): Any{
        val result = when (operand) {
            1 -> firstNumber + secondNumber
            2 -> firstNumber - secondNumber
            3 -> firstNumber * secondNumber
            4 -> firstNumber / secondNumber
            else -> 0.0
        }
        return  result.toString()
    }

}

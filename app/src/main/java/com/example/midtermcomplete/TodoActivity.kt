package com.example.midtermcomplete

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TodoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todolist)

        val taskInput = findViewById<EditText>(R.id.taskInput)
        val taskList = findViewById<TextView>(R.id.taskList)
        val btnAddTask = findViewById<Button>(R.id.btnAddTask)
        val prioritySpinner = findViewById<Spinner>(R.id.prioritySpinner)

        val messageView = findViewById<TextView>(R.id.messageView)

        val uname: String = intent.getStringExtra("username").toString()
        messageView.text = "Hello, " + uname

        val priorities = arrayOf("High", "Medium", "Low")
        prioritySpinner.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, priorities)

        btnAddTask.setOnClickListener {
            val task = taskInput.text.toString()
            val priority = prioritySpinner.selectedItem.toString()
            taskList.append("$task ($priority)\n")
        }

        prioritySpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Do nothing
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                // Do something when an item is selected
            }
        }
    }
}

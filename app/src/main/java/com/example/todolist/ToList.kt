package com.example.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.content.Intent

class ToList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_to_list)

        val checkBtn = findViewById<Button>(R.id.checkBtn)
        val toListDate1 = findViewById<EditText>(R.id.date_to_list1)
        val toListTitle1 = findViewById<EditText>(R.id.title_to_list1)
        val toListDate2 = findViewById<EditText>(R.id.date_to_list2)
        val toListTitle2 = findViewById<EditText>(R.id.title_to_list2)

        val tlDate1 = toListDate1.text.toString()
        val tlTitle1 = toListTitle1.text.toString()
        val tlDate2 = toListDate2.text.toString()
        val tlTitle2 = toListTitle2.text.toString()


        checkBtn.setOnClickListener {


            val intentToList = Intent(this, MainActivity::class.java)
            intentToList.putExtra("tldate1",tlDate1)
            intentToList.putExtra("tltitle1",tlTitle1)
            intentToList.putExtra("tldate2",tlDate2)
            intentToList.putExtra("tltitle2",tlTitle2)
            startActivity(intentToList)

        }
    }
}
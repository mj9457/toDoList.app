package com.example.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class MainActivity : AppCompatActivity() {
    private val tag: String = "AfterLoginActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "To Do List"
        val todoAddBtn = findViewById<Button>(R.id.toListBtn)

        val toListCheckBox1 = findViewById<CheckBox>(R.id.toListCheckBox1)
        val toListCheckBox2 = findViewById<CheckBox>(R.id.toListCheckBox2)

        val doListCheckBox1 = findViewById<CheckBox>(R.id.doListCheckBox1)
        val doListCheckBox2 = findViewById<CheckBox>(R.id.doListCheckBox2)

        /* to list 추가하기  */
        todoAddBtn.setOnClickListener {
            val intent = Intent(this, ToList::class.java)
            startActivity(intent)
        }

        /* 추가한 to list 출력 */
        val tlDate1 = intent.getStringExtra("tldate1")
        val tlTitle1 = intent.getStringExtra("tltitle1")
        val tlDate2 = intent.getStringExtra("tldate2")
        val tlTitle2 = intent.getStringExtra("tltitle2")

        var count1 = 0;
        var count2 = 0;

        if(intent.hasExtra("tlDate1") && intent.hasExtra("tlTitle1")){
            toListCheckBox1.text = getString(R.string.to_list_name, "tldate1", "tltitle1")
        }

        if ( intent.hasExtra("tlDate2") && intent.hasExtra("tlTitle2")) {
            toListCheckBox2.text = getString(R.string.to_list_name, "tldate2", "tltitle2")
        }
        toListCheckBox1.setOnClickListener { view ->
            count1++;
            if( count1 > 1) {
                toListCheckBox1.text = ""
                toListCheckBox1.isChecked = false
            } else {
                doListCheckBox1.text = getString(R.string.to_list_name, "tldate1", "tltitle1")
                toListCheckBox1.text = ""
                toListCheckBox1.isChecked = false
            }

        }

        doListCheckBox1.setOnClickListener { view ->
            doListCheckBox1.text = ""
            doListCheckBox1.isChecked = false
        }

        toListCheckBox2.setOnClickListener { view ->
            count2++;
            if ( count2 > 1) {
                toListCheckBox2.text = ""
                toListCheckBox2.isChecked = false
            } else{
                doListCheckBox2.text = getString(R.string.to_list_name, "tldate2", "tltitle2")
                toListCheckBox2.text = ""
                toListCheckBox2.isChecked = false
            }
        }

        doListCheckBox2.setOnClickListener { view ->
            doListCheckBox2.text = ""
            doListCheckBox2.isChecked = false
        }

    }
}
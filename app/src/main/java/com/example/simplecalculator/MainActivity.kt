package com.example.simplecalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.coroutines.newFixedThreadPoolContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addNumbers()
        subNumbers()
        multiplyNums()
        modulusNums()



    }
    fun addNumbers(){
        var num1 = findViewById<EditText>(R.id.etNumber1)
        var num2 = findViewById<EditText>(R.id.etNumber2)
        var button = findViewById<Button>(R.id.btnAdd)

        button.setOnClickListener {

            var sum = num1.text.toString().toInt()
            var sum2 = num2.text.toString().toInt()
            var res = sum+sum2

            Toast.makeText(this,  "$res", Toast.LENGTH_LONG).show()
        }
    }
    fun subNumbers(){
        var num1 = findViewById<EditText>(R.id.etNumber1)
        var num2 = findViewById<EditText>(R.id.etNumber2)
        var button = findViewById<Button>(R.id.btnSubtract)

        button.setOnClickListener {

            var sum = num1.text.toString().toInt()
            var sum2 = num2.text.toString().toInt()
            var res = sum-sum2

            Toast.makeText(this,  "$res", Toast.LENGTH_LONG).show()
        }
    }
    fun multiplyNums(){
        var num1 = findViewById<EditText>(R.id.etNumber1)
        var num2 = findViewById<EditText>(R.id.etNumber2)
        var button = findViewById<Button>(R.id.btnMultiply)

        button.setOnClickListener {

            var sum = num1.text.toString().toInt()
            var sum2 = num2.text.toString().toInt()
            var res = sum*sum2

            Toast.makeText(this,  "$res", Toast.LENGTH_LONG).show()
        }
    }
    fun modulusNums(){
        var num1 = findViewById<EditText>(R.id.etNumber1)
        var num2 = findViewById<EditText>(R.id.etNumber2)
        var button = findViewById<Button>(R.id.btnModulus)

        button.setOnClickListener {

            var sum = num1.text.toString().toInt()
            var sum2 = num2.text.toString().toInt()
            var res = sum%sum2

            Toast.makeText(this,  "$res", Toast.LENGTH_LONG).show()
        }
    }



    }


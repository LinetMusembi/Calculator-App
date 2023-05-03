package com.example.simplecalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.coroutines.newFixedThreadPoolContext

class MainActivity : AppCompatActivity() {
     lateinit var btnAdd:Button
     lateinit var btnSubtract:Button
     lateinit var btnMultiply:Button
     lateinit var btnModulus:Button
     lateinit var textView: TextView
   lateinit var etNumber1:EditText
   lateinit var etNumber2:EditText
   lateinit var number: Number




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd=findViewById(R.id.btnAdd)
        btnSubtract=findViewById(R.id.btnSubtract)
        btnMultiply=findViewById(R.id.btnMultiply)
        btnModulus=findViewById(R.id.btnModulus)
        textView=findViewById(R.id.answer)
        etNumber1=findViewById(R.id.etNumber1)
        etNumber2=findViewById(R.id.etNumber2)

    }

    override fun onResume() {

    }


    }


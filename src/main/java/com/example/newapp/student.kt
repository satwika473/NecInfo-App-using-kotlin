package com.example.newapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class student : AppCompatActivity() {
    lateinit var butn1:Button
    lateinit var butn2:Button
    lateinit var butn3:Button
    lateinit var butn4:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)
        butn1=findViewById(R.id.btn1)
        butn2=findViewById(R.id.bt2)
        butn3=findViewById(R.id.bt3)
        butn4=findViewById(R.id.bt4)
        butn1.setOnClickListener{
            val i= Intent(this,stuf1::class.java)
            startActivity(i)
        }
        butn2.setOnClickListener{
            val i= Intent(this,stuf1::class.java)
            startActivity(i)
        }
        butn3.setOnClickListener{
            val i= Intent(this,stuf1::class.java)
            startActivity(i)
        }
        butn4.setOnClickListener{
            val i= Intent(this,stuf1::class.java)
            startActivity(i)
        }

    }
}
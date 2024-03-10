package com.example.newapp
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Home : AppCompatActivity() {
lateinit var bt1: Button
lateinit var bt2:Button
lateinit var bt3:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        bt1=findViewById(R.id.b1)
        bt2=findViewById(R.id.b2)
        bt3=findViewById(R.id.b3)
        bt1.setOnClickListener{
            val intent = Intent(this,Bus::class.java)
            startActivity(intent)
        }
        bt2.setOnClickListener{
            val intent = Intent(this,student::class.java)
            startActivity(intent)
        }
        bt3.setOnClickListener{
            val intent = Intent(this,faculty::class.java)
            startActivity(intent)
        }

    }
}
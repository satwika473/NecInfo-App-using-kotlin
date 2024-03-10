package com.example.newapp

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class facf1 : AppCompatActivity() {
    lateinit var phbtn:Button
    private val phoneNumber="9885271324"
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facf1)
        phbtn=findViewById(R.id.phno)
        phbtn.setOnClickListener{
            val dialerIntent = Intent(Intent.ACTION_DIAL)
            dialerIntent.data = Uri.parse("tel:$phoneNumber")

            startActivity(dialerIntent)
        }
    }
}
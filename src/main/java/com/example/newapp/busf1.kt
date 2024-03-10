package com.example.newapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class busf1 : AppCompatActivity() {
    lateinit var phbtn:Button
    private val phoneNumber="9452345781"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_busf1)
        phbtn=findViewById(R.id.phno)
        phbtn.setOnClickListener{
            val dialerIntent = Intent(Intent.ACTION_DIAL)
            dialerIntent.data = Uri.parse("tel:$phoneNumber")

            startActivity(dialerIntent)
        }
    }
}
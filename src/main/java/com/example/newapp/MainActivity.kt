package com.example.newapp
import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

  lateinit var loginButton: Button
    lateinit var google: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loginButton=findViewById(R.id.buttonLogin)
        val googleButton: View = findViewById(R.id.gbtn)
        loginButton.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
      googleButton.setOnClickListener{
          val googleAccountsIntent = Intent(
              Intent.ACTION_VIEW,
              Uri.parse("https://accounts.google.com/")
          )


          startActivity(googleAccountsIntent)
      }

    }
}







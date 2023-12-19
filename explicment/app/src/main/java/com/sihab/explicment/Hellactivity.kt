package com.sihab.explicment

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Hellactivity : AppCompatActivity() {
    private lateinit var gobut2: Button
    private lateinit var tebut2: TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hellactivity)

        gobut2 = findViewById(R.id.button2)
        tebut2 = findViewById(R.id.tev)


        var massage = intent.getStringArrayExtra("massage")
         tebut2.text = massage.toString()
        tebut2.setOnClickListener {
           startActivity(Intent(this@Hellactivity,MainActivity::class.java))
//            finish()
        }

    }
}
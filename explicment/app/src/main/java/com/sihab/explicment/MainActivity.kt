package com.sihab.explicment

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var gobut:Button
    private lateinit var tebut:EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gobut = findViewById(R.id.button)
        tebut = findViewById(R.id.tex)

        gobut.setOnClickListener {
            var massage = tebut.text.toString()
            var intent = Intent(this@MainActivity, Hellactivity::class.java)
            intent.putExtra("massage",massage)
            startActivity(intent)
//            finish()
        }

    }
}


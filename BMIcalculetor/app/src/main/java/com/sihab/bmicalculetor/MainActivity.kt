package com.sihab.bmicalculetor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

//    private lateinit var weightTxt: EditText
//    private lateinit var heightTxt: EditText
//    private lateinit var calBtn: Button
//    private lateinit var countTxt: TextView
//    private lateinit var resultTxt: TextView
//    private lateinit var rangeTxt: TextView
//    override fun onCreate(savedInstanceState:

    private lateinit var ojon:TextView
    private lateinit var zero:EditText
    private lateinit var kgt:TextView
    private lateinit var uccota:TextView
    private lateinit var zero2:EditText
    private lateinit var kgt2:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        weightTxt = findViewById(R.id.wightEt)
//        heightTxt = findViewById(R.id.hightEt)
//        calBtn = findViewById(R.id.calBtn)
//        countTxt = findViewById(R.id.countTxt)
//        resultTxt = findViewById(R.id.resultTxt)
//        rangeTxt = findViewById(R.id.rangeTxt)

        ojon = findViewById(R.id.ওজন)
        zero = findViewById(R.id.zeroo)
        kgt = findViewById(R.id.KGt)
        uccota = findViewById(R.id.`উচ্চত`)
        zero2 = findViewById(R.id.zeroo2)
        kgt2 = findViewById(R.id.KGt2)


        coolbut.setOnClickListener{

            val
        }


//        calBtn.setOnClickListener {
//            val weight = weightTxt.text.toString()
//            val height = heightTxt.text.toString()
//
//            if (validateInput(weight, height)) {
//                val bmi = weight.toFloat() / ((height.toFloat() / 100) * (height.toFloat() / 100))
//
//                val bmiDigit = String.format("%.2f", bmi).toFloat()
//
//                displayResult(bmiDigit)
//            }
//        }

    }
}
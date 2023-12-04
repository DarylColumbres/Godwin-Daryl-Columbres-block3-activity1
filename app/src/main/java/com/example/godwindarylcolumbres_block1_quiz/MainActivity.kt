package com.example.godwindarylcolumbres_block1_quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstNumber: EditText = findViewById(R.id.et_firstNumber)
        val secondNumber: EditText = findViewById(R.id.et_secondNumber)
        val thirdNumber: EditText = findViewById(R.id.et_thirdNumber)
        val fourthNumber: EditText = findViewById(R.id.et_fourthNumber)
        val fifthNumber: EditText = findViewById(R.id.et_fifthNumber)

        val btCompute: Button = findViewById(R.id.bt_sum)
        val txNumber: TextView = findViewById(R.id.et_result)

        txNumber.text = resources.getString(R.string.et_calculate)

        btCompute.setOnClickListener {
            val sum = (firstNumber.text.toString().toInt() +
                    secondNumber.text.toString().toInt() +
                    thirdNumber.text.toString().toInt() +
                    fourthNumber.text.toString().toInt() +
                    fifthNumber.text.toString().toInt()).toString()
            txNumber.text = sum
        }
    }
}
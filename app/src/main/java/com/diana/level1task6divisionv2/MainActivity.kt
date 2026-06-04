package com.diana.level1task6divisionv2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextA = findViewById<EditText>(R.id.editTextA)
        val editTextB = findViewById<EditText>(R.id.editTextB)
        val buttonDivide = findViewById<Button>(R.id.buttonDivide)
        val textViewResult = findViewById<TextView>(R.id.textViewResult)

        buttonDivide.setOnClickListener {

            val a = editTextA.text.toString().toDoubleOrNull()
            val b = editTextB.text.toString().toDoubleOrNull()

            if (a == null || b == null) {
                textViewResult.text = "Помилка: введіть числа"
                return@setOnClickListener
            }

            if (b == 0.0) {
                textViewResult.text = "Помилка: ділення на нуль"
                return@setOnClickListener
            }

            val result = a / b

            textViewResult.text = "Результат: $result"
        }
    }
}
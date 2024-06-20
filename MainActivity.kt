package com.example.applicationsss

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.applicationsss.models.Calculator

class MainActivity : AppCompatActivity() {

    lateinit var editNumber1:EditText
    lateinit var editNumber2:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


            editNumber1 = findViewById(R.id.number1)
            editNumber2 = findViewById(R.id.number2)
        }

    fun buttonClick(v: View){
        var ans = 0.0
        val calculator = Calculator(
            editNumber1.text.toString().toDouble(),
            editNumber2.text.toString().toDouble()
        )

        when(v.id){
            R.id.add -> ans = calculator.add()
            R.id.minus -> ans = calculator.subtract()
            R.id.multi -> ans = calculator.multiply()
            R.id.divide -> ans = calculator.divide()
        }

        Toast.makeText(this, "Answer = $ans",Toast.LENGTH_LONG).show()
    }
    }



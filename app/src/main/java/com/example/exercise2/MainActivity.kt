package com.example.exercise2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //lateinit var bmiImage : imageViewProfile

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.buttonCalculate).setOnClickListener {
            BMI()
        }
        //bmiImage = findViewById(R.drawable.under)
    }
        private fun BMI(){
            val weight = findViewById<EditText>(R.id.editTextWeight)
            val height = findViewById<EditText>(R.id.editTextHeight)

            val bmi = findViewById<TextView>(R.id.textViewBMI)
            //val type = findViewById<TextView>(R.id.type)

            val num1: Float = weight.text.toString().toFloat()
            val num2: Float = height.text.toString().toFloat()

            val total1: Float = num2/100
            val total3: Float = total1*total1
            val total2: Float = num1/total3

            bmi.setText(total2.toString())

            if(total2<18.5){
                //type.setText("Underweight")
                imageViewProfile.setImageResource(R.drawable.under)
            }else if(total2 > 18.5 && total2 < 24.9){
                //type.setText("Normal")
                imageViewProfile.setImageResource(R.drawable.normal)
            }else if(total2>=25)
                //type.setText("overweight")
                imageViewProfile.setImageResource(R.drawable.over)


        }
    }


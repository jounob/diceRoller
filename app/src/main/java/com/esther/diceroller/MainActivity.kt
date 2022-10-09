package com.esther.diceroller

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        val countButton: Button = findViewById(R.id.btnCount)
        val resetButton: Button = findViewById(R.id.btnReset)

        rollButton.setOnClickListener { rollDice() }
        //countButton.setOnClickListener { count() }
         //resetButton.setOnClickListener { reset() }
    }

    private fun rollDice(){
        val randomInt = (1..6).random()
        val ivDice: ImageView = findViewById(R.id.ivDice)
       val drawableResource = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else->R.drawable.dice_6
        }
        ivDice.setImageResource(drawableResource)
    }

//    private fun count() {
//        val nameTV: TextView = findViewById(R.id.tvName)
//        if(nameTV.text == "Hello World!"){
//            nameTV.text = "1"
//        }
//        else{
//            var intName = nameTV.text.toString().toInt()
//            if (intName!=6){
//                intName++
//                nameTV.text = intName.toString()
//            }
//        }
//    }
//    private fun reset(){
//        val nameTV: TextView = findViewById(R.id.tvName)
//        nameTV.text = "0"
//    }
}


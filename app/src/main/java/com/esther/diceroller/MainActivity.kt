package com.esther.diceroller

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var ivDice: ImageView
    private lateinit var ivDice2: ImageView
    private lateinit var rollButton: Button
    private lateinit var resetButton: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollButton = findViewById(R.id.roll_button)
        ivDice = findViewById(R.id.ivDice)
        ivDice2 = findViewById(R.id.ivDice2)
        //val countButton: Button = findViewById(R.id.prbtnCount)
        resetButton = findViewById(R.id.btnReset)

        rollButton.setOnClickListener {
            rollDice1()
        }
        //countButton.setOnClickListener { count() }
        resetButton.setOnClickListener { reset() }
    }

    private fun rollDice1() {
        ivDice.setImageResource(getRandomImage())
        ivDice2.setImageResource(getRandomImage())
    }

    private fun getRandomImage(): Int {
        val drawableResource = when ((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        return drawableResource
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
    private fun reset() {
        ivDice.setImageResource(R.drawable.empty_dice)
        ivDice2.setImageResource(R.drawable.empty_dice)
    }
}


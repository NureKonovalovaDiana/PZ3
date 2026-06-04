package com.diana.level2task6dice

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonRoll = findViewById<Button>(R.id.buttonRoll)

        val textViewPlayer1 =
            findViewById<TextView>(R.id.textViewPlayer1)

        val textViewPlayer2 =
            findViewById<TextView>(R.id.textViewPlayer2)

        val textViewWinner =
            findViewById<TextView>(R.id.textViewWinner)

        buttonRoll.setOnClickListener {

            val player1 = Random.nextInt(1, 7)

            val player2 = Random.nextInt(1, 7)

            textViewPlayer1.text =
                getString(R.string.player1_result, player1)

            textViewPlayer2.text =
                getString(R.string.player2_result, player2)

            when {
                player1 > player2 ->
                    textViewWinner.text =
                        getString(R.string.winner1)

                player2 > player1 ->
                    textViewWinner.text =
                        getString(R.string.winner2)

                else ->
                    textViewWinner.text =
                        getString(R.string.draw)
            }
        }
    }
}
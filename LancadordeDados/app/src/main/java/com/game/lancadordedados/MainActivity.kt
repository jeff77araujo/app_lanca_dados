package com.game.lancadordedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // apertar o botão, para lançar o dado 1 e 2
        findViewById<Button>(R.id.jogar).setOnClickListener {
            findViewById<TextView>(R.id.dado1).text = lancarDados().toString()
            findViewById<TextView>(R.id.dado2).text = lancarDados().toString()
        }
    }
    fun lancarDados(): Int {
        return (1..6).random()
    }
}
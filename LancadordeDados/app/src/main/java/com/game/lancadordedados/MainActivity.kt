package com.game.lancadordedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // apertar o botão, para lançar o dado 1 e 2
        findViewById<Button>(R.id.buttonJogar).setOnClickListener {
            
        }
    }
    fun lancarDados(): Int {
        return (1..6).random()
    }
}
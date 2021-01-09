package com.game.lancadordedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoLancarDados = findViewById<Button>(R.id.buttonLancar)
        val imgDado1 = findViewById<ImageView>(R.id.imageDado1)
        val imgDado2 = findViewById<ImageView>(R.id.imageDado2)

        botaoLancarDados.setOnClickListener {
            imgDado1.setImageResource(lancaDado())
            imgDado2.setImageResource(lancaDado())
        }

        val nomeJogador = getIntent().getStringExtra("nomeDoJogador")
        val nomeNaTela = findViewById<TextView>(R.id.textoNome)
        nomeNaTela.text = "Olá, $nomeJogador"
    }

    fun lancaDado(): Int {
        return recuperaFaceDado(gerarNumero())
    }


    fun recuperaFaceDado(valor: Int): Int {
        return when(valor) {
            1 -> R.drawable.dado1
            2 -> R.drawable.dado2
            3 -> R.drawable.dado3
            4 -> R.drawable.dado4
            5 -> R.drawable.dado5
            else -> R.drawable.dado6
        }
    }

    fun gerarNumero(): Int {
        return (1..6).random()
    }
}
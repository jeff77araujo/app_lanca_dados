package com.game.lancadordedados

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        val botaoJogar = findViewById<Button>(R.id.buttonJogar)
        botaoJogar.setOnClickListener {
            val nomeDoJogador = findViewById<EditText>(R.id.inputNome).text.toString()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("nomeDoJogador", nomeDoJogador)

            startActivity(intent)
        }
    }
}
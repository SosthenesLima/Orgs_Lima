package com.sosthenes.orgs_lima

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.sosthenes.orgs_lima.R.id.nome


class MainActivity: Activity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            val nome = findViewById<TextView>(R.id.nome)
            nome.setText("cesta de frutas")
            val descricao = findViewById<TextView>(R.id.descricao)
            descricao.setText("Laranja, manga, uva")
            val valor = findViewById<TextView>(R.id.valor)
            valor.setText("19.99")
    }

}
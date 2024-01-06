
//Inserir Nome do Pacote
// Patos Bons - 29/12/2023
// Juazero do norte - CE 30/12/2023
// Maragogi - AL - 31/12/2023
// Tamandaré - PE - 01/01/2024
// Tamandaré - PE - 02/01/2024
// Tamandaré - PE - 03/01/2024
// Porto de Galinhas - PE - 03/01/2024
// Porto de Galinhas - PE - 04/01/2024
// Ouricuri - PE - 05/01/2024
// Balsas - MA - 06/01/2024

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
            descricao.setText("Tangirina, manga, morango, pera, melão, Jaca")
            val valor = findViewById<TextView>(R.id.valor)
            valor.setText("69.00")
    }

}
package com.lucky17.Orgs

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val IdCesta = findViewById<TextView>(R.id.cesta)
        IdCesta.text = "Cesta de frutas"

        val IdDescricao = findViewById<TextView>(R.id.descricao)
        IdDescricao.text = "Laranja manga e uva"

        val IdPreco = findViewById<TextView>(R.id.preco)
        IdPreco.text = "19.99"
    }
}
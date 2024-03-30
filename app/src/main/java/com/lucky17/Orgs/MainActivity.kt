package com.lucky17.Orgs

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast

class MainActivity : Activity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this,"Bem vindo ao Android",Toast.LENGTH_LONG).show()
    }
}
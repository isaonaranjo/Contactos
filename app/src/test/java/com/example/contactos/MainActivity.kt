package com.example.contactos

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    // Definicion de las variables

    lateinit var agregar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Creacion de las variables

        agregar = findViewById<View>(R.id.button) as Button


        // Direccionar boton agregar
        agregar.setOnClickListener {
            val agregar = Intent(this@MainActivity, CrearContacto::class.java)
            startActivity(agregar)
        }

    }
}

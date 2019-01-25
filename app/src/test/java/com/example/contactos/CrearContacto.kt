package com.example.contactos

import android.content.Intent
import android.os.Bundle
import android.support.annotation.StringRes
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

class CrearContacto : AppCompatActivity() {

    // Constructor

    lateinit var regresar: Button
    lateinit var crear: Button
    internal var adapter: ArrayAdapter<String>? = null
    var lista: ListView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_contacto)

        // Definicion de variables
        regresar = findViewById<View>(R.id.button2) as Button
        crear = findViewById<View>(R.id.button3) as Button

        crear.setOnClickListener {
            val crear = Intent(this@CrearContacto, VerContacto::class.java)
            startActivity(crear)
        }

        // Metodo para regresar a ver los contactos
        regresar.setOnClickListener {
            val regresar = Intent(this@CrearContacto, MainActivity::class.java)

            startActivity(regresar)
        }
    }
}




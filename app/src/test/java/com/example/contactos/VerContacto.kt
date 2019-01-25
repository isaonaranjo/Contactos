package com.example.contactos

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.Button

class VerContacto : AppCompatActivity() {
    // Definicion de las variables

    var Nombre: Button
    var Llamar: Button
    var Correo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ver_contacto)
        // Creacion de las variables

        Nombre = findViewById<View>(R.id.button4) as Button
        Llamar = findViewById<View>(R.id.button5) as Button
        Correo = findViewById<View>(R.id.button6) as Button

        Nombre.setOnClickListener {
            val Nombre = Intent(this@VerContacto, Nombre::class.java)
            startActivity(Nombre)
        }

    }
}

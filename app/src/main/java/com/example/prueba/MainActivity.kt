package com.example.prueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.prueba.databinding.OtraVistaBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val otraVista = OtraVistaBinding.inflate(layoutInflater)
        setContentView(otraVista.root)
        otraVista.nombre.setTextColor(R.color.blue)
        val texto = findViewById<TextView>(R.id.ejemplo)
        texto.text="Hola gente!"

        otraVista.volver.
    }
}
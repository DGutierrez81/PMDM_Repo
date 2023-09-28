package com.dgutierrez.actividad1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text = findViewById<TextView>(R.id.text)
        val button = findViewById<Button>(R.id.button)
        var contador = 0

        button.setOnClickListener {
            contador++
            if(contador <= 5){
                text.text = "Has hecho click $contador vez!"
                text.textSize = 22.toFloat()
            }else{
                text.text = "Has hecho click varias veces ($contador)!"
            }
            if(contador > 10){
                text.text = "Te has pasado de clicks!"
                button.isEnabled = false
                Toast.makeText(this,"El botón ha quedado deshabilitado",Toast.LENGTH_LONG).show()
            }

        }

    }
}
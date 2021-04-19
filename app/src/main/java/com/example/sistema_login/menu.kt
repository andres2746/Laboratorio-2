package com.example.sistema_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_menu.*

class menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        mostrar_correo.setText("Bienvenido: " + usuario)
        textView11.setText("Ciudad: " + city)
        textView12.setText("Instrumento: " + instrument)

    }

    override fun onBackPressed() {

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean{
        menuInflater.inflate(R.menu.menu_sesion, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            R.id.cerrar_sesion -> {
                Handler().postDelayed({
                    val intent = Intent(this,Splash::class.java)
                    startActivity(intent)
                    finish()
                },1)
            }

         else -> super.onOptionsItemSelected(item)

        }
    }

}
package com.example.sistema_login


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_registros.*
import kotlinx.android.synthetic.main.activity_splash.*

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        registro.setOnClickListener(){
            Handler().postDelayed({
                val intent = Intent(this,registros::class.java)
                startActivity(intent)
            },1)
        }

        login.setOnClickListener(){

            if(editTextTextEmailAddress.text.toString() == usuario && pass.text.toString() == contra){
                Handler().postDelayed({
                    val intent = Intent(this,menu::class.java)
                    startActivity(intent)
                    finish()
                },1)
            }
            else{
                textView8.setText("Datos incorrectos, intentelo de nuevo o registrese")
            }
        }


    }
    override fun onBackPressed() {

    }

}
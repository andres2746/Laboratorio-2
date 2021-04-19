package com.example.sistema_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_registros.*
import kotlinx.android.synthetic.main.activity_splash.*
var city = String()
var instrument = String()
var usuario = String()
var contra = String()

class registros : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registros)
        registro_completo.setOnClickListener(){
            if(pass1.text.toString() == pass2.text.toString() && pass1.text.toString().length > 5){
                contra = pass1.text.toString()
                usuario = mail.text.toString()
                Handler().postDelayed({
                    val intent = Intent(this,Splash::class.java)
                    startActivity(intent)
                    finish()
                },1)
            }
            else{
                textView7.setText("Contraseña no coincide o ha ingresado menos de 6 caracteres")
            }
            }
        }


    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            val checked = view.isChecked
            when (view.getId()) {
                R.id.medellin -> if (checked) {city = "Medellin"}
                R.id.bogota -> if (checked) {city = "Bogota"}
                R.id.cartagena -> if (checked) {city = "Cartagena"}
                R.id.leticia -> if (checked) {city = "Leticia"}
            }
        }
    }
    fun onRadioButtonClicked1(view: View) {
        if (view is RadioButton) {
            val checked = view.isChecked
            when (view.getId()) {
                R.id.piano -> if (checked) {instrument = "Piano"}
                R.id.guitarra -> if (checked) {instrument = "Guitarra"}
                R.id.violin -> if (checked) {instrument = "Violin"}
                R.id.bajo -> if (checked) {instrument = "Bajo"}
            }
        }
    }

}
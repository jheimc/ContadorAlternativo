package com.example.contadoralternativo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    private var boton:Button?=null
    private var texto:TextView?=null

    var contadorNuevo = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var entradaUsuario: EditText? = null

        boton = findViewById<Button>(R.id.botoncito)
        entradaUsuario = findViewById<EditText>(R.id.editText)
        texto = findViewById<TextView>(R.id.textView)

        boton?.setOnClickListener(object : View.OnClickListener {

            override fun onClick(v: View?) {



                contadorNuevo +=1
                if(contadorNuevo== 1){
                    texto?.append("usuario: ${entradaUsuario.text.toString()}!!  boton se ha clickeado $contadorNuevo vez\n")
                }else{
                    texto?.append("usuario: ${entradaUsuario.text.toString()}!!  boton se ha clickeado $contadorNuevo veces\n")

                }


                if(contadorNuevo== 10){
                    Toast.makeText(this@MainActivity,"se clickeo el boton $contadorNuevo veces",Toast.LENGTH_SHORT).show()

                }


            }

        })

    }

    private fun avisoEmergente(view:View){

        Toast.makeText(this,"se boton se ha clickeado 10 veces",Toast.LENGTH_SHORT).show()
    }
}

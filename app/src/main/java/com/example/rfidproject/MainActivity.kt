package com.example.rfidproject

import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import org.json.JSONObject


import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest

class MainActivity : AppCompatActivity() {

    private lateinit var btnLogin:Button
    private lateinit var username:EditText
    private lateinit var password:EditText

    var sesion: SharedPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        username = findViewById(R.id.txtMail)
        password = findViewById(R.id.txtPassword)
        btnLogin = findViewById(R.id.btnLogin)

        //archivo xml para guardar el token
        sesion = getSharedPreferences("sesion", 0)

        btnLogin.setOnClickListener {
            val user = username.text.toString().trim()
            val pass = password.text.toString().trim()

            if (user.isEmpty()){
                username.error = "Ingresa el usuario"
            }else if(pass.isEmpty()){
                username.error = "Ingresa la clave"
            }else{
                login()
            }
        }
    }

    private fun login() {
        val url = Uri.parse(Config.URL+"login")
            .buildUpon()
            .build().toString()

        val dato: JSONObject = JSONObject()
        dato.put("username", username?.text.toString())
        dato.put("password", password?.text.toString())

        val peticion = JsonObjectRequest(
            Request.Method.POST, url, dato,
            {
                    res -> respuesta(res)
            },
            {
                Toast.makeText(this, "Error en la peticion", Toast.LENGTH_SHORT).show()
            })

        MySingleton.getInstance(applicationContext).addToRequestQueue(peticion)
    }

    private fun respuesta(res: JSONObject) {
        with(sesion!!.edit()){
            putString("token", res.getString("jwt"))
            putString("user", username.text.toString())
            apply()
        }
        Toast.makeText(this, "Bienvenido ${username.text.toString()}", Toast.LENGTH_SHORT).show()
        startActivity(Intent(this, Sensors::class.java))
    }

}
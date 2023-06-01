package com.example.rfidproject

import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.JsonObjectRequest
import org.json.JSONArray
import org.json.JSONObject

class Sensors : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    lateinit var sesion: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sensors)

        sesion = getSharedPreferences("sesion", 0)
        supportActionBar!!.title = "Sensores:" + sesion.getString("user", "")

        //bRefresh = findViewById(R.id.bRefresh)
        recyclerView = findViewById(R.id.recyclerView)

        recyclerView.setHasFixedSize(true)
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.layoutManager = LinearLayoutManager(this)
        llenar()
        //bRefresh.setOnClickListener { llenar() }
    }



    private fun llenar() {
        val url = Uri.parse(Config.URL+"sensors")
            .buildUpon()
            .build().toString()
        val peticion = object: JsonArrayRequest(
            Method.GET, url, null,
            {
                    res -> llenarRespuesta(res)
            },
            {
                Toast.makeText(this, "Error en la peticion", Toast.LENGTH_SHORT).show()
            }
        ){
            override fun getHeaders(): MutableMap<String, String> {
                val header: MutableMap<String, String> = HashMap()
                header["Authorization"] = "Bearer " + sesion.getString("token", "")
                return header
            }
        }
        MySingleton.getInstance(applicationContext).addToRequestQueue(peticion)
    }

    private fun llenarRespuesta(res: JSONArray) {
        val lista = Array(res.length()){ arrayOfNulls<String>(2) }
        for(i in 0 until res.length()){
            //Log.d("ARRAY", res.getJSONObject(i).getString("id"))
            lista[i][0] = res.getJSONObject(i).getString("monto")
            lista[i][1] = res.getJSONObject(i).getString("fecha")
        }
        recyclerView.adapter = MyAdapter(lista)
    }


}
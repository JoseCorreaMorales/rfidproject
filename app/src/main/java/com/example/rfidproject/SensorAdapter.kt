package com.example.rfidproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val datos: Array<Array<String?>>):
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    inner class ViewHolder(itemSensor: View): RecyclerView.ViewHolder(itemSensor) {
        //lateinit var tvId: TextView
        lateinit var monto: TextView
        lateinit var fecha: TextView
        init {
            //tvId = itemSensor.findViewById(R.id.tvId)
            monto = itemSensor.findViewById(R.id.monto)
            fecha = itemSensor.findViewById(R.id.fecha)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemSensor: View = LayoutInflater.from(parent.context).
        inflate(R.layout.each_item, parent, false)
        return ViewHolder(itemSensor)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //holder.tvId.text = datos[position][0]
        holder.monto.text = datos[position][0]
        holder.fecha.text = datos[position][1]
    }

    override fun getItemCount(): Int {
        return datos.size
    }
}
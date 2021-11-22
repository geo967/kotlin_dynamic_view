package com.example.movingview_kotlin.FruitAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.movingview_kotlin.R
import com.example.movingview_kotlin.model.FruitsData

class FruitsAdapter(private val fruitsList:List<FruitsData>):RecyclerView.Adapter<FruitsAdapter.FruitsViewHolder>() {
    inner class FruitsViewHolder(v: View):RecyclerView.ViewHolder(v){
        val fruitsName: TextView =v.findViewById(R.id.fruit_name_id)
        val fruitsCal: TextView =v.findViewById(R.id.fruit_cal_id)
        val fruitsImg: ImageView =v.findViewById(R.id.fruit_image_id)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitsViewHolder {
        val inflater=LayoutInflater.from(parent.context)
        val v=inflater.inflate(R.layout.item_design,parent,false)
        return FruitsViewHolder(v)
    }

    override fun onBindViewHolder(holder: FruitsViewHolder, position: Int) {
       val fruitsList=fruitsList[position]
        holder.fruitsName.text=fruitsList.fruitsName
        holder.fruitsCal.text=fruitsList.fruitsInfo
        holder.fruitsImg.setImageResource(fruitsList.fruitsImage)
    }

    override fun getItemCount(): Int {
        return fruitsList.size
    }

}
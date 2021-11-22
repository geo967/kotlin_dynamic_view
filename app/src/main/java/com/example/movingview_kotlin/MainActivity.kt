package com.example.movingview_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.movingview_kotlin.FruitAdapter.FruitsAdapter
import com.example.movingview_kotlin.model.FruitsData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var fruitsAdapter:FruitsAdapter
    private lateinit var fruitsData: ArrayList<FruitsData>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fruitsData= ArrayList<FruitsData>()
        fruitsAdapter= FruitsAdapter(fruitsData)

        flowers_recycler_id.layoutManager=LinearLayoutManager(this)
        flowers_recycler_id.adapter=fruitsAdapter
        fruitsList()
    }

    fun fruitsList(){
        fruitsData.add(FruitsData(R.drawable.flower1,"asasas","100kg"))
        fruitsData.add(FruitsData(R.drawable.flower2,"asdsd","100kg"))
        fruitsData.add(FruitsData(R.drawable.flower3,"erege","100kg"))
        fruitsData.add(FruitsData(R.drawable.flower4,"dbdbdf","100kg"))
        fruitsData.add(FruitsData(R.drawable.flower5,"adfdfdfdf","100kg"))
        fruitsData.add(FruitsData(R.drawable.flower6,"asasdfvegvetas","100kg"))
        fruitsData.add(FruitsData(R.drawable.flower7,"asasegvevevas","100kg"))
        fruitsData.add(FruitsData(R.drawable.flower8,"asasergergas","100kg"))
        fruitsData.add(FruitsData(R.drawable.flower9,"asasergergas","100kg"))

    }
}
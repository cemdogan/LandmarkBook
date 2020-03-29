package com.example.landmarkbook

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var landmarkNames = ArrayList<String>()
        landmarkNames.add("Pisa")
        landmarkNames.add("Colloseum")
        landmarkNames.add("Eiffel")
        landmarkNames.add("London Bridge")

        val pisaId = R.drawable.pisa
        val colosseumId = R.drawable.colosseum
        val eiffelId = R.drawable.eiffel
        val londonBridgeId = R.drawable.londonbridge

        var landmarkIds = ArrayList<Int>()
        landmarkIds.add(pisaId)
        landmarkIds.add(colosseumId)
        landmarkIds.add(eiffelId)
        landmarkIds.add(londonBridgeId)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, landmarkNames)
        listView.adapter = adapter

        listView.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                var intent = Intent(applicationContext, DetailActivity::class.java)

                intent.putExtra("name", landmarkNames[position])
                intent.putExtra("id", landmarkIds[position])

                startActivity(intent)
            }
    }
}

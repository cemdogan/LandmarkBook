package com.example.landmarkbook

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val intent = intent
        val landmarkName = intent.getStringExtra("name")
        textView.text = landmarkName
        val landmarkImageId = intent.getIntExtra("id", 0)

        val selectedBitmap = BitmapFactory.decodeResource(applicationContext.resources, landmarkImageId)
        imageView.setImageBitmap(selectedBitmap)
    }
}

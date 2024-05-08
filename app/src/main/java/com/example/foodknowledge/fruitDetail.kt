package com.example.foodknowledge

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.foodknowledge.databinding.ActivityFruitDetailBinding

class fruitDetail : AppCompatActivity() {
    lateinit var binding: ActivityFruitDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=DataBindingUtil.setContentView(this@fruitDetail,R.layout.activity_fruit_detail)
        with(binding){
            val heading=intent.getStringExtra("fruitName")
            val imageid=intent.getIntExtra("fruitId",R.drawable.banana)
            val fruitcontent=intent.getStringExtra("fruitContent")

            fruitTitle.text=heading
            fruitText.text=fruitcontent
            fruitPic.setImageResource(imageid)


        }
      }
    }

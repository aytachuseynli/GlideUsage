package com.aytachuseynli.glideusage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aytachuseynli.glideusage.databinding.ActivityMainBinding
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        showImage("meatball.png")

        binding.buttonImage1.setOnClickListener{
            showImage("baklava.png")

        }
        binding.buttonImage2.setOnClickListener{
            showImage("ayran.png")
        }
    }

    fun showImage(imageName:String){
        val url = "http://kasimadalan.pe.hu/foods/images/$imageName"
        Glide.with(this).load(url).override(300,300).into(binding.imageView)
    }
}
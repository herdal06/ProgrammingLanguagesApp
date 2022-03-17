package com.example.programminglanguagesapp

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val intent = intent
        val chooseLanguage = intent.getStringExtra("languageName")
        textView.text = chooseLanguage

        val choosenLanguageImage = intent.getIntExtra("languageImage", 0) // default value equals to zero. Because data is local
        val bitmap = BitmapFactory.decodeResource(applicationContext.resources, choosenLanguageImage)
        imageView.setImageBitmap(bitmap)
    }
}
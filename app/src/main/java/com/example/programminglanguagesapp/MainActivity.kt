package com.example.programminglanguagesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.programminglanguagesapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // data preparation
        var languageNames = ArrayList<String>()
        languageNames.add("C")
        languageNames.add("C++")
        languageNames.add("Java")
        languageNames.add("Kotlin")
        languageNames.add("JavaScript")
        languageNames.add("Go")
        languageNames.add("Python")

        // image id preparation
        val cDrawableId = R.drawable.c
        val cppDrawableId = R.drawable.cpp
        val javaDrawableId = R.drawable.java
        val kotlinDrawableId = R.drawable.kotlin
        val javaScriptDrawableId = R.drawable.javascript
        val goDrawableId = R.drawable.go
        val pythonDrawableId = R.drawable.python

        // adding drawable ids into an array
        var languageDrawableList = ArrayList<Int>()
        languageDrawableList.add(cDrawableId)
        languageDrawableList.add(cppDrawableId)
        languageDrawableList.add(javaDrawableId)
        languageDrawableList.add(kotlinDrawableId)
        languageDrawableList.add(javaScriptDrawableId)
        languageDrawableList.add(goDrawableId)
        languageDrawableList.add(pythonDrawableId)

        // Todo : Adapter



    }
}
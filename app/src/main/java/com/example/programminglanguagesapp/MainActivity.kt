package com.example.programminglanguagesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

    }
}
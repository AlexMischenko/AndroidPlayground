package com.example.justandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addSomeViews(5)
    }

    fun addSomeViews (count: Int) {
        for (i in 1..count) {
            val newTextView = TextView(this)
            newTextView.text = "New text # $i"
            newTextView.textSize = 20f

            my_layout.addView(newTextView)
        }

        val newButton = Button(this)
        newButton.text = "Click me!"
//        my_layout.addView(newButton)
        findViewById<LinearLayout>(R.id.my_layout).addView(newButton)
    }
}
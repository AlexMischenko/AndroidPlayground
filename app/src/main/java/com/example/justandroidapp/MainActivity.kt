package com.example.justandroidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.justandroidapp.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

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
        newButton.text = getString(R.string.generated_btn_label)
        newButton.setOnClickListener { view ->
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        binding.myLayout.addView(newButton)
//        Also valid ways to add a View
//        my_layout.addView(newButton)
//        findViewById<LinearLayout>(R.id.my_layout).addView(newButton)
    }
}
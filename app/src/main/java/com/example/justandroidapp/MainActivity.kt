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

        // Generate "Go to Login" button
        val loginButton = Button(this)
        loginButton.text = getString(R.string.go_to_login)
        loginButton.setOnClickListener { view ->
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        binding.myLayout.addView(loginButton)

        // Generate "Go to GetToKnowYou from" button
        val goToFormButton = Button(this)
        goToFormButton.text = getString(R.string.get_to_know_you_form)
        goToFormButton.setOnClickListener { view ->
            val intent = Intent(this, GetToKnowYouActivity::class.java)
            startActivity(intent)
        }
        binding.myLayout.addView(goToFormButton)

//        Also valid ways to add a View
//        my_layout.addView(newButton)
//        findViewById<LinearLayout>(R.id.my_layout).addView(newButton)
    }
}
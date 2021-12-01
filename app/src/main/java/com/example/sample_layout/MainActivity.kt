package com.example.sample_layout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.sample_layout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainActivityBinding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainActivityBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainActivityBinding.root)

        mainActivityBinding.signUpBtn.setOnClickListener {
            Log.d("Click!", "signUpBtn Click!")
        }

        mainActivityBinding.googleBtn.setOnClickListener {
            Log.d("Click!", "GoogleBtn Click!")
        }

        mainActivityBinding.loginBtn.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }


}
package com.example.sample_layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.sample_layout.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var homeActivityBinding : ActivityHomeBinding
    lateinit var myViewModel: myViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        homeActivityBinding = ActivityHomeBinding.inflate(layoutInflater)

        setContentView(homeActivityBinding.root)

        val userInput = homeActivityBinding.editText.text.toString()


        myViewModel = ViewModelProvider(this).get(com.example.sample_layout.myViewModel::class.java)
        myViewModel.currentValue.observe(this, Observer {
            homeActivityBinding.textView.text = it.toString()
        })

        homeActivityBinding.button2.setOnClickListener {
            myViewModel.updateValue(actionType = ActionType.PLUS, Integer.parseInt(userInput))
        }

        homeActivityBinding.button.setOnClickListener {
            myViewModel.updateValue(actionType = ActionType.MINUS, Integer.parseInt(userInput))
        }
    }


}
package com.example.sample_layout

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_account.*
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.activity_second.InputIDEdit
import kotlinx.android.synthetic.main.activity_second.InputIDLayout
import kotlinx.android.synthetic.main.activity_second.InputPWEdit
import kotlinx.android.synthetic.main.activity_second.InputPWLayout

class Account : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)
        textWatcher()
    }

    private fun textWatcher(){
        InputIDEdit.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if(InputIDEdit.text!!.isEmpty()) {
                    InputIDLayout.error = "Input your ID plz"
                } else {
                    InputIDLayout.error = null
                }

            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

        InputNickEdit.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if(InputNickEdit.text!!.isEmpty()){
                    InputNickLayout.error = "Input your Nickname Plz"
                } else {
                    InputNickLayout.error = null
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

        InputPWEdit.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if(InputPWEdit.text!!.isEmpty()){
                    InputPWLayout.error = "Input Your PW plz"
                } else {
                    InputPWLayout.error = null
                }
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
        })
    }

    fun onCreate(view: View) {
        var id = InputIDEdit.text.toString()
        var Nick = InputNickEdit.text.toString()
        var pw = InputPWEdit.text.toString()
        Log.d("Creation", "\n ID: $id \n NickName: $Nick \n Pw: $pw")

        Log.d("Creation", "AccountActivity - onCreateBtnClicked")
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}
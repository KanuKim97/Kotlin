package com.example.sample_layout

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.activity_second.*
import android.util.Log.d as d1

class SecondActivity : AppCompatActivity() {
    val TAG:String = "로그"
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
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
    
    fun onBackclick(view: View){
        finish()
    }

    fun onLogin(view: View){
        var id = InputIDEdit.text.toString()
        var pw = InputPWEdit.text.toString()
        Log.d(TAG, "Value :  Id : $id Password : $pw")

        Log.d(TAG, "SecondActivity - onLoginBtnClicked")
        val intent = Intent(this, PageMain::class.java)
        startActivity(intent)
    }
}
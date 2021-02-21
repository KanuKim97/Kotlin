package com.example.sample_layout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

//메인화면
class MainActivity : AppCompatActivity() {

    val TAG: String = "로그"
    //뷰가 생성되었을 때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //xml 파일 연결, 즉 설정한다.
        setContentView(R.layout.activity_main)

        Login_Btn.setOnClickListener(View.OnClickListener {
        onLoginBtnClick() })

        Login_Btn.setOnClickListener {
            onLoginBtnClick()
        }
    }

    fun onLoginBtnClick(){
        Log.d(TAG, "MainActivity - onLoginBtnClicked");
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

    fun onCreateGoogle(view: View){
        Log.d(TAG, "MainActivity - onCreateGoogleBtnClicked");
        val intent = Intent(this, googleLogin::class.java)
        startActivity(intent)
    }

    fun onCreate(view: View) {
        Log.d(TAG, "MainActivity - onCreateBtnClicked");
        val intent = Intent(this, Account::class.java)
        startActivity(intent)
    }
}
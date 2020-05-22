package com.example.kotlin_intent


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //버튼은 id에 맞는 버튼을 사용하여 정의 하기.
        //버튼을 누르면 넘어 갈수 있도록 intent정의 하기.
        //넘어간 후 화면 subactivity만들기!
        
        btn1.setOnClickListener{
            var intent = Intent (this, SubActivity::class.java)
            startActivity(intent)//넘어가라!
        }


    }
}

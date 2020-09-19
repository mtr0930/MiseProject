package com.example.miselayout



import android.content.Intent

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*


abstract class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_Map.setOnClickListener{
            val intent = Intent(this, MapsActivity::class.java) //다음 화면으로 이동하기 위한 인텐트 객체 생성.
            startActivity(intent)
        }
    }

}




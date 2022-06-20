package com.ljm.kotlindeeplink

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ljm.kotlindeeplink.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main()
    }

    private fun main(){
        // 1. 바인딩 초기화
        val binding = ActivityMainBinding.inflate(layoutInflater);

        // 2. 레이아웃(root뷰) 표시
        setContentView(binding.root);

        // 3-1.뷰바인딩으로 버튼 접근
        binding.nextButton.setOnClickListener() {
            startActivity(Intent(this@MainActivity, SecondActivity::class.java))
        }
    }
}
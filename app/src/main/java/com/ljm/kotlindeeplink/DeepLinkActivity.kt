package com.ljm.kotlindeeplink

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ljm.kotlindeeplink.databinding.ActivityDeepLinkBinding
import com.ljm.kotlindeeplink.databinding.ActivityMainBinding

class DeepLinkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deep_link)

        init()
    }

    private fun init(){

        val binding = ActivityDeepLinkBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvDeeplinkReceive.setOnClickListener(){
            Toast.makeText(this, "딥링크 연결 성공",Toast.LENGTH_SHORT).show()
        }
    }

}
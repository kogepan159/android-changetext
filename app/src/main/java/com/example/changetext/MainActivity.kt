package com.example.changetext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var count: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            this.count = count + 1
            textView.text = count.toString()
        }
        button2.setOnClickListener {
            this.count = count - 1
            textView.text = count.toString()
            println("aaaaaa")
        }
    }
}

package com.example.changetext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val count:Count = Count()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            count.addSum()
            textView.text = count.getSum().toString()
        }
        button2.setOnClickListener {
            count.addMinasu()
            textView.text = count.getSum().toString()
            println("aaaaaa")
        }
    }
}

class Count {
    private var sum = 0

    fun addSum() {
        this.sum = this.sum + 1
    }

    fun addMinasu() {
        this.sum = this.sum - 1
    }


    fun getSum(): Int {
        return  this.sum
    }

}


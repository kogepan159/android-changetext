package com.example.changetext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            textView.text = "おやすみ"
        }
        button2.setOnClickListener {
            textView.text = button2.text
            println("aaaaaa")
        }

        val dog: Dog = Dog()
        dog.setName("ココア")
        dog.setName("アイス")
        println(dog.getName())

        val cat = Cat("ココア")
        println(cat.name)

        fun String.sum(a: String, b:String) = "[" + a + b + "]"
    }
}

class Cat(val name: String) {}

class Dog {
    private var name  = ""
    public fun setName(name: String) {
        this.name = name
    }
    fun getName() : String {
        return name
    }
}


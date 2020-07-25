package com.example.changetext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    // ここにvarで値を作る(1)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            // 数字に+1をする(2)
            // 変更後の値を、textViewに追加する

            // Hint
            // textView.text = count.toString() 数字をString型にする方法
        }
        button2.setOnClickListener {
            // 数字に-1をする(3)
            // 変更後の値を、textviewに追加する
        }
    }
}

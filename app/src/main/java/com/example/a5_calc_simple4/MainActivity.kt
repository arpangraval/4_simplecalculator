package com.example.a5_calc_simple4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var add:Button = findViewById(R.id.btnAdd)
        var sub:Button = findViewById(R.id.btnSub)
        var helpclick = HelperClickButton()
        add.setOnClickListener(helpclick)
        sub.setOnClickListener(helpclick)
    }

}
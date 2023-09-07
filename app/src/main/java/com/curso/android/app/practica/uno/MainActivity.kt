package com.curso.android.app.practica.uno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        buttonCompare.setOnClickListener {
            val text1 = editText1.text.toString()
            val text2 = editText2.text.toString()

            val result = viewModel.compareTexts(text1, text2)

            textResult.text = if (result) "Result: The character strings are the same" else "Result: The character strings aren`t the same"
        }
    }
}

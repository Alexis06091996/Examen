package com.example.sumardosnumexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class calcular : AppCompatActivity() {

    lateinit var Numero1 : EditText
    lateinit var Numero2 : EditText
    lateinit var btnsumar : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcular)

        Numero1 = findViewById(R.id.n1)
        Numero2 = findViewById(R.id.n2)
        btnsumar = findViewById(R.id.sumar)


        btnsumar.setOnClickListener(View.OnClickListener {
            val num1 = Integer.parseInt(Numero1.text.toString())
            val num2 = Integer.parseInt(Numero2.text.toString())
            val sum = num1 + num2



            val intent = Intent(this, resultado::class.java)
            intent.putExtra("Result", sum)
            startActivity(intent)
        })

    }

}
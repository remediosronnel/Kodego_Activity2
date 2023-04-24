package com.remedios.project2

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo

class Main :AppCompatActivity(){

    override fun onCreate(savedInstanceState:Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        setupUi()

        val text = findViewById<TextView>(R.id.textView)
        with(text) {
            this
            YoYo.with(Techniques.Flash).repeat(100)
                .playOn(text)
        }
    }
     private  fun setupUi(){
            Handler().postDelayed({
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }, 5000)
        }
}


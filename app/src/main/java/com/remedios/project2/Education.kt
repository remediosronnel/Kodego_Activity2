package com.remedios.project2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Education:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.education)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = "Education"


    }
}
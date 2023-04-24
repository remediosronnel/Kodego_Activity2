package com.remedios.project2

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class EmploymentHistory:AppCompatActivity() {
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.employment)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = "Employment History"



    }
}
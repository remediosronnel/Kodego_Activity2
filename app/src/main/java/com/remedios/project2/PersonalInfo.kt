package com.remedios.project2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class PersonalInfo:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.personal_information)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = "Personal Information"


    }
}
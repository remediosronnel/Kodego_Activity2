package com.remedios.project2


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.remedios.project2.databinding.AcknowledgementBinding


class Acknowledgement:AppCompatActivity() {
    lateinit var binding :AcknowledgementBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acknowledgement)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = "Acknowledgment and Authorization"

        binding = AcknowledgementBinding.inflate(layoutInflater)
        binding.button2.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}
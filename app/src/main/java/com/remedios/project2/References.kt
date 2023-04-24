package com.remedios.project2

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class References:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.references)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = "References"

        val addButton = findViewById<Button>(R.id.addButton)
        val nameEditText = findViewById<EditText>(R.id.nameEditText)
        val titleEditText = findViewById<EditText>(R.id.titleEditText)
        val companyEditText = findViewById<EditText>(R.id.companyEditText)
        val phoneEditText = findViewById<EditText>(R.id.phoneEditText)
        val tableLayout = findViewById<TableLayout>(R.id.tableLayout)




        addButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val title = titleEditText.text.toString()
            val company = companyEditText.text.toString()
            val phone = phoneEditText.text.toString()

            val tableRow = LayoutInflater.from(this).inflate(R.layout.table_row, null) as TableRow
            tableRow.findViewById<TextView>(R.id.nameTextView).setText(name)
            tableRow.findViewById<TextView>(R.id.titleTextView).setText(title)
            tableRow.findViewById<TextView>(R.id.companyTextView).setText(company)
            tableRow.findViewById<TextView>(R.id.phoneTextView).setText(phone)

            val removeButton = tableRow.findViewById<TableRow>(R.id.removeButton)

            removeButton.setOnClickListener {
                tableLayout.removeView(tableRow)
            }

            tableLayout.addView(tableRow)

        }

    }
}
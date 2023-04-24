package com.remedios.project2


import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.hitomi.cmlibrary.CircleMenu


class MainActivity : AppCompatActivity(){

    private lateinit var circlemenu:CircleMenu
    lateinit var constraintLayout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_menu_2)
        supportActionBar?.hide()

        circlemenu = findViewById(R.id.circle_menu)
        constraintLayout = findViewById(R.id.constraint_layout)

        circlemenu.setMainMenu(Color.parseColor("#FA6800"), R.drawable.main_menu, R.drawable.icon_cancel)
            .addSubMenu(Color.parseColor("#008A00"), R.drawable.icon_information)
            .addSubMenu(Color.parseColor("#F472D0"), R.drawable.icon_education)
            .addSubMenu(Color.parseColor("#AA00FF"), R.drawable.icon_work)
            .addSubMenu(Color.parseColor("#6A00FF"), R.drawable.icon_reference)
            .addSubMenu(Color.parseColor("#6D8764"), R.drawable.icon_acknowledge)
            .setOnMenuSelectedListener {
                    when (it) {
                        0 -> {
                            Toast.makeText(this, "Personal Info", Toast.LENGTH_SHORT).show()
                            constraintLayout.setBackgroundColor(Color.parseColor("#008A00"))
                                val intent = Intent(this, PersonalInfo::class.java)
                                startActivity(intent)
                        }
                        1 -> {
                            Toast.makeText(this, "Education", Toast.LENGTH_SHORT).show()
                            constraintLayout.setBackgroundColor(Color.parseColor("#F472D0"))
                                val intent = Intent(this, Education::class.java)
                                startActivity(intent)
                        }
                        2 -> {
                            Toast.makeText(this, "Employment", Toast.LENGTH_SHORT).show()
                            constraintLayout.setBackgroundColor(Color.parseColor("#AA00FF"))
                            val intent = Intent(this, EmploymentHistory::class.java)
                            startActivity(intent)
                        }
                        3 -> {
                            Toast.makeText(this, "References", Toast.LENGTH_SHORT).show()
                            constraintLayout.setBackgroundColor(Color.parseColor("#6A00FF"))
                            val intent = Intent(this, References::class.java)
                            startActivity(intent)
                        }
                        4 -> {
                            Toast.makeText(this, "Acknowledgement and Authorization", Toast.LENGTH_SHORT).show()
                            constraintLayout.setBackgroundColor(Color.parseColor("#6D8764"))
                            val intent = Intent(this, Acknowledgement::class.java)
                            startActivity(intent)
                        }
                }

            }
    }
}
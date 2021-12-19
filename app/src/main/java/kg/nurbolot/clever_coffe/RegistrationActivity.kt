package kg.nurbolot.clever_coffe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val back = findViewById<LinearLayout>(R.id.back)

        back.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }

        val dalee = findViewById<Button>(R.id.dalee)

        dalee.setOnClickListener{
            startActivity(Intent(this,ConfirmActivity::class.java))
        }
    }
}
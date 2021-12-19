package kg.nurbolot.clever_coffe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class ConfirmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm)

        val back = findViewById<LinearLayout>(R.id.back)

        back.setOnClickListener{
            startActivity(Intent(this,RegistrationActivity::class.java))
        }

        val dalee = findViewById<Button>(R.id.dalee)

        dalee.setOnClickListener{
            startActivity(Intent(this,HomePageActivity::class.java))
        }
    }
}
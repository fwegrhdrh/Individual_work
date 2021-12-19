package kg.nurbolot.clever_coffe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val registration = findViewById<LinearLayout>(R.id.linearLayout3)

        registration.setOnClickListener{
            startActivity(Intent(this,RegistrationActivity::class.java))
        }

        val main = findViewById<LinearLayout>(R.id.main)

        main.setOnClickListener{
            startActivity(Intent(this,HomePageActivity::class.java))
        }
    }
}
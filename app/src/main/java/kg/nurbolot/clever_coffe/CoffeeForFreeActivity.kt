package kg.nurbolot.clever_coffe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class CoffeeForFreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coffee_for_free)

        val back = findViewById<LinearLayout>(R.id.back)

        back.setOnClickListener{
            startActivity(Intent(this,HomePageActivity::class.java))
        }
    }
}
package kg.nurbolot.clever_coffe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class PenneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_penne)

        val back = findViewById<ImageView>(R.id.back)

        back.setOnClickListener{
            startActivity(Intent(this,HomePageActivity::class.java))
        }

    }
}
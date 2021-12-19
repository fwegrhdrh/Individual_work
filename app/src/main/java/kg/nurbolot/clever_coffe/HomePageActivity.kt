package kg.nurbolot.clever_coffe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class HomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val penne = findViewById<LinearLayout>(R.id.linearLayout23)

        penne.setOnClickListener{
            startActivity(Intent(this,PenneActivity::class.java))
        }

        val espresso = findViewById<LinearLayout>(R.id.linearLayout24)

        espresso.setOnClickListener{
            startActivity(Intent(this,EspressoActivity::class.java))
        }

        val besplatno = findViewById<LinearLayout>(R.id.linearLayout27)

        besplatno.setOnClickListener{
            startActivity(Intent(this,CoffeeForFreeActivity::class.java))
        }

        val menu = findViewById<LinearLayout>(R.id.linearLayout30)

        menu.setOnClickListener{
            startActivity(Intent(this,BarKuhnyaActivity::class.java))
        }

        val qrcode = findViewById<LinearLayout>(R.id.qrcode)

        qrcode.setOnClickListener{
            startActivity(Intent(this,ConfirmQRCodeActivity::class.java))
        }
    }
}
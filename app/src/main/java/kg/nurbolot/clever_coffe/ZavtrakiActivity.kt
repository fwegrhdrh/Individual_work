package kg.nurbolot.clever_coffe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class ZavtrakiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zavtraki)

        val back = findViewById<LinearLayout>(R.id.back)

        back.setOnClickListener{
            startActivity(Intent(this,BarKuhnyaActivity::class.java))
        }
    }
}
package kg.nurbolot.clever_coffe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class BarKuhnyaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bar_kuhnya)

        val zavtrak = findViewById<LinearLayout>(R.id.zavtrak)

        zavtrak.setOnClickListener{
            startActivity(Intent(this,ZavtrakiActivity::class.java))
        }
    }
}
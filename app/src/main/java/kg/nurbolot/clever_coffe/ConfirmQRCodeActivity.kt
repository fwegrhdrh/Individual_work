package kg.nurbolot.clever_coffe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class ConfirmQRCodeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm_qrcode)

        val back = findViewById<LinearLayout>(R.id.back)

        back.setOnClickListener{
            startActivity(Intent(this,HomePageActivity::class.java))
        }
    }
}
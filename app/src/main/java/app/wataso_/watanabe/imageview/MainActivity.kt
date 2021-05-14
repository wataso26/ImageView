package app.wataso_.watanabe.imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ImageView =findViewById<ImageView>(R.id.imageView)
        imageView.setImageResource(R.drawable.lit)

        val url = "https://life-is-tech.com/materials/images/logo-square.png"
        val imageView = findViewById<ImageView>(R.id.imageView)
    }
}
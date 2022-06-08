package br.com.zup.meupet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoPet: Button =findViewById(R.id.botaoPet)
        botaoPet.setOnClickListener {
            Toast.makeText(this, "Esse sujeito é maneiro!", Toast.LENGTH_LONG).show()
        }
    }
}
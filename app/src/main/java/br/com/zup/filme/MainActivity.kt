package br.com.zup.filme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonEval = findViewById<Button>(R.id.button_evaluation)
        buttonEval.setOnClickListener {
            Toast.makeText(this, "Este filme é inspirador!", Toast.LENGTH_LONG).show()
        }

        val buttonSynopsis = findViewById<Button>(R.id.button_synopsis)
        buttonSynopsis.setOnClickListener {
            val intent = Intent(this, FilmeDetails::class.java)
            startActivity(intent)

        }


    }
}
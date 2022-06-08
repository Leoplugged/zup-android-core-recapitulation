package br.com.zup.filme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    companion object {
        const val TAG = "APP_FILME"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "Passou pelo onCreate() da MainActivity")
        setContentView(R.layout.activity_main)

        val buttonEval = findViewById<Button>(R.id.button_evaluation)
        buttonEval.setOnClickListener {
            Toast.makeText(this, "Este filme é inspirador!", Toast.LENGTH_LONG).show()
        }

        val buttonSynopsis = findViewById<Button>(R.id.button_synopsis)
        buttonSynopsis.setOnClickListener {

            //Criação de uma intenção que fará com que o usuário saia da MainActivity e vá para o DetalheFilmeActivity
            val intent = Intent(this, FilmeDetails::class.java)

            val nomeDoFilme = "Captain Fantastic"
            val bundle = Bundle()
            bundle.putString("nomeDoFilme", nomeDoFilme)
            intent.putExtra("Message", bundle) //TODO Qual a necessidade da "Message"?! Seria o nome da Bundle?
            startActivity(intent)
        }

        val buttonMail = findViewById<Button>(R.id.button_mail)
        buttonMail.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/html"
            intent.putExtra(Intent.EXTRA_EMAIL, "leandro.almeida@zup.com.br")
            intent.putExtra(Intent.EXTRA_SUBJECT, "APP do Filme")
            intent.putExtra(Intent.EXTRA_TEXT, "Olá, Leandro!\n\n Mensagem originada a partir do app FILME:\n\n [digite sua mensagem aqui]")
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Passou pelo onStart() da MainActivity")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Passou pelo onResume() da MainActivity")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Passou pelo onPause() da MainActivity")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Passou pelo onStop() da MainActivity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Passou pelo onDestroy() da MainActivity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Passou pelo onRestart() da MainActivity")
    }
}
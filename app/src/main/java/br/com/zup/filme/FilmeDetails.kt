package br.com.zup.filme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Toast

class FilmeDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(MainActivity.TAG, "Passou pelo onCreate() da FilmeDetails")

        setContentView(R.layout.activity_filme_details)

        val bundle = intent.getBundleExtra("Message")  //TODO Qual a necessidade da "Message"?! Seria o nome da Bundle?
        val nomeDoFilme = bundle!!.getString("nomeDoFilme")

        Toast.makeText(this, nomeDoFilme, Toast.LENGTH_LONG).show()

        //Método que habilita o back button(botão de voltar) na toolbar da tela
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        /*Método que seta o título da tela na toolbar referenciando um valor que está adicionado no
         arquivo de strings.xml.*/
        supportActionBar?.setTitle(R.string.title_synopsis_layout)
    }

    //Este método habilitará voltar a tela quando o botão de voltar for pressionado
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            this.finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onStart() {
        super.onStart()
        Log.d(MainActivity.TAG, "Passou pelo onStart() do FilmeDetails")
    }

    override fun onResume() {
        super.onResume()
        Log.d(MainActivity.TAG, "Passou pelo onResume() do FilmeDetails")
    }

    override fun onPause() {
        super.onPause()
        Log.d(MainActivity.TAG, "Passou pelo onPause() do FilmeDetails")
    }

    override fun onStop() {
        super.onStop()
        Log.d(MainActivity.TAG, "Passou pelo onStop() do FilmeDetails")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MainActivity.TAG, "Passou pelo onDestroy() do FilmeDetails")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(MainActivity.TAG, "Passou pelo onRestart() do FilmeDetails")
    }
}
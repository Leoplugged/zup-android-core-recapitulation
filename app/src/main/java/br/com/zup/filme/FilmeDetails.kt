package br.com.zup.filme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast

class FilmeDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_filme_details)

        val bundle = intent.getBundleExtra("Message")
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
}
package br.com.alura.orgs.ui.activity
// continuação 
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import br.com.alura.orgs.R

class FormularioProdutoActivity :
    AppCompatActivity(R.layout.activity_formulario_produto) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val botaoSalvar = findViewById<Button>(R.id.botao_salvar)
        botaoSalvar.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                val campoNome = findViewById<EditText>(R.id.nome)
                val nome = campoNome.text.toString()
                Log.i("FormularioProduto", "onCreate: $nome")

            }
        })
    }




}
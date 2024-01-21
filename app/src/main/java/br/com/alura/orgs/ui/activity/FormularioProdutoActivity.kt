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
import br.com.alura.orgs.dao.ProdutosDao
import br.com.alura.orgs.model.Produto
import java.math.BigDecimal

class FormularioProdutoActivity :
    AppCompatActivity(R.layout.activity_formulario_produto) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val botaoSalvar = findViewById<Button>(R.id.botao_salvar)
        botaoSalvar.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                val campoNome = findViewById<EditText>(R.id.nome)
                val nome = campoNome.text.toString()
                val campoDescricao = findViewById<EditText>(R.id.descricao)
                val descricao = campoDescricao.text.toString()
                val campoValor = findViewById<EditText>(R.id.valor)
                val valoremTexto = campoValor.text.toString()
                val valor = if(valoremTexto.isBlank()) {
                    BigDecimal.ZERO
                } else {
                    BigDecimal(valoremTexto)
                }

                val produtoNovo = Produto(
                    nome = nome,
                    descricao = descricao,
                    valor = valor
                )

                Log.i("FormularioProduto", "onCreate: $produtoNovo")
                val dao= ProdutosDao()
                dao.adciona(produtoNovo)
                Log.i("FormularioProduto", "onCreate: ${dao.buscaTodos()}")
                finish()
            }
        })
    }




}
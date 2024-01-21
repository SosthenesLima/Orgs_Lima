package br.com.alura.orgs.ui.activity
// 18/01/2024
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.service.controls.actions.FloatAction
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.orgs.R
import br.com.alura.orgs.model.Produto
import br.com.alura.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.math.BigDecimal

@Suppress("UNUSED_EXPRESSION")
class MainActivity : AppCompatActivity(R.layout.activity_main) {

    Data

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(context = this, produtos = listOf(
                Produto(nome = "teste",
                        descricao = "teste desc",
                        valor = BigDecimal("19.99")
                ),
                Produto(nome = "teste 1",
                        descricao = "teste desc 1",
                        valor = BigDecimal("29.99")
                ),
                Produto(nome = "teste 2",
                        descricao = "teste desc 2",
                        valor = BigDecimal("39.99")
                ),
        ))
        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton3)
        fab.setOnClickListener {
            val intent = Intent(this, FormularioProdutoActivity::class.java)
            startActivity(intent)
        }
    }

}
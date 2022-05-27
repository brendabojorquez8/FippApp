package bojorquez.brenda.fippapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_registrar_categoria_gastos.*

class RegistrarCategoriasGastos : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categorias_gastos)

        btn_dismiss.setOnClickListener {
            val intent: Intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        btn_registrarCat.setOnClickListener {
            val intent: Intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
    }
}
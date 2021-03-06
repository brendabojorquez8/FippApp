package bojorquez.brenda.fippapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_gastos_fijos.*

class GastosFijos : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gastos_fijos)

        btn_Ingresos.setOnClickListener {
            val intent: Intent = Intent(this, BalanceIngresos::class.java)
            startActivity(intent)
        }

        btn_home.setOnClickListener {
            val intent: Intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        btn_clasificacion.setOnClickListener {
            val intent: Intent = Intent(this, ClasificacionGastos::class.java)
            startActivity(intent)
        }

        btn_clategorías.setOnClickListener {
            val intent: Intent = Intent(this, CategoriasGastos::class.java)
            startActivity(intent)
        }

        btn_fijos.setOnClickListener {
            val intent: Intent = Intent(this, GastosFijos::class.java)
            startActivity(intent)
        }

        btn_registrarGastosFijo.setOnClickListener {
            val intent: Intent = Intent(this, RegistrosGastosFijos::class.java)
            startActivity(intent)
        }
    }
}
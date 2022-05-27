package bojorquez.brenda.fippapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_clasificacion_ingresos.*

class ClasificacionIngresos : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clasificacion_ingresos)

        btn_gastos.setOnClickListener {
            val intent: Intent = Intent(this, BalanceGastos::class.java)
            startActivity(intent)
        }

        btn_home.setOnClickListener {
            val intent: Intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        btn_clasificacion.setOnClickListener {
            val intent: Intent = Intent(this, ClasificacionIngresos::class.java)
            startActivity(intent)
        }

        btn_clategorías.setOnClickListener {
            val intent: Intent = Intent(this, CategoriasIngresos::class.java)
            startActivity(intent)
        }

        btn_fijos.setOnClickListener {
            val intent: Intent = Intent(this, IngresosFijos::class.java)
            startActivity(intent)
        }
    }
}